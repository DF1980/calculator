interface Animal
    {
        String voice();

        String name();
    }

    class Application {

        public static void main(String args[]) {

            Mouse mouse = new Mouse();
            Dog dog = new Dog();
            Cat cat = new Cat();
            AnimalRecognizer objekt1Animal = new AnimalRecognizer();

            String zmiennaDoObjektuAnimal = objekt1Animal.recognizeee(dog);
           // String zmiennaDoObjektuAnimal = objekt1Animal.recognizeee(new Mouse());
            System.out.println(zmiennaDoObjektuAnimal);

        }

    }

    class Dog implements Animal {

        public String voice() {
            return "Hau hau!";
        }

        public String name() {
            return "Dog";
        }

    }

    class Cat implements Animal {

        public String voice() {
            return "miau!";
        }

        public String name() {
            return "Cat";
        }

    }

    class Mouse implements Animal {

        public String voice() {
            return "pi!";
        }

        public String name() {
            return "Mouse";
        }

    }

    class AnimalRecognizer {
        public String recognizeee(Animal animal) {
            return "I am sure that this is: " + animal.name()
                    + " and sounds like: " + animal.voice();
        }
    }



