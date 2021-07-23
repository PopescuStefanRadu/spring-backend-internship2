package ro.esolutions.internship.carrental.mapper;

import ro.esolutions.internship.carrental.entity.CarModel;
import ro.esolutions.internship.carrental.model.CarModelDTO;

public final class CarModelMapper {

    private CarModelMapper() {}

    public static CarModelDTO toDTO(CarModel carModel) {
        return CarModelDTO.builder()
                .brand(carModel.getCarModelPK().getBrand())
                .name(carModel.getCarModelPK().getName())
                .modelYear(carModel.getCarModelPK().getYear())
                .type(carModel.getType())
                .build();
    }
}
