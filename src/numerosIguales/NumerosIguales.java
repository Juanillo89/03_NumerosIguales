package numerosIguales;

import java.util.Scanner;

public class NumerosIguales
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("Introduce número. Para salir, mismo número dos veces: ");
		num1 = sc.nextInt();
		do
		{
			System.out.print("Introduce número. Para salir, mismo número dos veces: ");
			num2 = sc.nextInt();
			if(num2 != num1)
			{
				System.out.print("Introduce número. Para salir, mismo número dos veces: ");
				num1 = sc.nextInt();
			}
		}
		while(num1 != num2);
		sc.close();
		System.out.println("Fin del programa.");
	}
}
