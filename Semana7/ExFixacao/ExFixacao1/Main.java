//Imagine que você está criando um recurso de upload de vídeo para um aplicativo semelhante ao TikTok. Crie uma classe
//UploadDeVideo com um método upload(). Esse método deve simular o lançamento de exceções como FileTooLargeException e
//NetworkErrorException. Use um bloco try-catch para lidar com essas exceções.

package Semana7.ExFixacao.ExFixacao1;

public class Main {

    public static void main(String[] args) {
        System.out.println("-".repeat(40));

        UploadDeVideo video = new UploadDeVideo(2000, true);

        try {
            video.upload();
        } catch (UploadErrorException e){
            System.out.println("Erro: " + e);
        }

        System.out.println("-".repeat(40));
    }
}
