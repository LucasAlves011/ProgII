import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class NotaFiscal {
	
	Random gerador = new Random();
	DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");

	private Produto[] produtos = new Produto[20];
	private double desconto;
	private LocalDateTime dataHora;
	
	public NotaFiscal(double desconto) {
		this.desconto = desconto;
	}
	
	public NotaFiscal() {
		this.desconto = (double) (100-gerador.nextInt(16))/100; 
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public LocalDateTime getDataHora() {
		return this.dataHora;
	}
	
	public void addProduto(Produto x) {
		if(indexer()!= 30) {
			produtos[indexer()] = x;
		}
		else
			System.out.println("Lista cheia,produto não adicionado");
	}
	
	//temporario
	public String toString() {
		indentar();
		String x="";		
		for(int i=0;i < indexer();i++) {
			x += produtos[i].toString();
		}		
		dataHora = LocalDateTime.now();		
		
		return "---------- Nota Fiscal ----------\n    " + dataHora.format(forma) + "\n\n"
				+ x + "----------------------------------\n" + "Total: R$ " + totalIdentado+
				"\nUm desconto de " + descontoIdentado + "% já foi aplicado";
	}
	
	private int indexer(){
		int i=0;
		for( ; i<20;i++) {
			if(produtos[i] == null) {
				return i;
			}				
		}
		
		return 30;
	}
	
	public double calcularValorTotal() {
		double aux=0;
		for(int i=0;i<indexer();i++) {
			aux += produtos[i].getPrecoUnitario();
		}
		return aux*desconto;				
	}
	
	private String descontoIdentado;
	private String totalIdentado;
	
	private void  indentar() {
		String aux="";
		aux = String.valueOf(calcularValorTotal());
		totalIdentado = aux.substring(0, 5);		 
		aux= (Double.toString(100-(desconto*100)));
		if(100-(desconto*100) <10) {
			descontoIdentado = aux.substring(0,1);
		}
		else
			descontoIdentado = aux.substring(0,2);		
	}
}
