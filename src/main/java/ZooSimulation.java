public class ZooSimulation {
    public static void main(String[] args) {
        Zoo beekseBergen = new Zoo();

        beekseBergen.addAnimal(new Gorilla("Bokito", 42, 150, 220, false));
        beekseBergen.addAnimal(new Ostrich("KopInhetZand", 22, 16, 60));
        beekseBergen.addAnimal(new Tiger("Tijgeltje",  32, 120, 36));
        beekseBergen.addAnimal(new Gorilla("Jane",  42, 150, 210, true));

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
