import java.util.ArrayList;

public class Almacen {
    private final int CAPACIDADMAXIMA = 1000;
    private int capacidadActual;
    private ArrayList<Producto> productosAlmacenados;

    public Almacen(ArrayList<Producto> productosAlmacenados) {
        this.productosAlmacenados = productosAlmacenados;
        this.capacidadActual = 0;
    }

    public int getCAPACIDADMAXIMA() {
        return CAPACIDADMAXIMA;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    // falta ordenar los productos almacenados
    public void almacenar(Producto producto) {
        if (producto.getPrecio() <= 0 || producto.getStock() <= 0 || capacidadActual >= CAPACIDADMAXIMA) {
            System.out.println("Error, el producto introducido tiene un precio o stock no validos o el almacen esta lleno");
        } else {
            productosAlmacenados.add(producto);
            System.out.println(producto.getNombre() + " almacenado con exito");
            capacidadActual++;
        }
    }

    public void almacenar(ArrayList<Producto> productos){
        for (Producto producto: productos){
            if (producto.getPrecio() <= 0 || producto.getStock() <= 0 || capacidadActual >= CAPACIDADMAXIMA) {
                System.out.println("Error, el producto introducido tiene un precio o stock no validos o el almacen esta lleno");
            } else {
                productosAlmacenados.add(producto);
                System.out.println(producto.getNombre() + " almacenado con exito");
                capacidadActual++;
            }
        }
    }

    public int verStock(Producto producto) {
        if (!productosAlmacenados.contains(producto)) {
            System.out.println("El producto no existe en nuestro almacen");
            return 0;
        } else {
            return producto.getStock();
        }
    }

    public void sacarStock(Producto producto, int stockASacar){
        if (restarStock(producto,stockASacar) >= 0){
            producto.setStock(restarStock(producto,stockASacar));
            System.out.println(stockASacar + " de stock de  " + producto.getNombre() + " sacada con exito del almacen");
        } else {
            int stockSacado = (producto.getStock() - stockASacar) + stockASacar;
            producto.setStock(0);
            System.out.println(producto.getNombre() + " no tenia stock suficiente para la operación así que se ha sacado el máximo posible, siendo este " + stockSacado);
        }
        }


        private int restarStock(Producto producto, int stockAsacar){
        return producto.getStock() - stockAsacar;
        }
    }
