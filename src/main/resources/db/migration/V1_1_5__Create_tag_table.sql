CREATE TABLE "tag" (

    "tag_id" int NOT NULL PRIMARY KEY,
    "article_id" int NOT NULL,
    "description" varchar(50) NOT NULL,

    FOREIGN KEY ("article_id") REFERENCES "article" ("article_id")

) ;
