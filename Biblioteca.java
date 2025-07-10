import java.util.List;

public class Biblioteca {

    private IMensagem mensagem;

    public Biblioteca(IMensagem mensagem) {
        this.mensagem = mensagem;
    }

    public void processarMultas(List<UsuarioBiblioteca> usuarios) {
        double multa = 0;

        for (UsuarioBiblioteca usuario : usuarios) {
            multa = usuario.calcularMulta();
            mensagem.enviarMensagem(usuario.getResumo() + " A multa é de R$" + multa);
        }
    }
}
