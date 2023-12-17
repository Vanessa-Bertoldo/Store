package br.com.store.models;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
