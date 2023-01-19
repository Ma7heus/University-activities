package br.com.uffs.blog;

import java.util.Date;

public class Post {

	private String title; 
	
	private Date data;
	
	private String content; 
	
	private int likes;

	private int deslikes;
	

	public Post(String title, Date data, String content, int likes, int deslikes) {
		this.title = title;
		this.data = data;
		this.content = content;
		this.likes = likes;
		this.deslikes = deslikes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDeslikes() {
		return deslikes;
	}

	public void setDeslikes(int deslikes) {
		this.deslikes = deslikes;
	}
	
	public void show() {
		toString();
	}

	@Override
	public String toString() {
		return "Post [title=" + title + ", data=" + data + ", content=" + content + ", likes=" + likes + ", deslikes="
				+ deslikes + "]";
	}
	
	public void deslikes() {
		System.out.println(this.getDeslikes());
	}
	
	public void likes() {
		System.out.println(this.getLikes());
	}

}

