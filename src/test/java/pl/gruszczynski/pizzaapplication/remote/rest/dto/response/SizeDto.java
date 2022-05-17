package pl.gruszczynski.pizzaapplication.remote.rest.dto.response;

import pl.gruszczynski.pizzaapplication.data.entity.size.SizeEntity;

import java.math.BigDecimal;

public class SizeDto {

    private Integer id;
    private SizeEntity size;
    private BigDecimal price;

    public SizeDto() {
    }

    public SizeDto(Integer id, SizeEntity size, BigDecimal price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SizeEntity getSize() {
        return size;
    }

    public void setSize(SizeEntity size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
