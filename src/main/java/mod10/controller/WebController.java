/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 29, 2022
 */
package mod10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mod10.beans.Car;
import mod10.repository.CarRepository;

@Controller
public class WebController {
	@Autowired 
	CarRepository repo;

	@GetMapping("/addcar")
	public String addCar(Model model) {
		Car c = new Car();
		model.addAttribute("newCar", c);
		return"addcarpage";
	}

	@PostMapping("/addcar")
	public String addNewCar(@ModelAttribute Car c, Model model) {
		repo.save(c);
		return viewAllCars(model);

	}
	@GetMapping("/viewall")
		public String viewAllCars(Model model) {
			if(repo.findAll().isEmpty()) {
				return addCar(model);
			}
		model.addAttribute("car", repo.findAll());
		return "results";
	}

	@PostMapping("/update/{id}")
	public String reviseCar(Car c, Model model) {
		repo.save(c);
		return viewAllCars(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") Integer id, Model model) {
		Car c = repo.findById(id).orElse(null);
		model.addAttribute("newCar", c);
		return "addcarpage";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteCar(@PathVariable("id") Integer id, Model model) {
		Car c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllCars(model);
	}

}
