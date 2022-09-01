package br.com.montadora.beans;

import br.com.montadodois.beans.Veiculo;

public class Carro extends Veiculo {
   
	private int quantidadeJanelas;
	
	
/*
	public Carro(String nome, double capacidadeCombustivel, int quantidadeJanelas) {
		super(nome, capacidadeCombustivel);
		setQuantidadeJanelas(quantidadeJanelas);
	}
*/
	public Carro(){}
	
	public int getQuantidadeJanelas() {
		return quantidadeJanelas;
	}

	public void setQuantidadeJanelas(int quantidadeJanelas) {
		this.quantidadeJanelas = quantidadeJanelas;
	}
	
	public String mostrarAtributos() {
		
		return " O nome do Veiculo é " + getNome() +
				" e a capacidade do combustivel é " + getCapacidadeCombustivel()+
				" e quantidade de Janela é " + getQuantidadeJanelas();
		
	}
}
