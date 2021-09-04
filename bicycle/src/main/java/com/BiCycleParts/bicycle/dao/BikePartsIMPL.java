package com.BiCycleParts.bicycle.dao;

import com.BiCycleParts.bicycle.entity.BikeParts;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BikePartsIMPL implements BikePartsDAO {
    private final EntityManager entityManager;

    @Autowired
    public BikePartsIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List findAllParts() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<BikeParts> query = currentSession.createQuery("from BikeParts");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int thisId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(BikeParts .class, thisId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(BikeParts newParts) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(newParts);
    }

    @Override
    @Transactional
    public void deleteById(int thisId) {
        Session currentSession = entityManager.unwrap(Session.class);
        BikeParts thisPart = currentSession.get(BikeParts.class, thisId);
        currentSession.delete(thisPart);
    }
}