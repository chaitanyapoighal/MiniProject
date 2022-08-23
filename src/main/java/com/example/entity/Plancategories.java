package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Plancategories")
public class Plancategories {
	@Id
	@Column(name = "pcid")
	private Integer pcid;

	@Column(name = "pcname")
	private String pcname;

	public void setPcid(Integer pcid) {
		this.pcid = pcid;
	}

	public void setPcname(String pcname) {
		this.pcname = pcname;
	}

	public Integer getPcid() {
		return pcid;
	}

	public String getPcname() {
		return pcname;
	}

}
