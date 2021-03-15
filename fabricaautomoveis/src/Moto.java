public class Moto {

    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double valor;

    /* CONSTRUTOR PADRÃO */
    public Moto(){
    }

    /* CONSTRUTOR COM PARÂMETROS */
    public Moto(String nome, String marca, String modelo, String cor, int ano, double valor){
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }
}
