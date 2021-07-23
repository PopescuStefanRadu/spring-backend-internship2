package ro.esolutions.internship.carrental.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CarCreationDTO {
    @NotBlank
    private final String chassisNo;
    @NotBlank
    private final String color;

    /// de aici in jos pt a identifica modelul
    @NotBlank
    private final String name;
    @NotBlank
    private final String brand;
    @NotNull
    @Min(value = 1950L)
    private final Long year;
}

//
// POST (Model)-> Service -> Repositories -> DB
//
