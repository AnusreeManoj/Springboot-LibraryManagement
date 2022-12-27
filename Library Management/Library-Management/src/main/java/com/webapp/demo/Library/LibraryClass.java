package com.webapp.demo.Library;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LibraryClass {
	
	@Id
	private String bId;
	private String quantity;
	private String bName;
	private String genre;
	public String getBookId() {
		return bId;
	}
	public void setBookId(String bId) {
		this.bId = bId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getBookName() {
		return bName;
	}
	public void setBookName(String bName) {
		this.bName = bName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}