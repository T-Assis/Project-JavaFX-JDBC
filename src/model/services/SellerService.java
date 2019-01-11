package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll() {		
		return dao.findAll();
		
		/*List<Seller> list = new ArrayList<>();
		
		list.add(new Seller(1, "thales1", "thales@1", null, 3000.00, new Department(1, "Photos")));
		list.add(new Seller(1, "thales2", "thales@2", null, 3000.00, new Department(1, "Photos")));
		list.add(new Seller(1, "thales3", "thales@3", null, 3000.00, new Department(1, "Photos")));
		return list;*/
	}
	
}
