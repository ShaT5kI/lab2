import java.util.HashMap;

public class Push implements Command{
    @Override
    public void execute(String[] args, Context context) throws InputFormatException {
        HashMap<String, Double> def = context.getDefine();
        Stack stack = context.getStack();
        if (def.get(args[1]) == null) {
            try {
                stack.push(Double.parseDouble(args[1]));
            }
            catch (NumberFormatException e) {
                throw new InputFormatException("Incorrect format of line");
            }
        }
        else {
            try {
                stack.push(Double.parseDouble(String.valueOf(def.get(args[1]))));
            }
            catch (IndexOutOfBoundsException e) {
                throw new InputFormatException("Incorrect format of line");
            }
        }
        context.setDefine(def);
        context.setStack(stack);
    }
}
