package Semana3.ExFixacao_7;

public class VagaLinkedin {
    private String empresa;
    private String posicao;
    private String descricao;

    public VagaLinkedin(String empresa, String posicao, String descricao){
        this.empresa = empresa;
        this.posicao = posicao;
        this.descricao = descricao;
    }

    // set
    public void setEmpresa(String novaEmpresa){
        this.empresa = novaEmpresa;
    }
    public void setPosicao(String novaPosicao){
        this.posicao = novaPosicao;
    }
    public void setDescricao(String novaDescricao){
        this.descricao = novaDescricao;
    }

    // get
    public String getEmpresa(){
        return this.empresa;
    }
    public String getPosicao(){
        return this.posicao;
    }
    public String getDescricao(){
        return this.descricao;
    }
}
