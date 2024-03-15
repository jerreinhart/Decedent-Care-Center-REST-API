package decedentCareCenterComponents;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Chapel {
	private String chapelName;
	private String chapelAddress;
	private String chapelCity;
	private String chapelState;
	private String chapelZip;
	private String chapelPhone;
	private String chapelEmail;
	
	private Set<Chapel> chapels = new HashSet<>();


public void listChapelInfo() {
	System.out.println(chapelName);
	System.out.println(chapelAddress + " " + chapelCity + ", " + chapelState + " " + chapelZip);
	System.out.println(chapelPhone + "      " + chapelEmail);
}
}
