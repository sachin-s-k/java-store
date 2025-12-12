CREATE TABLE user_tags (
                           user_id BIGINT NOT NULL,
                           tag_id  INT NOT NULL,

                           CONSTRAINT user_tags_pk
                               PRIMARY KEY (user_id, tag_id),

                           CONSTRAINT user_tags_user_fk
                               FOREIGN KEY (user_id) REFERENCES users(id)
                                   ON DELETE CASCADE,

                           CONSTRAINT user_tags_tag_fk
                               FOREIGN KEY (tag_id) REFERENCES tags(id)
                                   ON DELETE CASCADE
);
