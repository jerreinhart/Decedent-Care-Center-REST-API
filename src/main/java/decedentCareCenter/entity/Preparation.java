package decedentCareCenter.entity;

import java.util.Date;

import decedentCareCenterComponents.Embalmer;
import decedentCareCenterComponents.Merchandise;
import decedentCareCenterComponents.PrepType;
import lombok.Data;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
@Entity
@Data
public class Preparation {
	private PrepType prepType;
	private Date dateOfPrep;
	private Embalmer embalmer;
	private Merchandise merchandise;
}
