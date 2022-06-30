public class PrintFactory implements CommandFactory {
    @Override
    public Command getCommand() {
        return new Print();
    }
}
