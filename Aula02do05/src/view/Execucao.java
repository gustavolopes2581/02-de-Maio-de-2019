package view;

import model.PessoaFisica;

public class Execucao {

		public static void main(String[] args) {
			PessoaFisica PF = new PessoaFisica();
			PF.setNome("Fulano");
			PF.setEndereco("Rua tal da terra do nunca");
			
			System.out.println("Nome: " + PF.getNome());
			System.out.println("Endereco: " + PF.getNome());
		}
}
