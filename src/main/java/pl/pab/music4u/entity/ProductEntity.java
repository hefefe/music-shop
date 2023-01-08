package pl.pab.music4u.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "PRODUCT")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "product_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class ProductEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length=50, nullable = false)
    private String name;
    @Column(precision=100, scale=2, nullable = false)
    private BigDecimal grossPrice;
    @Column(precision=100, scale=2, nullable = false)
    private BigDecimal netPrice;
    @Column(nullable = false)
    private Integer tax;
    @Column(length=512, nullable = false)
    private String imagePath;
    //pk def
    @OneToMany(mappedBy = "productEntity")
    private Set<OrderElementsEntity> orderElements = new HashSet<>();
    //fk def
    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id")
    private ArtistEntity artistEntity;
    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "id")
    private GenreEntity genreEntity;
    @ManyToOne
    @JoinColumn(name = "product_type_id", referencedColumnName = "id")
    private ProductTypeEntity productTypeEntity;
    @ManyToOne
    @JoinColumn(name = "warehouse_state_id", referencedColumnName = "id")
    private WarehouseStateEntity warehouseStateEntity;



}
