package com.movieapi.dto;

import com.movieapi.entity.TicketInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieTicketAcknowledgement {

    private String status;
    private double totalFare;
    private String prnNo;
    private TicketInfo ticketInfo;


}
