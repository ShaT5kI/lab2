public class PopFactory implements CommandFactory{
    @Override
    public Command getCommand() {
        return new Pop();
    }
}
