import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        Aluno usuario1 = new Aluno ("Alexandre", 3);
        Professor usuario2 = new Professor ("Gabriel", 3);
        Visitante usuario3 = new Visitante ("Ricardo", 3);

        IMensagem mensagem = new MensagemWhatsAppSimulado();

        Biblioteca biblioteca = new Biblioteca(mensagem);
        List<UsuarioBiblioteca> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        biblioteca.processarMultas(usuarios);



    }
}
