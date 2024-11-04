package com.javaweb.repository.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {
	@Column
	private String name;
	@Column
	private String code;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private List<BookEntity> books = new ArrayList<>();	
	
	public List<BookEntity> getBooks() {
		return books;
	}
	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
