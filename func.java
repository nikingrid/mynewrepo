import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner add = new Scanner(System.in);

		//Declaración de variables
		int numero1 = 0;
		int numero2 = 0;
		int resultado=0;
		
		//Se pide introducir variable
		System.out.println("¡Vamos a sumar!");  
		System.out.println("Introduce el primer número:");      
		numero1 = add.nextInt();
		      
		System.out.println("Introduce el segundo número:");
		numero2 = add.nextInt();
		
		//Se realiza la cuenta con las variables introducidas
		resultado = numero1+numero2;
		
		//Resultado impreso en pantalla
		System.out.println("El resultado es: " + resultado);
		
	}

}
