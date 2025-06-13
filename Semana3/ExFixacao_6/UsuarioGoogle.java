package Semana3.ExFixacao_6;

public class UsuarioGoogle {
    private String email;
    private String senha;

    public UsuarioGoogle(String email, String senha){
        this.email = email;
        this.senha= senha;
    }

    // set
    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }
    public void setSenha(String novoSenha){
        this.senha = novoSenha;
    }

    // get
    public String getEmail(){
        return this.email;
    }
    public String getSenha(){
        return this.senha;
    }
}
