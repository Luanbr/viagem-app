CREATE SEQUENCE book_seq start with 1 increment by 1;

INSERT INTO Client (id, name) VALUES (1, 'João');
INSERT INTO Client (id, name) VALUES (2, 'Maria');
INSERT INTO Client (id, name) VALUES (3, 'José');
INSERT INTO Client (id, name) VALUES (4, 'Ana');
ALTER SEQUENCE client_seq RESTART WITH 5;