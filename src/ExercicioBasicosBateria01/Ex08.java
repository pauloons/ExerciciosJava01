package ExercicioBasicosBateria01;

import javax.swing.JOptionPane;

/*
 * Fa�a um programa que leia dois valores nas vari�veis A e B respectivamente, troque o valor
 * contido na vari�vel A pelo valor em B, e o valor em B pelo valor em A, isto �, imprimiremos
 * A e B com os valores trocados.
 */
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = null, b = null, aux;
			a = JOptionPane.showInputDialog(null, "Informe o valor de A:", "Entrada", JOptionPane.QUESTION_MESSAGE);
			b = JOptionPane.showInputDialog(null, "Informe o valor de B:", "Entrada", JOptionPane.QUESTION_MESSAGE);
			aux = b;
			b = a;
			a = aux;
			JOptionPane.showMessageDialog(null, "O valore de A �: " + a + " e o valor de B �: " + b, "Sa�da", JOptionPane.INFORMATION_MESSAGE);
		}

	}


