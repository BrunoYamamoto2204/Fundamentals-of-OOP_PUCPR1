package Semana3.ExFixacao_6;

public class Main {
    public static void main(String[] args){

        System.out.println("-".repeat(40));

        UsuarioGoogle usuario = new UsuarioGoogle("email@gmail.com", "senha123");

        System.out.println("Dados atuais:");
        System.out.printf("Email: %s", usuario.getEmail());
        System.out.printf("\nSenha: %s", usuario.getSenha());

        usuario.setEmail("novoemail@gmail.com");
        usuario.setSenha("novasenha123");

        System.out.println("\n\nDados atualizados:");
        System.out.printf("Email: %s", usuario.getEmail());
        System.out.printf("\nSenha: %s", usuario.getSenha());

        System.out.println();
        System.out.println("-".repeat(40));
    }
}
