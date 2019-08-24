package br.com.java.emprestimolivro.dominio;

public class CadLivro {
	private String codigoLivro;
	private String nomeLivro;
	private String autor;



public CadLivro( String nomeLivro, String autor) {
		super();
		this.nomeLivro = nomeLivro;
		this.autor = autor;
	}



public void imprimeLivro() {
	System.out.println("Codigo: " + codigoLivro);
	System.out.println("Nome: " + nomeLivro);
	System.out.println("Data de Nascimento: " + autor);
}



public String getCodigoLivro() {
	return codigoLivro;
}



public void setCodigoLivro(String codigoLivro) {
	this.codigoLivro = codigoLivro;
}



public String getNomeLivro() {
	return nomeLivro;
}



public void setNomeLivro(String nomeLivro) {
	this.nomeLivro = nomeLivro;
}



public String getAutor() {
	return autor;
}



public void setAutor(String autor) {
	this.autor = autor;
}
}


