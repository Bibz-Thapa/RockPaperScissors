import java.util.Scanner;

public class UserInput {
    private static Scanner scanner;

    public UserInput(Scanner inPuts) {
        this.scanner = inPuts;
    }
    public String getUserInPut(){

        while (true) {
            System.out.println("Please enter your choice!\nChoose - Rock, Paper or Scissors");
            String  userInPut = scanner.nextLine().toLowerCase();
               if (userInPut.equals("rock") || userInPut.equals("paper") || userInPut.equals("scissors") || userInPut.equals("gun")) {
                return userInPut;

            }
            System.out.println("Invalid Input. Please type rock or paper or scissor.");
        }
    }

    public static boolean tryAgain(){
        while(true){
            System.out.println("Do you want to try again? yes or no - ");
            String tryAgain = scanner.nextLine().toLowerCase();

            switch (tryAgain){
                case "yes":
                    return false;
                case "no":
                    return true;
                default:
                    System.out.println("Invalid input, type yes or no");
            }

        }
    }
}
