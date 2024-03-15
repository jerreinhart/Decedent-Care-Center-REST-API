package decedentCareCenterComponents;

import jakarta.persistence.Embeddable;

@Embeddable
public class Urn extends Merchandise {
	private String urnName;
	private String urnSupplier;
}
