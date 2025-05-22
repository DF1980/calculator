public class Modulo {


        public static void main (String[] args)
        {
            int numberOne = 29;
            int numberTwo = 7;
            int modulo = numberOne % numberTwo;


            if (modulo == 0 ) {
                System.out.println("Liczba 7 jest dzielnikiem liczby" + " " + numberOne);
            } else {
                System.out.println("Liczba 7 NIE jest dzielnikiem liczby" + " " +  numberOne);
            }
        }

}
