package pl.michal.pizza.data.entity.ordersize;

import javax.persistence.*;

public class OrderSizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "oderd_id")
    private Integer oderd_id;

    @Column(name = "size_id")
    private Integer size_id;

    @Column(name = "size_count")
    private Integer size_count;


}
