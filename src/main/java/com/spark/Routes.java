package com.spark;

import com.google.gson.Gson;
import com.spark.beans.Contact;
import com.spark.services.ContactService;
import com.spark.services.ContactServiceImplements;

import static spark.Spark.*;

public class Routes {
    private static ContactService contactService = new ContactServiceImplements();
    public static void setRoutes() {
        //        before("/v1/*", (request, response) -> System.out.println("Passing before filter"));
        path("/v1", () -> {
            get("/contacts", (request, response) ->
                    new Gson().toJson(contactService.getContacts())
            );
            get("/contacts/:id", (request, response) ->
                    new Gson().toJson(contactService.getContact(request.params(":id")))
            );
            post("/contacts", (request, response) -> {
                Contact contact = new Gson().fromJson(request.body(), Contact.class);
                contactService.insertContact(contact);
                return new Gson().toJson(contact);
            });
            put("/contacts/:id", (request, response) -> "put /contacts/:id");
            delete("/contacts", (request, response) -> "delete /contacts");
        });
        after("/v1/*", (request, response) -> {
            response.type("application/json");
        });
//        afterAfter((request, response) -> System.out.println("Passing by After after filter"));
    }
}
