import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int playerScore = 0;
        int cpuScore = 0;
        int playerResult = 0;
        int cpuResult = 0;
        int move = 0;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        
        while (choice != 2) {
            try {
                System.out.println("\nDo you want to play ROCK, PAPER, SCISSORS?" +
                "\n 1. Yes" + "\n 2. No");
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid character");
                input.nextLine();
            }
            
            if (choice == 1) {
                
                try {
                    Player playerObject = new Player();
                    Random random = new Random();
                    int CPU = random.nextInt(1, 4);

                    System.out.println("What name do you want to add?");
                    playerObject.setName(input.nextLine());

                    System.out.println(
                            "\nThe game is ROCK, PAPER and SCISSORS" +
                            "\n Choose one of these options to play against the CPU" +
                            "\n 1 = ROCK" +
                            "\n 2 = PAPER" +
                            "\n 3 = SCISSORS");

                    move = input.nextInt();

                    if (move == 1) {
                        playerResult = rock;
                    } else if (move == 2) {
                        playerResult = paper;
                    } else if (move == 3) {
                        playerResult = scissors;
                    } else {
                        System.out.println("Invalid move");
                    }

                    if (CPU == 1) {
                        cpuResult = rock;
                    } else if (CPU == 2) {
                        cpuResult = paper;
                    } else if (CPU == 3) {
                        cpuResult = scissors;
                    } else {
                        System.out.println("Invalid move");
                    }

                    if (cpuResult == 1 && playerResult == 3 || cpuResult == 3 && playerResult == 2) {
                        System.out.println("\nMatch result: " + playerObject.getName() + " lost!");
                        playerScore = playerObject.getLoss();
                        cpuScore = playerObject.getWin();

                    } else if (playerResult == 1 && cpuResult == 3
                            || playerResult == 3 && cpuResult == 2) {

                        System.out.println("\nMatch result: " + playerObject.getName() + " won!");
                        playerScore = playerObject.getWin();
                        cpuScore = playerObject.getLoss();

                    } else if ((playerResult == 1 && cpuResult == 1)
                            || (playerResult == 2 && cpuResult == 2)
                            || (playerResult == 3 && cpuResult == 3)) {

                        System.out.println("\nMatch result: " +
                                playerObject.getName() + " tied!");
                        playerScore = playerObject.getDraw();
                        cpuScore = playerObject.getDraw();
                    }

                    System.out.println("\nROCK, PAPER, SCISSORS RANKING " +
                            "\n" + playerObject.getName() + " : " + playerScore +
                            "\nCPU : " + cpuScore);

                } catch (Exception e) {
                    System.out.println("Invalid character");
                    input.nextLine();
                }
            }
        }
        input.close();
    }
}
