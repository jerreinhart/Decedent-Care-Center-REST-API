package decedentCareCenterComponents;

import jakarta.persistence.Embeddable;

@Embeddable
public class Casket extends Merchandise {
	private String casketName;
	private String casketSupplier;
}
