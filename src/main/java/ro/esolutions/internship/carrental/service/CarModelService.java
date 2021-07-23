package ro.esolutions.internship.carrental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.esolutions.internship.carrental.entity.CarModel;
import ro.esolutions.internship.carrental.entity.CarModelPK;
import ro.esolutions.internship.carrental.repository.CarModelRepository;

@Service
@RequiredArgsConstructor
public class CarModelService {
    private final CarModelRepository carModelRepository;

    public CarModel findModelByPKFields(String name, String brand, Long year) {
        return carModelRepository.getById(new CarModelPK(name, brand, year));
    }
}
