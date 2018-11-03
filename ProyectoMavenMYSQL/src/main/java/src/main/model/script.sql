CREATE DATABASE bd_usuarios;

USE bd_usuarios;

CREATE TABLE usuario(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    correo VARCHAR(100),
    PRIMARY KEY(id)
);

INSERT INTO usuario VALUES(NULL, 'Prueba esto', 'preuab@gmail.com');
INSERT INTO usuario VALUES (NULL, 'Marcelo' 'cheloz_20@hotmail.com');

SELECT * FROM usuario;

CREATE USER 'hueuser'@'localhost' IDENTIFIED BY '';
GRANT ALL ON bd_usuarios.* TO 'hueuser'@'localhost';
