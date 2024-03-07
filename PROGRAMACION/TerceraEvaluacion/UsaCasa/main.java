package oovv;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class main {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Casa casa = new Casa();
        try {
            introduirCasa(casa);
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor valido");
        } catch (NoSuchElementException ex) {
            System.out.println("Introduce un valor valido");
        } catch (IllegalStateException exx) {
            System.out.println("Introduce un valor valido");
        } catch (IllegalFormatConversionException exxx) {
            System.out.println("Introduce un valor valido");
        } catch (IndexOutOfBoundsException exxx){System.out.println("Introduce un valor valido");}
        if (casa != null) {
            casa.toString();
        } else {
            System.out.println("No se ha introducido nunguna casa");
        }


    }

    public static void introduirCasa(Casa casa) {
        String carrer;
        int nombre;
        String poblacio;
        char opcionGaraje;
        boolean contieneGaraje;
        double superficie;
        int edadCasa;
        char finalizar;

        System.out.print("Introduix el carrer: ");
        carrer = leer.next();

        System.out.print("Numero: ");
        nombre = leer.nextInt();

        System.out.print("Poblacio: ");
        poblacio = leer.next();

        System.out.print("Tiene garaje? (s / n)");
        opcionGaraje = leer.next().charAt(0);
        if (opcionGaraje == 's') {
            contieneGaraje = true;
        } else {
            contieneGaraje = false;
        }

        System.out.print("Superficie en m\u00B2:");
        superficie = leer.nextDouble();

        System.out.print("Edad casa: ");
        edadCasa = leer.nextInt();

        System.out.print("Desea borrar la casa? (s / n)");
        finalizar = leer.next().charAt(0);
        if (finalizar != 's') {
            casa = new Casa(carrer, nombre, poblacio, superficie, contieneGaraje, edadCasa);
        }

    }

}
