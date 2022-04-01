/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 29, 2022
 */
package mod10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mod10.beans.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
