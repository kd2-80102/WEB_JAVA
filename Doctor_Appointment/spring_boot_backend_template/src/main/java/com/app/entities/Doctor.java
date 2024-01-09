package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Doctor extends BaseEntity {
	@Column(length = 50)
	private String DoctorName;
}
