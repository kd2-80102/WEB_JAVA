package com.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.AppointmentService;
import com.app.dto.AppointmentDTO;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;

	public AppointmentController() {
		System.out.println("In app controller");
	}

	/*
	 * Create Appointment: Endpoint: POST /appointments 
	 * Request: Schedule a new appointment by providing details like patient name, doctor, date, and time.
	 * Response: Return the confirmation of the scheduled appointment.
	 */
	@PostMapping
	public AppointmentDTO createAppointment(@RequestBody AppointmentDTO dto) 
	{
		return appointmentService.addAppointment(dto);
	}

}
