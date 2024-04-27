package classes_projet;

public class Stock {
	
	private int code_stock;
    private int stock;
    public Stock(int code_stock, int stock) {
		this.code_stock = code_stock;
		this.stock = stock;
	}
	public int getCode_stock() {
		return code_stock;
	}
	public void setCode_stock(int code_stock) {
		this.code_stock = code_stock;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void consulter_stock() {
        System.out.println("Le stock du produit avec le code " + code_stock + " est de " + stock + " unités.");
    }
	
	public void stock_bas() {
        if (stock <= 15) {
            System.out.println("Attention : Le stock du produit avec le code " + code_stock + " est bas.");
        } else {
            System.out.println("Le stock du produit avec le code " + code_stock + " est suffisant.");
        }
    }
}
