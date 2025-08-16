public class Critical extends MessageSender{

    public Critical(int level) {
        super(level);
    }

    @Override
    void sendMessage(String message) {
        System.out.println(message+ " - Критическая ошибка! ");
    }
}
