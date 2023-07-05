CREATE SEQUENCE hibernate_sequence start with 1 increment by 1;
INSERT INTO Client(id, name) VALUES (nextval('hibernate_sequence'), 'João');
INSERT INTO Client(id, name) VALUES (nextval('hibernate_sequence'), 'Maria');
INSERT INTO Client(id, name) VALUES (nextval('hibernate_sequence'), 'José');
INSERT INTO Client(id, name) VALUES (nextval('hibernate_sequence'), 'Ana');