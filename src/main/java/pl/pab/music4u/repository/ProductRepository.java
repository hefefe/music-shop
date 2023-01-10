package pl.pab.music4u.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.pab.music4u.entity.ProductEntity;
import pl.pab.music4u.projection.Productprojection;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    @Query("SELECT p.id as id, p.name as name, " +
            "p.grossPrice as grossPrice, p.imagePath as imagePath, a.name as artistName," +
            "g.name as genreName, pt.name as productTypeName, ws.amount as amount, w.name as warehouseName " +
            "From ProductEntity p " +
            "left join ArtistEntity a " +
            "on a.id = p.artistEntity.id " +
            "left join GenreEntity g " +
            "on g.id = p.genreEntity.id " +
            "left join ProductTypeEntity pt " +
            "on pt.id = p.productTypeEntity.id " +
            "left join WarehouseStateEntity ws " +
            "on ws.id = p.warehouseStateEntity.id " +
            "left join WarehouseEntity w " +
            "on w.id = ws.warehouseEntity.id")
    List<Productprojection> getListOfProducts();
}
