-- --------------------------------------------------------
-- Host:                         209.222.103.210
-- Versión del servidor:         10.1.31-MariaDB-cll-lve - MariaDB Server
-- SO del servidor:              Linux
-- HeidiSQL Versión:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para rurikkcl_zakaz
CREATE DATABASE IF NOT EXISTS `rurikkcl_zakaz` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rurikkcl_zakaz`;

-- Volcando estructura para tabla rurikkcl_zakaz.Empleados
CREATE TABLE IF NOT EXISTS `Empleados` (
  `nombre` varchar(50) DEFAULT NULL,
  `rut` varchar(50) DEFAULT NULL,
  `fechaNac` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla rurikkcl_zakaz.Empleados: ~5 rows (aproximadamente)
DELETE FROM `Empleados`;
/*!40000 ALTER TABLE `Empleados` DISABLE KEYS */;
INSERT INTO `Empleados` (`nombre`, `rut`, `fechaNac`) VALUES
	('carlos pina', '12343', '2018-04-06'),
	('juan perez', '12345678', '2018-04-14'),
	('rrtkds', 'rk5949', '2017-03-14'),
	('andres perez', '12312312', '2018-04-10'),
	('nombre', '978645', '1990-02-01');
/*!40000 ALTER TABLE `Empleados` ENABLE KEYS */;

-- Volcando estructura para tabla rurikkcl_zakaz.Empresa
CREATE TABLE IF NOT EXISTS `Empresa` (
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `rut` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `encargado` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla rurikkcl_zakaz.Empresa: ~0 rows (aproximadamente)
DELETE FROM `Empresa`;
/*!40000 ALTER TABLE `Empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `Empresa` ENABLE KEYS */;

-- Volcando estructura para tabla rurikkcl_zakaz.Encargos
CREATE TABLE IF NOT EXISTS `Encargos` (
  `idPlanilla` int(11) DEFAULT NULL,
  `producto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla rurikkcl_zakaz.Encargos: ~4 rows (aproximadamente)
DELETE FROM `Encargos`;
/*!40000 ALTER TABLE `Encargos` DISABLE KEYS */;
INSERT INTO `Encargos` (`idPlanilla`, `producto`, `cantidad`) VALUES
	(1, 2, 10),
	(1, 3, 50),
	(1, 6, 15),
	(2, 5, 50);
/*!40000 ALTER TABLE `Encargos` ENABLE KEYS */;

-- Volcando estructura para tabla rurikkcl_zakaz.Locales
CREATE TABLE IF NOT EXISTS `Locales` (
  `nombre` varchar(50) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  `rutEncargado` varchar(50) DEFAULT NULL,
  `nombreEncargado` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla rurikkcl_zakaz.Locales: ~4 rows (aproximadamente)
DELETE FROM `Locales`;
/*!40000 ALTER TABLE `Locales` DISABLE KEYS */;
INSERT INTO `Locales` (`nombre`, `id`, `direccion`, `ciudad`, `rutEncargado`, `nombreEncargado`) VALUES
	('Local1', 2, 'calle 2', 'valpo', '500565', 'nombre1'),
	('Local2', 1, 'calle ql', 'viña', '12345678', 'nombre2'),
	('Local3', 3, 'calle 3', 'quilpue', 'rk5949', 'nombre3'),
	('Local4', 4, 'calle 4', 'melon', 'rk5949', 'nombre4');
/*!40000 ALTER TABLE `Locales` ENABLE KEYS */;

-- Volcando estructura para tabla rurikkcl_zakaz.Planillas
CREATE TABLE IF NOT EXISTS `Planillas` (
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `codigo` int(11) DEFAULT NULL,
  `vehiculo` varchar(50) DEFAULT NULL,
  `conductor` varchar(50) DEFAULT NULL,
  `despacho` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla rurikkcl_zakaz.Planillas: ~1 rows (aproximadamente)
DELETE FROM `Planillas`;
/*!40000 ALTER TABLE `Planillas` DISABLE KEYS */;
INSERT INTO `Planillas` (`fechaInicio`, `fechaFin`, `codigo`, `vehiculo`, `conductor`, `despacho`) VALUES
	('2018-04-16', '2018-04-18', 1, 'xX2345', '12345678', 1);
/*!40000 ALTER TABLE `Planillas` ENABLE KEYS */;

-- Volcando estructura para tabla rurikkcl_zakaz.Productos
CREATE TABLE IF NOT EXISTS `Productos` (
  `id` int(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla rurikkcl_zakaz.Productos: ~10 rows (aproximadamente)
DELETE FROM `Productos`;
/*!40000 ALTER TABLE `Productos` DISABLE KEYS */;
INSERT INTO `Productos` (`id`, `nombre`, `valor`) VALUES
	(6, 'coca cola 2lts', 1200),
	(1, 'choman', 100),
	(7, 'vianesas 20', 2000),
	(2, 'super8', 100),
	(8, 'scotch', 1500),
	(3, 'gancito', 150),
	(9, 'alfajor', 150),
	(4, 'mineral', 500),
	(25, 'thula', 3000),
	(5, 'coca cola 590', 1000);
/*!40000 ALTER TABLE `Productos` ENABLE KEYS */;

-- Volcando estructura para tabla rurikkcl_zakaz.Vehiculos
CREATE TABLE IF NOT EXISTS `Vehiculos` (
  `Marca` varchar(50) DEFAULT NULL,
  `TipoVehiculo` varchar(50) DEFAULT NULL,
  `Modelo` varchar(50) DEFAULT NULL,
  `Patente` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla rurikkcl_zakaz.Vehiculos: ~11 rows (aproximadamente)
DELETE FROM `Vehiculos`;
/*!40000 ALTER TABLE `Vehiculos` DISABLE KEYS */;
INSERT INTO `Vehiculos` (`Marca`, `TipoVehiculo`, `Modelo`, `Patente`) VALUES
	('Chevrolet', 'Furgoneta', 'Mediano', '123456'),
	('Ford', 'Camion', 'Grande', 'xX2345'),
	('Hyundai', 'Camion', 'Chico', 'XX4567'),
	('Kia', 'Moto', 'Np', 'NP7979'),
	('Nissan', 'nya', 'Aje', '132456'),
	('Toyota', 'Japo', 'Piola', 'XL2934'),
	('Mitsubishi', 'Nain', 'rkek43', 'etkgo'),
	('Daihatsu? ', 'JP', 'EK', '1324'),
	('Lexus?', 'Moto', 'Feo', '1235687'),
	('Honda', 'Moto', 'Chico', '132AF'),
	('Marca', 'tipo', 'modelo', 'patente');
/*!40000 ALTER TABLE `Vehiculos` ENABLE KEYS */;

-- Volcando estructura para tabla rurikkcl_zakaz.wea
CREATE TABLE IF NOT EXISTS `wea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cash` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla rurikkcl_zakaz.wea: ~0 rows (aproximadamente)
DELETE FROM `wea`;
/*!40000 ALTER TABLE `wea` DISABLE KEYS */;
INSERT INTO `wea` (`id`, `cash`) VALUES
	(1, 500000);
/*!40000 ALTER TABLE `wea` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
