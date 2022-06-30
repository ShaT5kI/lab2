public class SqrtFactory implements CommandFactory {
    @Override
    public Command getCommand() {
        return new Sqrt();
    }
}
