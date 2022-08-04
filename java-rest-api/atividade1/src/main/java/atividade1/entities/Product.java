package atividade1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "products")
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private double terrain;
	private double construction;
	private int rooms;
	private int bathrooms;
	private int garage;
	private double price;
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
	public Product(int id, String name, String address, double terrain, double construction, int rooms, int bathrooms,
			int garage, double price) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.terrain = terrain;
		this.construction = construction;
		this.rooms = rooms;
		this.bathrooms = bathrooms;
		this.garage = garage;
		this.price = price;
	}
	
	public Product() {
		super();
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", address=" + address + ", terrain=" + terrain
				+ ", construction=" + construction + ", rooms=" + rooms + ", bathrooms=" + bathrooms + ", garage="
				+ garage + ", price=" + price + "]";
	}
	
}
