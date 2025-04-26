package inventory;

public class Product {
    private int itemNumber;
    private String name;
    private int qtdInStock;
    private double price;
    private boolean active = true;
    
    public Product() {}
    
    public Product(int number, String name, int qtd, double price)
    {
    	this.itemNumber = number;
    	this.name = name;
    	this.qtdInStock = qtd;
    	this.price = price;
    }

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQtdInStock() {
		return qtdInStock;
	}

	public void setQtdInStock(int qtdInStock) {
		this.qtdInStock = qtdInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public double getInventoryValue()
	{
		return this.price * this.qtdInStock;
	}

	public String toString()
    {
    	return "\nItem Number: " + this.itemNumber
    			+ "\nName:" + this.name
    			+ "\nQuzntity in stock: " + qtdInStock
    			+ "\nPrice: " + this.price
    			+"\nStock Value: " + this.getInventoryValue()
    			+ "\nStatus: " + (this.active ? "Ativo" : "Descontinuado");
    } 
}
