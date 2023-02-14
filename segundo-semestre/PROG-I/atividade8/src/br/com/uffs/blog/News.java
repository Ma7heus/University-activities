package br.com.uffs.blog;

import java.util.Date;

public class News extends Post {
	
	private String source;
	
	public News(String title, Date data, String content, int likes, int deslikes, String source) {
		super(title, data, content, likes, deslikes);
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("Source: " + this.source);
	}

}
