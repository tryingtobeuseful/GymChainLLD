package com.company.example.repo;

import java.util.HashMap;
import java.util.Map;

public class BookingRepo {

    private static BookingRepo bookingRepo = null;
    Map<Integer, Booking> bookings;

    private BookingRepo(){
        bookings = new HashMap<>();
    }
    public static BookingRepo getInstance() {
        if(bookingRepo == null){
            bookingRepo = new BookingRepo();
        }
        return bookingRepo;
    }

    public void addBooking(Booking booking){
        bookings.put(booking.id, booking);
    }

    public Booking getBooking(Integer id){
        return bookings.get(id);
    }
}
