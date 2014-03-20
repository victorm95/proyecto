/*CREATE DATABASE Sipcoffee;*/

USE Sipcoffee;

CREATE TABLE IF NOT EXISTS Rol(
	Id INT AUTO_INCREMENT ,
	Nombre VARCHAR(30) NOT NULL ,
	PRIMARY KEY(Id)
);


INSERT INTO Rol(Nombre) VALUES('Administrador');

SELECT *FROM Rol;