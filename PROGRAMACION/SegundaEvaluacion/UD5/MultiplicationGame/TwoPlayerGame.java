package MultiplicationGame;
import java.util.Scanner;

class TwoPlayerGame extends MultiplicationGame {
    public TwoPlayerGame() {
        super();
    }

    @Override
    public void play() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String player = players[currentPlayer];
            System.out.println("Problem: " + problem);
            System.out.print(player + ", enter your answer: ");
            int guess = sc.nextInt();
            if (guess == problem.getAnswer()) {
                System.out.println("Correct! " + player + " stays in the game.");
            } else {
                System.out.println("Incorrect! " + player + " is out of the game.");
                break;
            }
            currentPlayer = (currentPlayer + 1) % numPlayers;
        }
        sc.close();
    }
}