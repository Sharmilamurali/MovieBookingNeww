//package com.moviebooking.entity;
//
//import jakarta.validation.Validation;
//import jakarta.validation.Validator;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class MovieTest {
//    Movie movie = new Movie();
//    MovieId movieId = new MovieId("movieName","theatreName");
//
//    @Test
//    void setMovieId_Test(){
//        movie.setMovieId(movieId);
//        assertEquals(movieId,movie.getMovieId());
//    }
//    @Test
//    void setId_Test(){
//        movie.setId(1);
//        assertEquals(1,movie.getId());
//    }
//    @Test
//    void setCostOfTicket_Test(){
//        movie.setCostOfTicket(100);
//        assertEquals(100,movie.getCostOfTicket());
//    }
//    @Test
//    void setNoOfTicketsAllotted_Test(){
//        movie.setNoOfTicketsAllotted(10);
//        assertEquals(10,movie.getNoOfTicketsAllotted());
//    }
//    @Test
//    void setNoOfTicketsSold_Test(){
//        movie.setNoOfTicketsSold(5);
//        assertEquals(5,movie.getNoOfTicketsSold());
//    }
//    @Test
//    void setTicketStatus_Test(){
//        assertEquals("Book ASAP",movie.getTicketStatus());
//    }
//
//}
