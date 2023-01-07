package pl.pab.music4u.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "ARTIST")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "artist_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class ArtistEntity extends BaseEntity {
    @Column(length = 50, nullable = false)
    private String name;
    //pk def
    @OneToMany(mappedBy = "artistEntity")
    private Set<ProductEntity> product = new HashSet<>();
    //fk def
}
