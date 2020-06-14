package ExercicioBasicosBateria01;

import java.util.Scanner;

/*
 * Faça um programa que leia cinco números, calcule e escreva a soma, o produto e a média dos números lidos.
 */
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int N1,N2,N3,N4,N5,soma;
		float produto,media;
		
		
	
		
		try(Scanner s = new Scanner(System.in);){
		System.out.println("DIGITE O VALOR 1 ");
	    N1 = s.nextInt();
	    System.out.println("DIGITE O VALOR 2 ");
	    N2 = s.nextInt();
	    System.out.println("DIGITE O VALOR 3 ");
	    N3 = s.nextInt();
	    System.out.println("DIGITE O VALOR 4 ");
	    N4 = s.nextInt();
	    System.out.println("DIGITE O VALOR 5 ");
	    N5 = s.nextInt();
	    }
		
	    soma = N1+N2+N3+N4+N5;
	    produto = N1*N2*N3*N4*N5;
	    media = N1+N2+N3+N4+N5/5;
	   
	   System.out.println("Soma "+soma);
	   System.out.println("Produto"+produto);
	   System.out.println("Media"+media);
		
		}
	}

