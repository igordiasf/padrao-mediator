package padroescomportamentais.mediator;

public class Funcionario {

    public String elogiarEmpresa(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioEmpresa(mensagem);
    }

    public String reclamarEmpresa(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoEmpresa(mensagem);
    }

    public String sugerirEmpresa(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoEmpresa(mensagem);
    }


}
