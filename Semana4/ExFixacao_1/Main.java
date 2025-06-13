package Semana4.ExFixacao_1;

class Carro {

    public String marca;
    public String modelo;
    public int ano;
    public String placa;

    public Carro (String marca, String modelo, int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    // Set
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Get
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno() {
        return this.ano;
    }
    public String getPlaca(){
        return this.placa;
    }

    public String toString() {
        return "Carro ("+placa+"): "+marca+" "+modelo+" - "+ano;
    }

}

class MotoristaUber{

    public Carro carro;
    public String nome;
    public int idMotorista;

    public MotoristaUber(Carro carro, String nome, int idMotorista){
        this.carro = carro;
        this.nome = nome;
        this.idMotorista = idMotorista;
    }

    // set
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdMotorista(int idMotorista){
        this.idMotorista = idMotorista;
    }

    // Get
    public Carro getCarro() {
        return this.carro;
    }
    public String getNome () {
        return this.nome;
    }
    public int getIdMotorista() {
        return this.idMotorista;
    }

    public String toString() {
        return "Nome: " + nome + "\nId: " + idMotorista + "\n";
    }

    public static void main(String[] args) {

        Carro carro = new Carro("Nissan", "Gtr R34", 1998, "ABC-1223");
        MotoristaUber motorista = new MotoristaUber(carro,"Jonson", 1234);

        System.out.println("-".repeat(40));
        System.out.printf("%s%s", motorista, carro);
        System.out.println();
        System.out.println("-".repeat(40));
    }
}
