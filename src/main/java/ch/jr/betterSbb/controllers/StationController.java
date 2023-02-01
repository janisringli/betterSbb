package ch.jr.betterSbb.controllers;

import ch.jr.betterSbb.entities.Station;
import ch.jr.betterSbb.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StationController {

    private final StationRepository stationRepo;

    @Autowired
    public StationController(StationRepository stationRepo) {
        this.stationRepo = stationRepo;
    }

    @GetMapping("/stations")
    public List<Station> getStations() {
        return stationRepo.findAll();
    }

    @GetMapping("/stations/{station_id}")
    public Station getStation(@PathVariable("station_id") int station_id) {
        return stationRepo.findById(station_id).orElse(null);
    }
    @PostMapping(path="/stations")
    public Station addStation(@RequestBody Station station) {
        return stationRepo.save(station);
    }


    @PutMapping("/stations/{id}")
    public Station updateStation(@PathVariable("id") int id, @RequestBody Station station) {
        System.out.println(id);
        Station stationToUpdate = stationRepo.findById(id).get();
        stationToUpdate.setStation_name(station.getStation_name());
        stationToUpdate.setStation_latitude(station.getStation_latitude());
        stationToUpdate.setStation_longitude(station.getStation_longitude());
        return stationRepo.save(stationToUpdate);

    }
    @DeleteMapping("/stations/{station_id}")
    public void deleteStation(@PathVariable("station_id") int station_id) {
        stationRepo.deleteById(station_id);
    }
}
