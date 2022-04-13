package Capg.OnlineSeatBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Capg.OnlineSeatBooking.entity.Register;
import Capg.OnlineSeatBooking.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	private RegisterRepository repo;
	
	public void registerData( Register register)
	{
		repo.save(register);
	}

}
