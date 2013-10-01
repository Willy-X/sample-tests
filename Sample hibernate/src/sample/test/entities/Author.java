package sample.test.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author guillaume jouvelot
 * 
 */
@Entity
@Table(name = "author")
public class Author implements Serializable {

	private static final long serialVersionUID = 8921289176357966429L;

	@Id
	private int id;
	@Column(name = "name", length = 60, nullable = false)
	private String Name;

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.Name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.Name = name;
	}

	public Author() {
	}

}
