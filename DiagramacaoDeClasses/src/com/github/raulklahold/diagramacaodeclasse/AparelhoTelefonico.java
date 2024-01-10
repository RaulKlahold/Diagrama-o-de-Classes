package com.github.raulklahold.diagramacaodeclasse;

public class AparelhoTelefonico implements InterfaceacaoDois {

	@Override
	public void ligar() {
		System.out.println("O telefone está ligando!");
		
	}

	@Override
	public void atender() {
		System.out.println("O telefone foi atendido!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Tem mensagem no correio de voz!");
		
	}

}
