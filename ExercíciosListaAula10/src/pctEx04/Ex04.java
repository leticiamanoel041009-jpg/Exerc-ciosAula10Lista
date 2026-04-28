package pctEx04;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		String invertida = "";
		
		for (int i = palavra.length() -1; i>= 0; i--) {
			invertida += palavra.charAt(i);
		}
		
		System.out.println("Invertida: " + invertida);
		
		}

	}

