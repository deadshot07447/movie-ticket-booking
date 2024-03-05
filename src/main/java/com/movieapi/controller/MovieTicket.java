package com.movieapi.controller;

import com.movieapi.dto.MovieTicketAcknowledgement;
import com.movieapi.dto.MovieTicketRequest;
import com.movieapi.service.MovieTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieTicket {

    @Autowired
    MovieTicketService movieTicketService;

    @PostMapping("/book-ticket")
    public MovieTicketAcknowledgement bookTicket(@RequestBody MovieTicketRequest movieTicketRequest){

        return movieTicketService.bookMovieTicket(movieTicketRequest);

    }
}
