package pctEx01;
import java.util.Scanner;


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma string: ");
		String texto = sc.nextLine();
		//a)número de caracteres
		System.out.println("Quantidade de caracteres: " + texto.length());
		//b)tudo em maiusculo 
		System.out.println("Maiúsculo: " + texto.toUpperCase());
		//c)numero de vogais 
		int vogais = 0;
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if ("aeiou".indexOf(c) != -1) {
				vogais++;
		
			}
		}
		System.out.println("Quantidade de vogais: " + vogais);
		
		
	}

}
