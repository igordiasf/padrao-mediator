package padroescomportamentais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioEmpresa(String mensagem) {
        return "Agradecemos seu contato."+
                "A Empresa respondeu sua demanda conforme mensagem a seguir." +
                ">>" + Empresa.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoEmpresa(String mensagem) {
        return "Agradecemos seu contato."+
                "A Empresa respondeu sua demanda conforme mensagem a seguir." +
                ">>" + Empresa.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoEmpresa(String mensagem) {
        return "Agradecemos seu contato."+
                "A Empresa respondeu sua demanda conforme mensagem a seguir." +
                ">>" + Empresa.getInstancia().receberSugestao(mensagem);
    }

}
