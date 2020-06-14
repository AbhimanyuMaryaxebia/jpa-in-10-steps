package com.xebia.jpain10steps.service;

import com.xebia.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
    public class UserDaoService {
        @PersistenceContext
        private EntityManager entityManager;

        public long insert(User user)   //User is an Entity becz of annotation @Entity
        {
            entityManager.persist(user);
            return user.getId();
        }

}
