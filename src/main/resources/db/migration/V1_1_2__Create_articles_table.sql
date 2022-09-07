CREATE TABLE "articles" (

    "article_id" uuid NOT NULL,
    "slug" varchar(50) NOT NULL,
    "username" varchar(50) NOT NULL,
    "title" varchar(50) NOT NULL,
    "description" varchar(256) NOT NULL,
    "body" text NOT NULL,
    "created_at" timestamp NOT NULL,
    "updated_at" timestamp,
    "favorited" boolean,
    "favorites_count" int,
    PRIMARY KEY ("article_id"),
    FOREIGN KEY ("username") REFERENCES "authors" ("username")
) ;
