package com.ait.Controller;

import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.ait.Model.Item;
import com.ait.Model.Product;
import com.ait.Model.User;
import com.ait.Service.ProductService;
import com.ait.Service.UserService;

@Controller
public class UserController {
	
	ArrayList<Item> al =new ArrayList<>();
	@Autowired
	private UserService uservice;
	@Autowired
	private ProductService productservice;
	
	
	
	
	@GetMapping("/Addtocart")
	public String addToCart(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if (session == null) {
			return "firstview";
		} 
		else 
		{
			int pid = Integer.parseInt(req.getParameter("id"));
			Product p1 = productservice.getProductById(pid);
			al.add(new Item(p1.getProductId(), p1. getProductName(), p1.getProductPrice(),1));
			System.out.println("***************"+al);
			session.setAttribute("cartlist", al);
			return "forward:/productuser";
		}
	}
	
	
	@GetMapping("/viewcart")
	public String viewCart(HttpServletRequest req, Model m) {
		HttpSession session = req.getSession(false);
		if (session != null) 
		{	
			ArrayList<Item> arr = (ArrayList<Item>) session.getAttribute("cartlist");
			m.addAttribute("cartlist", arr);
			System.out.println("***************"+arr);
		}
		return "viewcart";
	}

	
	
	@GetMapping("/validateuser")
	  public String ValidateUser(@ModelAttribute User user, HttpServletRequest req) {

		System.out.println();
			String usernm = user.getUserName();
			String pass = user.getUserpassword();
			User u1 =uservice.getUserByNameAndPassword(usernm, pass);
			System.out.println("*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+u1);
			if (u1 == null) {
				req.setAttribute("status", "Invalid username and password");
				return "firstview";
			} else {
				HttpSession session = req.getSession();
				String role=u1.getRole().getRoleType();
				if(role.equalsIgnoreCase("admin"))
					return "redirect:/productadmin";
				else
					return "LoginFirstPage";
				

			}

		}
	
//	@GetMapping("/check")
//	public String checkUser(@RequestParam("userName") String n, @RequestParam("userpassword") String p) 
//	{	
//		
//		String mm="admin";
//		String m1="user";
//		List<User> li = uservice.getAllUsers();
//		for (User u : li) {
//			if (u.getUserName().equalsIgnoreCase(n) && u.getUserpassword().equalsIgnoreCase(p)
//					&& u.getRole().equals(mm))
//			{
//				return "redirect:/productadmin";
//			} 
//			if (u.getUserName().equalsIgnoreCase(n) && u.getUserpassword().equalsIgnoreCase(p)
//					&& u.getRole().equals(m1)) {
//				return "redirect:/productuser";
//			}
//		}
//		return "Signup";
//
//	}
	  
	@GetMapping("/logout")
	public String logout()
	{
		return "firstview";
	}
	
//	@GetMapping("/contact")
//	public String contact()
//	{
//		return "Contact";
//	}
	
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam("uname") String uname, @RequestParam("upass") String upass , @RequestParam("Gender") String gender, @RequestParam("uage") int age , @RequestParam("uemail") String email, @RequestParam("uph") long num) throws Exception
	{
		
	    User ob=new User(gender, uname, upass, age, email, num);
		uservice.insertUser(ob);
		return  "redirect:/go";
	}
	
	
	

}
