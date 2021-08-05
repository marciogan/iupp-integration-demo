CREATE KEYSPACE IF NOT EXISTS iupp_catalog WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

USE iupp_catalog;

CREATE TABLE IF NOT EXISTS attribute (
    id UUID,
    name VARCHAR,
    description VARCHAR,
    type VARCHAR,
    keyword VARCHAR,
    filterable  BOOLEAN,
    icon  VARCHAR,
    PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS product_type(
    id UUID,
    name VARCHAR,
    description VARCHAR,
    reference_code VARCHAR,
    themes list<UUID>,
    required_attributes list<UUID>,
    optional_attributes list<UUID>,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS category(
    id UUID,
    name VARCHAR,
    description VARCHAR,
    reference_code VARCHAR,
    image_url VARCHAR,
    category_parent_id UUID,
    sort_order VARCHAR,
    meta_tags VARCHAR,
    active BOOLEAN,
    tipo_produto UUID,
    PRIMARY KEY (id)
);
CREATE INDEX ON category(active);
CREATE INDEX ON category(category_parent_id);