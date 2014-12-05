package se.sacha.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import se.sacha.data.BlogPostRep;
import se.sacha.model.BlogPost;

public class Main {

	
	public static void main(String[] args) {
		
		getblogsBetweenTwoId();
//		addBlogPost();
//		updateblog();
//		deleteblog();
//		getblog();
//		getAllBlogs();
//		getBlogByTitle();
		
	}
	
	
	
	private static void getblogsBetweenTwoId() {
		// TODO Auto-generated method stub
		ApplicationContext ct = getApplicationContext();
		BlogPostRep br = ct.getBean(BlogPostRep.class);
		
		List<BlogPost> list = (List<BlogPost>) br.getNextFiveEntriesDb(5L);
		System.out.println("________  " + list);
		
	}



	private static void getBlogByTitle() {
		// TODO Auto-generated method stub
		ApplicationContext ct = getApplicationContext();
		BlogPostRep br = ct.getBean(BlogPostRep.class);
		
		BlogPost blog = br.getBlogByTitle("Java");
		
		System.out.println(blog);
	}



	private static void getAllBlogs() {
		// TODO Auto-generated method stub
		ApplicationContext ct = getApplicationContext();
		BlogPostRep br = ct.getBean(BlogPostRep.class);
		
		List<BlogPost> list = (List<BlogPost>) br.getAllBlogs();
		
		System.out.println(list);
	}



	private static void getblog() {
		// TODO Auto-generated method stub
		ApplicationContext ct = getApplicationContext();
		BlogPostRep br = ct.getBean(BlogPostRep.class);
		
		BlogPost blog = br.getBlogById(1L);
		
		System.out.println(blog);
	}



	private static void deleteblog() {
		// TODO Auto-generated method stub
		ApplicationContext ct = getApplicationContext();
		BlogPostRep br = ct.getBean(BlogPostRep.class);
		
		br.deleteBlogById(3L);
	}



	private static void updateblog() {
		// TODO Auto-generated method stub
		ApplicationContext ct = getApplicationContext();
		BlogPostRep br = ct.getBean(BlogPostRep.class);
		Date date = new Date();
		BlogPost blog = new BlogPost("C++", date, "spelprogrammering");
		
		br.updateBlog(1L, blog);
	}



	private static void addBlogPost() {
		// TODO Auto-generated method stub
		ApplicationContext ct = getApplicationContext();
		BlogPostRep br = ct.getBean(BlogPostRep.class);
		
		Date date = new Date();
		BlogPost bp = new BlogPost("Hibernate", date, "hibernate fundamentals");
		
		br.addBlogPost(bp);
		
	}



	private static ApplicationContext getApplicationContext(){
		ApplicationContext ct = new ClassPathXmlApplicationContext(new String [] {"spring-config.xml"});
		return ct;
	}
}
