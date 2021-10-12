package pl.michal.pizza.remote.rest.dto.request;

public class DeleteMenuDto {
    private Integer id;

    public DeleteMenuDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DeleteMenuDto(Integer id) {
        this.id = id;
    }
}
