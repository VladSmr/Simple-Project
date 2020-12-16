CREATE TABLE IF NOT EXISTS Product
(
    id          INTEGER COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(15)  NOT NULL COMMENT 'Название',
    description VARCHAR(255) NOT NULL COMMENT 'Описание',
    price       INTEGER      NOT NULL COMMENT 'Цена',

);
CREATE INDEX UX_product_id ON Product (id);