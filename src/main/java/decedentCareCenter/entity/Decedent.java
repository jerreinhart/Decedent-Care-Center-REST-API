package decedentCareCenter.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import decedentCareCenterComponents.Chapel;
import decedentCareCenterComponents.Embalmer;
import decedentCareCenterComponents.FuneralDirector;
import decedentCareCenterComponents.Merchandise;
import decedentCareCenterComponents.PrepType;
import decedentCareCenterComponents.ServiceInfo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Decedent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long decedentId;
	private String decedentFirstName;
	private String decedentLastName;
	private Date dateOfDeath;
	private Preparation prepRequired;
	private Service serviceInfo;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "decedent_preparation", joinColumns = @JoinColumn(name = "decedent_id"), inverseJoinColumns = @JoinColumn(name = "prep_type"))
	
	private Set<Decedent> decedents = new HashSet<>();
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy = "decedent", cascade = CascadeType.ALL, orphanRemoval = true)
	
	private Set<Service> services = new HashSet<>();

	public static PrepType getPrepType() {
		
	}
	
	public static Date getDateOfDeath() {
		
	}

	public static Embalmer getEmbalmer() {
		
	}

	public static Merchandise getMerchandise() {
		
	}
	
	public static ServiceInfo getServiceInfo() {
		
	}
	
	public static Date getDateOfService() {
		
	}
	
	public static Chapel getChapel() {
		
	}
	
	public static FuneralDirector getFuneralDirector() {
		
	}
	
}
