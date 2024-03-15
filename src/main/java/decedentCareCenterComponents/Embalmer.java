package decedentCareCenterComponents;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Embeddable;

@Embeddable
public class Embalmer extends PrepType {
	private String embalmerFirstName;
	private String embalmerLastName;
	private Long licenseNumber;
	
	private Set<Embalmer> embalmers = new HashSet<>();
}
