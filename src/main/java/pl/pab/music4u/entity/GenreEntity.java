package pl.pab.music4u.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.*;
import pl.pab.music4u.model.GenreDTO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GENRE")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "genre_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class GenreEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    //pk def
    @OneToMany(mappedBy = "genreEntity")
    private Set<ProductEntity> product = new HashSet<>();

}
