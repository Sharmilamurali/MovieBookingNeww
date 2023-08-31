package com.moviebooking.entity;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class TicketTest {
    Ticket ticket = new Ticket();
    @Test
    void setTicketId_Test(){
        ticket.setTicketId(1);
        assertEquals(1,ticket.getTicketId());
    }
    @Test
    void setMovieName_Test(){
        ticket.setMovieName("movieName");
        assertEquals("movieName",ticket.getMovieName());
    }
    @Test
    void setTheatreName_Test(){
        ticket.setTheatreName("theatreName");
        assertEquals("theatreName",ticket.getTheatreName());
    }
    @Test
    void setTotalCost_Test(){
        ticket.setTotalCost(100);
        assertEquals(100,ticket.getTotalCost());
    }
    @Test
    void setNoOfTickets_Test(){
        ticket.setNoOfTickets(2);
        assertEquals(2,ticket.getNoOfTickets());
    }
    @Test
    void setSeats_Test(){
        ticket.setSeats(List.of());
        assertEquals(List.of(),ticket.getSeats());
    }
}
