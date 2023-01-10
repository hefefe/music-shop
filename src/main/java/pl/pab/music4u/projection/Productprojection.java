package pl.pab.music4u.projection;

import java.math.BigDecimal;

public interface Productprojection {
    Long getId();

    String getName();

    BigDecimal getGrossPrice();

    String getImagePath();

    String getArtistName();

    String getGenreName();

    String getProductTypeName();

    Integer getAmount();

    String getWarehouseName();
}
