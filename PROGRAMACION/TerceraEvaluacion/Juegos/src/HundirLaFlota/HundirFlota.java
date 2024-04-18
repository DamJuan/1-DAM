package HundirLaFlota;

import java.io.*;
import java.util.Scanner;

public class HundirFlota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Hundir la Flota");
        System.out.println("Conoces las reglas del juego? S/N:");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("N")) {
            mostrarInstrucciones();
        } else if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Vamos a jugar!");
        }

        System.out.println("Contra quién quieres jugar? Jugador o Máquina?");
        String PVPoPVE = sc.nextLine();
    }


    public static void mostrarInstrucciones() {
        final File reglas = new File("src\\HundirLaFlota\\Reglas.");
        System.out.println("A continuación se mostrarán las reglas del juego:");

        try {
            BufferedReader br = new BufferedReader(new FileReader(reglas));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

    }



    //TODO 2: Preguntar si se quiere jugar contra jugador o contra la máquina
    //TODO 3: MIRAR COMO HACER (Si se juega contra la máquina, preguntar si se quiere jugar en modo fácil o difícil)
    //TODO 4: Preguntar nombre del jugador o jugadores
    //TODO 5: Mostrar el tablero del jugador 1 y los barcos disponibles
    //TODO 6: Preguntar al jugador 1 dónde quiere colocar los barcos
    //TODO 7: Mostrar el tablero del jugador 2 y los barcos disponibles
    //TODO 8: Preguntar al jugador 2 dónde quiere colocar los barcos
    //TODO 9: Comenzar el juego

}

//TODO: Hacer un array bidimensional con las coordenadas
