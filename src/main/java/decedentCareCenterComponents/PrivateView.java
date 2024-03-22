package decedentCareCenterComponents;

import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class PrivateView extends PrepType {
	private Date dateOfPrivateView;
	private Chapel chapel;
	private Embalmer preparedBy;
}
