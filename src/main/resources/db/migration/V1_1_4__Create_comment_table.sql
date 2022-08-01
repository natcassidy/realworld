CREATE TABLE "comment" (

    "comment_id" int NOT NULL,
    "username" varchar(50) NOT NULL,
    "article_id" int NOT NULL,
    "body" text,
    "created_at" timestamp NOT NULL,
    "updated_at" timestamp,

    FOREIGN KEY ("username") REFERENCES "author" ("username"),
    FOREIGN KEY ("article_id") REFERENCES "article" ("article_id")

) ;
