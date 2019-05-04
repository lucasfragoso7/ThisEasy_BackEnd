package thisEasy.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import thisEasy.interfaces.Contract;

@Entity
@Table(name = "people")
public class People implements Contract {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	private String name;

	@NotNull
	private String email;

	@NotNull
	private String telephone;

	@NotNull
	private Date dateOfBirth;

	public Long getId() {
		return this.id;
	}
}
