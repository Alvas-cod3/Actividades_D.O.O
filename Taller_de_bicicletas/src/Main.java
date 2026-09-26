public class Main {
    public static void main(String[] args) {
        GestorBicicletas gestor = new GestorBicicletas();// Se instancia el gestor
        BicicletaElectrica eBike1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, false, false, 60);
        BicicletaElectrica eBike2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, false, true, 45);
        BicicletaMontanya montanyaBike3 = new BicicletaMontanya("BIC-M01", 2021,
                13.5, 2);
        BicicletaMontanya montanyaBike4 = new BicicletaMontanya("BIC-M02", 2020,
                12.0, 1);

        //Buscar por codigo
        System.out.println("==BUSCANDO: BIC-E01");
        eBike1.activarGarantia();
        gestor.registrarBicicleta(eBike1);
        gestor.registrarBicicleta(eBike2);
        gestor.registrarBicicleta(montanyaBike3);
        gestor.registrarBicicleta(montanyaBike4);
        Bicicleta encontrada = gestor.buscarBicicleta("BIC-E01");
        if (encontrada != null) {
            System.out.println("\n Bicicleta encontrada");
            System.out.println(encontrada);
        } else {
            System.out.println("No encontramos una bicicleta con ese codigo :(");
        }
        System.out.println("LISTADO DE BICICLETAS:");
        gestor.listarBicicletas();

    }
}
