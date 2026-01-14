package org.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder({ "lng", "lat" })
public class Location {

    public Location(Double lng,Double lat){
        this.lng = lng;
        this.lat = lat;
    }

    private Double lng;
    private Double lat;
}
