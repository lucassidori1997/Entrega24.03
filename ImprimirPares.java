import javax.swing.JOptionPane;

public class ImprimirPares{

	public static void main (String [] args){
      
		for (int i = 0; i < 200 ;i ++ ){
			if (i % 2 == 0) {  
				JOptionPane.showMessageDialog(null, i);
			}
		}
	}
}