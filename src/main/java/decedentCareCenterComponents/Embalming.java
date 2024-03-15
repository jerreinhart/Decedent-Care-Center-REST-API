package decedentCareCenterComponents;

import java.util.Date;
import jakarta.persistence.Embeddable;

@Embeddable
public class Embalming extends PrepType {
	private boolean embalmingPermission;
	private Embalmer embalmer;
	private Date dateOfEmbalming;
}
