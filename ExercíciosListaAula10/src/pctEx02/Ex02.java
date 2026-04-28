package pctEx02;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma string: ");
		String texto = sc.nextLine();
		
		String invertida = "";
		
		for (int i = texto.length() - 1; i >=0; i--) {
			invertida += texto.charAt(i);
		}
		
		if (texto.equalsIgnoreCase(invertida)) {
			System.out.println("É um palíndromo");
		} else {
			System.out.println("Não é um palíndromo");
		}
		}
	}
