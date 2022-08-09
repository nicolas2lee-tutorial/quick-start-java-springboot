CREATE TABLE IF NOT EXISTS users(
    user_id serial PRIMARY KEY,
    username VARCHAR(50) NOT null,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS postEntities(
    post_id serial PRIMARY KEY,
    creator_id serial NOT NULL,
    content VARCHAR (50) NOT NULL,
    last_updated TIMESTAMP,
    FOREIGN KEY (creator_id)
    REFERENCES users(user_id)
);