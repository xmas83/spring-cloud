package com.techomeck.lil.reservationservices;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reservations")
public class ReservationWebService {
    private ReservationRepository repository;


    public ReservationWebService(ReservationRepository reservationRepository) {
        super();
        this.repository = reservationRepository;
    }

    @GetMapping
    public Iterable<Reservation> getAllReservations() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable("id") long id) {
        return this.repository.findById(id).get();
    }

}
