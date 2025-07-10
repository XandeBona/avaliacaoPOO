public class Professor extends UsuarioBiblioteca {

    public Professor(String nome, Integer diasAtraso) {
        super(nome, diasAtraso);
    }

    @Override
    public double calcularMulta() {
        return diasAtraso * 0.25;
    }
}
