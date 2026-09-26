public class Main {
    static void main(String[] args) {
        String nombre = "Kratos";
        int energia = 60;
        int nivel = 15;
        double vida = 80.5;
        boolean tieneArma = true;
        int nivelRequerido = 10;
        int energiaRequerida = 50;
        String puedeComenzarMision;
        if ((nivel >= nivelRequerido) && (energia >= energiaRequerida) && (tieneArma == true)){
            puedeComenzarMision = "Puede comenzar la misión";

        }else{
            puedeComenzarMision = "No puede comenzar la misión";
        }
        System.out.println("Energía: "+ energia);
        System.out.println("Nivel: "+ nivel);
        System.out.println("Arma: "+ tieneArma);
        System.out.println(puedeComenzarMision);
    }
}
