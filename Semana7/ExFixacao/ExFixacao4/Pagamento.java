package Semana7.ExFixacao.ExFixacao4;

public class Pagamento {
    private void pagamento(String metodo, double valor) throws MoedaInvalidaException, NotaInvalidaException, ErroLeituraCartaoException{
        if (metodo == "nota" && valor <= 0) {
            throw new NotaInvalidaException("Nota inválida");
        }
        if (metodo == "moeda" && valor <= 0) {
            throw new MoedaInvalidaException("Moeda inválida");
        }
        if (metodo == "cartao" && valor <= 0) {
            throw new ErroLeituraCartaoException("Cartão inválida");
        }

        System.out.println("Pagamento aceito");

    }

    public static void main(String[] args){
        Pagamento pagamento = new Pagamento();

        System.out.println("-".repeat(40));
        try {
            pagamento.pagamento("cartao", 1);
        } catch (MoedaInvalidaException|NotaInvalidaException|ErroLeituraCartaoException e) {
            e.printStackTrace();
        }
        System.out.println("-".repeat(40));
    }
}
