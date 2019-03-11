package ativBebida;
import javax.swing.JOptionPane;

public abstract class Principal {

	public static void main(String[] args) {
		
		Vinho v1 = new Vinho();
		Refrigerante r1 = new Refrigerante();
		Suco s1 = new Suco();
		Bebida b1 = new Refrigerante();
		Bebida b2 = new Suco();
		Bebida b3 = new Vinho();
		
		while(true) {		
//      <!-- Opções Selecionar Bebida --!>
		
		Object[]  bebidaOpcoes = { "Refrigerante", "Suco", "Vinho" };
		Object bebidaSelecionada = JOptionPane.showInputDialog(null,
				
			"Escolha uma bebida:", " Java's Bar",
			JOptionPane.INFORMATION_MESSAGE, null,
			bebidaOpcoes, bebidaOpcoes[0]);
		
		if(bebidaSelecionada == null) {
			System.exit(0); 
		}
//      <!-- Opções Selecionar Ação --!>
			
		String menuOpcoes[] = {"Cadastrar", "Verificar Preço", "Mostrar Dados","Trocar Bebida"};
		int menuSelecionado = JOptionPane.showOptionDialog(null,
				
				bebidaSelecionada+"\nEscolha uma ação:", " Java's Bar", 0,
			JOptionPane.QUESTION_MESSAGE, null, 
			menuOpcoes, menuOpcoes[0]);
		
		//Cadastrar
		if(menuSelecionado == 0) {
			if (bebidaSelecionada=="Refrigerante") {
			b1.setNome(JOptionPane.showInputDialog(null,"Digite o Nome do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE));
			b1.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE)));
			//retornavel
			}
			else if (bebidaSelecionada=="Suco") {
				b2.setNome(JOptionPane.showInputDialog(null,"Digite o Nome do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE));
				b2.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE)));
				s1.setSabor(JOptionPane.showInputDialog(null,"Digite o Sabor do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE));
			}
			else if (bebidaSelecionada=="Vinho") {
				b2.setNome(JOptionPane.showInputDialog(null,"Digite o Nome do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE));
				b2.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE)));
				v1.setSafra(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Safra do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE)));
				v1.setTipo(JOptionPane.showInputDialog(null,"Digite o Tipo do " + bebidaSelecionada, "Java's Bar", JOptionPane.QUESTION_MESSAGE));
			}
		}//fim cadastrar
		
			
			//Verificar Preço
		else if(menuSelecionado == 1) {
			if (bebidaSelecionada=="Refrigerante") {
				if (r1.verificarPreco(b1.getPreco())) {
					JOptionPane.showMessageDialog(null, "Produto em Promoção!", "Java's Bar", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Produto com Preço Normal!", "Java's Bar", JOptionPane.INFORMATION_MESSAGE);
				}
		}
			else if (bebidaSelecionada=="Suco") {
				if (s1.verificarPreco(b2.getPreco())) {
					JOptionPane.showMessageDialog(null, "Produto em Promoção!", "Java's Bar", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Produto com Preço Normal!", "Java's Bar", JOptionPane.INFORMATION_MESSAGE);
				}
			}
				else if (bebidaSelecionada=="Vinho") {
					if (v1.verificarPreco(b3.getPreco())) {
						JOptionPane.showMessageDialog(null, "Produto em Promoção!", "Java's Bar", JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Produto com Preço Normal!", "Java's Bar", JOptionPane.INFORMATION_MESSAGE);
					}
		}
		
		}//fim verificar preco
		
		
		//Mostrar Dados
		else if(menuSelecionado == 2) {
			
			
		}
		//Trocar Bebida
		else if(menuSelecionado == 3) {
		
		}
		//(X) Fechar
		else {
			System.exit(0); 
		
		}
	
		}//While
	}//Main
}//classe