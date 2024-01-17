import java.util.Scanner;
public class Gerenciador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculo calc = new Calculo();
        int escolha = 0, quantidade;








        while (true){

            System.out.println("==Estoque==\n\n");
            System.out.println("Ação:\n1-Adicionar\n2-Retirar\n3-Ver estoque\n4-Sair ");
            escolha = ler.nextInt();

            if (escolha == 1) {
                System.out.println("Entre a quantidade:");
                quantidade = ler.nextInt();
                calc.adicionar(quantidade);
                System.out.println("===================");
                System.out.println("Ação concluída!\n\n" + quantidade + " itens adicionados.");
                escolha = 0;

            } else if (escolha == 2) {
                System.out.println("Entre a quantidade:");
                quantidade = ler.nextInt();
                calc.remover(quantidade);
                System.out.println("===================");
                System.out.println("Ação concluída!\n\n" + quantidade + " itens removidos.");
                escolha = 0;



            } else if (escolha == 3) {
                System.out.println("\n\n\n\n==========Estoque==========");
                System.out.println("\nItens totais: " + calc.getQuantidadeEst());
                System.out.println("\n===========================");
                escolha = 0;



            } else if (escolha == 4) {

                System.out.println("Obrigado!");
                break;

            }
        }
    }
}