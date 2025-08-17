public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Васька");
        CatNameDecorator decorator = new CatNameDecorator(cat);

        System.out.println(cat.getName());
        System.out.println(decorator.getName());
    }
}
