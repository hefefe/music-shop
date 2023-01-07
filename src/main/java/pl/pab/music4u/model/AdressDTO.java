package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class AdressDTO {
    private Long id;
    private String locality;
    private String state;
    private String zipcode;
    private String street;
    private String number;
    private String apartmentNumber;
}
