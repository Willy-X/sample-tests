package sample.test.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author guillaume jouvelot
 * 
 */
@Entity
@Table(name = "book")
public class Book implements Serializable {

	private static final long serialVersionUID = -4034196361190399516L;

	@Id
	@Column(name = "iban", length = 13)
	private String iban;
	@Column(name = "title", length = 60, nullable = false)
	private String title;
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "author__id")
	private Author author;

	/**
	 * @return the iban
	 */
	public String getIban() {
		return this.iban;
	}

	/**
	 * @param iban
	 *            the iban to set
	 */
	public void setIban(final String iban) {
		this.iban = iban;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return this.author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(final Author author) {
		this.author = author;
	}

	/**
	 * default constructor
	 */
	public Book() {
	}

}
