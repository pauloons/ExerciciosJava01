package ExercicioBasicosBateria01;

import java.util.Scanner;

/*
 * Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expresa apenas em dias
 */
public class Ex04 {

	public static void main(String[] args) {
  	
		int ano,mes,dia;

		try (Scanner s = new Scanner(System.in);){
		System.out.println("Digite o ano de nascimeento");
		ano = s.nextInt();
		System.out.println("Digite o mes de nascimeento");
		mes = s.nextInt();
		System.out.println("Digite o dia de nascimeento");
		dia = s.nextInt();
		}
		
		System.out.println(dia+"/"+mes+"/"+ano);
	}
}
