package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pl.pab.music4u.entity.CustomerEntity;
import pl.pab.music4u.entity.EmployeeEntity;
import pl.pab.music4u.entity.OrderStatusEntity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderDTO {
    private Long id;
    private Timestamp date;
}
