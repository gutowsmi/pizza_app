package pl.michal.pizza.remote.rest.api;

import io.swagger.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.michal.pizza.domain.model.OrderStatusType;
import pl.michal.pizza.remote.rest.dto.request.AddOrderDto;
import pl.michal.pizza.remote.rest.dto.response.OrderCollectionDto;
import pl.michal.pizza.remote.rest.dto.response.TokenDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/orders",produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {
    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto){
        return ResponseEntity.ok(null);
    }
    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrders(@RequestParam("status") OrderStatusType orderStatusType, @RequestHeader("Access-Token") String token ){
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token, @PathVariable("order-id") Integer orderID ){
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{order-id}")
    public ResponseEntity<Void> updateOrder(@RequestHeader("Access-Token") String token, @PathVariable("order-id") Integer orderID ){
        return ResponseEntity.ok(null);
    }
}
