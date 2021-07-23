package ro.esolutions.internship.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ro.esolutions.internship.carrental.entity.Car;

public interface CarRepository extends JpaRepository<Car, String> {


    /// modificam ceva ne trebe @Modifying
    // Toate queries catre baza manageuite de spring sunt prepared statements, sau daca sunt scrise de noi
    // cu bind params ca aici, tot prepared statements
    @Query("UPDATE Car c SET c.color=:newColor WHERE c.chassisNo=:chassis")
    @Modifying
    void saveSth(String chassis, String newColor);
}
