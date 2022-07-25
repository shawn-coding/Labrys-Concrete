package daos;

import java.sql.Statement;

import models.Inventory;

public class MySQLInventoryDAOimpl {
	
	public Inventory getAll() {
		Statement stmt = "SELECT * FROM inventory";
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
