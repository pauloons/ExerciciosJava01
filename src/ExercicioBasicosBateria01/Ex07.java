package ExercicioBasicosBateria01;
/*
 * Faça um programa que leia o nome e a idade de uma pessoa e escreva estas informações.
 */

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int idade;
		String nome;
		
try (Scanner s = new Scanner(System.in)){
	
	System.out.println("Digite a idade");
	idade = s.nextInt();
	
    System.out.println("Digite o nome");
    nome = s.next();
    
    System.out.println(idade+"  "+"  "+nome);
}
	}

}