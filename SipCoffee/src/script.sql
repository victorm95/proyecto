
USE Sipcoffee;

CREATE TABLE IF NOT EXISTS Roles(
	Id INT AUTO_INCREMENT ,
	Nombre VARCHAR(30) NOT NULL ,
	PRIMARY KEY(Id)
);


INSERT INTO Roles(Nombre) VALUES('Administrador');

SELECT *FROM Roles;