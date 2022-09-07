CREATE TABLE "comments" (

    "comment_id" uuid NOT NULL,
    "username" varchar(50) NOT NULL,
    "article_id" uuid NOT NULL,
    "body" text,
    "created_at" timestamp NOT NULL,
    "updated_at" timestamp,

    PRIMARY KEY ("comment_id"),
    FOREIGN KEY ("username") REFERENCES "authors" ("username"),
    FOREIGN KEY ("article_id") REFERENCES "articles" ("article_id")

) ;
