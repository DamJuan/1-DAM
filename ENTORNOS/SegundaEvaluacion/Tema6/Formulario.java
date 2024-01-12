// Parte de diseño

import javax.swing.*; // importamos todos los elementos de la librería swing

public class Formulario extends JFrame { // extends = herencia que nos ayuda a importar cosas que han hecho otras
    // personas y se agregan dentro del JDK
    // JFrame nos permite crear interfaces gráficas.

    private JLabel label1;// etiqueta que muestra algo por pantalla
    // Los labels siempre deberían de ser de tipo privado ya
    // que solo la vamos a utilizar en la interfaz que estamos
    // programando
    public Formulario() {// constructores -> debe tener el mismo nombre que la clase
        setLayout(null); // Vamos a indicar la posición. Null evitamos que el ide
        // nos lo ponga donde quiera.
        label1 = new JLabel("Estos es una prueba!!");
        label1.setBounds(10, 20, 200, 300);
        add(label1);
    }

    public static void main(String args[]){
        Formulario formulario1 = new Formulario();// vamos hacer uso de la clase Jframe
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null); // que aparezca en el centro de la pantalla
    }
}