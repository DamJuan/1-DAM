package bingo;

import bingo.clases.Jugador;

public class MenorDeEdadException extends Exception {

        public MenorDeEdadException(Jugador jugador) {
            super("El jugador " + jugador.getNombre() + " es menor de edad");
        }

        public MenorDeEdadException(String mensaje) {
            super(mensaje);
        }
}
