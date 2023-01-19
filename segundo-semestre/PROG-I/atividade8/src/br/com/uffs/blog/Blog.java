package br.com.uffs.blog;

import java.util.List;

public class Blog {
	
	private List<Post> posts;
	
	public void showAll() {
		for (Post post : this.posts) {
			post.show();
		}
	}

	void readData(Post post) {
		post.show();
	}
	
}
