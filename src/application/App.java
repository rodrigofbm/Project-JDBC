package application;

import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDAO sellerDAO = DaoFactory.createSellerDAO();
        
        try {
        	System.out.println("==== TEST 1: seller findById ====");
        	Seller seller = sellerDAO.findById(8);
            
            System.out.println(seller);
            
            System.out.println("\n==== TEST 2: seller findByDepartment ====");
        	List<Seller> seller2 = sellerDAO.findByDepartment(2);
            
        	seller2.forEach(System.out::println);
            
            
		} catch (DbException e) {
			e.printStackTrace();
		}finally {
			DB.closeConnection();
		}
    }
}
