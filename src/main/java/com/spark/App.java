package com.spark;

import static spark.Spark.*;
import com.google.gson.Gson;
import com.spark.beans.MyBean;
import com.spark.utils.JsonResponse;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        new Config().setConfig();
        new Routes().setRoutes();
//        before("/v1/*", (request, response) -> System.out.println("Passing before filter"));
//        path("/v1", () -> {
//            get("/:name", "application/json", (request, response)
//                    -> new MyBean(request.params(":name")), new JsonResponse());
//            post("/bean/new", "application/json", (request, response) -> {
//                MyBean bean = new Gson().fromJson(request.body(), MyBean.class);
//                System.out.println(bean.getName());
//                System.out.println(bean.getAge());
//                return "ok";
//            }, new JsonResponse());
//        });
//        after("/v1/*", (request, response) -> {
//            response.type("application/json");
//        });
//        afterAfter((request, response) -> System.out.println("Passing by After after filter"));
    }
}
