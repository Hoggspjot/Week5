public class Logger extends MessageSender{

    public Logger(int level) {
        super(level);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println( message + " - Сведения внесены в лог");
    }
}
