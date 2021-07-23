package ro.esolutions.internship.carrental.mapper;

import ro.esolutions.internship.carrental.entity.Car;
import ro.esolutions.internship.carrental.entity.CarModel;
import ro.esolutions.internship.carrental.model.CarCreationDTO;
import ro.esolutions.internship.carrental.model.CarDTO;

public final class CarMapper {
    private CarMapper() {}

    public static CarDTO toDTO(Car car) {
        return CarDTO.builder()
                .chassisNo(car.getChassisNo())
                .model(CarModelMapper.toDTO(car.getCarModel()))
                .color(car.getColor())
                .build();
    }

    public static Car toNewCarEntity(CarCreationDTO carCreationDTO, CarModel carModel) {
        return Car.builder()
                .chassisNo(carCreationDTO.getChassisNo())
                .color(carCreationDTO.getColor())
                .carModel(carModel)
                .build();
    }
}
