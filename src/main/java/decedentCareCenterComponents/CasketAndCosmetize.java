package decedentCareCenterComponents;

import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class CasketAndCosmetize extends PrepType {
	private Date dateDue;
	private Casket casket;
	private Embalmer preparedBy;
}
