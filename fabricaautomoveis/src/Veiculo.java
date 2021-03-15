import java.util.Date;

public class Veiculo {

    private String cor;
    private String ano;
    private String modelo;
    private String placa;

    //metodos get e set
    public Veiculo(String _cor, String _ano, String _modelo, String _placa){
        this.cor = _cor;
        this.ano = _ano;
        this.modelo = _modelo;
        this.placa = _placa;
    }

    public class Carro extends Veiculo{
        public Carro(String _cor, String _ano, String _modelo, String _placa){
            super(_cor, _ano, _modelo, _placa);
        }
    }

    public class Moto extends Veiculo{
        public Moto(String _cor, String _ano, String _modelo, String _placa){
            super(_cor, _ano, _modelo, _placa));
        }
    }
}