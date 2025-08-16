public abstract class MessageSender {

    private int level;

    private MessageSender nextMessageSender;

    public MessageSender(int level) {
        this.level = level;
    }

    public void setNextMessageSender(MessageSender nextMessageSender) {
        this.nextMessageSender = nextMessageSender;
    }

    public void messageManager(String message, int level) {
        if (level >= this.level) {
            sendMessage(message);
        }
        if (nextMessageSender != null) {
            nextMessageSender.messageManager(message, level);
        }
    }

    abstract void sendMessage(String message);
}

