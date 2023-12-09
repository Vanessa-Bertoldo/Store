package br.com.store.dao;

import br.com.store.models.Product;

import javax.persistence.EntityManager;

public class ProductDAO {
    private EntityManager em;

    public ProductDAO(EntityManager em){
        this.em = em;
    }

    public void register(Product product){
        this.em.persist(product);
    }
}
