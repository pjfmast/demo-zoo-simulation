public class Ostrich extends Animal {
    private int maxRunningSpeed;

    public Ostrich(String name,  int age, int weight, int maxRunningSpeed) {
        super(name, age, weight);
        this.maxRunningSpeed = maxRunningSpeed;
    }

    @Override
    public void eat() {
        System.out.println("eats grass and lots of calcium");
    }

    @Override
    public void doAct() {
        System.out.println("Puts head in the sand");
    }
}
