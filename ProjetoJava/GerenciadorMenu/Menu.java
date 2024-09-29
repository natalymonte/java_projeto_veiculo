package GerenciadorMenu;

import java.util.Scanner;

public class Menu {
	static String menu = "----Menu----";
	
	Scanner scan = new Scanner(System.in);
	public void exibirMenu() {
		int op;
		int op1;
		int op2;
		do {
			System.out.println(menu);
			System.out.println("- Opção 1: Frente de Loja.\r\n"
					+ "- Opção 2: Manutenção no Cadastro.\r\n"
					+ "- Opção 3: Sair.");
			op = scan.nextInt();
			if (op==1) {
				do {
					System.out.println("Frente de Loja! Opção 1: Gerenciar Veículo Opção 2: Gerenciar Loja / \n Opção 3: Gerenciar Vendedor / Opção 4: Gerenciar Cliente \n / Opção 5: Gerenciar Venda \n / Opção 6: Voltar para o menu superior.");
					op1 = scan.nextInt();
					switch(op1) {
						case 1: System.out.println(" Gerenciar Veículo");
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 6:
							break;
						default: System.out.println("Valor Invalido!");
							break;
						}
				
					} while (op1!=6);
				
			}
			else if (op==2) {
				do {
					System.out.println("Manutenção no Cadastro! Opção 1: Gerenciar Veículo / Opção 2: Gerenciar Loja / \n Opção 3: Gerenciar Vendedor / Opção 4: Gerenciar Cliente \n / \"Opção 5: Gerenciar Venda\n / Opção 6: Voltar para o menu superior.");
					op2 = scan.nextInt();
					switch(op2) {
						case 1: System.out.println(" Gerenciar Veículo");
							break;
						case 2: System.out.println("...");
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 6:
							break;
						default: System.out.println("Valor Invalido!");
							break;
						}
					
					
					
				} while (op2!=6);
				
				
			}
		
			
		
			
			
		} while(op!=3);
	}
	
	

}
