package main;

import java.util.Locale;

import java.util.Scanner;

import entities.Livros;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Livro*/
		
		Livros livro_1 = new Livros("Jurassic Park"," Michael Crichton");

		Livros livro_2 = new Livros("Jurassic Park O mundo perdido",  "Michael Crichton");
		
		Livros livro_3 = new Livros("Como Treinar seu Dragão","Cressida Cowell" );
		
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
					
					System.out.printf("Livro:%s%nAutor:%s%n", livro_1.getNome(), livro_1.getAutor());
					if(livro_1.getImprestimo() == true) {
						System.out.println("Disponivel");
					
					}else {
						System.out.println("Indisponivel");
					}
					System.out.println("===============");
					
					//-------------------------------------------------
					
					System.out.printf("Livro:%s%nAutor:%s%n", livro_2.getNome(), livro_2.getAutor());
					if(livro_2.getImprestimo() == true) {
						System.out.println("Disponivel");
					
					}else {
						System.out.println("Indisponivel");
					}
					System.out.println("===============");
					//-------------------------------------------------
					
					System.out.printf("Livro:%s%nAutor:%s%n", livro_3.getNome(), livro_3.getAutor());
					if(livro_3.getImprestimo() == true) {
						System.out.println("Disponivel");
					
					}else {
						System.out.println("Indisponivel");
					}
					System.out.println("===============");
					
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
					
					String escolhaLivro = sc.nextLine();
					
					//================ Emprestimo livro 1 ================
					
					if(livro_1.getNome().toLowerCase().equals(escolhaLivro.toLowerCase())){
						
						System.out.printf("%s: ", livro_1.getNome());
						//DISPONIBILIDADE DO LIVRO VERDADEIRA
						if(livro_1.getImprestimo() == true) {
							
							System.out.println("DISPONIVEL");
							System.out.print("Pegar emprestimo s/n: ");
							
							char simOuNao = sc.next().toLowerCase().charAt(0);
							//imprestimo do livro aceito
							if(simOuNao == 's') {
								livro_1.imprestar();
								System.out.println("Livro Emprestado, BOA LEITURA!");
								System.out.println("VOLTANDO PARA INICIO...");
								try {
								        
									Thread.sleep(5000); 
							    } catch (InterruptedException e) {
							    	System.out.println("A pausa foi interrompida.");
							    }
								
								System.out.println("==================");
								break;
									
							
							}
							//imprestimo do livro não aceito
							else if(simOuNao == 'n') {
								System.out.println("VOLTANDO PARA INICIO...");
								try {
								        
									Thread.sleep(5000); 
							    } catch (InterruptedException e) {
							        System.out.println("A pausa foi interrompida.");
							    }
									
								System.out.println("==================");
								break;
									
							}
								
						}
						//DISPONIBILIDADE DO LIVRO FALSA
						else{
							
							System.out.println("INDISPONÍVEL");
							System.out.println("VOLTANDO PARA INICIO...");
							
							
							try {   
							
								Thread.sleep(5000); 
							
							} catch (InterruptedException e) {
					            	System.out.println("A pausa foi interrompida.");
							}
						
							System.out.println("==================");
							break;
						}
						
						
					}// FIM if do livro 1
					
					//================ Emprestimo livro 2 ================	
					
					else if(livro_2.getNome().toLowerCase().equals(escolhaLivro.toLowerCase())) {
						
						 System.out.printf("%s: ", livro_2.getNome());
						 
						 
						//DISPONIBILIDADE DO LIVRO VERDADEIRA
						 if(livro_2.getImprestimo() == true) {
							 
							 System.out.println("DISPONIVEL");
							 System.out.print("Pegar emprestimo s/n: ");
							 char simOuNao = sc.next().toLowerCase().charAt(0);
							//imprestimo do livro aceito
							 
							 if(simOuNao == 's') {
								 livro_2.imprestar();
								 
								 System.out.println("Livro Emprestado, BOA LEITURA!");
								 System.out.println("VOLTANDO PARA INICIO...");
								 try {
								        
									Thread.sleep(5000); 
									
								 } catch (InterruptedException e) {
								    	System.out.println("A pausa foi interrompida.");
								 }
									
									System.out.println("==================");
									break;	 
							 }
							 //imprestimo do livro não aceito
							 else {
								 System.out.println("VOLTANDO PARA INICIO...");
								 try {
								        
									Thread.sleep(5000); 
									
								 } catch (InterruptedException e) {
								    	System.out.println("A pausa foi interrompida.");
								 }
									
									System.out.println("==================");
									break;	 
							 }
							 
							 
						 }
						//DISPONIBILIDADE DO LIVRO FALSA
						 else {
							System.out.println("INDISPONÍVEL");
							System.out.println("VOLTANDO PARA INICIO...");
							try {   
									
								Thread.sleep(5000); 
								
							} catch (InterruptedException e) {
							
								System.out.println("A pausa foi interrompida.");
								
							}
							
							System.out.println("==================");
							break;
							 
						 }
						 
					}// FIM if do livro 2
					
					//================ Emprestimo livro 3 ================	
					
					else if(livro_3.getNome().toLowerCase().equals(escolhaLivro.toLowerCase())) {
						
						 System.out.printf("%s: ", livro_3.getNome());
						 
						 
						//DISPONIBILIDADE DO LIVRO VERDADEIRA
						 if(livro_3.getImprestimo() == true) {
							 
							 System.out.println("DISPONIVEL");
							 System.out.print("Pegar emprestimo s/n: ");
							 char simOuNao = sc.next().toLowerCase().charAt(0);
							//imprestimo do livro aceito
							 
							 if(simOuNao == 's') {
								 livro_3.imprestar();
								 
								 System.out.println("Livro Emprestado, BOA LEITURA!");
								 System.out.println("VOLTANDO PARA INICIO...");
								 try {
								        
									Thread.sleep(5000); 
									
								 } catch (InterruptedException e) {
								    	System.out.println("A pausa foi interrompida.");
								 }
									
									System.out.println("==================");
									break;	 
							 }
							 //imprestimo do livro não aceito
							 else {
								 System.out.println("VOLTANDO PARA INICIO...");
								 try {
								        
									Thread.sleep(5000); 
									
								 } catch (InterruptedException e) {
								    	System.out.println("A pausa foi interrompida.");
								 }
									
									System.out.println("==================");
									break;	 
							 }
							 
							 
						 }
						//DISPONIBILIDADE DO LIVRO FALSA
						 else {
							System.out.println("INDISPONÍVEL");
							System.out.println("VOLTANDO PARA INICIO...");
							try {   
									
								Thread.sleep(5000); 
								
							} catch (InterruptedException e) {
							
								System.out.println("A pausa foi interrompida.");
								
							}
							
							System.out.println("==================");
							break;
							 
						 }
						 
					}// FIM if do livro 3
					else {
						System.out.println("Digite um nome existente!");
						try {
							
							Thread.sleep(5000);
							
						} catch(InterruptedException e) {
							
							System.out.println("A pausa foi interrompida.");
							
						}
						System.out.println("==================");
						break;
					}
						
					}//chave do while do imprestimo
					
					break;
					
				case 3:
					
					//================ Devolução de livros ================
					
					System.out.println("Livros emprestados: ");
					int x = 1;
					for(int i = 1; i <= 3; i++) {
						boolean valor = true;
						String name = "";
						
						if(i == 1){
							valor = livro_1.getImprestimo();
							name = livro_1.getNome();
						}else if(i == 2) {
							valor = livro_2.getImprestimo();
							name = livro_2.getNome();
						}else if(i == 3) {
							valor = livro_3.getImprestimo();
							name = livro_3.getNome();
						}
						
						if(!valor) {
							System.out.printf("%d. %s = EMPRESTADO%n",x, name);
							x++;
						}
					}
					if(x == 1) {
						System.out.println("Nenhum livro emprestado");
						System.out.println("VOLTANDO PARA INICIO...");
						try {
						        
							Thread.sleep(5000); 
							
						 } catch (InterruptedException e) {
							 System.out.println("A pausa foi interrompida.");
						 }
							
						System.out.println("==================");	 
					}
					else {
						try {
					        
							Thread.sleep(5000); 
							
						 } catch (InterruptedException e) {
							 System.out.println("A pausa foi interrompida.");
						 }
							
						System.out.println("==================");	
					}
					
					// ================ Escolha de devolucão ================
					
					
					
					
					
					
					break;
				default:
				
			}
			
		}
		sc.close();
	}

}
