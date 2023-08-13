-- src/main/resources/data.sql
CREATE TABLE shop (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(255),
    quantity INT,
    price DECIMAL(10, 2)
);
