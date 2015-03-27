package Encapsulamentos;

public class Testador {

	public static void main(String[] args) {

		Vendedor vend = new Vendedor("Johnny Bravo", "123.456.789-10");
		
		Produto prod1 = new Produto(134679, "Gel capilar", 7.99);
		Produto prod2 = new Produto(316497, "Desodorante", 9.45);
		Produto prod3 = new Produto(147852, "Shampoo", 8.15);
		
		Data data = new Data(26, 3, 2015); 
		
		NotaFiscal nf = new NotaFiscal(1, data, vend);
		
		nf.adicionarProdutos(prod1);
		nf.adicionarProdutos(prod2);
		nf.adicionarProdutos(prod3);
		
		System.out.println(prod1.getDescricao() + " " + prod1.getPreco() + "\n"
						 + prod2.getDescricao() + " " + prod2.getPreco() + "\n"
						 + prod3.getDescricao() + " " + prod3.getPreco() + "\n");
		System.out.println("Total " + nf.somarProdutos());
		System.out.println(vend.getNome() + " " + data.getDia() + "/" + data.getMes() + "/" + data.getAno());
		
	}

}
