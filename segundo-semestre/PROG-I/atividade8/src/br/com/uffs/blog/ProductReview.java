package br.com.uffs.blog;

import java.util.Date;

public class ProductReview extends Post implements Avaluable{
	
	private String brand;
	
	private int stars;
	
	public ProductReview(String title, Date data, String content, int likes, int deslikes, String brand, int stars) {
		super(title, data, content, likes, deslikes);
		this.brand = brand;
		this.stars = stars;
	}

	@Override
	public void avaluable(int value) {
		

	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("Brand: " + this.brand + " Stars: " + this.stars);
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}
	
}
