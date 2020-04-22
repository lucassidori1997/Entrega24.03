import javax.swing.JOptionPane;

public class ImprimirMedia{

	public static void main (String [] args){
   
		double n, soma = 0;
		int i = 0;

		do{
			n = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
			
			if(n >= 0){
				soma = n + soma;
				i++
			}
		} while( n >= 0);
		JOptionPane.showMessageDialog(null, "A media é: " + (soma / i));
	}
}