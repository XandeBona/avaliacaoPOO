public class MensagemConsole implements IMensagem{
    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Console: " + msg);
    }
}
