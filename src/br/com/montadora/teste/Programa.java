package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.beans.Carro;



public class Programa {

	public static void main(String[] args) {
	
	int indice = 0;
	
	Carro[] carro = new Carro[3];
		
	for(indice = 0; indice < 3; indice++ ) {
		
	
		
    String nome = JOptionPane.showInputDialog("Digite o Nome do Carro");	
    Double capacidadeCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite" + " Capacidade de combustivel"));
    int quantidadeJanelas = Integer.parseInt(JOptionPane.showInputDialog("Digite" + " a quantidade de janelas"));
    
	carro[indice]  = new Carro();
	carro[indice].setNome(nome);
	carro[indice].setCapacidadeCombustivel(capacidadeCombustivel);
	carro[indice].setQuantidadeJanelas(quantidadeJanelas);
	
	
	
	   }
	
	  for(Carro Carro : carro ) {
		  
		  System.out.println("\n Nome do carro  "+Carro.getNome()+  "\n Capacidade de combustivel " + Carro.getCapacidadeCombustivel() + "\n Quantidade de Janelas " + 	Carro.getQuantidadeJanelas());
	  }
      
	
		  
		  
       
	}

}
