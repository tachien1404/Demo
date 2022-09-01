package com.example.demo.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private float price;
private Integer quantity;
private Date createDate;
private String photo;
private String status;
@OneToMany(mappedBy = "product")
private Set<size>danhSachSize;//38-43
@OneToMany(mappedBy = "product")
private Set<Color>danhSachMau;
@ManyToOne
@JoinColumn(name="category_id")
private Category category;//danhmuc
@ManyToOne
@JoinColumn(name="hang_id")
private hang hang;
}
