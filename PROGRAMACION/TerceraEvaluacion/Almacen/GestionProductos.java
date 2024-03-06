import java.util.ArrayList;

public class GestionProductos {
    public static void main(String[] args) {
        Producto productoCongeladoPrueba = new ProductoCongelado("Patatas fritas","30/09/2004",12378,29.23,200,-43.20);

        ArrayList<Producto> productosAAlmacenar= crearProductosPrueba();
        Almacen almacenPrueba = new Almacen(new ArrayList<>());

        System.out.println("Almacenando productos individuales y en Lista");
        imprimirSeparador();
        almacenPrueba.almacenar(productoCongeladoPrueba);
        almacenPrueba.almacenar(productosAAlmacenar);
        imprimirSeparador();

        System.out.println("Probando sacar a sacar stock de productoCongeladoPrueba");
        imprimirSeparador();
        System.out.println("El productoCongeladoPrueba tiene " + almacenPrueba.verStock(productoCongeladoPrueba) + " unidades en stock");

        almacenPrueba.sacarStock(productoCongeladoPrueba,10);


        System.out.println("El productoCongeladoPrueba tiene " + almacenPrueba.verStock(productoCongeladoPrueba) + " unidades en stock");

        almacenPrueba.sacarStock(productoCongeladoPrueba,200);

        System.out.println("El productoCongeladoPrueba tiene " + almacenPrueba.verStock(productoCongeladoPrueba) + " unidades en stock");

        imprimirSeparador();


        // Comento el codigo de abajo para que el resto de pruebas sean legibles, descomentar para probar la sobrecarga
        /*System.out.println("Probando a sobrecargar el almacen");
        sobrecargarAlmacen(almacenPrueba,productosAAlmacenar);
        */
    }
    public static void imprimirSeparador(){
        System.out.println("----------------------------------------");
    }

    public static void sobrecargarAlmacen(Almacen almacen,ArrayList <Producto> productosSobreCarga){
        while (almacen.getCAPACIDADMAXIMA() > almacen.getCapacidadActual()){
            almacen.almacenar(productosSobreCarga);
            System.out.println("El stock del almacen ahora mismo es " + almacen.getCapacidadActual());
        }
    }
    public static ArrayList<Producto> crearProductosPrueba(){
        Producto productoFrescoPrueba = new ProductoFresco("Patatas","24/02/2024",12345,5.2,20,"19/02/2024","España");
        Producto productoRefrigeradoPrueba = new ProductoRefrigerado("Patatas al horno preparadas","10/06/2024",32456,6.66,66,"666L");

        ArrayList<Producto> productosAAlmacenar = new ArrayList<>();
        productosAAlmacenar.add(productoRefrigeradoPrueba);
        productosAAlmacenar.add(productoFrescoPrueba);

        return productosAAlmacenar;
    }
    }