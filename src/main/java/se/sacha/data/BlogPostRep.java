package se.sacha.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import se.sacha.model.BlogPost;


@Service
public class BlogPostRep {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void addBlogPost(BlogPost blog){
		
		em.persist(blog);
	}
	
	@Transactional
	public BlogPost getBlogById(Long id){
		
		BlogPost blog = em.find(BlogPost.class, id);
		
		return blog;
	}
	
	public BlogPost getBlogByTitle(String title){
		
		return (BlogPost) em.createQuery("SELECT b FROM BlogPost b  WHERE b.title LIKE :title")
		.setParameter("title", title)
		.getSingleResult();
		
	}
	
	@Transactional
	public void updateBlog(Long id, BlogPost blog){
		
		BlogPost oldBlog = em.find(BlogPost.class, id);
		
		BlogPost bloggupdated = new BlogPost(oldBlog.getId(),blog.getTitle(), blog.getPostDate(), blog.getText());
		em.merge(bloggupdated);
		
	}
	
	@Transactional
	public void deleteBlogById(Long id){
		
		BlogPost blog = em.find(BlogPost.class, id);
		em.remove(blog);
	}
	
	@Transactional
	public Collection<BlogPost> getAllBlogs(){
		
		Query query = em.createQuery("SELECT b FROM BlogPost b");
		
		return query.getResultList();
	}
	
	@Transactional
	public List<BlogPost> getNextFiveEntriesDb(Long id){
		
		Query query = em.createQuery("SELECT COUNT(*) FROM BlogPost ");
		Object x =  query.getSingleResult();
		String ww = x.toString();
		System.out.println(ww);
		System.out.println("XXX   " + x);
		
		
		
			Query qs  = em.createQuery("SELECT b FROM BlogPost b");
			List<BlogPost> list = qs.getResultList();
		System.out.println(list);
		System.out.println("**************");
		Collections.reverse(list);
		ArrayList<BlogPost> array  = new ArrayList<BlogPost>();
		
		Query q = em.createQuery("SELECT b FROM BlogPost b where b.id BETWEEN 5 and 10");
		
		return q.getResultList();
		
		
	}
}
