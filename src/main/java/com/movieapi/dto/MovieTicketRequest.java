package com.movieapi.dto;

import com.movieapi.entity.PaymentInfo;
import com.movieapi.entity.TicketInfo;
import lombok.Data;

@Data
public class MovieTicketRequest {

    private TicketInfo ticketInfo;
    private PaymentInfo paymentInfo;

}
