package JavaBlocoI_Vetor;

import java.util.Scanner;

public class Intro_Matriz_plataforma {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [][] matriz = new int[3][3];
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Matriz M[3][3]\n");
		
		for (int linha=0;linha<3;linha++)
		{
			for(int coluna = 0;coluna<3;coluna++)
			{
			System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);	
			matriz[linha][coluna]=entrada.nextInt();
			}
		}
		System.out.println("\nA matriz ficou: \n");
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t %d \t",matriz[linha][coluna]);
			}
		}
	}

}
