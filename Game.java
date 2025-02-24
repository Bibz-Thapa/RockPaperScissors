import java.util.Objects;
import java.util.Scanner;

public class Game {

    private String name;
    private int userWin = 0;
    private int computerWin = 0;

    public void startUp() {
        
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Computer computer = new Computer();

        name = scanner.nextLine();
        System.out.println("Nice to meet you " + name + " lets start the game!");
        while (true) {
            String user = userInput.getUserInPut();
            String computer1 = computer.opponent();
            System.out.println("Computer used\n" + computer1);
            String result = whoWins(user, computer1);
            System.out.println(result);

            if (result.equalsIgnoreCase("You win!")) {
                userWin++;
            } else if (result.equalsIgnoreCase("You lose!")) {
                computerWin++;
            }
            System.out.println(name + "'s Score = " + userWin + "     Computers score = " + computerWin );

            if (result.equalsIgnoreCase("Tie! Try again")){
                System.out.println("Refresh it");
                continue;
            }

            if (UserInput.tryAgain()) {
                System.out.println("You did well! See you next time!");
                break;
            }
        }
        scanner.close();
    }

    private String whoWins(String user, String computer1){
        if (user.equals(computer1)) {
            return "Tie! Try again";
        } else if
                        ((user.equals("rock") && computer1.equals("scissors"))||
                        (user.equals("paper") && computer1.equals("rock"))||
                        (user.equals("scissors") && computer1.equals("paper"))) {
            return "You win!";
        }else if
                    ((user.equals("gun") && computer1.equals("rock"))||
                    (user.equals("gun") && computer1.equals("paper"))||
                    (user.equals("gun") && computer1.equals("scissors"))){
            return "Well your right gun always wins!";
        }else {
            return "You lose!";

        }
    }

}
