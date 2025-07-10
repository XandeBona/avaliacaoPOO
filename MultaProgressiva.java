public class MultaProgressiva implements ICalculadoraDeMulta {
    @Override
    public double escolhaDeMulta(int diasAtraso) {
        double calc1 = 0.5 * Math.pow(1 + 0.10, diasAtraso);
        return calc1;
    }

}