package ExercicioBasicosBateria01;

import java.util.Scanner;

/*
 * Fa�a um programa que leia A, B e C e calcule a seguinte f�rmula 7 * C + 5 / (2 * A * 3), 
 * armazenando-a na vari�vel Result.
 */
public class Ex03 {

	public static void main(String[] args) {
	
		int A,B,C;
		int result = 0;

		try (Scanner s = new Scanner(System.in);){
		System.out.println("Digite o primero numero ");
		A =s.nextInt();
		System.out.println("Digite o primero numero ");
		B =s.nextInt();
		System.out.println("Digite o primero numero ");
		C =s.nextInt();
		
		result = 7 * C + 5 / (2 * A * 3)  ;
		
		}
		System.out.println(result);
	}

}
