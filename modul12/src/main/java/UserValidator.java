public class UserValidator {
    public void validateAge(int age) {
        if (age <= 15) {
            System.out.println("Too young!");
        } else {
            System.out.println("User age is okey!");
        }
    }
    public void validateSex(char sex) {
        if (sex == 'm') {
            System.out.println("User is a male");
        } else if (sex == 'f') {
            System.out.println("User is a female");
        } else {
            System.out.println("Unknown sex!");
        }
    }
}
class Application {
    public static void main (String[] args){
        System.out.println("Starting...");
        int age = 15;
        char sex = 'm';
        UserValidator validator = new UserValidator();
        validator.validateAge(age);
        validator.validateSex(sex);
        System.out.println("End of the program");
    }
}
