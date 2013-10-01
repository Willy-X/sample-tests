/**
 * 
 */
package sample.test.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author guillaume jouvelot
 * 
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = -8581494247357161079L;

	@Id
	private int id;
	@Column(name = "name", length = 80, nullable = false)
	private String name;
	@Column(name = "phone_number", length = 10, nullable = true)
	private String phoneNumber;
	@Column(name = "address", length = 200, nullable = true)
	private String address;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "loan", joinColumns = @JoinColumn(name = "customer__id"), inverseJoinColumns = @JoinColumn(name = "book__iban"))
	private List<Book> books;

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
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return this.books;
	}

	/**
	 * @param books
	 *            the books to set
	 */
	public void setBooks(final List<Book> books) {
		this.books = books;
	}

	public Customer() {
	}

}
