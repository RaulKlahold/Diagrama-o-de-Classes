package com.github.raulklahold.diagramacaodeclasse;

public class ReprodutorMusical implements interfaceacao {

	@Override
	public void tocar() {
		System.out.println("A musica começou a tocar! ");
		
	}

	@Override
	public void pausar() {
		System.out.println("A musica foi pausada! ");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("A musica foi selecionada! ");
		
	}

}
