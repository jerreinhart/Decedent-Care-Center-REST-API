package decedentCareCenterComponents;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Embeddable;

@Embeddable
public class FuneralDirector extends ServiceInfo {
	private String directorFirstName;
	private String directorLastName;
	
	private Set<FuneralDirector> funeralDirectors = new HashSet<>();
}
