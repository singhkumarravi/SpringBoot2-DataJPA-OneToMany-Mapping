package com.olive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="Model_Tab")
public class Model {
	@Id
	@Column(name="mid")
    private Integer modId;
	@Column(name="mcode")
	private String modCode;
	@Column(name="mcolor")
	private String modColor;
	@Column(name="mcost")
	private double modcost;

}
