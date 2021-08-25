package com.olive.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="product_tab")
public class Product {
@Id
@Column(name="pid")
private Integer prodId;
@Column(name="pname")
private String prodName;
@Column(name="pvendor")
private String prodVendor;
@OneToMany
@JoinColumn(name="pid_fk")
private Set<Model> mobs;
}
