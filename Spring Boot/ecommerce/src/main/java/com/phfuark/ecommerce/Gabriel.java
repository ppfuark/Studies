package com.phfuark.ecommerce;

import java.util.Objects;

public class Gabriel {
    private Integer id;
    private String name;
    private Boolean annoying;

    public Gabriel(){}
    public Gabriel(Integer id, String name, boolean annoying) {
        this.id = id;
        this.name = name;
        this.annoying = annoying;
    }

    public Gabriel(int id, String name) {
        this.id = id;
        this.name = name;
        this.annoying = null;
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

    public Boolean getAnnoying() {
        return annoying;
    }

    public void setAnnoying(Boolean annoying) {
        this.annoying = annoying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gabriel gabriel = (Gabriel) o;
        return Objects.equals(getId(), gabriel.getId()) && Objects.equals(getName(), gabriel.getName()) && Objects.equals(getAnnoying(), gabriel.getAnnoying());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAnnoying());
    }
}
