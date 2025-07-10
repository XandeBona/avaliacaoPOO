public class MultaFixaPorTipo implements ICalculadoraDeMulta{
    @Override
    public double escolhaDeMulta(UsuarioBiblioteca usuario) {
        return usuario.calcularMulta();
    }
}
