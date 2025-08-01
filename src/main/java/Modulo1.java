public class Modulo1 {
    public static void main(String[] args) {
        int numberOne = 24;
        int numberTwo = 6;
        int modulo = numberOne % numberTwo;

        System.out.println(modulo);

        if (modulo == 0 ) {
            System.out.println("Nie ma modulo");
        } else {
            System.out.println("Modulo = " + modulo);
        }


    }
}
