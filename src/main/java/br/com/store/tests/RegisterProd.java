package br.com.store.tests;

import br.com.store.dao.CategoryDAO;
import br.com.store.dao.ProductDAO;
import br.com.store.models.Category;
import br.com.store.models.Product;
import br.com.store.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class RegisterProd {
    public static void main(String[] args) {
        Category categoria = new Category("DISPOSITIVOS");
        Product smartphone = new Product("Iphone", "Celular com memoria", new BigDecimal("7566"));

        EntityManager em = JPAUtil.getEntityManager();

        ProductDAO Produtodao = new ProductDAO(em);
        CategoryDAO categoryDAO = new CategoryDAO(em);

        em.getTransaction().begin();
        em.persist(categoria);
        categoria.setName("Mudei");
        em.flush();
        em.clear();
        categoria = em.merge(categoria);
        categoria.setName("Troquei");
        categoryDAO.register(categoria);
        //Produtodao.register(smartphone);
        em.getTransaction().commit();
        em.close();

    }
}
