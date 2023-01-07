package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pl.pab.music4u.entity.ArtistEntity;
import pl.pab.music4u.entity.GenreEntity;
import pl.pab.music4u.entity.ProductTypeEntity;
import pl.pab.music4u.entity.WarehouseStateEntity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ProductDTO {
    private Long id;
    private String name;
    private BigDecimal grossPrice;
    private BigDecimal netPrice;
    private Integer tax;
    private String imagePath;
    private int artistId;
    private int genreId;
    private int productTypeId;
    private int warehouseStateId;
}
