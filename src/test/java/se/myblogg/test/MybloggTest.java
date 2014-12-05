package se.myblogg.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import se.sacha.data.BlogPostRep;
import se.sacha.model.BlogPost;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/springs-config.xml")
@Transactional
public class MybloggTest {

	@Autowired
	BlogPostRep rep;
	
	
	@Test
	public final void getBlogById(){
		BlogPost blog = new BlogPost("Jira", new Date(), "jira är bra");
		
		rep.addBlogPost(blog);
		
		assertEquals("Jira", rep.getBlogByTitle("Jira").getTitle());
	}
	
	@Test
	public final void testBlogPosts(){
		
		List<BlogPost> list = (List<BlogPost>) rep.getAllBlogs();
		
		int size = 0;
		
		for (BlogPost blogPost : list) {
			
			size++;
		}
		assertEquals(23, size);
	}
}
