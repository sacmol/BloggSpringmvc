package se.myblogg.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import se.sacha.model.BlogPost;
import se.sacha.repository.BlogPostRepository;
import se.sacha.repositoryimpl.BlogPostRepositoryImpl;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/springs-config.xml")
@Transactional
public class GetBlogs {
	
	@Autowired
	BlogPostRepository repository;
	
	
	@Before
	public void setUp(){
		this.repository = new BlogPostRepositoryImpl();
		
	}
	
	@Test
	public void getBlogById(){
		
		BlogPost blogOne = repository.getBlogById(1L);
		BlogPost blogTwo = repository.getBlogById(1L);
		
		assertEquals(blogOne.getTitle(),blogTwo.getTitle());
		
	}

}
