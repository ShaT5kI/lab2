import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        File file = new File("in.txt");
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        Context context = new Context();
        Calculator calculator;
        try {
            calculator = new Calculator();
        }
        catch (PropertyExistenceException e) {
            System.out.println(e.getMessage());
            return;
        }
        while (scanner.hasNextLine()) {
            String[] str = new String[0];
            try {
                String line = scanner.nextLine();
                str = line.split(" ");
                Command command = calculator.getCommandFromFactory(str[0]);
                command.execute(str, context);
            } catch (InputFormatException | ArithmeticException | AmountOfElementsInStackException | PropertyExistenceException e) {
                System.out.println(e.getMessage());
            }  catch (RuntimeException e) {
                if (!Objects.equals("#", str[0]))
                    System.out.println("is unknown specialty");
            }
        }
        scanner.close();
    }

}
