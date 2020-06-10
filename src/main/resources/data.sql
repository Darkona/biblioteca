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
INSERT INTO `author` (`last_name`,`name`) VALUES ('Lamb','Garth'),('Ewing','Clio'),('Olson','Ramona'),('Steele','Ulric'),('Arnold','Martena'),('Fuentes','Hilda'),('Ortega','Harper'),('Mccarty','Autumn'),('Donovan','Kareem'),('Wells','Lysandra');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Wheeler','Branden'),('Benson','Axel'),('Rodriquez','Briar'),('Emerson','Yardley'),('Berry','Abraham'),('Gallegos','Helen'),('Pope','Asher'),('Hughes','Dane'),('Haney','Skyler'),('Oneill','Quinlan');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Cotton','Elizabeth'),('Martin','Galena'),('Rollins','Nasim'),('Page','Nora'),('Buckley','Maggie'),('Scott','Virginia'),('Nicholson','Chava'),('Phelps','Vance'),('Velazquez','Buckminster'),('Roman','Suki');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Kent','Perry'),('Schroeder','Signe'),('Gamble','Mariam'),('Brewer','Theodore'),('Chan','Melissa'),('Rosales','Maisie'),('Conner','Jin'),('Lang','Macey'),('Franco','Yuli'),('Carpenter','Charity');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Gibson','Nathaniel'),('Mclaughlin','Winifred'),('Maddox','Myles'),('Mejia','Emery'),('Armstrong','Justine'),('Soto','Hammett'),('Small','Ursa'),('Pace','Dieter'),('Hamilton','Hedley'),('Clayton','Tanek');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Stevens','Wallace'),('Gonzales','Abbot'),('Mason','Giacomo'),('Fuentes','Noelle'),('Lang','Charles'),('Burnett','Travis'),('Lucas','Liberty'),('Farley','Alexandra'),('Goodman','Frances'),('Leonard','Nelle');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Sweeney','Daquan'),('Hamilton','Noah'),('Bray','Dillon'),('Beck','Demetria'),('Hensley','Violet'),('Smith','Rafael'),('Wiley','Jameson'),('Greene','Sydney'),('Hughes','Chaney'),('Morton','Arden');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Maldonado','Olga'),('Rodriguez','Suki'),('Odonnell','Nero'),('Kinney','Oscar'),('Castillo','Adele'),('Ortega','MacKenzie'),('Cantrell','Phillip'),('Bowman','Maryam'),('Sykes','Nolan'),('Clayton','Rae');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Chapman','Upton'),('Steele','Pearl'),('Mayo','Rahim'),('Higgins','Yuli'),('Ryan','Craig'),('Burks','Garrison'),('Santana','Karen'),('Mills','Martin'),('Pitts','Yen'),('Marks','Len');
INSERT INTO `author` (`last_name`,`name`) VALUES ('Skinner','Kirsten'),('Kerr','Whitney'),('Odom','Hilary'),('Chaney','Oleg'),('Howe','Keaton'),('Rojas','Deacon'),('Hart','Elliott'),('Ellison','Juliet'),('Douglas','Gil'),('Navarro','Jeremy');

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


