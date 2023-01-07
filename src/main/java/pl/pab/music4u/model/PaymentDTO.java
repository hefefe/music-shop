package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PaymentDTO {
    private Long id;
    private Timestamp date;
    private BigDecimal grossPrice;
    private BigDecimal netPrice;
    private boolean isPaid;
    private String bankAccountNumber;
    private Integer tax;
}
