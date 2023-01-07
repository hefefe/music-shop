package pl.pab.music4u.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pab.music4u.entity.WarehouseStateEntity;

@Repository
public interface WarehouseStateRepository extends JpaRepository<WarehouseStateEntity,Long> {
}
