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
		System.out.println();
		System.out.println("Vlr total do carrinho: " + vlrTotalCarrinho+"\n");
		System.out.println("Imposto de 9% cobrado no valor total da compra: "+(vlrTotalCarrinho * 0.09)+"\n");
		System.out.println("\nOpções de pagamento\n");
		System.out.println("[1]À vista em dinheiro ou cartão MASTERCARD, 20% de desconto.");
		System.out.println("[2]À vista no cartão de crédito, 15% de desconto.");
		System.out.println("[3]Em 2x, preço normal de etiqueta sem juros.");
		System.out.println("[4]Em 3x, preço normal de etiqueta mais juros de 10%.\n");
		System.out.println("Qual seria a forma de pagamento?");
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
