package SpringBootTutorialGroup.SpringBootTutorial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Tarea {
    
	// ATTRIBUTES
	private Integer id;
    private String titulo;
    private String descripcion;
    private String creado_por;
    private String responsable;
    
    // CONSTRUCTORS
    public Tarea() {
    }
    
    public Tarea(Integer id, String titulo, String descripcion, String creado_por, String responsable) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creado_por = creado_por;
        this.responsable = responsable;
    }
    
    //GETTERS AND SETTERS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreado_por() {
		return creado_por;
	}

	public void setCreado_por(String creado_por) {
		this.creado_por = creado_por;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
}
/*
public class Product {
	
    private Integer id;
    private String name;
    private float price;
 
    public Product() {
    }
 
    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
    	this.id = id;
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
    	this.name = name;
    }
    
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
    	this.price = price;
    }
    
}
*/

