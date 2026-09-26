import java.util.ArrayList;
public class GestorBicicletas {
    private ArrayList<Bicicleta> coleccionBicicletas = new ArrayList<>();
    public void registrarBicicleta(Bicicleta bicicleta){
        coleccionBicicletas.add(bicicleta);//Añade la nueva bicicleta al array de coleccionBicicletas
    }

    public Bicicleta buscarBicicleta(String codigo){
        for (Bicicleta bicicleta : coleccionBicicletas) {
            if (bicicleta.getCodigo().equalsIgnoreCase(codigo)){// equalsIgnoreCase: IGNORA LAS MAYUSCULAS
                return bicicleta;
            }
        }
        return null;
    }
    public void listarBicicletas(){
        for(Bicicleta bicicleta : coleccionBicicletas){
            System.out.println(bicicleta.getCodigo() + bicicleta.getAnyo() + " Costo de mantención: $" + bicicleta.calcularCosto());
            System.out.println("-----------------------");
        }
    }
}
