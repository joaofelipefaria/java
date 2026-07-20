INSERT INTO users (name, role)
VALUES
    ('John Lennon', 'ADMIN'),
    ('Paul McCartney', 'CUSTOMER'),
    ('George Harrison', 'CUSTOMER');

INSERT INTO account (user_id, identifier, balance)
VALUES
    (1, 'ACC-0001', 10000.00),
    (2, 'ACC-0002', 2500.00),
    (3, 'ACC-0003', 500.00);