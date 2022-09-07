CREATE TABLE "tags" (

    "tag_id" uuid NOT NULL,
    "article_id" uuid NOT NULL,
    "description" varchar(50) NOT NULL,

    PRIMARY KEY ("tag_id"),
    FOREIGN KEY ("article_id") REFERENCES "articles" ("article_id")

) ;
