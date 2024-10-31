package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springdemo.dao.CustomerDAO;
import com.example.springdemo.entity.Customer;
import com.example.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject the customer dao
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	// @GetMapping("/list") chạy bình thường
	// @PostMapping("/list") lỗi 404 vì /customer/list yêu cầu gọi get dùng post nên 0 đc.
	public String listCustomers(Model theModel) {

		// get customers from the dao
		List<Customer> theCustomers = customerService.getCustomers();

		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);

		return "list-customers";
	}

}
