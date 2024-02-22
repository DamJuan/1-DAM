import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
    private final ArrayList<Producto> productos;
    private final double MAXSTOCK = 1000;

    private int stock;
    private double precio;


    public Almacen() {

        Scanner sc = new Scanner(System.in);

        productos = new ArrayList<>();

        do {

            System.out.println("Bienvenido al almacen que desea hacer: \n" + "1: Insertar productos \n" + "2: Ver el stock actual \n" + "3: Sacar prductos del almacen");

            int eleccionMenu = sc.nextInt();
            switch (eleccionMenu) {
                case 1:

                    System.out.println("Has elegido agregar un producto");

                    System.out.println("Introduce el nombre del producto");
                    String nombre = sc.next();

                    System.out.println("Introduce el tipo del producto");
                    String tipoProducto = sc.next();

                    System.out.println("Introduce el año de caducidad de caducidad:");
                    int fechaCaducidad = sc.nextInt();

                    System.out.println("Introduce el numero de lote:");
                    int numLote = sc.nextInt();

                    System.out.println("Introduce el precio del producto:");
                    double precioProducto = sc.nextDouble();

                    System.out.println("Introduce la cantidad del producto");
                    int cantidad = sc.nextInt();

                    if (precioProducto == 0 && cantidad == 0) {
                        System.out.println("No se puede introducir un producto con valor o cantidad 0");
                    } else {

                        System.out.println("Introduciendo los productos");
                        agregarProducto(fechaCaducidad, numLote, precio, cantidad, nombre, tipoProducto);
                    }

                    break;

                case 2:
                    System.out.println("Has elegido ver el stock actual");

                    if (productos.size() == 0) {
                        System.out.println("No se a introducido ningun producto");
                    } else {
                        for (int i = 0; productos.size() > i; i++) {
                            productos.get(i);
                        }
                    }

                    break;

                case 3:
                    System.out.println("Has elegido sacar productos del almacen");
                    if (productos.size() == 0) {
                        System.out.println("No se a introducido ningun producto");
                    } else {
                        System.out.println("Introduce la posicion del producto:");
                        int posicion = sc.nextInt();

                        System.out.println("Introduce la cantidad del producto:");
                        int cantidadSacar = sc.nextInt();

                        productos.remove(posicion);

                        System.out.println("Sacando " + cantidadSacar + "Productos");

                    }
                    break;

                default:
                    System.out.println("El valor introducido no existe");
            }


        } while (sc.nextLine().equalsIgnoreCase("s"));

        sc.close();

    }

    public void agregarProducto(int fechaCaducidad, int numeroLote, double precio, int cantidad, String nombre, String tipoProducto) {
        productos.add(new Producto(fechaCaducidad, numeroLote, precio, cantidad, nombre, tipoProducto));
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getMaxStock() {
        return MAXSTOCK;
    }
}
