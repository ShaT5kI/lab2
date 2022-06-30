public class SumFactory implements CommandFactory{
    @Override
    public Command getCommand() {
        return new Sum();
    }
}
