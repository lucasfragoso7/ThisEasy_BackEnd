package thisEasy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import thisEasy.interfaces.Contract;

@Entity
@Table(name = "recipe")
public class Recipe implements Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	private String name;

	@NotNull
	@ElementCollection
	private List<String> instructions = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "RECIPE_INGREDIENTE", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "ingredients_id"))
	private List<Ingredients> ingredients = new ArrayList<>();

	public Long getId() {
		return this.id;
	}

}
