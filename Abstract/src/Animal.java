public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void walk();

    public void noise() {
        System.out.println("Noise");
    }
    public void setName(String name) {
        this.name = name;
    }
}
