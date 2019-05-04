package thisEasy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import thisEasy.interfaces.Contract;

@Entity
@Table(name = "ingredients")
public class Ingredients implements Contract {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	private String name;

	@ManyToMany(mappedBy = "ingredients")
	private List<Recipe> recipe = new ArrayList<>();

	@ManyToMany(mappedBy = "ingredients")
	private List<Ambry> ambry = new ArrayList<>();

	public Long getId() {
		return this.id;
	}
}
