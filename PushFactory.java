public class PushFactory implements CommandFactory{
    @Override
    public Command getCommand() {
        return new Push();
    }
}
