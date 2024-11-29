package com.kowee.quarkus.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DbService {

    private static final Logger logger = LoggerFactory.getLogger(DbService.class);

    public boolean isTableAccessible() {
        try {
            PanacheEntityBase.findAll(); // Vérifie si la table est accessible
            logger.info("Connection with DB successful");
            return true;
        } catch (Exception e) {
            logger.error("Connection with DB faild");
            e.printStackTrace();
            return false;
        }
    }
}
