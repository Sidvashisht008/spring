package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.CustomerRepo;
import com.example.demo.model.Customer;



@Controller
public class Custcontroller {
	
	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer cust) {
		repo.save(cust);
		return "index.jsp";
	}
	
	@RequestMapping("/getCustomer")
	public ModelAndView getCustomer(@RequestParam int cid) {
		ModelAndView mv = new ModelAndView("show.jsp");
		Customer cust = repo.findById(cid).orElse(new Customer());
		mv.addObject(cust);
		return mv;
	}
	
//	@PostMapping("/customers")
//	public Customer addCustomer(@RequestBody Customer cust) {
//		repo.save(cust);
//		return cust;
//	}
	
	
	
	
//Delete
	@DeleteMapping("/customers/{cid}")
	public String deleteCustomer(@PathVariable int cid) {
		Customer c = repo.getOne(cid);
		repo.delete(c);
		return "Deleted";	
	}
	
	@RequestMapping("/customers")
	@ResponseBody
	public List<Customer> getCustomer() {
		return repo.findAll();
	}
	
//	@RequestMapping("/customers/{cid}")
//	@ResponseBody
//	public Optional<Customer> getCustomer(@PathVariable("cid") int cid) {
//		return repo.findById(cid);
//	}
}
