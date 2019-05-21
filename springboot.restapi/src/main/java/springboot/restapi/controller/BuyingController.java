package springboot.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.restapi.dao.BuyingDAO;
import springboot.restapi.model.Buying;

@RestController
@RequestMapping("/company")

public class BuyingController {
	@Autowired
	BuyingDAO buyingDAO;
	
	/*Save an order */
	@PostMapping("/buying")
	public Buying createAnOrder(@Valid @RequestBody Buying buy) {
		return buyingDAO.insert(buy);
	}
	
	/*Get All */
	@GetMapping("/buying")
	public List<Buying>getAllOrderDetails(){
		return buyingDAO.find();
	}
	
}
