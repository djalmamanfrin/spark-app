package com.spark;

import static spark.Spark.*;
public class Config {
    public static void setConfig() {
         port(4567);
         ipAddress("127.0.0.1");
    }
}
