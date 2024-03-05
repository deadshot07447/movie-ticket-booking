package com.movieapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Ticket")
@Data
public class TicketInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String movieName;
    private String email;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "DD/MM/YY")
    private Date movieDate;
    private String movieTime;
    private double ticketPrice;



}
