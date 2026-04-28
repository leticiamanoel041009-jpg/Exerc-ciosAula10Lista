package pctEx03;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma sequência: ");
		String texto = sc.nextLine();
		
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == '1') {
				contador++;
			}
		}
		
		System.out.println("Quantidade de '1's: " + contador);
		
		
    
	}

}
