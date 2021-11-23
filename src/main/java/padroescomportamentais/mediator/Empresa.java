package padroescomportamentais.mediator;

public class Empresa implements Setor {

    private static Empresa instancia = new Empresa();

    private Empresa() {}

    public static Empresa getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "Agradecemos a mensagem:" + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "Agradecemos a mensagem:" + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "Agradecemos a mensagem:" + mensagem;
    }
}
