package se.sacha.repositoryimpl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import se.sacha.model.BlogPost;
import se.sacha.repository.BlogPostRepository;

@Repository
@Transactional
public class BlogPostRepositoryImpl implements BlogPostRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public void addNewBloggPost(BlogPost blog) {
		// TODO Auto-generated method stub
		em.persist(blog);
	}

	

	@Override
	public void deleteBlogPost(Long id) {
		// TODO Auto-generated method stub
		BlogPost blog = em.find(BlogPost.class, id);
		em.remove(blog);
	}

	@Override
	public Collection getAllBlogPosts() {
		// TODO Auto-generated method stub
		
		Query query = em.createQuery("SELECT b FROM BlogPost b");
		return query.getResultList();
	}

	@Override
	public BlogPost getBlogById(Long id) {
		// TODO Auto-generated method stub
		
		return em.find(BlogPost.class, id);
	}

	@Override
	public BlogPost getBlogByTitle(String title) {
		// TODO Auto-generated method stub
		return (BlogPost) em.createQuery("SELECT b FROM BlogPost b  WHERE b.title LIKE :title")
		.setParameter("title", title)
		.getSingleResult();
	}



	@Override
	public BlogPost updateBlog(Long id, BlogPost blog) {
		// TODO Auto-generated method stub
		
		BlogPost oldBlog = em.find(BlogPost.class, id);
		
		BlogPost bloggupdated = new BlogPost(oldBlog.getId(),blog.getTitle(), blog.getPostDate(), blog.getText());
		em.merge(bloggupdated);
		
		return em.find(BlogPost.class, id);
	}



	@Override
	public Collection getNextFiveEntriesDb(String start, String end) {
		// TODO Auto-generated method stub
		
		Query q = em.createQuery("SELECT b FROM BlogPost b where b.id BETWEEN "+ start +" and "+end);
		System.out.println("QQQQ   "+ q.getResultList());
		return q.getResultList();
	}

}
