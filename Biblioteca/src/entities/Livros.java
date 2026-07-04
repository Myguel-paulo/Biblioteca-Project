package entities;

public class Livros {
	public String nome;
	public String autor;
	public Boolean imprestimo = true;
	
	
	public Livros(String nomeLivro, String autorLivro) {
		nome = nomeLivro;
		autor = autorLivro;
	}
	public void imprestar() {
		imprestimo = false;
	}
	public void devolucao() {
		imprestimo = true;
	}
}
