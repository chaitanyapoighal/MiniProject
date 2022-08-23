package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Plan")
public class Plan {
	@Id
	@Column(name = "planId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer planid;

	@Column(name = "Name")
	private String planname;

	@Column(name = "plancreated_date")
	private LocalDate created_date;

	@Column(name = "planupdated_date")
	private LocalDate updated_date;

	@Column(name = "plancreated_by")
	private String createdby;

	@Column(name = "planupted_by")
	private String updatedby;

	@Column(name = "status_swtch")
	private Character statuswith;

	public Integer getPlanid() {
		return planid;
	}

	public String getPlanname() {
		return planname;
	}

	public LocalDate getCreateddate() {
		return created_date;
	}

	public LocalDate getUpdateddate() {
		return updated_date;
	}

	public String getCreatedby() {
		return createdby;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public Character getStatuswith() {
		return statuswith;
	}

	public void setPlanid(Integer planid) {
		this.planid = planid;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public void setCreateddate(LocalDate createddate) {
		this.created_date = createddate;
	}

	public void setUpdateddate(LocalDate updateddate) {
		this.updated_date = updateddate;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public void setStatuswith(Character statuswith) {
		this.statuswith = statuswith;
	}

	public Plan() {
	}

	public Plan(Integer planid, String planname, LocalDate createddate, LocalDate updateddate, String createdby,
			String updatedby, Character statuswith) {
		super();
		this.planid = planid;
		this.planname = planname;
		this.created_date = createddate;
		this.updated_date = updateddate;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.statuswith = statuswith;
	}
}
