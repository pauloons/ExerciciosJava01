package ExercicioBasicosBateria01;

import java.util.Scanner;

/*
 * Faça um programa que leia 3 notas de um aluno e calcule a média final deste aluno.
 * Considere que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente
 * 
 * Média ponderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) /soma_pesos
 */

public class Ex05 {

	public static void main(String[] args) {
    int nota1,nota2,nota3;
    int peso1 = 2;
    int peso2=  3;
    int peso3 = 5;
    int media;
    int somaPesos;
    
    
   try( Scanner s = new Scanner(System.in);){
    System.out.println("Digite sua primeira nota");
    nota1 = s.nextInt()*2;
    
    System.out.println("Digite sua segunda nota");
    nota2 = s.nextInt()*3;
    
    System.out.println("Digite sua Terceira nota");
    nota3 = s.nextInt()*5;
   }
    
   somaPesos = peso1+peso2+peso3;
   media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) /somaPesos;
   System.out.println("A media gera é"+media);
	}

}
