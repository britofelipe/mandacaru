package br.ufc.mandacaru.springProject.model;

public class Product {
	private int id;
	private String name;
	private String address;
	private double terrain;
	private double construction;
	private int rooms;
	private int bathrooms;
	private int garage;
	private double price;
	private boolean status;
	private String purpose;
	private String time;
	private int owner;
	
	public Product(int id, String name, int owner, String address, double terrain, double construction, int rooms,
			int bathrooms, int garage, double price, boolean status, String purpose, String time) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.address = address;
		this.terrain = terrain;
		this.construction = construction;
		this.rooms = rooms;
		this.bathrooms = bathrooms;
		this.garage = garage;
		this.price = price;
		this.status = status;
		this.purpose = purpose;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTerrain() {
		return terrain;
	}
	public void setTerrain(double terrain) {
		this.terrain = terrain;
	}
	public double getConstruction() {
		return construction;
	}
	public void setConstruction(double construction) {
		this.construction = construction;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public int getGarage() {
		return garage;
	}
	public void setGarage(int garage) {
		this.garage = garage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getPurpose() {
		return purpose;
	}
	public void serPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", owner=" + owner + ", address=" + address + ", terrain="
				+ terrain + ", construction=" + construction + ", rooms=" + rooms + ", bathrooms=" + bathrooms
				+ ", garage=" + garage + ", price=" + price + ", status=" + status + ", purpose=" + purpose
				+ ", time=" + time + "]";
	}

	
}
