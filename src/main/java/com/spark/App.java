package com.spark;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        path("/v1", () -> {
            get("/:name", "application/json", (request, response) -> new MyBean(request.params(":name")), new JsonResponse());
        });
    }
}
