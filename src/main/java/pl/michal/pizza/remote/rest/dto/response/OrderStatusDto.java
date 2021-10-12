package pl.michal.pizza.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.michal.pizza.domain.model.OrderStatusType;

import java.util.Date;

public class OrderStatusDto {
    private OrderStatusType status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }

    public OrderStatusDto(OrderStatusType status, Date updatedAt, Date expectedAt) {
        this.status = status;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
    }

    public OrderStatusDto() {
    }
}
