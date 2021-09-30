public abstract class Animal implements Acting, Comparable<Animal> {
    private String name;
    private int age; // in months
    private int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    /*
    // Do not do this: 
    @Override
    public void doAct() {
        System.out.print(name + ": ");
        switch (this.getClass().getTypeName()) {

            case "Gorilla" -> {
                System.out.println("Impresses people by making noise");
            }
            case "Tiger" -> {
                System.out.println("Hunts on the visitors");
            }
            case "Ostrich" -> {
                System.out.println("Puts head in the sand");
            }
        }
    }
    */



    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }
}
