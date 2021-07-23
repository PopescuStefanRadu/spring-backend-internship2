package ro.esolutions.internship.carrental.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDTO {
    private final String chassisNo;
    private final String color;
    private final CarModelDTO model;
}
