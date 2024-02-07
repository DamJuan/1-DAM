package MultiplicationGame;


import java.util.Scanner;

public abstract class MultiplicationGame {
    protected int numPlayers;
    protected String[] players;
    protected int currentPlayer;
    protected MultiplicationProblem problem;

    public MultiplicationGame(int numPlayers) {
        this.numPlayers = numPlayers;
        players = new String[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = "Player " + (i + 1);
        }
        currentPlayer = 0;
        problem = new MultiplicationProblem();
    }

    public abstract void play();

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
}
