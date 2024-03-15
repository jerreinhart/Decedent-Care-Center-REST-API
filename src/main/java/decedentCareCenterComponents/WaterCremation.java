package decedentCareCenterComponents;

import java.util.Date;
import jakarta.persistence.Embeddable;

@Embeddable
public class WaterCremation extends PrepType {
	private Urn urn;
	private Casket shroud;
	private CrematoryOperator crematoryOperator;
	private Date dateOfCremation;
	private boolean cremationAuthorization;
	private Long cremationIdNumber;
}
