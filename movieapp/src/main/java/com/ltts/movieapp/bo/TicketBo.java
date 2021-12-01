package com.ltts.movieapp.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ltts.movieapp.model.Ticket;

@Repository
@EnableJpaRepositories
public interface TicketBo extends JpaRepository<Ticket,String>{

}
