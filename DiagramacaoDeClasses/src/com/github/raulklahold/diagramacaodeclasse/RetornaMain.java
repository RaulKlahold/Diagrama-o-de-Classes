package com.github.raulklahold.diagramacaodeclasse;

public class RetornaMain {

	public static void main(String[] args) {
		try {
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		ReprodutorMusical ipod = new ReprodutorMusical();
		NavegadorDeInternet nav = new NavegadorDeInternet();

		System.out.println("\n ---- Diagramação de classes ---- \n ");

		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioVoz();

		ipod.selecionarMusica();
		ipod.tocar();
		ipod.pausar();

		nav.exibirPagina();
		nav.adicionarNovaAba();
		nav.atualizarPagina();
		}
		
		catch (Exception e) {
			System.out.println("Erro ao realizar a ação! " + e.getMessage());
		}
	}

}
