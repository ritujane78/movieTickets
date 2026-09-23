package com.jane.movietickets.controllers;

import com.jane.movietickets.entities.Ticket;
import com.jane.movietickets.services.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TicketController {

  private TicketService ticketService;

  public TicketController(TicketService ticketService) {
    this.ticketService = ticketService;
  }

  @RequestMapping("/showMovieTicket")
  public String createTicket(){
    return "createTicket";
  }

  @RequestMapping("/createTicket")
  public String createTicket(Ticket ticket, Model model){
    ticketService.createTicket(ticket);
    model.addAttribute("msg", "Ticket Purchased Successfully!");
    return "createTicket";
  }
}
