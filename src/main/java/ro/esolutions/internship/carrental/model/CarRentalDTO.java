package ro.esolutions.internship.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarRentalDTO {
    private Long id;
    private CarDTO car;
    private ClientDTO client;
    private LocalDate startDate;
    private LocalDate endDate;
}
