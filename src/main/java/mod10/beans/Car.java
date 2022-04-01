/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 29, 2022
 */
package mod10.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//data not doing its job
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String model;
	private String make;
	private double price;
	
	public Car() {
		super();
	}
	
	public Car(String model, String make, double price) {
		this.model = model;
		this.make = make;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}  
	
}
