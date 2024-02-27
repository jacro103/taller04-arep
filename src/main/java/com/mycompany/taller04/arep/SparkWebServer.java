
package com.mycompany.taller04.arep;

import static spark.Spark.get;
import static spark.Spark.port;



public class SparkWebServer {
    
    public static void main(String... args){
          port(getPort());
          get("hello", (req,res) -> "Hello Docker!");
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
    public double cos(double num){
        double cos = Math.cos(num);
        return cos;
    }
    
    public double sin(double num){
        double sin = Math.sin(num);
        return sin;
    }
    public double vec(double numA, double numB){
        double a =numA * numA;
        double b = numB * numB;
        double c = a +b;
        double d = Math.sqrt(c);
        return d;
    }
    
    public Boolean palindromo(String palabra){
        Boolean palindromo = false;
        
        return palindromo;
    }
    
}


