package ExercicioBasicosBateria01;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ex01 {

	public static void main(String[] args) {
	String n1;
	int n2 = 0;
	int n3 = 0;
	float media = 0;
	
/*	try (Scanner s = new Scanner(System.in)) {
		System.out.println("Digite a sua primeira nota");
		n1 = s.nextInt();
		System.out.println("Digite a sua segunda nota");
		n2 = s.nextInt();
		System.out.println("Digite a sua terceira nota");
		n3 = s.nextInt();
	}*/
n1 = JOptionPane.showInputDialog(null, "Digite um numero", JOptionPane.QUESTION_MESSAGE);
	 JOptionPane.showMessageDialog(null, "Digite a primeira nota");
	
	 
	 //a = JOptionPane.showInputDialog(null, "Informe o valor de A:", "Entrada", JOptionPane.QUESTION_MESSAGE);
	//media = (n1+n2+n3)/3;
	
	//System.out.println("A media dos numero é: "+ media);
	
	}

}
