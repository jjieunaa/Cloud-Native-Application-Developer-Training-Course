package blog;

import java.util.ArrayList;

public class Blog {
	
	private int blogId;
	private String title;
	private Author author;
	private ArrayList<Post> posts;
	
	public Blog(int blogId) {
		this.blogId = blogId;
	}
	
}
