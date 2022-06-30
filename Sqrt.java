public class Sqrt implements Command {
    @Override
    public void execute(String[] args, Context context) throws AmountOfElementsInStackException{
        Stack stack = context.getStack();
        double num = 0;
        try {
            num = stack.pop();
            num = Math.sqrt(num);
        }
        catch (IndexOutOfBoundsException e) {
            throw new AmountOfElementsInStackException("Not enough elements in stack");
        }
        stack.push(num);
        context.setStack(stack);
    }
}
