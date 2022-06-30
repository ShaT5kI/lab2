public class Pop implements Command{
    @Override
    public void execute(String[] args, Context context) throws AmountOfElementsInStackException {
        Stack stack = context.getStack();
        try {
            stack.pop();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new AmountOfElementsInStackException("Not enough elements in stack");
        }
        context.setStack(stack);
    }

}
