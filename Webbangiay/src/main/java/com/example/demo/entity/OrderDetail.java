package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Orderdetail")
@Getter
@Setter
public class OrderDetail {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private float price;//cái giá phải trả 
private Integer quantity;//số lượng bán đc 
@ManyToOne
@JoinColumn(name="product_id")
private Product product;
@ManyToOne
@JoinColumn(name="order_id")
private Order order;


}
