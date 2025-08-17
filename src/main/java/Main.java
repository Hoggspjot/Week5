public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ProxyReadFile("testFile.txt");
        //первое обращение загружает файл
        readFile.read();
        //второе обращение изспользует закешированный
        readFile.read();
    }
}
