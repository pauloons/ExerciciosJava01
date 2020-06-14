package ExercicioBasicosBateria01;

import javax.swing.JOptionPane;

/*
 * Faça um programa que leia dois valores nas variáveis A e B respectivamente, troque o valor
 * contido na variável A pelo valor em B, e o valor em B pelo valor em A, isto é, imprimiremos
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
			JOptionPane.showMessageDialog(null, "O valore de A é: " + a + " e o valor de B é: " + b, "Saída", JOptionPane.INFORMATION_MESSAGE);
		}

	}


