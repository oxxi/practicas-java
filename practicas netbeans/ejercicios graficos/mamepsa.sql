-- phpMyAdmin SQL Dump
-- version 4.0.3
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-08-2013 a las 07:37:25
-- Versión del servidor: 5.6.12-log
-- Versión de PHP: 5.5.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `mamepsa`
--
CREATE DATABASE IF NOT EXISTS `mamepsa` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `mamepsa`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `cif` varchar(15) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `tfno1` varchar(15) DEFAULT NULL,
  `tfno2` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`cif`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cif`, `nombre`, `direccion`, `tfno1`, `tfno2`) VALUES
('12345678-A', 'Cliente 2', 'C/direccio', '956344384', '956344345'),
('12345678-B', 'Cliente', 'C/Ancha 2', '956344334', '956344334'),
('B11223212', 'Seguros Segasa', 'C/Ancha 2', '956344334', '956344332'),
('B22334466', 'Academia la plata', 'C/direccion', '985746785', '8798445689');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coches`
--

CREATE TABLE IF NOT EXISTS `coches` (
  `matricula` varchar(10) NOT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `anio` int(11) DEFAULT NULL,
  `dni` varchar(15) NOT NULL,
  PRIMARY KEY (`matricula`,`dni`),
  KEY `fk_Coches_Trabajadores1_idx` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `coches`
--

INSERT INTO `coches` (`matricula`, `marca`, `modelo`, `anio`, `dni`) VALUES
('3322-ASR', 'SEAT', 'Ibiza', 2000, '21.123.123-A'),
('4433-ABB', 'CITROEN', 'Saxo', 2002, '12.321.567-B');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE IF NOT EXISTS `servicios` (
  `numero` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `comentarios` varchar(45) DEFAULT NULL,
  `dni` varchar(15) NOT NULL,
  `cif` varchar(15) NOT NULL,
  PRIMARY KEY (`numero`,`dni`,`cif`),
  KEY `fk_Servicios_Trabajadores_idx` (`dni`),
  KEY `fk_Servicios_Clientes1_idx` (`cif`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`numero`, `fecha`, `tipo`, `cantidad`, `comentarios`, `dni`, `cif`) VALUES
(1, '2013-08-01', 'limpieza', 300, 'nooo', '21.123.123-A', 'B11223212'),
(2, '2013-08-02', 'fontaneria', 238, 'Arreglo tuberia', '21.123.123-A', 'B11223212'),
(3, '2013-08-03', 'Electricidad', 130, 'revision cableado', '21.123.123-A', 'B22334466'),
(4, '2013-08-04', 'Fontaneria', 250, 'sdsd', '12.321.567-B', 'B11223212');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajadores`
--

CREATE TABLE IF NOT EXISTS `trabajadores` (
  `dni` varchar(15) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `sueldo` double DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `matricula` varchar(10) NOT NULL,
  PRIMARY KEY (`dni`),
  KEY `matricula` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `trabajadores`
--

INSERT INTO `trabajadores` (`dni`, `nombre`, `apellido`, `sueldo`, `fecha`, `matricula`) VALUES
('11.111.111-A', 'Maria', 'Ruiz', 1100, '2013-08-01', '4433-RET'),
('12.321.567-B', 'Juan', 'Perez', 1120, '2013-08-14', '4433-ABB'),
('21.123.123-A', 'Ana', 'Ruiz', 1200, '2013-08-01', '3322-ASR'),
('22.222.222-B', 'Pedro', 'Marin', 2050, '2013-08-07', '4455-DET'),
('33.333.133-B|', 'pablo', 'marmol', 5214, '2012-04-01', '1144-DES'),
('33.333.332-B', 'Carol', 'Marmol', 1230, '2013-08-02', '8866-TYS'),
('33.333.333-B', 'Pablo', 'Marmol', 1230, '2013-08-02', '8866-TYS'),
('55.555.555-A', 'Nombre', 'Apellido', 2050, '2013-08-09', '5566-SET'),
('55.666.666-A', 'Luis', 'Ruiz', 2015, '2013-08-12', '1144-CSD'),
('88.888.999-A', 'Daniela', 'Centeno', 5000, '2013-05-12', '4879-WSD');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `coches`
--
ALTER TABLE `coches`
  ADD CONSTRAINT `fk_Coches_Trabajadores1` FOREIGN KEY (`dni`) REFERENCES `trabajadores` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD CONSTRAINT `fk_Servicios_Clientes1` FOREIGN KEY (`cif`) REFERENCES `clientes` (`cif`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Servicios_Trabajadores` FOREIGN KEY (`dni`) REFERENCES `trabajadores` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
