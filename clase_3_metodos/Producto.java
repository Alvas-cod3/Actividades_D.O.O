public class Producto {
    //Atributos = características
    private String nombre;
    private double precio;
    private int stock;

    //Constructor = construye objetos = instancias de una clase (producto)
    //debe ser publico, con el mismo nombre de la clase
    //(Argumentos de clase
    public Producto(String nombre, double precio, int stock){
        //Guardar datos recibidos y lo almacenamos en el atributo
        //Para llamar el atributo debe hacerse llamando al atributo con : this.nombreAtributo
        // Atributo = argumento
        this.nombre = nombre;
        this.precio = precio; // Se guardan los atributos dentro del objeto
        this.stock = stock;

    }
    //Metodo sin argumento () y sin retorno = void
    //tipometodo = puublic o private
    //nombremetodo(...)
    //{contenido}
    public void mostrarInformacion(){
        System.out.println("----Producto----");//mostrar título
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    //Método con argumento pero sin retorno
    public void vender(int cantidad){
        //Verificar si hay stock suficiente
        if (cantidad <= stock) {
            //Restar unidades vendidas
            stock -= cantidad;
            //Informar venta realizada
            System.out.println("Venta realizada: " + cantidad + " unidad(es)");
        }else {
            //informar el problema
            System.out.println("El Stock es insuficiente");
        }
    }
    //metodo con argumento pero con retorno
    public double calcularPrecioConIva(){
        //Calculamos el IVA
        double precioConIva = precio * 1.19;
        return precioConIva;
    }
    //metodo con argumento y retorno
    public double calcularPrecioFinal(int cantidad, double descuento){
        //Calcular precio normal de la compra
        double total = precio * cantidad;
        //Calcular descuento
        double montoDescuento = total * descuento/100;
        //Calcular el precio final
        double totalDescuento = total - montoDescuento;
        return totalDescuento;

    }

}
