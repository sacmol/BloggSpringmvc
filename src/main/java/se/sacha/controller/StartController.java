package se.sacha.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import se.sacha.model.BlogPost;
import se.sacha.repository.BlogPostRepository;


@Controller
@RequestMapping(value="/")
public class StartController {

	@Autowired
	private BlogPostRepository rep;
	
	static Date d = new Date();
//	private static List<BlogPost> userList;
//	
//	static {
//        userList = new ArrayList<BlogPost>(20);
//        userList.add(new BlogPost(1L, "aa", d, "jag"));
//        userList.add(new BlogPost(2L, "bb", d, "du"));
//        userList.add(new BlogPost(3L, "cc", d, "han"));
//        userList.add(new BlogPost(4L, "dd", d, "hon"));
//        userList.add(new BlogPost(5L, "ee", d, "den"));
//        userList.add(new BlogPost(6L, "ff", d, "det"));
//        userList.add(new BlogPost(7L, "gg", d, "vi"));
//        userList.add(new BlogPost(8L, "hh", d, "ni"));
//        userList.add(new BlogPost(9L, "ii", d, "de"));
//        userList.add(new BlogPost(10L, "jj", d, "oss"));
//    
//        
//    }
	
	@RequestMapping(method = RequestMethod.GET)
	public String indexPage(Model model, HttpServletRequest req,HttpSession ses){
		
		List<BlogPost> list = (List<BlogPost>) rep.getAllBlogPosts();
		
		Collections.reverse(list);
		ArrayList<BlogPost> array  = new ArrayList<BlogPost>();
		
		for (int i = 0; i <=4; i++) {
			array.add(list.get(i));
		}
		
//		Map paramMap = WebUtils.getParametersStartingWith(req, "d-");
////		Map paramMap = (Map) WebUtils.getOrCreateSessionAttribute(ses, "d-", BlogPost.class);
//		if (paramMap.size() == 0) {
//            WebUtils.setSessionAttribute(req, "userList", list);
//        }
		
		Long nr = array.get(4).getId();
		nr= nr-1; 
		req.setAttribute("blogs", array);
		req.setAttribute("lastId", nr);
		return "index";
	}
	
	
	@RequestMapping(value = "about", method = RequestMethod.GET)
	public String aboutPage(Model model){
		return "about";
	}
	
	@RequestMapping(value = "resume/profile", method = RequestMethod.GET)
	public String resumePage(Model model){
		return "resume_profile";
	}
	
	@RequestMapping(value = "resume/skills", method = RequestMethod.GET)
	public String skillsPage(Model model){
		return "skills";
	}
	
	@RequestMapping(value = "resume/experience", method = RequestMethod.GET)
	public String experiencePage(Model model){
		return "experience";
	}
	
	@RequestMapping(value = "resume/degree", method = RequestMethod.GET)
	public String degreePage(Model model){
		return "degree";
	}
	
}
