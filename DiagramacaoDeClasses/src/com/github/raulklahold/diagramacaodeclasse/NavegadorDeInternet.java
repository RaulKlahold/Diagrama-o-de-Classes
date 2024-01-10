package com.github.raulklahold.diagramacaodeclasse;

public class NavegadorDeInternet implements InterfaceacaoTres {

	@Override
	public void exibirPagina() {
		System.out.println("A pagina está sendo exibida!");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("A pagina está adicionando uma nova aba!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("A pagina foi atualizada!");
		
	}

}
