public class BicicletaMontanya extends Bicicleta{
    private int numeroDeSuspensiones;

    public BicicletaMontanya(String codigo, int anioFabricacion, double peso, int numeroDeSuspensiones) {
        super(codigo, anioFabricacion, peso);
        setNumeroDeSuspensiones(numeroDeSuspensiones);
    }

    public void setNumeroDeSuspensiones(int numeroDeSuspensiones) {
        if(numeroDeSuspensiones < 0){
            throw new IllegalArgumentException("El numero de suspensiones debe ser mayor o igual a 0");
        }else{this.numeroDeSuspensiones = numeroDeSuspensiones;}
    }
    @Override
    public double calcularCosto() {
        double COSTO_BASE = 30000.0;
        double suspensionesDoub = numeroDeSuspensiones;
        //se calcula la tarifa extra 15% por cada suspension
        double costoFinal = COSTO_BASE + ((COSTO_BASE * 0.85) * suspensionesDoub);
        return costoFinal;
    }

    @Override
    public String toString() {
        return "Tipo: BicicletaMontanya /" +
                "numeroDeSuspensiones: " + numeroDeSuspensiones +
                '/' + super.toString();
    }
}
