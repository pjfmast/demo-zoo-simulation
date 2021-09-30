public class ZooSimulation {
    public static void main(String[] args) {
        Zoo beekseBergen = new Zoo();

        beekseBergen.addAnimal(new Animal("Bokito", AnimalType.GORILLA, 42, 150));
        beekseBergen.addAnimal(new Animal("KopInhetZand", AnimalType.OSTRICH, 22, 16));
        beekseBergen.addAnimal(new Animal("Tijgeltje", AnimalType.TIGER, 32, 120));
        beekseBergen.addAnimal(new Animal("Jane", AnimalType.GORILLA, 42, 150));

        beekseBergen.addVisitor(new Visitor("John"));
        beekseBergen.addVisitor(new Visitor("Kees"));
        beekseBergen.addVisitor(new Visitor("Anja"));
        beekseBergen.addVisitor(new Visitor("Maartje"));

        beekseBergen.simulate();

        beekseBergen.animalFrequency().forEach((animalType,count) -> {
            System.out.println(animalType + " - " + count);
        });

        System.out.println("Sorted by name:");
        beekseBergen.sortAndPrintAnimalsByName();
        System.out.println("Sorted by age:");
        beekseBergen.sortAndPrintAnimalsByAge();
    }
}
