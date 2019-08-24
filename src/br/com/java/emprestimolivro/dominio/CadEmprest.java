package br.com.java.emprestimolivro.dominio;

public class CadEmprest {

	
		private String codigoSolicit;
		private Usuario cadsolicitante;
		private CadLivro livroEmprest;
		private String dataSolicit;
		private String dataDevolv;
		
		
		
		
		public CadEmprest(Usuario solicitante, CadLivro livroEmprest, String dataSolicit,
				String dataDevolv) {
			super();
			this.cadsolicitante = solicitante;
			this.livroEmprest = livroEmprest;
			this.dataSolicit = dataSolicit;
			this.dataDevolv = dataDevolv;
		}


		public void imprimeEmprest() {
			System.out.println("Codigo do Solicitante" + codigoSolicit);
			System.out.println("Usuario Solicitante" + cadsolicitante.getNomeCompleto());
			System.out.println("Livro a ser emprestado" + livroEmprest.getNomeLivro());
			System.out.println("Data da solicitação" + dataSolicit);
			System.out.println("Data da devolução" + dataDevolv);
		}


		public String getCodigoSolicit() {
			return codigoSolicit;
		}


		public void setCodigoSolicit(String codigoSolicit) {
			this.codigoSolicit = codigoSolicit;
		}


	


		public String getDataSolicit() {
			return dataSolicit;
		}


		public void setDataSolicit(String dataSolicit) {
			this.dataSolicit = dataSolicit;
		}


		public String getDataDevolv() {
			return dataDevolv;
		}


		public void setDataDevolv(String dataDevolv) {
			this.dataDevolv = dataDevolv;
		}
	
	
}
