/*
public String almacenarProductos(ProductoAlmacenado producto) {
    int cantidadAAnadir = producto.getCantidad();

    if (cantidadActual + cantidadAAnadir > LIMITE_ALMACEN) { // LIMITE_ALMACEN = 1000
        int espacioDisponible = LIMITE_ALMACEN - cantidadActual;

        if (espacioDisponible > 0) {
            cantidadAAnadir = espacioDisponible;
        } else {
            return "No hay espacio disponible para almacenar más productos.";
        }
    }

    almacen.add(new ProductoAlmacenado(producto.getNombre(), cantidadAAnadir)); // Crear una nueva instancia del producto para evitar modificaciones externas
    cantidadActual += cantidadAAnadir;

    return "Se han añadido " + cantidadAAnadir + " productos.";
}
*/