package ro.esolutions.internship.carrental.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarModelDTO {
    private final String name;
    private final String brand;
    private final Long modelYear;
    private final String type;
}
