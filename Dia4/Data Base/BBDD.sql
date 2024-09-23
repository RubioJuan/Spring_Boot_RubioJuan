create database restaurant_management;

use restaurant_management;

-- Crear tabla Plato
CREATE TABLE plato (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    disponibilidad BOOLEAN NOT NULL
);

-- Crear tabla Mesa
CREATE TABLE mesa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_mesa INT NOT NULL UNIQUE,
    ocupada BOOLEAN NOT NULL
);

show tables;