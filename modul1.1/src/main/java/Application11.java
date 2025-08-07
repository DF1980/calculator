public class Application11 {
    public static void main (String[] args){
        System.out.println("Starting...");
        int age = 19;
        char sex = 'm';
        if (age <= 15) {
            System.out.println("Too young!");
        } else {
            System.out.println("User age is okey!");
            if (sex == 'm') {
                System.out.println("User is a male");
            } else if (sex == 'f') {
                System.out.println("User is a female");
            } else {
                System.out.println("Unknown sex!");
            }
        }
        System.out.println("End of the program");
    }
}

