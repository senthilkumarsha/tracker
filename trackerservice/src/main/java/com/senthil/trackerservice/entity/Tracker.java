package com.senthil.trackerservice.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "tbl_tracker")
public class Tracker {
	
	@Override
	public String toString() {
		return "Tracker [id=" + id + ", device_id=" + device_id + ", lattitude=" + lattitude + ", longitude="
				+ longitude + ", createdon=" + createdon + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	@Column(nullable = false)
	private String device_id;
	@Column(nullable = false)
	private String lattitude;
	@Column(nullable = false)
	private String longitude;
	private Date createdon = new Date();
	
}
