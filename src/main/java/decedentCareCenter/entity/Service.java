package decedentCareCenter.entity;

import java.util.Date;

import care.center.controller.model.CareCenterData.DecedentServices;
import decedentCareCenterComponents.Chapel;
import decedentCareCenterComponents.FuneralDirector;
import decedentCareCenterComponents.ServiceInfo;
import lombok.Data;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
@Entity
@Data

public class Service {
	private ServiceInfo serviceInfo;
	private Date dateOfService;
	private Chapel chapel;
	private FuneralDirector funeralDirector;
	
	
	public void add(DecedentServices decedentServices) {
		
	}
}
