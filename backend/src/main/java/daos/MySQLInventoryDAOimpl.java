package daos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conf.inventoryDBCreds;
import models.Inventory;

public class MySQLInventoryDAOimpl {
	
	public Inventory getAll() throws SQLException {
		String sql = "SELECT * FROM inventory";
		try(Connection conn =inventoryDBCreds.getInstance().getConnection()){
			Statement stmt = conn.prepareStatement(sql);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public Inventory getById() {
		return null;
	}
	
	public Inventory getByWarehouse() {
		return null;
	}
	
	public Inventory getByPO() {
		return null;
	}
	
	public void createInventory() {
		
	}
	
	public void updateInventory() {
		
	}
	
	public void deleteInventory() {
		
	}
}
