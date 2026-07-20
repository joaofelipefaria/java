CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE account (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    identifier VARCHAR(50) NOT NULL UNIQUE,
    balance NUMERIC(15,2) NOT NULL DEFAULT 0,

    CONSTRAINT fk_account_user
        FOREIGN KEY (user_id)
        REFERENCES users(id)
);

CREATE TABLE operations (
    id BIGSERIAL PRIMARY KEY,

    user_id BIGINT NOT NULL,

    account_origin_id BIGINT,
    account_destiny_id BIGINT,

    type VARCHAR(30) NOT NULL,

    value NUMERIC(15,2) NOT NULL,

    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_operation_user
        FOREIGN KEY (user_id)
        REFERENCES users(id),

    CONSTRAINT fk_operation_origin
        FOREIGN KEY (account_origin_id)
        REFERENCES account(id),

    CONSTRAINT fk_operation_destiny
        FOREIGN KEY (account_destiny_id)
        REFERENCES account(id)
);