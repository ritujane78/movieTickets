package com.jane.movietickets.services;

import com.jane.movietickets.entities.Ticket;
import com.jane.movietickets.repositories.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
  private TicketRepository ticketRepository;

  public TicketServiceImpl(TicketRepository ticketRepository) {
    this.ticketRepository = ticketRepository;
  }

  @Override
  public Ticket createTicket(Ticket ticket) {
    return ticketRepository.save(ticket);
  }
}
