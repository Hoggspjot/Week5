public class Main {
    public static void main(String[] args) {
        MessageSender logger = new Logger(1);
        MessageSender warning = new WarningMessager(2);
        MessageSender error = new ErrorMessage(3);
        MessageSender critical = new Critical(4);


        logger.setNextMessageSender(warning);
        warning.setNextMessageSender(error);
        error.setNextMessageSender(critical);

        logger.messageManager("Произошло событие", Level.low.getLevel());
        System.out.println("------------------------------");
        logger.messageManager("Что то не так",Level.middle.getLevel());
        System.out.println("------------------------------");
        logger.messageManager("Ошибка!",Level.high.getLevel());
        System.out.println("------------------------------");
        logger.messageManager("Критическая ошибка", Level.critical.getLevel());
    }
}
