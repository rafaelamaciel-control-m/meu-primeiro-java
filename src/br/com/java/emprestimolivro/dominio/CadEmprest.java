package br.com.java.emprestimolivro.dominio;

import java.time.LocalDate;

public class CadEmprest {

	
		private String codigoSolicit;
		private Usuario cadsolicitante;
		private CadLivro livroEmprest;
		private LocalDate dataSolicit;
		private LocalDate dataDevolv;
		
		
		
		
		public CadEmprest(Usuario solicitante, CadLivro livroEmprest, LocalDate dataSolicit,
				LocalDate dataDevolv) {
			super();
			this.cadsolicitante = solicitante;
			this.livroEmprest = livroEmprest;
			this.dataSolicit = dataSolicit;
			this.dataDevolv = dataDevolv;
		}


		public void imprimeEmprest() {
			System.out.println("Codigo do Solicitante: " + codigoSolicit);
			System.out.println("Usuario Solicitante: " + cadsolicitante.getNomeCompleto());
			System.out.println("Livro a ser emprestado: " + livroEmprest.getNomeLivro());
			System.out.println("Data da solicitação: " + dataSolicit);
			System.out.println("Data da devolução: " + dataDevolv);
		}


		public String getCodigoSolicit() {
			return codigoSolicit;
		}


		public void setCodigoSolicit(String codigoSolicit) {
			this.codigoSolicit = codigoSolicit;
		}


	


		public LocalDate getDataSolicit() {
			return dataSolicit;
		}


		public void setDataSolicit(LocalDate dataSolicit) {
			this.dataSolicit = dataSolicit;
		}


		public LocalDate getDataDevolv() {
			return dataDevolv;
		}


		public void setDataDevolv(LocalDate dataDevolv) {
			this.dataDevolv = dataDevolv;
		}
	
	
}
