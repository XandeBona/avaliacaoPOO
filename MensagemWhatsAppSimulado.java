public class MensagemWhatsAppSimulado implements IMensagem{
    @Override
    public void enviarMensagem(String msg) {
        System.out.println("WhatsApp: " + msg);
    }
}
