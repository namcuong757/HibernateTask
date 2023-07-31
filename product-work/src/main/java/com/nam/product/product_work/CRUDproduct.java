package com.nam.product.product_work;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class CRUDproduct {
	private static Session session = SessionConfig.getSession();

    public static void add(Product product)
    {
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
    }

    public static Product get(int id)
    {
        return session.get(Product.class, id);
    }

    public static List<Product> getAll()
    {
        Query<Product> query = session.createQuery("from Product");
        List<Product> productList = query.list();
        return productList;
    }

    public static void update(Product product)
    {
        session.beginTransaction();
        session.update(product);
        session.getTransaction().commit();

    }
    public static void delete(Product product)
    {
        session.beginTransaction();
        session.delete(product);
        session.getTransaction().commit();
    }
}
