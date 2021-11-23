package pl.michal.pizza.data.entity.pizza;

import nonapi.io.github.classgraph.json.Id;

import javax.persistence.*;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}
