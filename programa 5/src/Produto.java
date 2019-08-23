
public class Produto {

	private String descricao;
	private float pesoEmKg;
	private double precoUnitario;
	
	public Produto() {
		
	}
	
	public Produto(String desc,float peso,double preco) {
		this.descricao=desc;
		this.pesoEmKg=peso;
		this.precoUnitario=preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPesoEmKg() {
		return pesoEmKg;		
	}

	public void setPesoEmKg(float pesoEmKg) {
		this.pesoEmKg = pesoEmKg;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	@Override
	public String toString() {
		if(descricao ==null && pesoEmKg==0 && precoUnitario == 0) {
			return "";
		}
		else
			return this.getDescricao()+"\n "+"Preço: R$ " + this.getPrecoUnitario()
			+" ; Peso: " + this.getPesoEmKg() + "Kg.\n\n";
	}

	
}
