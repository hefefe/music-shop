package pl.pab.music4u.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pab.music4u.entity.OrderStatusEntity;

@Repository
public interface OrderStatusRepository extends JpaRepository<OrderStatusEntity,Long> {
}
