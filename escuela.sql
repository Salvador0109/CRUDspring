-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-06-2023 a las 06:18:30
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `escuela`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_alumno`
--

CREATE TABLE IF NOT EXISTS `tbl_alumno` (
  `activo` bit(1) DEFAULT NULL,
`id_alumno` int(11) NOT NULL,
  `ap_materno` varchar(255) DEFAULT NULL,
  `ap_paterno` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_alumno`
--

INSERT INTO `tbl_alumno` (`activo`, `id_alumno`, `ap_materno`, `ap_paterno`, `nombre`) VALUES
(b'1', 1, 'Sanchez', 'Vera', 'Salvador'),
(b'0', 2, 'Paz', 'Hernandez', 'Juan'),
(b'0', 3, 'Rios', 'Gonzalez', 'Francisco'),
(b'1', 4, 'Campos', 'Campos', 'Pedro'),
(b'1', 6, 'Garcia', 'Herrera', 'Andrade'),
(b'1', 10, 'Juarez', 'Velazquez', 'Gustavo'),
(b'0', 11, 'Ramos', 'Nava', 'Francisco'),
(b'0', 12, 'Hernandez', 'Rosas', 'Alejandro'),
(b'0', 13, 'Diaz', 'Hernandez', 'Antonio'),
(b'1', 14, 'Flores', 'Garcia', 'Omar'),
(b'0', 15, 'Ramos', 'Huerta', 'Sergio'),
(b'1', 16, 'Romero', 'Aguilar', 'Ruben'),
(b'0', 17, 'Tapia', 'Hernandez', 'Carlos'),
(b'1', 18, 'Juarez', 'Coronado', 'Arturo'),
(b'0', 20, 'Cardenas', 'Ibarra', 'David'),
(b'0', 21, 'Ramos', 'Juarez', 'Juan');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_alumno`
--
ALTER TABLE `tbl_alumno`
 ADD PRIMARY KEY (`id_alumno`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_alumno`
--
ALTER TABLE `tbl_alumno`
MODIFY `id_alumno` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
