package ExercicioBasicosBateria01;

import java.util.Scanner;

/*
 * Faça um programa que leia um valor inteiro, multiplique por dois e escreva o resultado 
 */
public class Ex06 {

	public static void main(String[] args) {
int numero;

try (Scanner s = new Scanner(System.in);){
System.out.println("Digite um numero");
numero = s.nextInt()*2;
}
System.out.println(numero);
	}

}
