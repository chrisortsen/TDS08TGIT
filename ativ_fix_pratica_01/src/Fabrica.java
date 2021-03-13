public class Fabrica {
    public static void main(String[] args){

        Carro carro01;
        carro01 = new Carro();

        //Salvando informacoes
        carro01.setCor("Azul");
        carro01.setAno("2011");
        //Salvar as demais informaçoes

        //Pegando as informaçoes para imprimir
        System.out.println("Dados do Carro: ");
        System.out.println("Cor: " + carro01.getCor());
        System.out.println("Ano: " + carro01.getAno());
        //Imprimir as demais informações
    }
}
