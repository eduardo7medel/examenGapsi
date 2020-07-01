CREATE DATABASE gapsi;
use gapsi;

CREATE TABLE `gapsi`.`articulo` (
  `id_articulo` VARCHAR(10) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `precio` FLOAT NOT NULL,
  `modelo` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id_articulo`));
