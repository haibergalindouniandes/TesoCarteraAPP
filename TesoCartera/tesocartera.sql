-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-10-2015 a las 02:33:37
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `tesocartera`
--

USE tesocartera;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` varchar(12) NOT NULL,
  `tipo_identificacion` varchar(4) NOT NULL,
  `nombre_cliente` varchar(40) NOT NULL,
  `direccion_cliente` varchar(60) NOT NULL,
  `telefono_cliente` varchar(20) NOT NULL,
  `email_cliente` varchar(50) NOT NULL,
  `id_cod_postal` int(11) NOT NULL,
  `id_poblacion_cliente` int(11) NOT NULL,
  `id_provincia_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `tipo_identificacion`, `nombre_cliente`, `direccion_cliente`, `telefono_cliente`, `email_cliente`, `id_cod_postal`, `id_poblacion_cliente`, `id_provincia_cliente`) VALUES
('8000008192', 'C.C', 'CALRIANT', 'IBAGUE ', '469000', 'analista@clariant.com', 2, 1, 1),
('800018488-1', 'NIT', 'AGROZ S.A', 'KM 1 VIA ESPINAL IBAGUE', '2485584', 'agroz@fedearroz.com', 2, 1, 1),
('800087795-0', 'NIT', 'Dow Agrociencies De Colombia SA', 'Mamonal Km 14 Zona Industrial', '956688087', 'mesalina@dow.com', 2, 2, 3),
('815004945-0', 'NIT', 'PHYTOCARE SAS', 'CL 64 NORTE 5B NO. 146-306', '3902050', 'PHYTOCARE@PHYTOCAREGROU.COM', 2, 2, 11),
('830127647-0', 'NIT', 'CHEMINOVA AGRO COLOMBIA', 'Cl 108 45 30 Of 1004 1005 To 2', '6361247 / 6571900', 'contact@cheminova.com.co', 2, 2, 2),
('860010522-0', 'NIT', 'FEDERACION NACIONAL DE ARROCEROS', 'Cr 100 25H 55', '4251150 / 4252028', 'contabilidad@fedearroz.com.co', 2, 2, 10),
('860037777-0', 'NIT', 'ISAGRO COLOMBIA S.A', 'Km 1 Via Siberia Cota Par Empresarial Los Robles Iv Bg 1', '7457333', 'contabilidad@isagrocolombia.com', 2, 2, 9),
('890100363-0', 'NIT', 'LABORATORIOS COFARMA', 'Cra 43 No. 54-14', '3716842', 'servicio.cliente@cofarma.com', 2, 2, 10),
('900527664', 'NIT', 'AVGUST COLOMBIA SAS', 'AV CRA 15 124-17TB', '3155962817', 'insumos@avgust.com.co', 2, 2, 7),
('900804080-5', 'NIT', 'SUMMIT AGROZ ', 'Calle 113 No 7-21 Oficina 1111', '4847000', 'ushio.nakagawa@sumitomocorp.com', 2, 2, 9),
('prueba', 'NIT', 'prueba', 'prueba', '213165', 'prueba', 2, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `codigo_postal`
--

CREATE TABLE IF NOT EXISTS `codigo_postal` (
`id_cod_postal` int(11) NOT NULL,
  `nombre_pais` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `codigo_postal`
--

INSERT INTO `codigo_postal` (`id_cod_postal`, `nombre_pais`) VALUES
(1, 'ARGENTINA'),
(2, 'COLOMBIA'),
(3, 'CHILE'),
(4, 'ECUADOR'),
(5, 'VENEZUELA'),
(6, 'URUGUAY'),
(7, 'ALEMANIA'),
(8, 'AUSTRALIA'),
(9, 'BOLIVIA'),
(10, 'BRAZIL'),
(11, 'CANADA'),
(12, 'JAPON'),
(13, 'CHINA'),
(14, 'GUATEMALA'),
(15, 'HONDURAS'),
(16, 'MEXICO MOD'),
(17, 'JAPAN'),
(18, 'COSTA RICA'),
(19, 'NICARAGUA'),
(20, 'REPUBLICA DOMINICANA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_devolucion_stock`
--

CREATE TABLE IF NOT EXISTS `detalle_devolucion_stock` (
`id_detalle_devolucion` int(11) NOT NULL,
  `id_devolucion` int(11) NOT NULL,
  `id_producto` varchar(10) NOT NULL,
  `catidad_producto` decimal(10,2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_devolucion_stock`
--

INSERT INTO `detalle_devolucion_stock` (`id_detalle_devolucion`, `id_devolucion`, `id_producto`, `catidad_producto`) VALUES
(3, 3, 'AMPAJ0145', '79.00'),
(4, 4, 'COFPT0009', '2.00'),
(5, 5, 'AMPAJ0145', '10.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_factura`
--

CREATE TABLE IF NOT EXISTS `detalle_factura` (
`id_detalle_factura` int(11) NOT NULL,
  `id_factura` int(11) NOT NULL,
  `id_producto` varchar(10) NOT NULL,
  `cantidad_producto` decimal(10,2) NOT NULL,
  `total` decimal(12,2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_factura`
--

INSERT INTO `detalle_factura` (`id_detalle_factura`, `id_factura`, `id_producto`, `cantidad_producto`, `total`) VALUES
(1, 1, 'PHYME0001', '1000.00', '200000.99'),
(2, 1, 'PHYME0005', '8.00', '800000.55'),
(3, 2, 'COFPT0009', '4992.00', '18370560.45'),
(4, 2, 'COFPT0017', '2004.00', '10420800.00'),
(5, 3, 'AMPAJ0145', '150.00', '270068.63'),
(6, 3, 'AMPAJ0146', '80.00', '184000.00'),
(7, 3, 'AMPAJ0148', '400.00', '1292160.22'),
(8, 3, 'AMPAZ0006', '6000.00', '9600000.00'),
(9, 3, 'AMPED0003', '200.00', '960000.00'),
(10, 1, 'AGVME0707', '5000.00', '650000.00'),
(11, 5, ' GENPT0020', '4800.00', '62400000.00'),
(12, 5, 'AMPAJ0145', '150.00', '277500.00'),
(13, 5, 'AMPAJ0146', '160.00', '420800.00'),
(14, 5, 'AMPAZ0006', '1500.00', '2400000.00'),
(15, 6, 'AGPT0119', '855.00', '4275000.00'),
(16, 6, 'AMPAJ0146', '200.00', '526000.00'),
(18, 4, 'AMPAJ0145', '1000.00', '1850000.00'),
(19, 4, 'AMPAJ0145', '200.00', '370000.00'),
(21, 4, 'AGVME0707', '63.00', '8190.00'),
(22, 4, 'PHYME0006', '600.00', '372000.00'),
(23, 4, 'PHYME0005', '10.00', '130000.00'),
(24, 4, 'AMPAJ0146', '80.00', '210.40'),
(25, 4, 'AMPAJ0146', '100.00', '263.00'),
(26, 1, 'AMPAJ0145', '150.00', '277500.00'),
(27, 1, 'AMPAJ0145', '150.00', '277500.00'),
(28, 1, 'PHYME0006', '10.00', '6200.00'),
(29, 1, 'COFMP0018', '80.00', '192000.00'),
(30, 1, 'PHYME0004', '20.00', '530000.00'),
(31, 1, 'AGPT0119', '150.00', '750000.00'),
(32, 1, 'PHYME0005', '0.53', '6890.00'),
(33, 1, 'GENME0012', '48.00', '57600.00'),
(35, 3, 'AMPAJ0146', '160.00', '420800.00'),
(37, 3, 'AMPAJ0146', '80.00', '210400.00'),
(40, 2, 'AMPAJ0146', '80.00', '210400.00'),
(41, 2, 'AMPAJ0145', '150.00', '277500.00'),
(42, 2, 'GENPT0010', '100.00', '330000.00'),
(44, 7, ' GENPT0020', '15551.00', '202163000.00'),
(45, 7, 'AMPAJ0145', '798.00', '1476300.00'),
(46, 7, 'GENME0123', '1000.00', '900000.00'),
(47, 8, ' GENPT0020', '4800.00', '62400000.00'),
(48, 8, 'AGVME0707', '5000.00', '650000.00'),
(49, 8, 'AMPAJ0145', '150.00', '277500.00'),
(51, 8, 'PHYME0004', '10.00', '265000.00'),
(52, 8, 'AGVME0707', '900.00', '117000.00'),
(53, 8, 'GENPT0011', '98.00', '509600.00'),
(54, 8, 'PHYME0004', '190.00', '5035000.00'),
(55, 7, 'COFPT0017', '2004.00', '10623183.96');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedido`
--

CREATE TABLE IF NOT EXISTS `detalle_pedido` (
`id_detalle_pedido` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
  `id_producto` varchar(10) NOT NULL,
  `cantidad_producto` decimal(10,2) NOT NULL,
  `precio_pedido_producto` decimal(12,2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_pedido`
--

INSERT INTO `detalle_pedido` (`id_detalle_pedido`, `id_pedido`, `id_producto`, `cantidad_producto`, `precio_pedido_producto`) VALUES
(1, 2, 'PHYME0001', '249.00', '251.00'),
(2, 2, 'PHYME0004', '100.00', '25560.00'),
(8, 3, 'GENPT0011', '12000.00', '5120.00'),
(9, 3, ' GENPT0020', '500.00', '12560.00'),
(12, 4, 'AGVME0707', '2000.00', '111.00'),
(13, 5, 'AMPAJ0145', '300.00', '1800.45'),
(14, 5, 'AMPAJ0146', '160.00', '2300.00'),
(15, 5, 'AMPAZ0006', '240.00', '1580.36'),
(16, 5, 'AMPED0003', '5578.00', '4590.00'),
(17, 5, 'AMPAJ0148', '800.00', '3230.40');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devolucion_stock`
--

CREATE TABLE IF NOT EXISTS `devolucion_stock` (
`id_devolucion` int(11) NOT NULL,
  `fecha_devolucion` date NOT NULL,
  `observaciones` text NOT NULL,
  `id_factura` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `devolucion_stock`
--

INSERT INTO `devolucion_stock` (`id_devolucion`, `fecha_devolucion`, `observaciones`, `id_factura`) VALUES
(3, '2015-10-07', 'se devolvio por fecha de vencimiento', 2),
(4, '2015-10-07', 'se devuleven dos unidades por daño', 2),
(5, '2015-10-07', 'llegaron 10 kilos de producto vencido', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE IF NOT EXISTS `facturas` (
`id_factura` int(11) NOT NULL,
  `num_factura` varchar(8) DEFAULT NULL,
  `forma_pago` varchar(15) NOT NULL,
  `fecha_factura` date NOT NULL,
  `subtotal_factura` decimal(12,2) NOT NULL,
  `cuota_iva_factura` int(2) NOT NULL,
  `descuento_factura` int(2) NOT NULL,
  `total_factura` decimal(12,2) NOT NULL,
  `id_cliente` varchar(12) NOT NULL,
  `observaciones` text NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`id_factura`, `num_factura`, `forma_pago`, `fecha_factura`, `subtotal_factura`, `cuota_iva_factura`, `descuento_factura`, `total_factura`, `id_cliente`, `observaciones`) VALUES
(1, '03336', 'EFECTIVO', '2015-08-01', '3747691.54', 16, 0, '4347322.19', '830127647-0', 'ninguna'),
(2, '000036', 'EFECTIVO', '2015-05-05', '29609260.45', 16, 12, '30793630.87', '8000008192', 'ninguna'),
(3, '', 'EFECTIVO', '2015-07-31', '12937428.85', 16, 0, '15007417.47', '900804080-5', 'ninguna'),
(4, '', 'EFECTIVO', '2015-09-03', '2730663.40', 16, 0, '3167569.54', '800018488-1', 'probando modificacion factura'),
(5, '6699', 'EFECTIVO', '2015-10-31', '65498300.00', 16, 0, '75978028.00', '900527664', 'ninguna'),
(6, '', 'EFECTIVO', '2015-10-31', '4801000.00', 16, 0, '5569160.00', '860037777-0', 'ninguna'),
(7, '789', 'EFECTIVO', '2015-06-16', '215162483.96', 16, 0, '249588481.39', '815004945-0', 'ninguna'),
(8, '', 'EFECTIVO', '2015-08-14', '69254100.00', 16, 0, '80334756.00', '8000008192', 'ninguna');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
`id_pedido` int(11) NOT NULL,
  `id_cliente` varchar(12) NOT NULL,
  `num_pedido` varchar(8) NOT NULL,
  `total_pedido` decimal(12,2) NOT NULL,
  `fecha_pedido` date NOT NULL,
  `observaciones` text
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_cliente`, `num_pedido`, `total_pedido`, `fecha_pedido`, `observaciones`) VALUES
(2, '815004945-0', 'REMISION', '2618499.00', '2015-09-23', 'los productos se reciben en perfecto estado'),
(3, '830127647-0', 'RE-00000', '12424000.00', '2015-09-19', 'corte de mes '),
(4, '900527664', 'RE-00002', '2269100.00', '2015-10-02', 'PARA PRODUCCION DE CIPEMETRINA'),
(5, '860010522-0', 'FA 00012', '29474761.40', '2015-08-26', 'PARA FACTURAR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `poblacion`
--

CREATE TABLE IF NOT EXISTS `poblacion` (
`id_poblacion` int(11) NOT NULL,
  `nombre_poblacion` varchar(30) NOT NULL,
  `id_codigo_postal` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `poblacion`
--

INSERT INTO `poblacion` (`id_poblacion`, `nombre_poblacion`, `id_codigo_postal`) VALUES
(1, 'TOLIMA', 2),
(2, 'CUNDINAMARCA', 2),
(3, 'VALLE DEL CAUCA', 2),
(4, 'CHOCO', 2),
(5, 'HUILA', 2),
(6, 'AMAZONAS', 2),
(7, 'BOYACA', 2),
(8, 'SUCRE', 2),
(9, 'CALDAS', 2),
(10, 'CESAR', 2),
(11, 'NORTE DE SANTANDER', 2),
(13, 'LA GUAJIRA', 2),
(14, 'BOLIVAR', 2),
(15, 'CHOCO', 2),
(16, 'RISARALDA', 2),
(17, 'ARAUCA', 2),
(18, 'VICHADA', 2),
(21, 'PRUEBA1', 1),
(22, 'PRUEBA', 10),
(23, 'QUITO', 4),
(24, 'pepito', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `id_producto` varchar(10) NOT NULL,
  `cod_barras_producto` varchar(20) DEFAULT NULL,
  `referencia_producto` varchar(20) DEFAULT NULL,
  `referencia_producto_cliente` varchar(20) DEFAULT NULL,
  `descripcion_producto` varchar(40) NOT NULL,
  `stock_inicial` decimal(10,2) NOT NULL,
  `stock_actual` decimal(10,2) NOT NULL,
  `precio_producto` decimal(12,2) NOT NULL,
  `precio_venta_producto` decimal(12,2) NOT NULL,
  `categoria_producto` varchar(3) NOT NULL,
  `unidad_medida` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `cod_barras_producto`, `referencia_producto`, `referencia_producto_cliente`, `descripcion_producto`, `stock_inicial`, `stock_actual`, `precio_producto`, `precio_venta_producto`, `categoria_producto`, `unidad_medida`) VALUES
(' GENPT0020', NULL, NULL, '40109584', 'CIPERMETRINA 15% *20ML', '4800.00', '4800.00', '12560.89', '13000.00', 'PT', 'UNI'),
('AGPT0119', NULL, NULL, NULL, ' AMITRAZ E.C 20.8% FCO X 500ML (2)', '1258.00', '1200.00', '4732.56', '5000.00', 'PT', 'UNI'),
('AGVME0707', 'dsfsdf', 'fdsfsf', 'fsdfsdaf', ' ACTIVADOR PARA AEROSOL (1)', '379856.00', '379856.00', '110.03', '130.00', 'ME', 'UNI'),
('AMPAJ0145', NULL, 'FEDMP0015', 'AMPAJ0145', 'SAL CALCICA AL 70%', '0.00', '150.00', '1800.45', '1850.00', 'MP', 'KG'),
('AMPAJ0146', NULL, 'FEDMP0012', 'AMPAJ0146', 'TERGITOL XD', '0.00', '80.00', '2530.00', '2630.00', 'MP', 'KG'),
('AMPAJ0148', NULL, 'FEDMP0003', 'AMPAJ0148', 'OXADIAZON TECNICO', '0.00', '400.00', '3230.40', '0.00', 'MP', 'KG'),
('AMPAZ0006', '', 'FEDMP0001', 'AMPAZ0006', 'ARKOPAL-N100', '0.00', '120.00', '1580.36', '1600.00', 'MP', 'KG'),
('AMPED0003', NULL, 'FEDMP0016', 'AMPED0003', 'SOLVESSO 150 BRENNTAG', '0.00', '2789.00', '4590.00', '4800.00', 'MP', 'KG'),
('COFMP0005', NULL, '125/00022', '99820', 'D-ALETRIN', '0.00', '500.00', '850.00', '900.00', 'MP', 'KG'),
('COFMP0006', NULL, '125/00030', '990822', 'D-TETRAMETRIN', '0.00', '10000.00', '1520.00', '1550.00', 'MP', 'KG'),
('COFMP0008', NULL, '125/00012', '99815', 'ENMASCARANTE DE OLOR KV-1191', '2.00', '502.00', '520.00', '600.00', 'MP', 'KG'),
('COFMP0018', NULL, '125/00045', '99833', 'PHENOTHRIN', '0.00', '80.00', '2300.00', '2400.00', 'MP', 'KG'),
('COFMP0023', NULL, '125/00010', '99819', 'SPAN 80', '0.00', '200.00', '963.00', '1000.00', 'MP', 'KG'),
('COFPT0009', NULL, NULL, NULL, 'RAYOL MATATODO * 400ML', '0.00', '4992.00', '3680.00', '3752.56', 'PT', 'UNI'),
('COFPT0017', NULL, NULL, NULL, 'RAYOL MAT REPUESTOS', '0.00', '2004.00', '5200.00', '5300.99', 'PT', 'UNI'),
('EJEMPLO', '', '', '', 'EJEMPLO', '0.00', '1230.00', '678.00', '800.00', 'MP', 'KG'),
('GENME0012', '10222221111', '', '4000999', 'CAJA PAREX * 10FCOS * 20 ML', '10586.00', '9800.00', '1125.36', '1200.00', 'ME', 'UNI'),
('GENME0123', NULL, NULL, '4001677', 'FRASCO  VID AMBAR 120ML BOCA 28MM PILFER', '89568.00', '89568.00', '723.00', '900.00', 'ME', 'UNI'),
('GENPT0010', NULL, NULL, '4001415', 'AMITRAZ 20,8% X 20 ML', '48720.00', '48720.00', '3258.00', '3300.00', 'PT', 'UNI'),
('GENPT0011', NULL, NULL, '4003871', 'CIPERMETRINA 15% *120ML', '9892.00', '9892.00', '5120.63', '5200.00', 'PT', 'UNI'),
('PHYME0001', '11111111', '123/4566', 'ETIPHYTOCARE00000010', 'ETIQUETA QUON', '10000.00', '10000.00', '250.00', '300.00', 'ME', 'UNI'),
('PHYME0004', '0111000111', '134/9090', 'MPPHYTOCARE000002', 'LAMDACIALOTINA * 200LT', '193.60', '193.60', '25560.00', '26500.00', 'MP', 'KG'),
('PHYME0005', '000001000001', '567/2347', 'MPPHYTOCARE00000100', 'TREUX * 17KG', '0.53', '0.53', '12560.00', '13000.00', 'MP', 'KG'),
('PHYME0006', '01001011001', '123/8200', 'MEPHYTOCARE0000011', 'TAPA * 60 LISA', '10.00', '10.00', '530.00', '620.00', 'ME', 'UNI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincia`
--

CREATE TABLE IF NOT EXISTS `provincia` (
`id_provincia` int(11) NOT NULL,
  `nombre_provincia` varchar(30) NOT NULL,
  `id_poblacion` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `provincia`
--

INSERT INTO `provincia` (`id_provincia`, `nombre_provincia`, `id_poblacion`) VALUES
(1, 'ESPINAL', 1),
(2, 'SALDAÑA', 1),
(3, 'GUAMO', 1),
(4, 'PURIFICACION', 1),
(5, 'GIRARDOT', 2),
(6, 'SIMON BOLIVAR', 2),
(7, 'SUBA RINCON', 2),
(8, 'CIUDAD KENEDY', 2),
(9, 'SIVERIA', 2),
(10, 'FONTIBON', 2),
(11, 'IBAGUE', 1),
(12, 'BOSA CAÑISA MOD', 7),
(13, 'GUAMO', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` varchar(12) NOT NULL,
  `tipo_identificacion` varchar(4) DEFAULT NULL,
  `nombres_usuario` varchar(40) NOT NULL,
  `apellidos_usuario` varchar(40) NOT NULL,
  `id_cod_postal` int(11) NOT NULL,
  `id_poblacion_usuario` int(11) NOT NULL,
  `id_provincia_usuario` int(11) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono_usuario` varchar(20) NOT NULL,
  `email_usuario` varchar(50) NOT NULL,
  `nickname` varchar(15) NOT NULL,
  `contrasena` varchar(20) NOT NULL,
  `tipo_usuario` varchar(4) NOT NULL,
  `fecha_registro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `tipo_identificacion`, `nombres_usuario`, `apellidos_usuario`, `id_cod_postal`, `id_poblacion_usuario`, `id_provincia_usuario`, `direccion`, `telefono_usuario`, `email_usuario`, `nickname`, `contrasena`, `tipo_usuario`, `fecha_registro`) VALUES
('1019070415', 'C.C', 'HAIBER HUMBERTO', 'GALINDO SANCHEZ', 2, 1, 1, 'mz f casa 2', '3137893058', 'zlaifer619@gmail.com', 'zlaifer', 'zlaifer', 'ADM', '2015-04-13'),
('1105674995', 'C.C', 'OSCAR ENRIQUE', 'QUINTERO CRIALES', 2, 2, 6, '', '', '', 'oquintero', 'dana25', 'ADM', '2015-05-01'),
('1789789789', 'C.C', 'Tathan', 'Villanueva Guzman', 2, 2, 7, 'Guamo', '3156983640', 'tathanVillanueva@gmail.com', 'tathan', '123456', 'ADM', '2015-10-30');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
 ADD PRIMARY KEY (`id_cliente`), ADD KEY `id_cod_postal` (`id_cod_postal`), ADD KEY `id_provincia_cliente` (`id_provincia_cliente`), ADD KEY `id_poblacion_cliente` (`id_poblacion_cliente`);

--
-- Indices de la tabla `codigo_postal`
--
ALTER TABLE `codigo_postal`
 ADD PRIMARY KEY (`id_cod_postal`);

--
-- Indices de la tabla `detalle_devolucion_stock`
--
ALTER TABLE `detalle_devolucion_stock`
 ADD PRIMARY KEY (`id_detalle_devolucion`), ADD KEY `id_devolucion` (`id_devolucion`), ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
 ADD PRIMARY KEY (`id_detalle_factura`), ADD KEY `id_producto` (`id_producto`), ADD KEY `id_factura` (`id_factura`);

--
-- Indices de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
 ADD PRIMARY KEY (`id_detalle_pedido`), ADD KEY `id_pedido` (`id_pedido`), ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `devolucion_stock`
--
ALTER TABLE `devolucion_stock`
 ADD PRIMARY KEY (`id_devolucion`), ADD KEY `id_factura` (`id_factura`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
 ADD PRIMARY KEY (`id_factura`), ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
 ADD PRIMARY KEY (`id_pedido`), ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `poblacion`
--
ALTER TABLE `poblacion`
 ADD PRIMARY KEY (`id_poblacion`), ADD KEY `id_codigo_postal` (`id_codigo_postal`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
 ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `provincia`
--
ALTER TABLE `provincia`
 ADD PRIMARY KEY (`id_provincia`), ADD KEY `id_poblacion` (`id_poblacion`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`id_usuario`), ADD KEY `id_cod_postal` (`id_cod_postal`), ADD KEY `id_provincia_usuario` (`id_provincia_usuario`), ADD KEY `id_poblacion_usuario` (`id_poblacion_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `codigo_postal`
--
ALTER TABLE `codigo_postal`
MODIFY `id_cod_postal` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT de la tabla `detalle_devolucion_stock`
--
ALTER TABLE `detalle_devolucion_stock`
MODIFY `id_detalle_devolucion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
MODIFY `id_detalle_factura` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=56;
--
-- AUTO_INCREMENT de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
MODIFY `id_detalle_pedido` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT de la tabla `devolucion_stock`
--
ALTER TABLE `devolucion_stock`
MODIFY `id_devolucion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
MODIFY `id_factura` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `poblacion`
--
ALTER TABLE `poblacion`
MODIFY `id_poblacion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT de la tabla `provincia`
--
ALTER TABLE `provincia`
MODIFY `id_provincia` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_cod_postal`) REFERENCES `codigo_postal` (`id_cod_postal`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `cliente_ibfk_2` FOREIGN KEY (`id_provincia_cliente`) REFERENCES `provincia` (`id_provincia`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `cliente_ibfk_3` FOREIGN KEY (`id_provincia_cliente`) REFERENCES `provincia` (`id_provincia`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `cliente_ibfk_4` FOREIGN KEY (`id_poblacion_cliente`) REFERENCES `poblacion` (`id_poblacion`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_devolucion_stock`
--
ALTER TABLE `detalle_devolucion_stock`
ADD CONSTRAINT `detalle_devolucion_stock_ibfk_1` FOREIGN KEY (`id_devolucion`) REFERENCES `devolucion_stock` (`id_devolucion`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `detalle_devolucion_stock_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
ADD CONSTRAINT `detalle_factura_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `detalle_factura_ibfk_3` FOREIGN KEY (`id_factura`) REFERENCES `facturas` (`id_factura`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
ADD CONSTRAINT `detalle_pedido_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `detalle_pedido_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `devolucion_stock`
--
ALTER TABLE `devolucion_stock`
ADD CONSTRAINT `devolucion_stock_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `facturas` (`id_factura`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
ADD CONSTRAINT `facturas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `poblacion`
--
ALTER TABLE `poblacion`
ADD CONSTRAINT `poblacion_ibfk_1` FOREIGN KEY (`id_codigo_postal`) REFERENCES `codigo_postal` (`id_cod_postal`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `provincia`
--
ALTER TABLE `provincia`
ADD CONSTRAINT `provincia_ibfk_1` FOREIGN KEY (`id_poblacion`) REFERENCES `poblacion` (`id_poblacion`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_cod_postal`) REFERENCES `codigo_postal` (`id_cod_postal`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`id_provincia_usuario`) REFERENCES `provincia` (`id_provincia`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `usuario_ibfk_3` FOREIGN KEY (`id_poblacion_usuario`) REFERENCES `poblacion` (`id_poblacion`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
