import java.io.IOException;

public class Stack {
    private final double[] array;
    private int size;

    public Stack() {
        array = new double[1024];
        size = 0;
    }

    public Double pop() throws ArrayIndexOutOfBoundsException{
        double tmp = 0;
        tmp = array[size - 1];
        size--;
        return tmp;
    }

    public void push(Double num) {
        array[size++] = num;
    }

    public void print() throws ArrayIndexOutOfBoundsException {
        Double top = pop();
        System.out.println(top);
        push(top);
    }
}
