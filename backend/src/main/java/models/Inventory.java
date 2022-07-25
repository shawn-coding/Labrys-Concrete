package models;

public class Inventory {
	private int id;
	private String type;
	private int wareid;
	private int orderid;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWareid() {
		return wareid;
	}
	public void setWareid(int wareid) {
		this.wareid = wareid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
}
