package br.com.store.dao;

import br.com.store.models.Category;
import br.com.store.models.Product;

import javax.persistence.EntityManager;

public class CategoryDAO {
    private EntityManager em;

    public CategoryDAO(EntityManager em){
        this.em = em;
    }

    public void register(Category category){
        this.em.persist(category);
    }

    public void update(Category category) {
        this.em.merge(category);
    }
    public void remove(Category category) {
        category = em.merge(category); //transformation 
        this.em.remove(category);
    }

}
