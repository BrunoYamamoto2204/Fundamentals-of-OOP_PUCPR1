package Semana7.ExFixacao.ExFixacao1;

class UploadDeVideo {
    protected double tamanho;
    protected boolean conexaoWifi;

    public UploadDeVideo(double tamanho, boolean conexaoWifi){
        this.tamanho = tamanho;
        this.conexaoWifi = conexaoWifi;
    }

    public void upload() throws UploadErrorException{
        if (!conexaoWifi) {
            throw new NetworkErrorException("Você está offline. Conecte-se à internet");
        }
        if (tamanho > 3000) {
            throw new FileTooLargeException("Arquivo muito grande! Máximo de 3GB");
        }
        else {
            System.out.println("Upload realizado com sucesso!");
        }
    }
}

