package com.mudzingwapr.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer pid;
	
	@Column(name="product")
	private String productname;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="category")
	private String category;
	
	
	public Product(Integer pid, String productname, Double price, String category) {
		super();
		this.pid = pid;
		this.productname = productname;
		this.price = price;
		this.category = category;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, pid, price, productname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(pid, other.pid)
				&& Objects.equals(price, other.price) && Objects.equals(productname, other.productname);
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productname=" + productname + ", price=" + price + ", category=" + category
				+ "]";
	}
	

}
