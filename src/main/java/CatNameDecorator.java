public class CatNameDecorator implements Animal {
    private Animal animal;


    public CatNameDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void setName(String name) {
        animal.setName(name);
    }

    public String getName() {
        return "Кот по имени "+animal.getName();
    }

}
