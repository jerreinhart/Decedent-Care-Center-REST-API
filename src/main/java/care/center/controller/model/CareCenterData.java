package care.center.controller.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import decedentCareCenter.entity.Decedent;
import decedentCareCenter.entity.Preparation;
import decedentCareCenter.entity.Service;
import decedentCareCenterComponents.Chapel;
import decedentCareCenterComponents.Embalmer;
import decedentCareCenterComponents.FuneralDirector;
import decedentCareCenterComponents.Merchandise;
import decedentCareCenterComponents.PrepType;
import decedentCareCenterComponents.ServiceInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CareCenterData {
	@Data
	@NoArgsConstructor

	public class DecedentData {
		private Long decedentId;
		private String decedentFirstName;
		private String decedentLastName;
		private Date dateOfDeath;
		private Set<DecedentPreparation> prepRequired = new HashSet<>();
		private Set<DecedentServices> serviceInfo = new HashSet<>();

		public DecedentData(Decedent decedent) {
			decedentId = decedent.getDecedentId();
			decedentFirstName = decedent.getDecedentFirstName();
			decedentLastName = decedent.getDecedentLastName();
			dateOfDeath = decedent.getDateOfDeath();
			prepRequired = decedent.getPrepRequired();
			serviceInfo = decedent.getServiceInfo();

			for (Preparation preparations : Decedent.getPreparations()) {
				preparations.add(new DecedentPreparation());
			}
			for (Service services : Decedent.getServices()) {
				services.add(new DecedentServices(services));
			}
		}

		@Data
		@NoArgsConstructor
		public static class DecedentPreparation {
			private PrepType prepType;
			private Date dateOfPrep;
			private Embalmer embalmer;
			private Merchandise merchandise;
		}

		public void DecedentPreparation(Preparation preparations) {
			prepType = Decedent.getPrepType();
			dateOfPrep = Decedent.getDateOfDeath();
			embalmer = Decedent.getEmbalmer();
			merchandise = Decedent.getMerchandise();

		}
	}

	@Data
	@NoArgsConstructor

	public static class DecedentServices {
		private ServiceInfo serviceInfo;
		private Date dateOfService;
		private Chapel chapel;
		private FuneralDirector funeralDirector;

		public DecedentServices(Service services) {
			serviceInfo = Decedent.getServiceInfo();
			dateOfService = Decedent.getDateOfService();
			chapel = Decedent.getChapel();
			funeralDirector = Decedent.getFuneralDirector();
		}
	}

	public void setDecedentId(Long decedentId) {
		
	}
}
