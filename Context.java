import java.util.HashMap;

public class Context {
    private HashMap<String, Double> define;
    private Stack stack;

    public Context() {
        define = new HashMap<String, Double>();
        stack = new Stack();
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public HashMap<String, Double> getDefine() {
        return define;
    }

    public void setDefine(HashMap<String, Double> define) {
        this.define = define;
    }

}
