package br.com.java.emprestimolivro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.java.emprestimolivro.dominio.CadEmprest;
import br.com.java.emprestimolivro.dominio.CadLivro;
import br.com.java.emprestimolivro.dominio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario("Rafaela","02/12/1990","Rua dos Bobos");
		
		CadLivro livro = new CadLivro("Pequeno Principe", "Alguem");
		
		LocalDate dataSolicit = LocalDate.parse("2019-08-24", DateTimeFormatter.ISO_DATE);
		LocalDate dataDevolv = dataSolicit.plusDays(7L);
		CadEmprest emprestimo = new CadEmprest(usuario1, livro, dataSolicit, dataDevolv);
		
		
		usuario1.imprimeUsuario();
		System.out.println("***********************");
		livro.imprimeLivro();
		System.out.println("************************");
		emprestimo.imprimeEmprest();
	}

}
