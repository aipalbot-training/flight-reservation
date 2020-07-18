package com.aipalbot.flight.reservation;

import com.aipalbot.flight.reservation.models.Address;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.School;
import com.aipalbot.flight.reservation.models.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //String name, String id, School school, Address address
        String name = "Sam";
        String id="1022-A";
        Address address = new Address();
        address.setCity("Philly");
        
        School school = new School(name, address);
        
        Person student= new Student(name,id,school,address);
        
        
        
    }
}
