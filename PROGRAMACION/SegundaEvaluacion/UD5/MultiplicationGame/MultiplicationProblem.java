package MultiplicationGame;
import MultiplicationGame.*;

class MultiplicationProblem {
    private int num1;
    private int num2;
    private int answer;

    public MultiplicationProblem() {
        java.util.Random rand = new java.util.Random();
        num1 = rand.nextInt(50) + 1;
        num2 = rand.nextInt(50) + 1;
        answer = num1 * num2;
    }

    public int getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return num1 + " * " + num2;
    }
}