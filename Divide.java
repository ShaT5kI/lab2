public class Divide implements Command {
    @Override
    public void execute(String[] args, Context context) {
        Stack stack = context.getStack();
        double num1 = stack.pop();
        double num2 = stack.pop();
        if (num1 == 0) {
            stack.push(num2);
            stack.push(num1);
            throw new ArithmeticException("Dividing by zero");
        }
        stack.push(num2 / num1);
        context.setStack(stack);
    }
}
