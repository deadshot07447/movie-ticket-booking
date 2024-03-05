package com.movieapi.service;

import com.movieapi.dto.MovieTicketAcknowledgement;
import com.movieapi.dto.MovieTicketRequest;
import com.movieapi.entity.PaymentInfo;
import com.movieapi.entity.TicketInfo;
import com.movieapi.repository.PaymentInfoRepo;
import com.movieapi.repository.TicketInfoRepo;
import com.movieapi.utility.ValidatePaymentInfo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MovieTicketService {

    @Autowired
    TicketInfoRepo ticketInfoRepo;

    @Autowired
    PaymentInfoRepo paymentInfoRepo;

    @Transactional
    public MovieTicketAcknowledgement bookMovieTicket(MovieTicketRequest movieTicketRequest){

        TicketInfo ticketInfo = movieTicketRequest.getTicketInfo();
        ticketInfo = ticketInfoRepo.save(ticketInfo);

        PaymentInfo paymentInfo = movieTicketRequest.getPaymentInfo();

        ValidatePaymentInfo.validateCreditLimit(paymentInfo.getAccountNo(), ticketInfo.getTicketPrice());

        paymentInfo.setTicketId(ticketInfo.getId());

        paymentInfo.setAmount(ticketInfo.getTicketPrice());

        paymentInfoRepo.save(paymentInfo);

        return new MovieTicketAcknowledgement("Success!", ticketInfo.getTicketPrice(), UUID.randomUUID().toString(),ticketInfo);


    }
}
