package decedentCareCenterComponents;

import java.util.Date;
import jakarta.persistence.Embeddable;

@Embeddable
public class FlameCremation extends PrepType {
	private Casket casket;
	private Urn urn;
	private CrematoryOperator crematoryOperator;
	private Date dateOfCremation;
	private boolean cremationAuthorization;
	private Long cremationIdNumber;
}
