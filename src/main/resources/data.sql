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

INSERT INTO genero (nombre) values('Ciencia Ficción');
INSERT INTO genero (nombre) values('Novela Policial');
INSERT INTO genero (nombre) values('Historia');
INSERT INTO genero (nombre) values('Suspenso');
INSERT INTO genero (nombre) values('Drama');

INSERT INTO editorial (nombre) values('Planeta');
INSERT INTO editorial (nombre) values('Nebula');
INSERT INTO editorial (nombre) values('Santillana');
INSERT INTO editorial (nombre) values('Salamantra');
INSERT INTO editorial (nombre) values('Barnes&Noble');

INSERT INTO libro (titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values('Fundación', 1951, '2134314432532', 1, 2, 1, 1);
INSERT INTO libro (titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values('Fundación e Imperio', 1952, '2134314432532', 1, 2, 1, 1);
INSERT INTO libro (titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values('Segunda Fundación', 1953, '2134314432532', 1, 2, 1, 1);
INSERT INTO libro (titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values('Mundo Anillo', 1970, '2134314432532', 4, 2, 1, 1);
INSERT INTO libro (titulo, `year`, isbn, autor_id, editorial_id, genero_id, edicion) values('1984', 1948, '2134314432532', 6, 2, 1, 1);


