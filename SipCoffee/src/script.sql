-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-03-2014 a las 01:06:41
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sipcoffe`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bloque`
--

CREATE TABLE IF NOT EXISTS `bloque` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdTerreno` int(11) NOT NULL,
  `Nombre` varchar(15) NOT NULL,
  `Area` int(11) NOT NULL,
  `RutaImagen` varchar(100) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdTerreno` (`IdTerreno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cafeto`
--

CREATE TABLE IF NOT EXISTS `cafeto` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(20) NOT NULL,
  `CantidadAbono` int(11) NOT NULL,
  `CantidadPesticida` int(11) NOT NULL,
  `DistanciaSurco` int(11) NOT NULL,
  `DistanciaCafeto` int(11) NOT NULL,
  `TiempoSemillero` int(11) NOT NULL,
  `TiempoAlmacigo` int(11) NOT NULL,
  `TiempoGraneo` int(11) NOT NULL,
  `TiempoSoca` int(11) NOT NULL,
  `Proveedor` int(11) NOT NULL,
  `PrimerCosecha` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cosecha`
--

CREATE TABLE IF NOT EXISTS `cosecha` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdParcela` int(11) NOT NULL,
  `IdUsuario` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdParcela` (`IdParcela`),
  KEY `IdUsuario` (`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entradas`
--

CREATE TABLE IF NOT EXISTS `entradas` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdProducto` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Valor` int(11) NOT NULL,
  `Comentarios` varchar(100) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdProducto` (`IdProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nomina`
--

CREATE TABLE IF NOT EXISTS `nomina` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdUsuario` int(11) NOT NULL,
  `IdProceso` int(11) NOT NULL,
  `Tiempo` int(11) NOT NULL,
  `Costo` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdProceso` (`IdProceso`),
  KEY `IdUsuario` (`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parcela`
--

CREATE TABLE IF NOT EXISTS `parcela` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdBloque` int(11) NOT NULL,
  `Activo` bit(1) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Area` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdBloque` (`IdBloque`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `procesos`
--

CREATE TABLE IF NOT EXISTS `procesos` (
  `Id` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(15) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`Id`, `Nombre`) VALUES
(4, 'administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidas`
--

CREATE TABLE IF NOT EXISTS `salidas` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdProducto` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdProducto` (`IdProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siembra`
--

CREATE TABLE IF NOT EXISTS `siembra` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdParcela` int(11) NOT NULL,
  `IdCafeto` int(11) NOT NULL,
  `IdUsuario` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdParcela` (`IdParcela`),
  KEY `IdCafeto` (`IdCafeto`),
  KEY `IdUsuario` (`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `terreno`
--

CREATE TABLE IF NOT EXISTS `terreno` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Municipio` varchar(30) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Area` int(11) NOT NULL,
  `RutaImagen` varchar(100) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdRol` int(11) NOT NULL,
  `Activo` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Documento` bigint(20) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdRol` (`IdRol`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Id`, `IdRol`, `Activo`, `Nombre`, `Documento`, `Direccion`, `Telefono`, `FechaRegistro`) VALUES
(4, 4, 1, 'daver', 234124, 'sdfadffd', 234243, '2014-03-02'),
(5, 4, 1, 'daver', 234124, 'sdfadffd', 234243, '2014-03-02');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bloque`
--
ALTER TABLE `bloque`
  ADD CONSTRAINT `Id_Terreno_Bloque` FOREIGN KEY (`IdTerreno`) REFERENCES `terreno` (`Id`);

--
-- Filtros para la tabla `cosecha`
--
ALTER TABLE `cosecha`
  ADD CONSTRAINT `Id_Usuarios_Parcela` FOREIGN KEY (`IdUsuario`) REFERENCES `usuarios` (`Id`),
  ADD CONSTRAINT `Id_Cosecha_Parcela` FOREIGN KEY (`IdParcela`) REFERENCES `parcela` (`Id`);

--
-- Filtros para la tabla `entradas`
--
ALTER TABLE `entradas`
  ADD CONSTRAINT `Id_Entradas_Producto` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`Id`);

--
-- Filtros para la tabla `nomina`
--
ALTER TABLE `nomina`
  ADD CONSTRAINT `Id_Procesos_Nomina` FOREIGN KEY (`IdProceso`) REFERENCES `procesos` (`Id`),
  ADD CONSTRAINT `Id_Usuarios_Nomina` FOREIGN KEY (`IdUsuario`) REFERENCES `usuarios` (`Id`);

--
-- Filtros para la tabla `parcela`
--
ALTER TABLE `parcela`
  ADD CONSTRAINT `Id_Bloque_Parcela` FOREIGN KEY (`IdBloque`) REFERENCES `bloque` (`Id`);

--
-- Filtros para la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD CONSTRAINT `Id_Salidas_Producto` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`Id`);

--
-- Filtros para la tabla `siembra`
--
ALTER TABLE `siembra`
  ADD CONSTRAINT `Id_Siembra_Usuario` FOREIGN KEY (`IdUsuario`) REFERENCES `usuarios` (`Id`),
  ADD CONSTRAINT `Id_Siembra_Cafeto` FOREIGN KEY (`IdCafeto`) REFERENCES `cafeto` (`Id`),
  ADD CONSTRAINT `Id_Siembra_Parcela` FOREIGN KEY (`IdParcela`) REFERENCES `parcela` (`Id`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `Id_Rol_Usuario` FOREIGN KEY (`IdRol`) REFERENCES `roles` (`Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
