INSERT INTO author (id, last_name, `name`) values(1,'Asimov', 'Isaac');
INSERT INTO author (id, last_name, `name`) values(2, 'Heinlein', 'Robert A.');
INSERT INTO author (id, last_name, `name`) values(3, 'Clarke', 'Arthur C.');
INSERT INTO author (id, last_name, `name`) values(4, 'Niven', 'Larry');
INSERT INTO author (id, last_name, `name`) values(5, 'Herbert', 'Frank');
INSERT INTO author (id, last_name, `name`) values(6, 'Orwell', 'George');
INSERT INTO author (id, last_name, `name`) values(7, 'Cixin', 'Liu');
INSERT INTO author (id, last_name, `name`) values(8, 'Scott Card', 'Orson');
INSERT INTO author (id, last_name, `name`) values(9, 'Vance', 'Jack');
INSERT INTO author (id, last_name, `name`) values(10, 'Sturgeon', 'Theodore');

INSERT INTO genre (id, `name`) values(1,'Ciencia Ficción');
INSERT INTO genre (id, `name`) values(2, 'Novela Policial');
INSERT INTO genre (id, `name`) values(3, 'Historia');
INSERT INTO genre (id, `name`) values(4, 'Suspenso');
INSERT INTO genre (id, `name`) values(5, 'Drama');

INSERT INTO editorial (id, `name`) values(1, 'Planeta');
INSERT INTO editorial (id, `name`) values(2, 'Nebula');
INSERT INTO editorial (id, `name`) values(3, 'Santillana');
INSERT INTO editorial (id, `name`) values(4, 'Salamantra');
INSERT INTO editorial (id, `name`) values(5, 'Barnes&Noble');

INSERT INTO book (id, title, `year`, isbn, author_id, editorial_id, genre_id, edition) values(1, 'Fundación', 1951, '2134314432532', 1, 2, 1, 1);
INSERT INTO book (id, title, `year`, isbn, author_id, editorial_id, genre_id, edition) values(2, 'Fundación e Imperio', 1952, '2134314432532', 1, 2, 1, 1);
INSERT INTO book (id, title, `year`, isbn, author_id, editorial_id, genre_id, edition) values(3, 'Segunda Fundación', 1953, '2134314432532', 1, 2, 1, 1);
INSERT INTO book (id, title, `year`, isbn, author_id, editorial_id, genre_id, edition) values(4, 'Mundo Anillo', 1970, '2134314432532', 4, 2, 1, 1);
INSERT INTO book (id, title, `year`, isbn, author_id, editorial_id, genre_id, edition) values(5, '1984', 1948, '2134314432532', 6, 2, 1, 1);


