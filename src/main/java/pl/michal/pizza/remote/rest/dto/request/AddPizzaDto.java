package pl.michal.pizza.remote.rest.dto.request;

import java.util.List;

public class AddPizzaDto {
    private String name;
    private List<AddSizeDto> size;

    public AddPizzaDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddSizeDto> getSize() {
        return size;
    }

    public void setSize(List<AddSizeDto> size) {
        this.size = size;
    }

    public AddPizzaDto(String name, List<AddSizeDto> size) {
        this.name = name;
        this.size = size;
    }
}
