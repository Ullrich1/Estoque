public class Calculo {

    private int quantidadeEst;

    public Calculo() {
        this.quantidadeEst = 0;
    }

    public int getQuantidadeEst() {
        return quantidadeEst;
    }


    public int adicionar(int quantidade){

         quantidadeEst = quantidade + quantidadeEst;

        return quantidadeEst;
    }

    public int remover (int quantidade){

        if ((quantidadeEst - quantidade) < 0 ){

            System.out.println("Erro!");

        }
    else {
            quantidadeEst = quantidadeEst - quantidade;
        }


        return quantidadeEst;
    }

}
