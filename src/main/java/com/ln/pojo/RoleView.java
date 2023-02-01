package com.ln.pojo;

public class RoleView {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "RoleView{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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

    public RoleView(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public RoleView() {
    }
}
