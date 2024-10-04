package com.senthil.trackerservice.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "tbl_tracker")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tracker {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	@Column(nullable = false)
	private String device_id;
	@Column(nullable = false)
	private String lattitude;
	@Column(nullable = false)
	private String longitude;
	private Date createdon = new Date();
	
}
