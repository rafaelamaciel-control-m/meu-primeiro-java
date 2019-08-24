package br.com.java.emprestimolivro;

import br.com.java.emprestimolivro.dominio.CadEmprest;
import br.com.java.emprestimolivro.dominio.CadLivro;
import br.com.java.emprestimolivro.dominio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario("Rafaela","02/12/1990","Rua dos Bobos");
		
		CadLivro livro = new CadLivro("Pequeno Principe", "Alguem");
		
		CadEmprest emprestimo = new CadEmprest(usuario1, livro, "24/08/2019", "05/09/2019");
		
		
		usuario1.imprimeUsuario();
		System.out.println("***********************");
		livro.imprimeLivro();
		System.out.println("************************");
		emprestimo.imprimeEmprest();
	}

}
