package com.ticketbooking.api.flimhub.repository;

import com.ticketbooking.api.flimhub.model.Seatmanagement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatmanagementRepository extends CrudRepository<Seatmanagement, String> {
}
