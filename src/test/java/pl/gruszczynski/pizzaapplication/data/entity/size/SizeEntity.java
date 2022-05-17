package pl.gruszczynski.pizzaapplication.data.entity.size;

//import pl.gruszczynski.pizzaapplication.data.entity.ordersize.OrderSizeEntity;
import pl.gruszczynski.pizzaapplication.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "sizes")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private String sizeType;

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    //powinno napisać się jeszcze OrderSizeEntity ale nie było tegop w zadaniu

    /*
    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSizes;
    */

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public void setPriceBase(BigDecimal priceBase) {
        this.priceBase = priceBase;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

    public Integer getId() {
        return id;
    }

    public String getSizeType() {
        return sizeType;
    }

    public BigDecimal getPriceBase() {
        return priceBase;
    }
}
