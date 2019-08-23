import java.util.Scanner;
 /**
  * 
  * @author Lucas Alves
  * BC4
  *
  */
public class Main {

	public static void main(String[] args) {
				
		/**			EXEMPLOS DE PRODUTOS :
		Produto carne = new Produto("Carne",1.5f,19.90);
		Produto feijao = new Produto("Feijão Preto",1f,4.50);
		Produto arroz = new Produto("Arroz Branco",1f,4.99);
		Produto biscoito1 = new Produto("Biscoito Vitarela Morango", 0.250f, 1.20);
		Produto biscoito2 = new Produto("Biscoito VitaMassa Chocolate", 0.250f, 1.00);
		Produto faca = new Produto("Faca Tramontina", 0.500f, 29.99);
		Produto n1 = new Produto();
		Produto n2 = new Produto();
		Produto n3 = new Produto();
		 */
			
		String nome;
		float peso;
		double preco;
		Produto[] array = new Produto[8];
		Scanner ler = new Scanner(System.in);		
		
		System.out.println("Criando produto : "
				+ "Formula -> Nome , Peso , Preço \n USE VIRGULA PARA SEPARAR CASAS DECIMAIS");
		for(int k=0;k<8;k+=2) {
			System.out.println("Produto "+(k+1)+": \nNome: ");
			
			if(k>0) {
				ler.nextLine();
				}
			
			nome = ler.nextLine();
			System.out.println("Peso: ");
			peso = ler.nextFloat();
			System.out.println("Preço: ");
			preco = ler.nextDouble();
			
			//adicionando o produto 
			array[k] = new Produto(nome, peso, preco);
			//adicionando automaticamente um produto "nulo" 
			array[k+1] = new Produto();
			
	}	
		NotaFiscal nota = new NotaFiscal();
		System.out.println("Desconto recebido será de " + (100-(nota.getDesconto()*100))+"%.\n");
		
		for(int x=0;x<8;x++) {
		nota.addProduto(array[x]);
		}
		
		System.out.println(nota.toString());

	}
}
