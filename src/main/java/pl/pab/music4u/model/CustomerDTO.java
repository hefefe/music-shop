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
public class CustomerDTO {
    private Long id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String nip;
    private String type;
    private boolean isactive;
}
