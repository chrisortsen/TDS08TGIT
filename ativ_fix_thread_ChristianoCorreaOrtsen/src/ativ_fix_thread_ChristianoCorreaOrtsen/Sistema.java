package ativ_fix_thread_ChristianoCorreaOrtsen;

public class Sistema implements Runnable{
	
	private String nome;
	
	public String getNome() {
		return nome;		
	}
	
	public void setNome(String nome) {
		this.nome = nome;		
	}
	
	public synchronized void iniciarSistema() {
		int i = 0;
		while(i<10){
			System.out.println("Sistema executado por " + nome + "!");
			i++;
		}
	}
	
	public void run() {
		iniciarSistema();
	}

	
}
