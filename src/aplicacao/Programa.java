package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro para ser atribuida a sequencia de Golomb :");
		int n = sc.nextInt();
		List<Integer> golomb = new ArrayList<>();

		int[] vet = new int[n + 1];

		vet[1] = 1;
		golomb.add(vet[1]);
		for (int i = 2; i <= n ; i++) {
			vet[i] = vet[1] + vet[i - vet[vet[i - 1]]];
			golomb.add(vet[i]);

		}

		for (Integer i : golomb) {
			System.out.print(i + "  ");

		}

	}

}
