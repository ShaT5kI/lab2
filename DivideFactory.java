public class DivideFactory implements CommandFactory {
    @Override
    public Command getCommand() {
        return new Divide();
    }
}
