package ativ_fix_arrays_03_ChristianoCorrea;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);
        System.out.println("Sistema de cadastro de clientes.");
        System.out.print("\nPor favor, insira o limite de clientes para cada lista: ");
        int limite = scan.nextInt();
        Cliente[] clientes = new Cliente[limite];
        ClienteEspecial[] clientesEspeciais = new ClienteEspecial[limite];
        ClienteDevedor[] clientesDevedores = new ClienteDevedor[limite];

        System.out.println("Iremos iniciar a inserção de dados nas listas.\n\n");
        System.out.println("Inserção de Clientes Normais.");
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
            System.out.print("\n\nPor favor, insira o nome do cliente " + i + ": ");
            clientes[i].setNome(scan.nextLine()); // Por algum motivo, somente assim o java não "pula" a
            clientes[i].setNome(scan.nextLine()); // inserção de dados deste scanner.
            System.out.print("Por favor, insira o cpf do cliente " + i + ": ");
            clientes[i].setCpf(scan.nextLine());
            System.out.print("Por favor, insira o email do cliente " + i + ": ");
            clientes[i].setEmail(scan.nextLine());
            System.out.print("Por favor, insira o telefone do cliente " + i + ": ");
            clientes[i].setTelefone(scan.nextLine());
            System.out.print("Por favor, insira o endereço do cliente " + i + ": ");
            clientes[i].setEndereco(scan.nextLine());
        }

        System.out.println("\n\nAgora inserção na lista de Clientes Especiais.");
        for (int i = 0; i < clientesEspeciais.length; i++) {
            clientesEspeciais[i] = new ClienteEspecial();
            System.out.print("\n\nPor favor, insira o nome do cliente " + i + ": ");
            clientesEspeciais[i].setNome(scan.nextLine());
            System.out.print("Por favor, insira o cpf do cliente " + i + ": ");
            clientesEspeciais[i].setCnpj(scan.nextLine());
            System.out.print("Por favor, insira o email do cliente " + i + ": ");
            clientesEspeciais[i].setEmail(scan.nextLine());
            System.out.print("Por favor, insira o telefone do cliente " + i + ": ");
            clientesEspeciais[i].setTelefone(scan.nextLine());
            System.out.print("Por favor, insira o endereço do cliente " + i + ": ");
            clientesEspeciais[i].setEndereco(scan.nextLine());
        }

        System.out.println("\n\nAgora inserção na lista de Clientes Devedores.");
        for (int i = 0; i < clientesDevedores.length; i++) {
            clientesDevedores[i] = new ClienteDevedor();
            System.out.print("\n\nPor favor, insira o nome do cliente " + i + ": ");
            clientesDevedores[i].setNome(scan.nextLine());
            System.out.print("Por favor, insira o cpf do cliente " + i + ": ");
            clientesDevedores[i].setCpf(scan.nextLine());
            System.out.print("Por favor, insira o email do cliente " + i + ": ");
            clientesDevedores[i].setEmail(scan.nextLine());
            System.out.print("Por favor, insira o telefone do cliente " + i + ": ");
            clientesDevedores[i].setTelefone(scan.nextLine());
            System.out.print("Por favor, insira o endereço do cliente " + i + ": ");
            clientesDevedores[i].setEndereco(scan.nextLine());
        }

        System.out.println("\n\nAgora, iremos exibir todos os clientes cadastrados para cada tipo.\n\n");
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("\nDados do cliente " + i + " da lista Clientes Comuns.\n");
            System.out.println("| Nome: " + clientes[i].getNome() + " | CPF: " + clientes[i].getCpf() + " | Email: " + clientes[i].getEmail()
            + " | Telefone: " + clientes[i].getTelefone() + " | Endereço: " + clientes[i].getEndereco() + " |");
        }
        try {
            input.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n");
        for (int i = 0; i < clientesEspeciais.length; i++) {
            System.out.println("\nDados do cliente " + i + " da lista Clientes Especiais.\n");
            System.out.println("| Nome: " + clientesEspeciais[i].getNome() + " | CPF: " + clientesEspeciais[i].getCnpj() + " | Email: " + clientesEspeciais[i].getEmail()
                    + " | Telefone: " + clientesEspeciais[i].getTelefone() + " | Endereço: " + clientesEspeciais[i].getEndereco() + " |");
        }
        try {
            input.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n");
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("\nDados do cliente " + i + " da lista Clientes Devedores.\n");
            System.out.println("| Nome: " + clientesDevedores[i].getNome() + " | CPF: " + clientesDevedores[i].getCpf() + " | Email: " + clientesDevedores[i].getEmail()
                    + " | Telefone: " + clientesDevedores[i].getTelefone() + " | Endereço: " + clientesDevedores[i].getEndereco() + " |");
        }
        try {
            input.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}