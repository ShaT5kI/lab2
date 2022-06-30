public class DefineFactory implements CommandFactory {
    @Override
    public Command getCommand() {
        return new Define();
    }
}
