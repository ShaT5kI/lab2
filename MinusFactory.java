public class MinusFactory implements CommandFactory{
    @Override
    public Command getCommand() {
        return new Minus();
    }
}
