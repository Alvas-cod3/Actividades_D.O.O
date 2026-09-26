public class BicicletaElectrica extends Bicicleta
        implements ConGarantiaExtendida
{
    //Variables propias de la clase electrica: Si tiene garantía; la autonomía en km; y si tiene bateria certificada o no.
    private boolean tieneGarantia;
    public double autonomia;
    private boolean tieneBateriaCertificada;

    public BicicletaElectrica(String codigo, int anioFabricacion, double peso, boolean tieneGarantia, boolean tieneBateriaCertificada, double autonomia) {
        super(codigo, anioFabricacion, peso);
        this.tieneGarantia = tieneGarantia;
        this.tieneBateriaCertificada = tieneBateriaCertificada;
        this.autonomia = autonomia;
    }

    //Metodos de Interfaz
    @Override
    public boolean consultorDeGarantia() {
        return tieneGarantia;
    }
    @Override
    public void activarGarantia() {
        this.tieneGarantia = true;
    }
    //Metodos abstractos heredados
    @Override
    public double calcularCosto(){
        double COSTO_BASE = 45000.0;
        double costoFinal;
        if (tieneBateriaCertificada == false){
            //Aumenta el valor base un 25%
            costoFinal = COSTO_BASE * 1.25;
        }else{
            costoFinal = COSTO_BASE;
        }
        return costoFinal;
    }

    @Override
    public String toString() {
        return "Tipo: BicicletaElectrica" +
                "+tieneGarantia: " + tieneGarantia +
                " / , autonomia: " + autonomia +
                "/, tieneBateriaCertificada: " + tieneBateriaCertificada +
                '/' + super.toString();
    }
}
