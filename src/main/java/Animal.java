public class Animal implements Acting, Comparable<Animal> {
    private String name;
    private final AnimalType typeOfAnimal;
    private int age; // in months
    private int weight;

    public Animal(String name, AnimalType typeOfAnimal, int age, int weight) {
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public int getAge() {
        return age;
    }

    // Lambda
    @Override
    public void doAct() {
        System.out.print(name + ": ");
        switch (typeOfAnimal) {

            case GORILLA -> {
                System.out.println("Impresses people by making noise");
            }
            case TIGER -> {
                System.out.println("Hunts on the visitors");
            }
            case OSTRICH -> {
                System.out.println("Puts head in the sand");
            }
        }
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }
}
