package JavaBlocoI;

import java.util.Scanner;

public class Intro_Laco_repeticao_While_Java
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
		System.out.printf("Entre com a sua idade: ");
		idade = entrada.nextInt();
		
		while(idade>=1)
		{
			System.out.printf("\nSua idade: %d",idade);
			if (idade>=18)
			{
				System.out.printf("\nVoc� � maior de idade.");
			}
			else
			{
				System.out.printf("Voc� � menor de idade.");
			}
		System.out.printf("\nEntre com a sua idade: ");
		idade = entrada.nextInt();
		}
	}
}
