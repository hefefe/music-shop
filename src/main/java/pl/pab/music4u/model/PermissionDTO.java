package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PermissionDTO {
    private Long id;
    private String name;
}
