package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
public class Appointments extends BaseEntity {
	@ManyToOne
	@JoinColumn(name="patient_id",nullable = false)
	private Patient patient;
	@ManyToOne
	@JoinColumn(name="doctor_id",nullable = false)
	private Doctor doctor;
	private LocalDateTime appointmentTime;
}
