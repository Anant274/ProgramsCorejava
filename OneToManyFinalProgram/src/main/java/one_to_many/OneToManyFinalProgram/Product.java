package one_to_many.OneToManyFinalProgram;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "PRICE")
	private float price;

	@OneToMany
	@JoinColumn(name = "Product_CATEGORY_ID")
	private List<Category>category;

	public Product() {
	}


	public long getId() {
		return id;
	}

	public Product(String name, String description, float price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	public List<Category> getCategory() {
		return category;
	}


	public void setCategory(List<Category> category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", category=" + category + "]";
	}



}
