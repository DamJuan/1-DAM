import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DinosaurGame extends JFrame implements KeyListener {
    private Juego juego;
    private long tiempoInicio;

    public DinosaurGame() {
        setTitle("Dinosaur Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        juego = new Juego();
        tiempoInicio = System.currentTimeMillis();

        addKeyListener(this);

        Timer timer = new Timer(20, e -> {
            if (!juego.isGameOver()) {
                juego.actualizar();
                repaint();
            }
        });
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        juego.dibujar(g);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        long tiempoTranscurrido = (System.currentTimeMillis() - tiempoInicio) / 1000;
        g.drawString("Tiempo: " + tiempoTranscurrido + "s", 10, 20);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            DinosaurGame game = new DinosaurGame();
            game.setVisible(true);
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE && !juego.getDinosaurio().isSaltando()) {
            juego.getDinosaurio().saltar();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

class Dinosaurio {
    private int x, y;
    private int velocidadY;
    private boolean saltando;
    private int alturaSuelo;

    public Dinosaurio(int x, int y) {
        this.x = x;
        this.y = y;
        velocidadY = 0;
        saltando = false;
        alturaSuelo = y;
    }

    public void actualizar() {
        if (saltando) {
            velocidadY += 1;
            y += velocidadY;

            if (y >= alturaSuelo) {
                y = alturaSuelo;
                saltando = false;
                velocidadY = 0;
            }
        }
    }

    public void dibujar(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y - 30, 30, 30);
    }

    public void saltar() {
        if (!saltando) {
            saltando = true;
            velocidadY = -15;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSaltando() {
        return saltando;
    }

    public int getVelocidadY() {
        return velocidadY;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y - 30, 30, 30);
    }
}

class Obstaculo {
    private int x, y, ancho, altura;
    private int velocidad;

    public Obstaculo(int x, int y, int ancho, int altura) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.altura = altura;
        velocidad = 10;
    }

    public void actualizar() {
        x -= velocidad;
    }

    public void dibujar(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, ancho, altura);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAltura() {
        return altura;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, ancho, altura);
    }
}

class Juego {
    private Dinosaurio dinosaurio;
    private List<Obstaculo> obstaculos;
    private int puntaje;
    private boolean gameOver;

    public Juego() {
        dinosaurio = new Dinosaurio(100, 450);
        obstaculos = new ArrayList<>();
        puntaje = 0;
        gameOver = false;
    }

    public void actualizar() {
        dinosaurio.actualizar();

        if (!gameOver) {
            puntaje++;

            if (puntaje % 100 == 0) {
                Random random = new Random();
                int altura = random.nextInt(80) + 20;
                obstaculos.add(new Obstaculo(800, 450 - altura, 20, altura));
            }

            Iterator<Obstaculo> iter = obstaculos.iterator();
            while (iter.hasNext()) {
                Obstaculo obstaculo = iter.next();
                obstaculo.actualizar();

                if (obstaculo.getBounds().intersects(dinosaurio.getBounds())) {
                    if (dinosaurio.getY() + 30 - dinosaurio.getVelocidadY() <= obstaculo.getY() + obstaculo.getAltura()) {
                        iter.remove();
                    } else {
                        gameOver = true;
                        break;
                    }
                }
            }

            obstaculos.removeIf(obstaculo -> obstaculo.getX() + obstaculo.getAncho() < 0);
        }
    }

    public void dibujar(Graphics g) {
        dinosaurio.dibujar(g);

        for (Obstaculo obstaculo : obstaculos) {
            obstaculo.dibujar(g);
        }

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Puntuación: " + puntaje, 10, 20);

        if (gameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over", 300, 150);
            g.drawString("Puntuación: " + puntaje, 300, 200);
        }
    }

    public Dinosaurio getDinosaurio() {
        return dinosaurio;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
