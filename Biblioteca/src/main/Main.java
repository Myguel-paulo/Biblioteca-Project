package main;

import java.util.Locale;

import java.util.Scanner;

import entities.Livros;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Livro*/

		
		Livros[] livros = {
			new Livros("Jurassic Park"," Michael Crichton"), 
			new Livros("Jurassic Park O mundo perdido",  "Michael Crichton"),
			new Livros("Como Treinar seu Dragão","Cressida Cowell" )};
		/*Opções*/
		
		
		
		int sairDecisao = 0;
		while(sairDecisao == 0) {
			System.out.println("1. Lista de Livros");
			System.out.println("2. Emprestar livro");
			System.out.println("3. Devolver livro");
			System.out.println("4. Buscar um livro por título");
			System.out.println("5. Sair");
			
			System.out.print("Digite a opção desejada: ");
			
			
			
			int escolha = sc.nextInt();
			sc.nextLine();
			System.out.println("===============");
			
			switch (escolha) {
				case 1:
					
					for(Livros l: livros) {
						System.out.println(l);
					}
					
					
					try {
			            Thread.sleep(5000); 
			        } catch (InterruptedException e) {
			            System.out.println("A pausa foi interrompida.");
			        }
					break;
					
					
				case 2:
					
					//================================== Emprestimos ==================================
					
					
					int imprestimo = 0;
					while(imprestimo == 0) {
					
					System.out.println("Emprestimos: ");
					System.out.print("Digite o nome do livro desejado: ");
					
					String escolhaLivro = sc.nextLine().toLowerCase();
					
		
					for(Livros l : livros) {
		
						if(l.getNome().toLowerCase().equals(escolhaLivro)) {
							
							System.out.println(l);
							imprestimo++;
							
						}
						
					}
					
					System.out.println("\n-----------------------------------------------");
					try {
				        
						Thread.sleep(5000); 
						
					 } catch (InterruptedException e) {
						 System.out.println("A pausa foi interrompida.");
					 }
					
					}
					
					break;
					
				case 3:
					
					//================ Devolução de livros ================
					
					System.out.println("Livros emprestados: ");
					for(Livros l : livros) {
						if(l.getImprestimo().equals("Indisponivel"))
						{
							System.out.println(l);
						}
					}
					
					
					
					// ================ Escolha de devolucão ================

					
					break;
					
				default:
				
			}
			
		}
		sc.close();
	}

}
