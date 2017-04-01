package com.hand.ssm.dto;

public class Goods {

	private long id;
	private String name;
	private float price;
	private int quantity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Goods() {

	}

	public Goods(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Goods(long id, String name, float price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
