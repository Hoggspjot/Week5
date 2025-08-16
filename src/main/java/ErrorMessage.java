public class ErrorMessage extends MessageSender{

    public ErrorMessage(int level) {
        super(level);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " - Ошибка!");
    }
}
