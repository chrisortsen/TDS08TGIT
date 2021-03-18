import java.util.Scanner;
import javax.swing.JOptionPane;

public class Fabrica{
    public static void main (String[] args){
        Carro carro01;
        carro01 = new Carro();

        Carro carro02;
        carro02 = new Carro();

        //Criação do objeto responsavel por ler a informaçao digitada pelo usuario
        Scanner scan = new Scanner(System.in);
        //Solicitando informacao do usuario
        System.out.println("Digite a cor do carro: ");
        //Lendo a informacao e armazenando em uma variavel chamada cor
        String cor = scan.nextLine();
        //Setando a informaçao no objeto do tipo Carro
        carro01.setCor(cor);
        //Criação do componente de mensagem
        JOptionPane jPane = new JOptionPane();
        //Solicitando informacao ao usuario e armazenando ela em uma variavel chamada cor
        String cor = jPane.showInputDialog("Digite a cor do carro: ");
        //Setando a informaçao no objeto do tipo carro
        carro02.setCor(cor);

        //Pegando as informacoes para imprimir

        System.out.println("Dados do Carro01: ");
        System.out.println("Cor: " + carro01.getCor());
        //Imprimir as demais informacoes

        System.out.println("Dados do Carro02: ");
        System.out.println("Cor: " + carro02.getCor());
        //Imprimir as demais informacoes
    }

    public void fabricarVeiculo(Carro carro){
        Carro carro = new Veiculo();
        carro.setNome("Audi R8");
        carro.setCor("Preto");
        carro.setAno("2021");
        carro.setModelo("Audi R8");
        carro.setPlaca("ABCD1234");
    }

    public void listVeiculo(Veiculo veiculo){
        for(int = 0; i < listVeiculo.size();i++){
            if(listVeiculo).get(i) instanceof Carro){
                Carro carro = (Carro) listVeiculo.get(i);
                System.out.println("Dados do carro: " + i);
                System.out.println(carro.getCor());
            }else if(listVeiculo.get(i) instanceof Moto) {
                Moto moto = (Moto)listVeiculo.get(i);
                System.out.println("Dados da moto: " + i);
                System.out.println(moto.getCor());
            }
        }
    }
}

