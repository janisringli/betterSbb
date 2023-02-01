package ch.jr.betterSbb.repositories;

import ch.jr.betterSbb.entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {


}
