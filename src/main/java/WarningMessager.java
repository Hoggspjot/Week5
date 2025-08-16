public class WarningMessager extends MessageSender {

    public WarningMessager(int level) {
        super(level);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " - Внимание! ");
    }
}
