import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        //Cria o usuario com os dados
        Aluno usuario1 = new Aluno ("Alexandre", 3);
        Professor usuario2 = new Professor ("Gabriel", 3);
        Visitante usuario3 = new Visitante ("Ricardo", 3);


        //Faz a interface puxar a implementação
        IMensagem mensagem = new MensagemWhatsAppSimulado();
        ICalculadoraDeMulta calculadoraDeMulta = new MultaProgressiva();


        //Cria novo objeto contendo as interfaces criadas à cima
        Biblioteca biblioteca = new Biblioteca(mensagem, calculadoraDeMulta);
        //Cria nova lista
        List<UsuarioBiblioteca> usuarios = new ArrayList<>();
        //Adiciona o usuario na lista
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        //Faz executar o envio de mensagem e realiza o calculo da multa
        biblioteca.processarMultas(usuarios);



    }
}
