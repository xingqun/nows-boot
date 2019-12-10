DROP TABLE IF EXISTS soul;

CREATE TABLE soul (
    id BIGINT(20) NOT NULL,
    title VARCHAR(300) NOT NULL,
    hits VARCHAR(100) DEFAULT '0',
    PRIMARY KEY (id)
);
