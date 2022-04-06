package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreWipro {
	public static void main(String[] args) {
		String [] pNomes = {"Feijão", "Arroz", "Leite"};
		int [] pEstoque = {10, 10, 10};
		float [] pPreco = {8.99f, 5.99f, 4.99f};
		
		List<Integer> carrinhoIndex = new ArrayList<>();
		List<Integer> carrinhoQtde = new ArrayList<>();
		
		
		Scanner input = new Scanner(System.in);
		String ctn = "s";
		do {
			printEstoque(pNomes, pEstoque, pPreco);
			System.out.println("Digite o código do produto desejado:");
			int codProduto = (input.nextInt() - 1);
			
			System.out.println("Insira a quantidade:");
			int quantidade = input.nextInt();
			
			carrinhoIndex.add(codProduto);
			carrinhoQtde.add(quantidade);
			
			pEstoque[codProduto] = pEstoque[codProduto] - quantidade;
			
			System.out.println(quantidade + " un. de " + pNomes[codProduto] +" adicionado com sucesso no carrinho");
			
			System.out.println("Deseja continuar? [S/N]");
			ctn = input.next();
		} while(ctn.equals("s") || ctn.equals("S"));
		System.out.println("Itens do carrinho:");
		System.out.printf("%5s %20s %20s %20s", "NOME", "QTDE.", "PREÇO UN.", "TOTAL");
		System.out.println();
		float vlrTotalCarrinho = 0;
		for (int i=0;i < carrinhoIndex.size();i++) {
			float vlrTotal = 0;
			vlrTotal = vlrTotal + (carrinhoQtde.get(i) * pPreco[carrinhoIndex.get(i)]);
			System.out.printf("%5s %20s %20s %20s\n", pNomes[carrinhoIndex.get(i)], carrinhoQtde.get(i), pPreco[carrinhoIndex.get(i)], vlrTotal);
			vlrTotalCarrinho += vlrTotal; 
		}
		System.out.println("Vlr total do carrinho: " + vlrTotalCarrinho);
		System.out.println("Imposto de 9% cobrado no valor total da compra: "+(vlrTotalCarrinho * 0.09));
		System.out.println("\nOpções de pagamento\n\n");
		input.close();
	}

	private static void printEstoque(String[] pNomes, int[] pEstoque, float[] pPreco) {
		System.out.println("=================================== WIPRO STORE =======================");
		System.out.printf("%5s %20s %20s %20s", "COD", "PRODUTO", "ESTOQUE", "PREÇO");
		System.out.println();
		for (int i=0;i < pNomes.length;i++) {
			System.out.printf("%5s %20s %20s %20s\n", i+1, pNomes[i], pEstoque[i], pPreco[i]);
		}
		System.out.println("=======================================================================");
		
	}
}
