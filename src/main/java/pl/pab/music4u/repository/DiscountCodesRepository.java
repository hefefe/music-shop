package pl.pab.music4u.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pab.music4u.entity.DiscountCodesEntity;

public interface DiscountCodesRepository extends JpaRepository <DiscountCodesEntity,Long> {
}
