package ch.jr.betterSbb.entities;

import com.sun.jna.platform.win32.OaIdl;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;

@Entity
@Table(name = "station")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "station_id")
    private Long station_id;
    @Column(name = "station_name")
    private String station_name;
    @Column(name = "station_latitude")
    private Double station_latitude;

    @Column(name = "station_longitude")
    private Double station_longitude;

    public Station() {
    }

    //Getters
    public Long getStation_id() {
        return station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public Double getStation_latitude() {
        return station_latitude;
    }

    public Double getStation_longitude() {
        return station_longitude;
    }
    //Setters
    public void setStation_id(Long station_id) {
        this.station_id = station_id;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public void setStation_latitude(Double station_latitude) {
        this.station_latitude = station_latitude;
    }

    public void setStation_longitude(Double station_longitude) {
        this.station_longitude = station_longitude;
    }


}
