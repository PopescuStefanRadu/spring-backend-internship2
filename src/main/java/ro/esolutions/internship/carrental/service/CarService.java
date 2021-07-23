package ro.esolutions.internship.carrental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.esolutions.internship.carrental.entity.Car;
import ro.esolutions.internship.carrental.entity.CarModel;
import ro.esolutions.internship.carrental.exception.EntityAlreadyExistsException;
import ro.esolutions.internship.carrental.mapper.CarMapper;
import ro.esolutions.internship.carrental.model.CarCreationDTO;
import ro.esolutions.internship.carrental.model.CarDTO;
import ro.esolutions.internship.carrental.repository.CarRepository;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private final CarModelService carModelService;

    public CarDTO getByChassisNo(String chassisNo) {
        return CarMapper.toDTO(carRepository.getById(chassisNo));
    }

    public CarDTO create(CarCreationDTO carCreationDTO) {
        CarModel carModel = carModelService.findModelByPKFields(carCreationDTO.getName(), carCreationDTO.getBrand(), carCreationDTO.getYear());
        Car newCarEntity = CarMapper.toNewCarEntity(carCreationDTO, carModel);
        String chassisNo = carCreationDTO.getChassisNo();
        carRepository.findById(chassisNo).ifPresent(car -> {
            throw new EntityAlreadyExistsException(String.format("Car with id %s already exists", chassisNo));
        });
        Car persistedCarEntity = carRepository.save(newCarEntity);
        return CarMapper.toDTO(persistedCarEntity);
    }
}


