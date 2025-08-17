public class ProxyReadFile implements ReadFile{
    private String fileName;
    private RealReadFile realReadFile;

    public ProxyReadFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        // при первом вызове присходит загрузка
        if (realReadFile == null) {
            realReadFile = new RealReadFile(fileName);
        }
        realReadFile.read();
    }
}
