public class Multiply implements Command {
    @Override
    public void execute(String[] args, Context context) throws AmountOfElementsInStackException {
        Stack stack = context.getStack();
        double num1 = 0, num2 = 0;
        try {
            num1 = stack.pop();
            num2 = stack.pop();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new AmountOfElementsInStackException("Not enough elements in stack");
        }
        stack.push(num1 * num2);
        context.setStack(stack);
    }
}
