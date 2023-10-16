package duke;

import java.util.Scanner;

public class EstacApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		int iVaga = -1;
		String placa;
		String tipo;
		
		
		Veiculo[] listaVagas = new Veiculo[10];
		
		// inicio repetição
		do {
			System.out.println("+---------------------------+");
			System.out.println("| Duke Park Estacionamentos |");
			System.out.println("+---------------------------+");
			System.out.println("");
			System.out.println("[1] - Entrada de Veiculos");
			System.out.println("[2] - Saída de Veiculos");
			System.out.println("[3] - Veiculos no Patio");
			System.out.println("[4] - Relatório Geral");
			System.out.println("");
			System.out.println("[0] - Sair do Sistema");
			
			System.out.println("\n\nEscolha: ");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) {
				case 1: 
						
						System.out.println("Voce escolheu Entrada de Veículos");
						// Solicitar o nr da vaga
						
						do {
							System.out.print("Informe Vaga: ");
							iVaga = teclado.nextInt();
						
							
							if (iVaga < 1 || iVaga > 10) {
								System.out.println("Vaga nao existe! Digite novamente.");
							}
						
						} while ( iVaga < 1 || iVaga > 10 );
						/*if(0<iVaga && iVaga<11) {
							while(iVaga<11) {
							System.out.println("Escolha um numero de 1 a 10");
							}
							while(iVaga>0) {
								System.out.println("Escolha um numero de 1 a 10");
								}
						} Tentei fazer ;P
						*/
						
						
						
						teclado.nextLine();
						
						// Solicitar a placa e tipo veículo
						System.out.print("Tipo Veiculo [C/M]: ");
						tipo = teclado.nextLine();
						System.out.print("Placa             : ");
						placa = teclado.nextLine();
					
						// adicionar o veiculo na vaga.
						listaVagas[iVaga] = new Veiculo(tipo, placa);
					
					break;
				
				case 2:
					System.out.println("Voce escolheu Saida de Veículos");
					// Solicitar o nr da vaga
					do {
						System.out.print("Informe Vaga: ");
						iVaga = teclado.nextInt();
					
						
						if (iVaga < 1 || iVaga > 10) {
							System.out.println("Vaga nao existe! Digite novamente.");
						}
					
					} while ( iVaga < 1 || iVaga > 10 );
					System.out.println(listaVagas[iVaga].toString());
					// limpar a vaga
					listaVagas[iVaga] = null;
					break;
					
				case 3:
					System.out.println("Voce escolheu Veiculos no Pátio");
					// Lista o vetor
					for (int i = 0; i< listaVagas.length; i++) {
						
						System.out.print("Vaga: " + i + ": ");
						if (listaVagas[i] == null) {
							System.out.println("Livre");
						} else {
							System.out.println(listaVagas[i].toString());
						}

					}
					break;
					
				case 4:
					System.out.println("Voce escolheu Relatório Geral");
					System.out.println("Aguarde as próximas versões...");
					break;
					
				case 0:
					System.out.println("Voce escolheu Sair");
					break;
				
				default:
					System.out.println("Opção invalida!");
	
			}
		// fim repetição
		} while (opcao != 0);
		
		System.out.println("Fim do programa.");
		
	}
}
