public class Gorilla extends Animal {
    private int armSpan;
    private boolean isSilverBack;

    public Gorilla(String name, int age, int weight, int armSpan, boolean isSilverBack) {
        super(name, age, weight);
        this.armSpan = armSpan;
        this.isSilverBack = isSilverBack;
    }

    @Override
    public void eat() {
        System.out.println("eats fruit and nuts");
    }

    @Override
    public void doAct() {
        System.out.println("Impresses people by making noise");
    }
}
