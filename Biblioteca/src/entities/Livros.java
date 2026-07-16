package entities;

public class Livros {
	
	private String nome;
	private String autor;
	private Boolean imprestimo = true;
	
	public Livros() {
	}	
	public Livros(String nomeLivro, String autorLivro) {
		nome = nomeLivro;
		autor = autorLivro;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getImprestimo(){
		return (imprestimo) ? "Disponivel" : "Indisponivel";
	}
	
	public void imprestar() {
		imprestimo = false;
	}
	public void devolucao() {
		imprestimo = true;
	}
	
	public String toString() {
		return "Nome: "+ nome + "\n" + 
				"Autor: " + autor + "\n" +
				"Disponibilidade: " + getImprestimo() +
				"\n-----------------------";
	}
}
