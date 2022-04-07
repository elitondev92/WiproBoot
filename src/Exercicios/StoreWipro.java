package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterName;
/*
 * Ainda faltam algumas melhorias
 * 1º Validações de input do usuário
 * 2º Um método para formatar os valores monetários
 * */
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
		System.out.println("\nOpções de pagamento\n");
		System.out.println("[1]À vista (dinheiro, pix ou cartão MasterdCard) com 20% de desconto;.");
		System.out.println("[2]À vista no crédito com 10% de desconto.");
		System.out.println("[3]Parcelado em até 3x sem tem desconto;\n.");
		System.out.println("Qual seria a forma de pagamento?");
		
		int opcaoPagamento = input.nextInt();
		float desconto = 0f;
		float total = 0f, tributo = 0f;
		
		switch (opcaoPagamento) {
			case 1:
				desconto = vlrTotalCarrinho * 0.2f;
				total = vlrTotalCarrinho - desconto;
				break;
			case 2:
				desconto = vlrTotalCarrinho * 0.1f;
				total = vlrTotalCarrinho - desconto;
				break;
			case 3:
				desconto = 0;
				total = vlrTotalCarrinho;
				break;
			case 4:
				
				break;
		}
		printNotaFiscal(pNomes, pPreco, carrinhoIndex, carrinhoQtde, desconto, total);
		input.close();
	}

	private static void printEstoque(String[] pNomes, int[] pEstoque, float[] pPreco) {
		System.out.println("=================================== WIPRO STORE ===================================");
		System.out.printf("%5s %20s %20s %20s", "COD", "PRODUTO", "ESTOQUE", "PREÇO");
		System.out.println();
		for (int i=0;i < pNomes.length;i++) {
			System.out.printf("%5s %20s %20s %20s\n", i+1, pNomes[i], pEstoque[i], pPreco[i]);
		}
		System.out.println("===================================================================================");
		
	}
	
	private static void printNotaFiscal(String[] pNomes, float[] pPreco, List<Integer> carrinhoIndex, List<Integer> carrinhoQtde, float desconto, float valorTotal) {
		System.out.println("=================================== Nota Fiscal ===================================");
		System.out.printf("%20s %20s %20s %20s", "PRODUTO", "QTDE", "PREÇO UNT.", "VALOR TOTAL");
		System.out.println();
		int index;
		for (int i=0;i < carrinhoIndex.size();i++) {
			index = carrinhoIndex.get(i);
			System.out.printf("%20s %20s %20s %20s\n", pNomes[index], carrinhoQtde.get(i), pPreco[index], (carrinhoQtde.get(i) * pPreco[index]));
		}
		System.out.println("==================================================================================");
		System.out.println("Desconto na compra: " + desconto);
		System.out.println("Valor total a ser pago: " + valorTotal);
		System.out.println("Imposto sobre a compra: " + (valorTotal * 0.09f));
		
	}
}
