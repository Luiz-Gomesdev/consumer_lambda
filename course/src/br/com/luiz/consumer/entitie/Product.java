package br.com.luiz.consumer.entitie;

public class Product {
	
	private String product;
	private double price;
	
	public Product(String product, double price) {
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void noStaticPriceUpdate() {
		price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return product + ", " + String.format("%.2f", price);
	}
	

}
