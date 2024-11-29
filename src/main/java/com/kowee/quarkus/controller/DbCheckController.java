package com.kowee.quarkus.controller;

import com.kowee.quarkus.service.DbService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/check-db")
public class DbCheckController {

    @Inject
    DbService dbService;

    @GET
    public String checkDatabase() {
        return dbService.isTableAccessible()
                ? "Database connection is successful!"
                : "Failed to connect to database or table is missing.";
    }

}
