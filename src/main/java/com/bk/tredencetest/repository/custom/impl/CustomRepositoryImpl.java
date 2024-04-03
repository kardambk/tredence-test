package com.bk.tredencetest.repository.custom.impl;

import com.bk.tredencetest.entity.ShopperProducts;
import com.bk.tredencetest.repository.custom.CustomRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;

import java.util.ArrayList;
import java.util.List;

public class CustomRepositoryImpl implements CustomRepository {

    @PersistenceContext
    private EntityManager em;
    @Override
    public List<ShopperProducts> getShelf(String shopperId, Integer pageNumber, String category, String brand, String productId, String sortBy, String order) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ShopperProducts> query = cb.createQuery(ShopperProducts.class);
        Root<ShopperProducts> queryRoot = query.from(ShopperProducts.class);
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.and(cb.equal(queryRoot.get("shopperId"), shopperId)));
        if(category != null) {
            predicates.add(cb.and(cb.equal(queryRoot.get("product").get("category"), category)));
        }
        if(brand != null) {
            predicates.add(cb.and(cb.equal(queryRoot.get("product").get("brand"), brand)));
        }
        if(productId != null) {
            predicates.add(cb.and(cb.equal(queryRoot.get("product").get("productId"), productId)));
        }

        query.select(queryRoot);
        if(predicates.size() > 0) {
            query.where(predicates.toArray(new Predicate[]{}));
        }
        if (sortBy != null) {
            Order orderBy = null;
            if ("DESC".equalsIgnoreCase(order)) {
                if("brand".equals(sortBy) || "category".equals(sortBy)) {
                    orderBy = cb.desc(queryRoot.get("product").get(sortBy));
                } else {
                    orderBy = cb.desc(queryRoot.get(sortBy));
                }

            } else {
                if("brand".equals(sortBy) || "category".equals(sortBy)) {
                    orderBy = cb.asc(queryRoot.get("product").get(sortBy));
                } else {
                    orderBy = cb.asc(queryRoot.get(sortBy));
                }

            }
            query.orderBy(orderBy);
        }

        List<ShopperProducts> productList = em.createQuery(query)
                .setFirstResult((pageNumber - 1) * 100)
                .setMaxResults(100)
                .getResultList();

        return productList;
    }
}
