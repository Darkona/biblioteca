INSERT INTO autor (id, apellido, nombre) values(1,'Asimov', 'Isaac');
INSERT INTO autor (id, apellido, nombre) values(2, 'Heinlein', 'Robert A.');
INSERT INTO autor (id, apellido, nombre) values(3, 'Clarke', 'Arthur C.');
INSERT INTO autor (id, apellido, nombre) values(4, 'Niven', 'Larry');
INSERT INTO autor (id, apellido, nombre) values(5, 'Herbert', 'Frank');
INSERT INTO autor (id, apellido, nombre) values(6, 'Orwell', 'George');
INSERT INTO autor (id, apellido, nombre) values(7, 'Cixin', 'Liu');
INSERT INTO autor (id, apellido, nombre) values(8, 'Scott Card', 'Orson');
INSERT INTO autor (id, apellido, nombre) values(9, 'Vance', 'Jack');
INSERT INTO autor (id, apellido, nombre) values(10, 'Sturgeon', 'Theodore');

INSERT INTO genero (id, nombre) values(1,'Ciencia Ficción');
INSERT INTO genero (id, nombre) values(2, 'Novela Policial');
INSERT INTO genero (id, nombre) values(3, 'Historia');
INSERT INTO genero (id, nombre) values(4, 'Suspenso');
INSERT INTO genero (id, nombre) values(5, 'Drama');

INSERT INTO editorial (id, nombre) values(1, 'Planeta');
INSERT INTO editorial (id, nombre) values(2, 'Nebula');
INSERT INTO editorial (id, nombre) values(3, 'Santillana');
INSERT INTO editorial (id, nombre) values(4, 'Salamantra');
INSERT INTO editorial (id, nombre) values(5, 'Barnes&Noble');

INSERT INTO libro (id, titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values(1, 'Fundación', 1951, '2134314432532', 1, 2, 1, 1);
INSERT INTO libro (id, titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values(2, 'Fundación e Imperio', 1952, '2134314432532', 1, 2, 1, 1);
INSERT INTO libro (id, titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values(3, 'Segunda Fundación', 1953, '2134314432532', 1, 2, 1, 1);
INSERT INTO libro (id, titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values(4, 'Mundo Anillo', 1970, '2134314432532', 4, 2, 1, 1);
INSERT INTO libro (id, titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values(5, '1984', 1948, '2134314432532', 6, 2, 1, 1);


