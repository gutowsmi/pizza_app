package pl.michal.pizza.data.entity.pizza;

import nonapi.io.github.classgraph.json.Id;
import pl.michal.pizza.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "pizza")
    private Set<SizeEntity> sizes;

    @Column(name = "name")
    private String name;
}
