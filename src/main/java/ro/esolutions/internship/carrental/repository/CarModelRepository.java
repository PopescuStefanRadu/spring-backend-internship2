package ro.esolutions.internship.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.esolutions.internship.carrental.entity.CarModel;
import ro.esolutions.internship.carrental.entity.CarModelPK;

import java.util.List;

public interface CarModelRepository extends JpaRepository<CarModel, CarModelPK> {


    List<CarModel> getByCarModelPK_Brand(String brand);
}
