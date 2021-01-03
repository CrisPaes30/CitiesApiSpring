package paes.cristian.citiesapi.coutries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import paes.cristian.citiesapi.coutries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
