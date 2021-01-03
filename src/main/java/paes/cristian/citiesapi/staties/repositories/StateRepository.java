package paes.cristian.citiesapi.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import paes.cristian.citiesapi.staties.entities.State;


public interface StateRepository extends JpaRepository<State, Long> {
}
