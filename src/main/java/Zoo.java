import java.util.*;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private List<Visitor> visitors = new ArrayList<>();


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public Map<AnimalType, Integer> animalFrequency () {
        Map<AnimalType, Integer> freqTable = new HashMap<>();
        // todo calculate frequency of each animaltype
        for (Animal animal : animals) {
            AnimalType animalType = animal.getTypeOfAnimal();

            if (freqTable.containsKey(animalType)) {
                int count = freqTable.get(animalType);
                freqTable.put(animalType, count+1);
            } else {
                freqTable.put(animalType, 1);
            }
        }
        return freqTable;
    }

    public void sortAndPrintAnimalsByName() {
        Collections.sort(animals);
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public void sortAndPrintAnimalsByAge() {
        animals.sort((animal1, animal2) -> {
            return animal1.getAge() - animal2.getAge();
        });
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public void simulate() {
        List<Acting> actors = new ArrayList<>();
        actors.addAll(animals);
        actors.addAll(visitors);

        Collections.shuffle(actors);
        for (Acting actor : actors) {
            actor.doAct();
        }
    }

}
