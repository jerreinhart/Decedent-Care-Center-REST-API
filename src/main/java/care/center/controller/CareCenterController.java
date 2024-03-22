package care.center.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import care.center.controller.model.CareCenterData;
import care.center.controller.model.CareCenterData.DecedentData.DecedentPreparation;
import care.center.controller.model.CareCenterData.DecedentServices;
import decedent.care.center.DecedentCareCenterProgram;
import lombok.extern.slf4j.Slf4j;
import pet.store.controller.model.PetStoreData;
import pet.store.controller.model.PetStoreData.PetStoreCustomer;
import pet.store.controller.model.PetStoreData.PetStoreEmployee;
import pet.store.service.StoreService;

@RestController
@RequestMapping("/decedent")
@Slf4j

public class CareCenterController {
	@Autowired
	private DecedentCareCenterProgram decedentCareCenterProgram;

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public CareCenterData insertDecedent(@RequestBody CareCenterData careCenterData) {
		log.info("Creating a new Decedent {}", careCenterData);
		return decedentCareCenterProgram.saveDecedent(careCenterData);
	}

	@PutMapping("/{decedentId}")
	public CareCenterData updateDecedent(@PathVariable Long decedentId, @RequestBody CareCenterData careCenterData) {
		careCenterData.setDecedentId(decedentId);
		log.info("Updating Decedent information {}", careCenterData);
		return decedentCareCenterProgram.saveDecedent(careCenterData);
	}

	@PostMapping("/{decedentId}/preparation")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DecedentPreparation insertPreparation(@PathVariable Long decedentId,
			@RequestBody DecedentPreparation decedentPreparation) {
		log.info("Adding preparation information  {} for decedent with ID = {}", decedentPreparation, decedentId);
		return decedentCareCenterProgram.savePreparation(decedentId, decedentPreparation);
	}

	@PostMapping("/{decedentId}/service")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DecedentServices insertService(@PathVariable Long decedentId,
			@RequestBody DecedentServices decedentService) {
		log.info("Adding service information {} for decedent with ID = {}", decedentService, decedentId);
		return decedentCareCenterProgram.saveService(decedentService);
	} 


	@GetMapping()
	public List<CareCenterData> retrieveAllDecedents() {
		log.info("Retrieve all pet stores.");
		return decedentCareCenterProgram.retrieveAllDecedents();
	}

	@GetMapping("/{decedentId}")
	public CareCenterData retrieveDecedentById(@PathVariable Long decedentId) {
		log.info("Retrieving decedent by ID = {}", decedentId);
		return decedentCareCenterProgram.retrieveDecedentById(decedentId);
	}

	@DeleteMapping("/{decedentId}")
	public Map<String, String> deleteDecedentById(@PathVariable Long decedentId) {
		log.info("Removing decedent with ID = {}", decedentId);
		decedentCareCenterProgram.deleteDecedentById(decedentId);

		return Map.of("message", "Decedent with ID = " + decedentId + " has been removed");
	}



	

}
