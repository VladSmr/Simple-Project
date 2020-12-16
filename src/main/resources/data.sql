CREATE TABLE IF NOT EXISTS Product
(
    id          INTEGER COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(15)  NOT NULL COMMENT 'Название',
    description VARCHAR(255) NOT NULL COMMENT 'Описание',
    price       INTEGER      NOT NULL COMMENT 'Цена',

);
CREATE INDEX UX_product_id ON Product (id);

INSERT INTO Product (id, name, description, price) VALUES (1, 'Milk', 'Молоко', 10);

INSERT INTO Product (id, name, description, price) VALUES (2, 'Water', 'Вода', 5);

INSERT INTO Product (id, name, description, price) VALUES (3, 'Beer', 'Пиво', 15);

INSERT INTO Product (id, name, description, price) VALUES (4, 'Cheese', 'Сыр', 13);

INSERT INTO Product (id, name, description, price) VALUES (5, 'Hot-Dog', 'Хот-дог', 8);