package com.izhyk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Location {
    private Integer id;
    private String city;
    private String street;
    private String countryName;
}
