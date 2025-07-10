import java.util.List;

public class Biblioteca {

    //Cria os atributos de inteface
    private IMensagem mensagem;
    private ICalculadoraDeMulta calculadoraDeMulta;

    //Construtor do IMensagem
    public Biblioteca(IMensagem mensagem, ICalculadoraDeMulta calculadoraDeMulta) {
        this.mensagem = mensagem;
        this.calculadoraDeMulta = calculadoraDeMulta;
    }

    public void processarMultas(List<UsuarioBiblioteca> usuarios) {
        double multa = 0;

        for (UsuarioBiblioteca usuario : usuarios) {
            //puxa da interface ICalculadoraDeMulta
            multa = calculadoraDeMulta.escolhaDeMulta(usuario);
            //puxa da interface IMensagem
            mensagem.enviarMensagem(usuario.getResumo() + " A multa é de R$" + multa);
        }
    }
}
