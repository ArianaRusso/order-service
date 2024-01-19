    CREATE TABLE tb_order (
        id binary(16) PRIMARY KEY,
        status VARCHAR(50) NOT NULL
    );

    CREATE TABLE tb_order_item (
        id binary(16) PRIMARY KEY,
        description VARCHAR(255) NOT NULL,
        quantity INT NOT NULL,
        order_id binary,
        FOREIGN KEY (order_id) REFERENCES tb_order(id)
    );
