package parImpar;

import javax.swing.JOptionPane;

public class ParesOImpares {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
		num2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número"));
		
		if(num1%2==0 && num2%2==0) {
			
			JOptionPane.showConfirmDialog(null, "Ambos números son pares");
		}
		else if(num1%2!=0 && num2%2!=0) {
			JOptionPane.showConfirmDialog(null, "Ambos números son impares");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Uno es par y el otro impar");
		}
	}

}
