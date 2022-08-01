CREATE TABLE "users" (

    "username" varchar(50) NOT NULL PRIMARY KEY,
    "token" varchar(50),
    "email" varchar(50) NOT NULL,
    "bio" varchar(256),
    "image" varchar(256),

    FOREIGN KEY ("username") REFERENCES "author" ("username")
) ;
