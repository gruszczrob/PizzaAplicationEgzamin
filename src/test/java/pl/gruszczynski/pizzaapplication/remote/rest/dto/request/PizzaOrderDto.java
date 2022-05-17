package pl.gruszczynski.pizzaapplication.remote.rest.dto.request;

public class PizzaOrderDto {

    private Integer sizeId;
    private Integer count;

    public PizzaOrderDto() {
    }

    public PizzaOrderDto(Integer sizeId, Integer count) {
        this.sizeId = sizeId;
        this.count = count;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCunt(Integer cunt) {
        this.count = cunt;
    }
}
