package se.sacha.repository;

import java.util.Collection;

import se.sacha.model.BlogPost;

public interface BlogPostRepository {

	void addNewBloggPost(BlogPost blog);
	
	BlogPost updateBlog(Long id,BlogPost blog);
	
	void deleteBlogPost(Long id);
	
	Collection getAllBlogPosts();
	
	BlogPost getBlogById(Long id);
	
	BlogPost getBlogByTitle(String title);
	
	Collection getNextFiveEntriesDb(String start, String end);
	
}
