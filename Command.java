import java.util.HashMap;

interface Command {
    void execute(String[] args, Context context) throws InputFormatException, AmountOfElementsInStackException;
}

