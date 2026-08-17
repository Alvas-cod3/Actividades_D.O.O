public class Main {
    //El inicio de la app
    public static void main(String[] args){

        System.out.println("BIENVENIDO A TECH STORE");

        //crear objeto o instancia
        // 1- NombreClase, 2- nombreObjeto, 3 = new NombreClase, 4(poblar argumentos = datos del producto)
        Producto cargador = new Producto("Cargador Iphone carga rápida", 100000.0, 20);
        Producto teclado = new Producto("Teclado mecánico RedDragon", 26000.0, 20);
        //Ejecutar el método sin argumentos
        cargador.mostrarInformacion();
        teclado.mostrarInformacion();
        //Venta // Con argumento
        System.out.println("--VENTAS--");
        cargador.vender(10);
        teclado.vender(15);
        System.out.println("Actualización Stock: ");
        cargador.mostrarInformacion();
        teclado.mostrarInformacion();

        //IVA // Metodo con return
        System.out.println("---PRECIO CON IVA---");
        double precioConIva = teclado.calcularPrecioConIva();
        System.out.println("Precio con IVA del teclado: " + precioConIva);

        //Mostrar precio de la compra
        System.out.println("Compra normal");
        int cantidad = 3;
        //calcular el total usando el metodo con arg y return
        double totalcompra = teclado.calcularPrecioFinal(cantidad, 20.0);
        // mostrar retorno
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + totalcompra);

        // mostrar sobrecarga
        System.out.println("Compra con descuento");
        double totalDescuento = teclado.calcularPrecioFinal(2, 30);
        // mostrar total despues del descuento
        System.out.println("Total con 30% de descuento: " + totalDescuento);

        System.out.println("Final del programa TECH STORE");
    }
}
