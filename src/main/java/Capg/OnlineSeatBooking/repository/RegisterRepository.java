package Capg.OnlineSeatBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Capg.OnlineSeatBooking.entity.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, String> {

}
