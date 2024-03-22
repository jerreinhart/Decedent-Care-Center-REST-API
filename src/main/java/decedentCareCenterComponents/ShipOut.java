package decedentCareCenterComponents;

import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class ShipOut extends PrepType {
	private Date dateDue;
	private Casket container;
	private Embalmer preparedBy;
}
