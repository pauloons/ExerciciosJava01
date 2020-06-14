package ExercicioBasicosBateria01;

import java.util.Scanner;

/*
 * Faça um programa que leia um valor numérico e uma palavra, some 5 ao valor numérico e escreva ambos.
 */

public class Ex02 {

	public static void main(String[] args) {

		int numero = 0;
		String palavra;
		
try (Scanner s = new Scanner(System.in)){
	
	System.out.println("Digite um valor");
	numero = s.nextInt()+1;
	
    System.out.println("Digite uma palavra");
    palavra = s.next();
    
    System.out.println(numero+"  "+"  "+palavra);
}
	}

}
