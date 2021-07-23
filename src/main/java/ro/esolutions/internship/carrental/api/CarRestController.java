package ro.esolutions.internship.carrental.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ro.esolutions.internship.carrental.exception.EntityAlreadyExistsException;
import ro.esolutions.internship.carrental.exception.EntityNotFoundException;
import ro.esolutions.internship.carrental.model.CarCreationDTO;
import ro.esolutions.internship.carrental.model.CarDTO;
import ro.esolutions.internship.carrental.service.CarService;

import javax.validation.Valid;

@CrossOrigin
@RequestMapping("/api/car")
@RestController
@RequiredArgsConstructor
public class CarRestController {
    private final CarService carService;

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> conflict() {
        return ResponseEntity.badRequest().body("Nu e bine");
    }


    @GetMapping("/{chassisNo}")
    public CarDTO getCarModelByChassisNo(@PathVariable(name = "chassisNo") String id) {
        return carService.getByChassisNo(id);
    }


    @PostMapping("/create")
    public CarDTO create(@Valid @RequestBody CarCreationDTO carCreationDTO, BindingResult bindingResult) {
        return carService.create(carCreationDTO);
    }

    @GetMapping("/failedValidation")
    public Object failedValidation() {
        throw new EntityNotFoundException("Wth is going on");
    }
}
