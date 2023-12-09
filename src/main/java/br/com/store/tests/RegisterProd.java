package br.com.store.tests;

import br.com.store.dao.ProductDAO;
import br.com.store.models.Product;
import br.com.store.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class RegisterProd {
    public static void main(String[] args) {
        Product smartphone = new Product("Iphone", "Celular com memoria", new BigDecimal("7566"));

        EntityManager em = JPAUtil.getEntityManager();

        ProductDAO dao =new ProductDAO(em);

        em.getTransaction().begin();
        dao.register(smartphone);
        em.getTransaction().commit();
        em.close();

    }
}