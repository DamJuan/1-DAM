package UD9.ahorcado.nacho.clases;

public class Dibujo {

    private String dibujoMunyeco;

    public Dibujo() {
        super();
    }

    public String getDibujoMunyeco() {
        return dibujoMunyeco;
    }

    public void setDibujoMunyeco(int numIntento) {

        if (numIntento == 12) {
            this.dibujoMunyeco = "";
        } else if (numIntento == 11) {
            this.dibujoMunyeco = "=============";
        } else if (numIntento == 10) {
            this.dibujoMunyeco = """
                          
                          |
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 9) {
            this.dibujoMunyeco = """
                          
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 8) {
            this.dibujoMunyeco = """
                          _________
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 7) {
            this.dibujoMunyeco = """
                          _________
                          |       |
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 6) {
            this.dibujoMunyeco = """
                          _________
                          |       |
                          |       0
                          |
                          |
                          |
                          |
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 5) {
            this.dibujoMunyeco = """
                          _________
                          |       |
                          |       0
                          |       |
                          |       |
                          |
                          |
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 4) {
            this.dibujoMunyeco = """
                          _________
                          |       |
                          |       0
                          |      /|\\
                          |       |
                          |
                          |
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 3) {
            this.dibujoMunyeco = """
                          _________
                          |       |
                          |       0
                          |      /|\\
                          |       |
                          |       |
                          |      / \\
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 2) {
            this.dibujoMunyeco = """
                          _________
                          |       |
                          |       0
                          |      /|\\
                          |     / | \\
                          |       |
                          |      / \\
                          |     /   \\
                          |
                          |
                          |
                        =============""";
        } else if (numIntento == 1) {
            this.dibujoMunyeco = """
                          _________
                          |       |
                          |       0
                          |      /|\\
                          |     / | \\
                          |    w  |  w
                          |      / \\
                          |     /   \\
                          |
                          |
                        =============""";
        } else {
            this.dibujoMunyeco = """
                          _________
                          |       |
                          |       0
                          |      /|\\
                          |     / | \\
                          |    w  |  w
                          |      / \\
                          |     /   \\
                          |   --     --
                          |
                        =============""";
        }
    }
}
