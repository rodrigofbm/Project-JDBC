package application;

import db.DB;
import db.DbException;
import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDAO sellerDAO = DaoFactory.createSellerDAO();
        
        try {
        	Seller seller = sellerDAO.findById(8);
            
            System.out.println(seller);
            
            DB.closeConnection();
		} catch (DbException e) {
			e.printStackTrace();
		}
    }
}
