package com.example.shoppinglist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.shoppinglist")
public class ShoppingListApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingListApplication.class, args);
    }
}
