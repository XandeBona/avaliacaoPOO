public class Aluno extends UsuarioBiblioteca{

    public Aluno(String nome, Integer diasAtraso) {
        super(nome, diasAtraso);
    }

    @Override
    public double calcularMulta() {
        return diasAtraso * 0.5;
    }
}
