package ativ_SIM_SA_ChristianoCorrea;

public class Vendas {

	public int idVenda;
	public String nomeProduto;
	public int quantidadeProduto;
	public double valorTotal;
	public String formaPagamento;
	
	// Get e Set
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	// Métodos
	public void cadastrarVenda() {
		
	}
	public void cancelarVenda() {
		
	}
	public void excluirProduto() {
		
	}
	
	//IMPRESSAO DAS VENDAS ARMAZENADAS
	public void exibirVendas() {
		System.out.println("");
		System.out.println("|-------------------------------------------|");
		System.out.println("|            RELATÓRIO DE VENDAS            |");
		System.out.println("|-------------------------------------------|");
		System.out.println("");
		System.out.println("ID da venda: " + idVenda);
		System.out.println("Nome do produto: " + nomeProduto);
		System.out.println("Quantidade do produto: " + quantidadeProduto);
		System.out.println("Forma de Pagamento: " + formaPagamento);
		System.out.println("Valor Total: " + valorTotal); 
	}
	
	
}

