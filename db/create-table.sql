GRANT CREATE ON DATABASE "ec-training" TO developer;

CREATE TABLE todo
(
    id serial PRIMARY KEY,
    priority text NOT NULL,
    task text NOT NULL,
    created_at timestamp with time zone NOT NULL DEFAULT now(),
    updated_at timestamp with time zone NOT NULL DEFAULT now()
);
-- Userテーブル

