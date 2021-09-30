public class Tiger extends Animal {

    private int teethLength;

    public Tiger(String name, int age, int weight, int teethLength) {
        super(name, age, weight);
        this.teethLength = teethLength;
    }

    @Override
    public void eat() {
        System.out.println("Hunts on prey and eats raw meat");
    }

    @Override
    public void doAct() {
        System.out.println("Hunts on the visitors");

    }
}
