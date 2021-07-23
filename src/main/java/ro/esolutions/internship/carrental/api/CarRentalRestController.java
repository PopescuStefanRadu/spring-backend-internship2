package ro.esolutions.internship.carrental.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.esolutions.internship.carrental.exception.EntityNotFoundException;

@RequestMapping("/api/car-rental")
@RestController
public class CarRentalRestController {


    @GetMapping
    public String helloWorld(){
        throw new EntityNotFoundException("Hellow workd");
    }
}
