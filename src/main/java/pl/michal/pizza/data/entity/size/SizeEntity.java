package pl.michal.pizza.data.entity.size;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import pl.michal.pizza.data.entity.ordersize.OrderSizeEntity;
import pl.michal.pizza.data.entity.pizza.PizzaEntity;
import pl.michal.pizza.domain.model.SizeType;

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

    @Column(name="size_type")
    private SizeType sizeType;

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false,updatable = false)
    private PizzaEntity pizza;

    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSize;
}
