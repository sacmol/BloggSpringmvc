package se.sacha.controller;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import se.sacha.model.BlogPost;
import se.sacha.repository.BlogPostRepository;

@Controller
@RequestMapping(value="admin")
public class AdminController {
	
	private Date today = new Date();
	
	@Autowired
	private BlogPostRepository rep;
	
	@RequestMapping(value="start",method = RequestMethod.POST)
	public String loginPage(HttpSession ses,Model model,@RequestParam("id") String id, @RequestParam("pass")String pass){
		
		if(id.equals("1") && pass.equals("a")){
			ses.setAttribute("user", "user");
			return "/admin/adminstart";
		}else{
			return "redirect:/login";
		}
	}
	
	@RequestMapping(value = "editprofile", method = RequestMethod.GET)
	public String editAbout(Model model){
		
		return "/admin/editabout";
	}

	@RequestMapping(value = "addblog", method = RequestMethod.GET)
	public String addBlog(Model model){
		
		return "/admin/addblog";
	}
	@RequestMapping(value = "addblogg", method = RequestMethod.GET)
	public String addingBlog(Model model,HttpServletRequest req,@RequestParam("title") String title, @RequestParam("txt") String content){
		
		req.setAttribute("preblog", content);
		req.setAttribute("pretitle", title);
		return "/admin/addblog";
	}
	
	@RequestMapping(value = "addblogdb", method = RequestMethod.POST)
	public String persistBlog(Model model,@RequestParam("title") String title, @RequestParam("txt") String content){
		
		BlogPost blog = new BlogPost(title, today, content);
		
		rep.addNewBloggPost(blog);
		
		return "/admin/addblog";
	}
	
	@RequestMapping(value = "prepost", method = RequestMethod.POST)
	public String prePostBlog(Model model,HttpServletRequest req,@RequestParam("title") String title, @RequestParam("txt") String content){
		
		req.setAttribute("preblog", content);
		req.setAttribute("pretitle", title);
		
		return "/admin/prepostblog";
	}
	
	@RequestMapping(value = "blogtag", method = RequestMethod.GET)
	public String blogPost(Model model,@RequestParam("id") String id,HttpServletRequest req){
		
	int x = Integer.parseInt(id);
	x = x-4;
	String end = String.valueOf(x);
		
		List<BlogPost> list = (List<BlogPost>) rep.getNextFiveEntriesDb(end, id);
		Collections.reverse(list);
		x= x-1;
		req.setAttribute("blogs", list);
		req.setAttribute("lastId", x);
		req.setAttribute("firstId", id);
		return "blogsort";
	}
	
	@RequestMapping(value = "forwardbp", method = RequestMethod.GET)
	public String blogPostForward(Model model,@RequestParam("id") String id,HttpServletRequest req){
	int x = Integer.parseInt(id);
	x = x-4;
	String end = String.valueOf(x);
		
		List<BlogPost> list = (List<BlogPost>) rep.getNextFiveEntriesDb(end, id);
		Collections.reverse(list);
		req.setAttribute("blogs", list);
		
		x= x-1;
		req.setAttribute("lastId", x);
		req.setAttribute("firstId", id);
		return "blogsort";
	}
	
	@RequestMapping(value = "backbp", method = RequestMethod.GET)
	public String blogPostBack(Model model,@RequestParam("id") String id,HttpServletRequest req){
	int x = Integer.parseInt(id);
	x = x+1;
	String start = String.valueOf(x);
	x=x+4;
	String end =String.valueOf(x);
		List<BlogPost> list = (List<BlogPost>) rep.getNextFiveEntriesDb(start, end);
		Collections.reverse(list);
		req.setAttribute("blogs", list);
		int y = Integer.parseInt(start);
		y=y-1;
		req.setAttribute("lastId", y);
		req.setAttribute("firstId", x);
		return "blogsort";
	}
	
	
}
