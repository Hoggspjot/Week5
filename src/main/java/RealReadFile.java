public class RealReadFile implements ReadFile {
    private String fileName;


    public RealReadFile(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);  // предполагаемая ресурсозатратная операция по загрузке файла
    }

    @Override
    public void read() {
        System.out.println("Передача запрошенного файла пользователю");
    }

    public void loadFile(String fileName) {
        //предполагаемая реализация кэширования
        System.out.printf("Загрузка файла %s с диска\n", fileName);
    }
}
