package com.app.Service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AppointmentDao;
import com.app.dto.AppointmentDTO;
import com.app.entities.Appointments;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentDao appDao;
	
	@Autowired
	private ModelMapper mapper;
	public AppointmentServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Create Appointment: Endpoint: POST /appointments 
	 * Request: Schedule a new appointment by providing details like patient name, doctor, date, and time.
	 * Response: Return the confirmation of the scheduled appointment.
	 */
	public AppointmentDTO addAppointment(AppointmentDTO app)
	{	
		app.findById(app.getDoctor_id())
	}
	
	
	
}
