CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE "authors" (

    "username" varchar(50) NOT NULL PRIMARY KEY,
    "following" boolean NOT NULL,
    "email" varchar(50) NOT NULL,
    "bio" varchar(256),
    "image" varchar(256)

) ;
