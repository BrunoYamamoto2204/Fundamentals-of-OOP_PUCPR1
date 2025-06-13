package Semana3.ExFixacao_2;

class Corrida {
    private String localizacaoAtual;
    private String destino;
    private float precoEstimado;

    public Corrida(String localizacaoAtual, String destino, float precoEstimado){
        this.localizacaoAtual = localizacaoAtual;
        this.destino = destino;
        this.precoEstimado = precoEstimado;
    }

    // get
    public String getLocalizacaoAtual(){
        return this.localizacaoAtual;
    }
    public String getDestino(){
        return this.destino;
    }
    public float getPrecoEstimado(){
        return this.precoEstimado;
    }

    //set
    public void setLocalizacaoAtual(String novoLocal){
        this.localizacaoAtual = novoLocal;
    }
    public void setDestino(String novoDestino){
        this.destino = novoDestino;
    }
    public void setPrecoEstimado(float novoPreco){
        this.precoEstimado = novoPreco;
    }

}
public class CorridaUber{
    public static void main(String[] args){
        System.out.println("-".repeat(40));

        Corrida corrida = new Corrida("Localizacao A", "Localizacao B", 20);

        System.out.println("Dados atuais:");
        System.out.printf("Localização atual: %s", corrida.getLocalizacaoAtual());
        System.out.printf("\nLocalização de destino: %s", corrida.getDestino());
        System.out.printf("\nPreço da corrida: R$%.2f", corrida.getPrecoEstimado());

        corrida.setLocalizacaoAtual("Localizacao C");
        corrida.setDestino("Localizacao D");
        corrida.setPrecoEstimado(30);

        System.out.println("\n\nDados modificados:");
        System.out.printf("Localização Atual atualizada: %s", corrida.getLocalizacaoAtual());
        System.out.printf("\nLocalização de destino atualizada: %s", corrida.getDestino());
        System.out.printf("\nPreço da corrida atualizado: R$%.2f", corrida.getPrecoEstimado());

        System.out.println();
        System.out.println("-".repeat(40));
    }
}
