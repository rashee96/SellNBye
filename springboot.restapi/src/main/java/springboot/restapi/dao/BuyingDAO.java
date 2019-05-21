package springboot.restapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.restapi.model.Buying;
import springboot.restapi.repository.BuyingRepository;

@Service

public class BuyingDAO {
	
	@Autowired
	BuyingRepository buyingRepository;
	
	/*to save an order */
	
	public Buying insert(Buying buy) {
		return buyingRepository.save(buy);
	}
	
	/*find an order */
	
	public List<Buying> find(){
		return buyingRepository.findAll();
	}
	
	/*get an order details */
	
	public Buying findone(long id) {
		return buyingRepository.findOne(id);
	}
	
	/*delete an order */
	
	public void delete(Buying buy) {
		 buyingRepository.delete(buy);
	}

}
