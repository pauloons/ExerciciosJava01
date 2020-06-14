package ExercicioBasicosBateria01;

import java.util.Scanner;

/*
 * Faça um programa que leia um valor inteiro, calcule e escreva o dobro e o triplo desse número.
 */

public class Ex09 {

	public static void main(String[] args) {
	int valor;
	int dobro;
	int triplo;
	
	
	try(Scanner s = new Scanner(System.in);){
	System.out.println("DIGITE O VALOR");
    valor = s.nextInt();
	}
    dobro = valor*2;
    triplo = valor*3;
   System.out.println("o dobro do valor e "+dobro);
   System.out.println("O triplo do valor é : "+triplo);
	
	
	}

}
