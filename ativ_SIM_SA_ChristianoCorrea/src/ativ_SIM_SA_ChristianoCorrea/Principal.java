package ativ_SIM_SA_ChristianoCorrea;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		int voltar = 1; 
		int resposta = 1;
		int resposta2 = 1;
		int resposta3 = 1;
		int resposta4 = 1;
		int resposta5 = 1;
			
		ArrayList<Cliente> listCliente = new ArrayList<>();
		ArrayList<Funcionario> listFuncionario = new ArrayList<>();
		ArrayList<Pedidos> listPedido = new ArrayList<>();
		ArrayList<Estoque> listEstoque = new ArrayList<>();
		ArrayList<Vendas> listVenda = new ArrayList<>();
			
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		Pedidos pedido = new Pedidos();
		Estoque estoque = new Estoque();
		Vendas venda = new Vendas();
		
		
		
		while(voltar == 1) {
		// MENU PRINCIPAL
		System.out.println("|----------------------------------------------|");
		System.out.println("|          Loja de Perif�ricos para PC         |");
		System.out.println("|----------------------------------------------|");
		System.out.println("|    MENU PRINCIPAL - Selecione uma op��o e    |");
		System.out.println("|    aperte a tecla ENTER:                     |");
		System.out.println("|                                              |");
		System.out.println("| 1 - Vendas                                   |");
		System.out.println("| 2 - Cadastrar Cliente                        |");
		System.out.println("| 3 - Cadastrar Funcion�rio                    |");
		System.out.println("| 4 - Cadastrar Encomenda                      |");
		System.out.println("| 5 - Atualizar Estoque                        |");
		System.out.println("|----------------------------------------------|");
		int escolhaMenu = scan.nextInt();
		
		// SWITCH ESCOLHA SUBMENUS
		switch(escolhaMenu) {
		case 1:
			// MENUS DE VENDA
			System.out.println();
			System.out.println("|----------------------------------------------|");
			System.out.println("|                MENU DE VENDAS                |");
			System.out.println("|----------------------------------------------|");
			System.out.println("|    Selecione uma op��o e  aperte a tecla     |");
			System.out.println("|    ENTER:                                    |");
			System.out.println("|                                              |");
			System.out.println("| 1 - Cadastrar Venda                          |");
			System.out.println("| 2 - Cancelar Venda                           |");
			System.out.println("| 3 - Excluir produto                          |");
			System.out.println("|----------------------------------------------|");
			int escolhaMenu2 = scan.nextInt();
			
			switch(escolhaMenu2) {
			case 1:
				System.out.println();
				System.out.println("|-------------------------------------------|");
				System.out.println("|            CADASTRO DE VENDA              |");
				System.out.println("|-------------------------------------------|");
				System.out.println("");
				
				while(resposta == 1) {
				System.out.println(" Informe o ID da venda: ");
				int idVenda = scan.nextInt();
				venda.setIdVenda(idVenda);
				
				System.out.println(" Nome do produto: ");
				String nomeProduto = scan.next();
				venda.setNomeProduto(nomeProduto);
				
				System.out.println(" Quantidade do produto: ");
				int quantidadeProduto = scan.nextInt();
				venda.setQuantidadeProduto(quantidadeProduto);
				
				System.out.println(" Valor Unit�rio: ");
			    double valorTotal = scan.nextDouble();
				venda.setValorTotal(valorTotal);
				
				
				System.out.println(" Forma de Pagamento: ");
				String formaPagamento = scan.next();
				venda.setFormaPagamento(formaPagamento);
											
								
				
				System.out.println("");
				System.out.println("|-------------------------------------------|");
				System.out.println("|           INFORMA��ES DA VENDA            |");
				System.out.println("|-------------------------------------------|");
				System.out.println("ID da venda: " + venda.getIdVenda());
				System.out.println("Nome do produto: " + venda.getNomeProduto());
				System.out.println("Quantidade do produto: " + venda.getQuantidadeProduto());
				System.out.println("Forma de Pagamento: " + venda.getFormaPagamento());
				System.out.println("Valor Total: " + venda.getValorTotal()); 

				
				
				listVenda.add(venda); 	
				
				System.out.println("Deseja cadastrar uma nova venda? (1 = SIM / 2 = N�O)");
				resposta = scan.nextInt();
								
				
				if(resposta == 2) {
					venda.exibirVendas();
				break;
				}
				
				
			}
						
				break;
				
			case 2:
				System.out.println();
				System.out.println("|-------------------------------------------|");
				System.out.println("|               CANCELAR VENDA              |");
				System.out.println("|-------------------------------------------|");
				System.out.println("");
				
				System.out.println("Informe o ID da venda que deseja cancelar: ");
				int cancelarVenda = scan.nextInt();
				
				
				
		
				break;
			case 3:
				System.out.println();
				System.out.println("|-------------------------------------------|");
				System.out.println("|               EXCLUIR PRODUTO             |");
				System.out.println("|-------------------------------------------|");
				System.out.println("");
				
				System.out.println("Informe o nome do produto que deseja excluir: ");
				int excluirProduto = scan.nextInt();
				
				break;
				
			}
			
			break;
		case 2:
			
			while(resposta2 == 1) {
				System.out.println();
				System.out.println("|-------------------------------------------|");
				System.out.println("|              REGISTRAR CLIENTE            |");
				System.out.println("|-------------------------------------------|");
				System.out.println("");
				
				System.out.println("Informe o ID do cliente: ");
				int id = scan.nextInt();
				cliente.setId(id);
				
				System.out.println("Informe o nome do cliente: ");
				String nome = scan.next();
				cliente.setNome(nome);
				
				System.out.println("Informe o telefone do cliente: ");
				String telefone = scan.next();
				cliente.setTelefone(telefone);
				
				System.out.println("Informe o endere�o do cliente: ");
				String endereco = scan.next();
				cliente.setEndereco(endereco);
				
				listCliente.add(cliente);
				System.out.println("Deseja cadastrar outro cliente? (1 = SIM / 2 = N�O)");

				resposta2 = scan.nextInt();
				
			if(resposta2 == 2) {			
				break;
				}
		
			}
			
			break;	
		case 3:
			while(resposta3 == 1) {
				System.out.println();
				System.out.println("|-------------------------------------------|");
				System.out.println("|           CADASTRO DE FUNCION�RIO         |");
				System.out.println("|-------------------------------------------|");
			System.out.println("");
			
			System.out.println("Informe o ID do funcion�rio: ");
			int id = scan.nextInt();
			funcionario.setId(id);
			
			System.out.println("Informe o nome do funcion�rio: ");
			String nome = scan.next();
			funcionario.setNome(nome);
			
			System.out.println("Informe o telefone do funcion�rio: ");
			String telefone = scan.next();
			funcionario.setTelefone(telefone);
			
			System.out.println("Informe o endere�o do funcion�rio: ");
			String endereco = scan.next();
			funcionario.setEndereco(endereco);
			
			System.out.println("Informe a idade do funcion�rio: ");
			int idade = scan.nextInt();
			funcionario.setIdade(idade);
			
			System.out.println("Informe o cpf do funcion�rio: ");
			String cpf = scan.next();
			funcionario.setCpf(cpf);
			
			
			System.out.println("Informe o cargo do funcion�rio: ");
			String cargo = scan.next();
			funcionario.setCargo(cargo);
			
			System.out.println("Informe o email do funcion�rio: ");
			String email = scan.next();
			funcionario.setEmail(email);
			
			
			listFuncionario.add(funcionario);
			
			System.out.println("Deseja cadastrar outro funcion�rio? (1 = SIM / 2 = N�O)");
			resposta3 = scan.nextInt();
			
			if(resposta3 == 2) {			
			break;
			}
			
		}
			break;
			
		case 4: 
			while(resposta4 == 1) {
				System.out.println();
				System.out.println("|-------------------------------------------|");
				System.out.println("|             CADASTRO DE PEDIDO            |");
				System.out.println("|-------------------------------------------|");
				System.out.println("");
				
				System.out.println("Informe o ID da pedido: ");
				int idPedido = scan.nextInt();
				pedido.setIdPedido(idPedido);
				
				System.out.println("Informe o nome do cliente: ");
				String nomeCliente = scan.next();
				pedido.setNomeCliente(nomeCliente);
				
				System.out.println("Informe o telefone do cliente: ");
				String telefoneCliente = scan.next();
				pedido.setTelefoneCliente(telefoneCliente);
				
				System.out.println("Informe o endere�o do cliente: ");
				String enderecoCliente = scan.next();
				pedido.setEnderecoCliente(enderecoCliente);
				
				
				
				System.out.println("Informe o valor da encomenda: ");
				double valor = scan.nextDouble();
				pedido.setValor(valor);
				
				listPedido.add(pedido);
				
				System.out.println("Deseja cadastrar outra pedido? (1 = SIM / 2 = N�O)");
				resposta4 = scan.nextInt();
				
			if(resposta4 == 2) {	
			break;
			}
		}
			break;
			
			
			case 5:
				while(resposta5 == 1) {
					System.out.println("|-------------------------------------------|");
					System.out.println("|             ENTRADA NO ESTOQUE            |");
					System.out.println("|-------------------------------------------|");
				System.out.println("");
				
				System.out.println("Informe o ID do produto: ");
				int idProduto = scan.nextInt();
				estoque.setIdProduto(idProduto);
				
				System.out.println("Informe o nome do produto: ");
				String nomeProduto = scan.next();
				estoque.setNomeProduto(nomeProduto);
				
				System.out.println("Informe o Modelo do produto: ");
				String modeloProduto = scan.next();
				estoque.setModeloProduto(modeloProduto);
				
				System.out.println("Informe a marca do produto: ");
				String marcaProduto = scan.next();
				estoque.setMarcaProduto(marcaProduto);
				
				System.out.println("Informe o tipo de produto (Mouse, Teclado, Mousepad, Fone): ");
				String tipoProduto = scan.next();
				estoque.setTipoProduto(tipoProduto);				
				
				System.out.println("Informe a quantidade do produto: ");
				int quantidadeProduto = scan.nextInt();
				estoque.setQuantidadeProduto(quantidadeProduto);
				
				System.out.println("Informe o valor do produto: ");
				double valorProduto = scan.nextDouble();
				estoque.setValorProduto(valorProduto);
				
				
				listEstoque.add(estoque);
				System.out.println("Deseja adicionar mais algum produto? (1 = SIM / 2 = N�O)");
				resposta5 = scan.nextInt();
				if(resposta5 == 2) {
				break;	
				}
			}				
			
		}			
		System.out.println("Digite 1 para voltar ao menu principal ou 2 para sair do programa: ");
		voltar = scan.nextInt();
		
		}


	}

}
