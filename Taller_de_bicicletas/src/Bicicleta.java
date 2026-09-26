public abstract class Bicicleta {
    //El taller trabaja con distintos tipos de bicicletas;
    //aunque todas comparten información básica como código de bicicleta, año de fabricación
    //y peso,
    private String codigo;
    private int anioFabricacion;
    private double peso;

    public Bicicleta(String codigo, int anioFabricacion, double peso) {
        setCodigo(codigo);
        setAnioFabricacion(anioFabricacion);
        setPeso(peso);
    }


    public void setCodigo(String codigo) {
        if (codigo != null || codigo.trim().isEmpty()) {
            this.codigo = codigo;
        }else{
            throw new IllegalArgumentException("El codigo es invalido. No debe estar vacío");
        }
    }


    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion <= 0 || anioFabricacion > 2026) {
            throw new IllegalArgumentException("Anio fabricacion invalido");
        }else{
            this.anioFabricacion = anioFabricacion;
        }
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Anio fabricacion invalido");
        }else{
            this.peso = peso;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    abstract double calcularCosto();

    @Override
    public String toString() {
        return
                "codigo: " + codigo + '\'' +
                ",/ anioFabricacion " + anioFabricacion +
                ",/ peso: " + peso +
                "gramos";
    }

    public int getAnyo() {
        return anioFabricacion;
    }
}
