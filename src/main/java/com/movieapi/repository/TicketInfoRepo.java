package com.movieapi.repository;

import com.movieapi.entity.TicketInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketInfoRepo extends JpaRepository<TicketInfo, String> {

}
