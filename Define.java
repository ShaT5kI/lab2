import java.util.HashMap;

public class Define implements Command {
    @Override
    public void execute(String[] args, Context context) throws InputFormatException {
        boolean checker = false;
        try {
            Double.parseDouble(args[1]);
        }
        catch (NumberFormatException e) {
            checker = true;
        }
        HashMap<String, Double> def = context.getDefine();
        if (checker) {
            def.put(args[1], Double.valueOf(args[2]));
            context.setDefine(def);
        }
        else
            throw new InputFormatException("Incorrect format of line");
    }
}
