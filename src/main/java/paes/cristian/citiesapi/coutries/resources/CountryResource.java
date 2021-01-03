package paes.cristian.citiesapi.coutries.resources;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import paes.cristian.citiesapi.coutries.entities.Country;
import paes.cristian.citiesapi.coutries.repositories.CountryRepository;

@RestController
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public List<Country> cities() {

        return repository.findAll();
    }

}
