package com.app.dto;

import java.time.LocalDateTime;

import com.app.entities.Doctor;
import com.app.entities.Patient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppointmentDTO {
	@JsonProperty(access = Access.READ_ONLY)
	private Long appointment_id; 
	private LocalDateTime appointmentTime;
	private Long patient_id;
	private Long doctor_id;

}
