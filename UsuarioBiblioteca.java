public abstract class UsuarioBiblioteca {
    protected String nome;
    protected Integer diasAtraso;

    public UsuarioBiblioteca(String nome, Integer diasAtraso) {
        this.nome = nome;
        this.diasAtraso = diasAtraso;
    }

    public String getResumo() {
        return "Bom dia " + nome + ", seu livro está com " + diasAtraso + " dias de atraso.";
    }

    public abstract double calcularMulta();

}

