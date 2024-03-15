package decedentCareCenterComponents;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Embeddable;

@Embeddable
public class CrematoryOperator extends PrepType {
	private String operatorFirstName;
	private String operatorLastName;
	
	private Set<CrematoryOperator> crematoryOperators = new HashSet<>();
}
