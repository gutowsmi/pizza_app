package pl.michal.pizza.data.entity.order;

import pl.michal.pizza.domain.model.OrderStatusType;
import pl.michal.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="status")
    private OrderStatusType status;

    @Column(name ="name")
    private String name;

    @Column(name ="address")
    private String address;

    @Column(name ="phone")
    private String phone;

    @Column(name ="floor")
    private Integer floor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="created")
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="updated")
    private Date updated;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="expected")
    private Date expected;

    @Column(name ="token")
    private String token;


}
