package sg.edu.iss.clubjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sg.edu.iss.clubjpa.domain.Facility;

import java.util.List;

public interface FacilityRepository extends JpaRepository<Facility, Integer> {
    @Query("SELECT f FROM Facility f WHERE f.name = :name")
    List<Facility> findFacilitiesByName(@Param("name") String name);
}
