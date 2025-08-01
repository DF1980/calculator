abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    abstract public void voice();

}

class Male extends Person {
    public Male(String name) {
        super(name);
    }
    public void voice() {
        System.out.println("Hey there!");
    }
}
class Application {
    public static void main(String args[]) {
        Male nazwaObiektuMale = new Male("Piotr");
        String zmiennaDoKonsoliName = nazwaObiektuMale.getName();
        System.out.println(zmiennaDoKonsoliName);
        nazwaObiektuMale.voice();

    }
}


