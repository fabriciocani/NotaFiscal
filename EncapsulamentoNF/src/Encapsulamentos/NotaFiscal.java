package Encapsulamentos;

public class NotaFiscal {
	
	private int numero;
	private Data data;
	private Vendedor vendedor; //nome, cpf
	private Produto[] produtos; //10 no maximo
	
	//getter para numero e data - OK
	//getter para vendedor - OK
	//geter e setter para produtos - OK
	
	//construtor com numero, data e vendedor - OK
	
	//Produtos adicionados por meio de um metodo chamado adicionarProdutos 
	//que faz a verificacao pelo codigo.
	//Se o produto ja existe. Este metodo deve retornar um booleano
	
	//metodo chamado calcularTotal que retorna o valor total da nota
	
	public NotaFiscal(int numero, Data data, Vendedor vendedor) {
		produtos = new Produto[3];
		this.numero = numero;
		this.data = data;
		this.vendedor = vendedor;
	}

	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	public int getNumero() {
		return numero;
	}
	public Data getData() {
		return data;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}

	public boolean adicionarProdutos(Produto p) {
		if (existeEspacoNoVetor()) { // resultando em true, entra no if
			if (produtoJaExiste(p) == false) {
				for (int i = 0; i < 3; i++) {
					if (produtos[i] == null) {
						produtos[i] = p;
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean produtoJaExiste(Produto produto) {
		Produto temporario = null;
		for (int i = 0; i < 3; i++) {
			temporario = produtos[i];
			if (temporario != null)
				if (temporario.getCodigo() == produto.getCodigo())
					return true;
		}
		return false;
	}

	private boolean existeEspacoNoVetor() {
		for (int i = 0; i < 3; i++) {
			if (produtos[i] == null)
				return true;
		}
		return false;
	}

	public double somarProdutos() {
		double soma = 0;
		for (int i = 0; i < 3; i++)
			soma = soma + produtos[i].getPreco();
		return soma;
	}
		
}
