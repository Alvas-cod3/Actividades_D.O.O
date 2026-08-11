public class Main {
    public static void main(String[] args) {

        //Clase 2 Estructuras de control
        //1 Estructura de control if

        //Almacenar la edad
        int edad = 20;
        System.out.println("== IF ==");
        // IF evalua el True or False
        //Si es True se ejecuta si no, else
        if(edad>= 18){
            System.out.println("La persona es mayor de edad");
        }
        System.out.println("== IF - ELSE ==");
        int edadCliente = 16;

        if(edadCliente >= 18){
            System.out.println("La persona es mayor de edad");

        }else{
            System.out.println("La persona es menor de edad");
        }
        System.out.println("== CONDICIONES COMBINADAS ==");
        int edadUsuario = 22;
        boolean tieneEntrada = true;
        // && = AND = True + True = True
        if(edadUsuario >= 18 && tieneEntrada == true){
            System.out.println("Puede ingresar al concierto");

        }else{
            System.out.println("No puede pasar");

        }

        System.out.println("== ELSE IF ==");
        double nota = 5.5;
        if(nota >= 6.0){
            System.out.println("EXCELENTE");

        } else if (nota >= 5.0) {
            System.out.println("BUENO");

        } else if (nota >= 4.0) {
            System.out.println("APROBADO");

        } else {
            System.out.println("REPROBAO POR FLOJO");
        }
        System.out.println("== SWITCH ==");
        int opcion = 2;

        // Switch = compara un valor con diferentes casos
        switch(opcion){

            case 1:
                System.out.println("Escogiste la opción de crear usuario");
                break;
            case 2:
                System.out.println("Buscar usuario");
                break;
            case 3:
                System.out.println("Eliminar usuario");
                break;
            case 4:
                System.out.println("Salir");
            default:
                System.out.println("Opción inválida, escoja un numero por favor");

        }
        System.out.println("== OPERADORES TERNARIOS ==");

        int edadPersonaTernario = 25;
        //Operador Ternario = permite generar una operacion condicional en una sola linea
        //FUNCIONA CON UN "?" --> IF; : --> ELSE
        String mensajeEdad = edadPersonaTernario >= 18 ? "Mayor de Edad" : "Menor de edad";
        System.out.println("Operador ternario " + mensajeEdad);

        System.out.println("== CASO PRACTICO ==");
        
        //Control de acceso
        
        String nombrePersona = "Camila";
        int edadPersonaC = 17;
        double altura = 1.65;
        boolean tieneEntradaAlaAtraccion = true;
        int tipoEntrada = 1;
        System.out.println("Nombre: "+nombrePersona);
        System.out.println("Edad: "+edadPersonaC);
        System.out.println("Altura: "+altura);
        
        //Tipo de entrada
        switch (tipoEntrada) {
            case 1:
                System.out.println("Entrada general");
                break;
            case 2:
                System.out.println("ENTRADAS VIP");
                break;
            case 3:
                System.out.println("Entrada estudiante");
            default:
                System.out.println("No valida entrada");

        
        }
        // Validación de acceso
        //REvisamos la entrada
        if(!tieneEntrada){
            System.out.println("Acceso Rechazado, no tiene entrada");
            
        } else if (edadPersonaC < 12) {
            System.out.println("Acceso rechazado, no cumple con la edad");
        } else if (altura < 1.48) {
            System.out.println("Acceso rechazadi, no cumple la estatura");
            
        } else{
            System.out.println("Ta bien");
        }
    }



}
