package pl.michal.pizza.remote.rest.dto.request;

import pl.michal.pizza.remote.rest.dto.response.SizeDto;

import java.util.List;

public class UpdateMenuDto {
    private Integer id;
    private String name;
    private List<SizeDto> size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeDto> getSize() {
        return size;
    }

    public void setSize(List<SizeDto> size) {
        this.size = size;
    }

    public UpdateMenuDto(Integer id, String name, List<SizeDto> size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public UpdateMenuDto() {
    }
}
