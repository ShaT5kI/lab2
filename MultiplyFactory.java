public class MultiplyFactory implements CommandFactory{
    @Override
    public Command getCommand() {
        return new Multiply();
    }
}
