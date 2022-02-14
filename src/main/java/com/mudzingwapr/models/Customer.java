package com.mudzingwapr.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cid;
	
	@Column(name="customername")
	private String customername;
	
	@Column(name="address")
	private String address;
	
	@OneToMany(targetEntity=Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName="cid")
	private List<Product> product;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public Customer(Integer cid, String customername, String address, List<Product> product) {
		super();
		this.cid = cid;
		this.customername = customername;
		this.address = address;
		this.product = product;
	}
	public Customer() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, cid, customername, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(cid, other.cid)
				&& Objects.equals(customername, other.customername) && Objects.equals(product, other.product);
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", customername=" + customername + ", address=" + address + ", product="
				+ product + "]";
	}
	
	

}
