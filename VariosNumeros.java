import javax.swing.JOptionPane;

public class VariosNumeros{

	public static void main(String [] args){
   
		int n, qtde = 0;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
   
		while (n != 0){
			if ((n > 100) && (n <200)){
				qtde = qtde + 1;
			}
			qtde = n
		}
		JOptionPane.showMessageDialog(null, "Foram digitados " + qtde + " valores.");
	}
}