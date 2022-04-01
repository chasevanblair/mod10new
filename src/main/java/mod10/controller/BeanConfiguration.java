/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 30, 2022
 */
package mod10.controller;

import org.springframework.context.annotation.Bean;

import mod10.beans.Car;

public class BeanConfiguration {
	@Bean
	public Car Car() {
		Car bean = new Car("Honda", "Accord", 9999.99);

		return bean;
	}
}
