package com.ait.Controller;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.ait.Model.Product;
import com.ait.Model.User;
import com.ait.Service.ProductService;
import com.ait.Service.UserService;


@Controller
public class ProductController {
	
	
	
	@Autowired
	private ProductService productservice;
	
	@Autowired
	private UserService uservice;
	
	@GetMapping("/")
	public String firstView()
	{
		return "firstview";
	}
	
	
	@GetMapping("/go")
	public String go()
	{
		return "firstview";
	}
	
	 @GetMapping("/productuser") 
	  public ModelAndView userView() 
	  { 
		  List<Product>lst=productservice.getAllProducts(); 
		  ModelAndView mv=new
	      ModelAndView("viewUser"); 
		  mv.addObject("prodUserlist",lst);
		  return mv;
	  }
	
	
	  @GetMapping("/signup")
	  public String adminLogin() 
	  { 
		  return "Singup"; 
      }
	  
	  
	  
	 
	  
	  @GetMapping("/productadmin") 
	  public ModelAndView startpage() 
	  { 
		  List<Product>lst=productservice.getAllProducts();
		  ModelAndView mv=new ModelAndView("view"); 
		  mv.addObject("prodlist",lst); 
		  return mv;
      }
	  
	 
	 
	
	@GetMapping("/add")
	public String AddNewProduct()
	{
		return "add";
		
	}
	
	@GetMapping("/save")
	public String saveProduct(@RequestParam("pname") String pname, @RequestParam("price") int price,@RequestParam("pcolor") String pcolor) throws Exception
	{
		
		Product ob=new Product(pname,price,pcolor);
		productservice.insertProduct(ob);
		return  "redirect:/productadmin";
	}
	
	@GetMapping("/update")
	public String updateProduct(@RequestParam("pname") String pname, @RequestParam("price") int price,@RequestParam("pcolor") String pcolor) throws Exception
	{
		
		Product ob=new Product(pname,price,pcolor);
		productservice.updateProduct(ob);
		return  "redirect:/productadmin";
	}
	
	@GetMapping("/edit")
	public ModelAndView editProduct(@RequestParam("id") int id)
	{
		Product obj=productservice.getProductById(id);
		ModelAndView mv=new ModelAndView("edit");
		mv.addObject("product",obj);
		return mv;
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id)
	{
		Product ob=productservice.getProductById(id);
		if(ob!=null)
			productservice.deleteProduct(ob);
		return "redirect:/productadmin";
	}
	

}
