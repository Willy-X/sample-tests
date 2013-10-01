/**
 * 
 */
package sample.test.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author guillaume jouvelot
 * 
 */
public class Loan implements Serializable {

	private static final long serialVersionUID = 8290382694253628025L;

	private int id;
	private Date loanDate;
	private Date returnDate;
	private Customer customer;
	private Book book;
	private boolean statut;

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
	 * @return the loanDate
	 */
	public Date getLoanDate() {
		return this.loanDate;
	}

	/**
	 * @param loanDate
	 *            the loanDate to set
	 */
	public void setLoanDate(final Date loanDate) {
		this.loanDate = loanDate;
	}

	/**
	 * @return the returnDate
	 */
	public Date getReturnDate() {
		return this.returnDate;
	}

	/**
	 * @param returnDate
	 *            the returnDate to set
	 */
	public void setReturnDate(final Date returnDate) {
		this.returnDate = returnDate;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return this.book;
	}

	/**
	 * @param book
	 *            the book to set
	 */
	public void setBook(final Book book) {
		this.book = book;
	}

	/**
	 * @return the statut
	 */
	public boolean isStatut() {
		return this.statut;
	}

	/**
	 * @param statut
	 *            the statut to set
	 */
	public void setStatut(final boolean statut) {
		this.statut = statut;
	}

	public Loan() {
	}

}
