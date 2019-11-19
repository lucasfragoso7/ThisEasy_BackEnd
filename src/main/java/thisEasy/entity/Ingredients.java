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

import lombok.Data;
import thisEasy.interfaces.EntityContract;

@Entity
@Data
@Table(name = "ingredients")
public class Ingredients implements EntityContract {

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
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Recipe> getRecipe() {
		return recipe;
	}

	public void setRecipe(List<Recipe> recipe) {
		this.recipe = recipe;
	}

	public List<Ambry> getAmbry() {
		return ambry;
	}

	public void setAmbry(List<Ambry> ambry) {
		this.ambry = ambry;
	}
	


}
