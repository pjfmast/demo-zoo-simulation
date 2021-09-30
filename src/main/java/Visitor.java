public class Visitor implements Acting, Comparable<Visitor> {
    private String name;

    public Visitor(String name) {
        this.name = name;
    }



    @Override
    public void doAct() {
        System.out.print(name+ ": ");

        int random = (int)(Math.random() * 3);
        switch (random) {
            case 0 -> {
                System.out.println("watches animals");
                break;
            }
            case 1 -> {
                System.out.println("eats and drinks");
                break;
            }
            case 2 -> {
                System.out.println("walks and talks");
                break;
            }
            default -> System.out.println("default visitor behaviour");
        }
    }

    @Override
    public int compareTo(Visitor o) {
        return this.name.compareTo(o.name);
    }
}
