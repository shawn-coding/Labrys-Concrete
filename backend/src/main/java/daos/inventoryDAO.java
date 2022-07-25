package daos;

import models.Inventory;

public interface inventoryDAO {
	
	public Inventory getAll();
	public Inventory getById(int productid);
	public Inventory getByWarehouse(int wareid);
	public Inventory getByPO(int orderid);
	public void createInventory(Inventory newproduct);
	public void updateInventory(int productid);
	public void deleteInventory(int productid);

}
