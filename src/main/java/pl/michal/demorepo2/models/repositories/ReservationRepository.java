package pl.michal.demorepo2.models.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.michal.demorepo2.models.ReservationModel;

@Repository
public interface ReservationRepository extends
        CrudRepository <ReservationModel, Integer> {
}
