-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-06-2023 a las 04:04:08
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemaescritorio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE `cargo` (
  `idCargo` int(11) NOT NULL,
  `nombreCargo` varchar(20) NOT NULL,
  `estadoCargo` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`idCargo`, `nombreCargo`, `estadoCargo`) VALUES
(1, 'Gerente', b'1'),
(2, 'Administrador', b'1'),
(3, 'Vendedor', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombreCategoria` varchar(20) NOT NULL,
  `estadoCategoria` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `nombreCategoria`, `estadoCategoria`) VALUES
(1, 'Bebidas', b'1'),
(2, 'Desayunos', b'1'),
(3, 'Abarrotes', b'1'),
(4, 'Snack y Golosinas', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombreCliente` varchar(20) NOT NULL,
  `apellidoCliente` varchar(20) NOT NULL,
  `identificacionCliente` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombreCliente`, `apellidoCliente`, `identificacionCliente`) VALUES
(1, 'Alejandro', 'Torres Flores', '45678901'),
(2, 'Valentina', 'Vargas Sánchez', '12345678'),
(3, 'Camila', 'López Jiménez', '67890123'),
(4, 'Percy', 'Dávila Gonzales', '74859612'),
(5, 'Armando', 'Torres Medina', '84526314'),
(6, 'Alexander', 'Fuentes Rojas', '78019778');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `idDetalleVenta` int(11) NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `cantidad` tinyint(4) NOT NULL,
  `precioVenta` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`idDetalleVenta`, `idVenta`, `idProducto`, `cantidad`, `precioVenta`) VALUES
(1, 1, 3, 2, 2),
(2, 1, 1, 3, 2),
(3, 2, 1, 2, 2),
(4, 3, 3, 2, 2),
(5, 4, 3, 4, 2),
(6, 5, 3, 2, 2),
(7, 6, 3, 3, 2),
(8, 7, 1, 3, 2),
(9, 8, 3, 2, 2),
(10, 9, 3, 4, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idEmpleado` int(11) NOT NULL,
  `nombreEmpleado` varchar(50) NOT NULL,
  `apellidoEmpleado` varchar(50) NOT NULL,
  `dniEmpleado` char(8) NOT NULL,
  `celularEmpleado` char(9) NOT NULL,
  `estadoEmpleado` bit(1) NOT NULL,
  `correoEmpleado` varchar(50) NOT NULL,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idEmpleado`, `nombreEmpleado`, `apellidoEmpleado`, `dniEmpleado`, `celularEmpleado`, `estadoEmpleado`, `correoEmpleado`, `idUsuario`) VALUES
(1, 'Stephano', 'Sanchez Medina', '72271235', '946145406', b'1', 'sanchez.15985214@gmail.com', 1),
(2, 'Alexander', 'Fuentes Medina', '78415263', '914523952', b'1', 'alexander@gmail.com', 2),
(3, 'Eberth', 'Sigueñas Noriega', '78459612', '967412853', b'1', 'eberth@gmail.com', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `metodopago`
--

CREATE TABLE `metodopago` (
  `idMetodoPago` int(11) NOT NULL,
  `nombrePago` varchar(11) NOT NULL,
  `estadoPago` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `metodopago`
--

INSERT INTO `metodopago` (`idMetodoPago`, `nombrePago`, `estadoPago`) VALUES
(1, 'Yape', b'1'),
(2, 'Plim', b'1'),
(3, 'Tunki', b'1'),
(4, 'Efectivo', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(20) NOT NULL,
  `descripcionProducto` varchar(500) NOT NULL,
  `contenidoProducto` varchar(100) NOT NULL,
  `precioProducto` float(10,2) NOT NULL,
  `estadoProducto` bit(1) NOT NULL,
  `stockProducto` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcionProducto`, `contenidoProducto`, `precioProducto`, `estadoProducto`, `stockProducto`, `idCategoria`, `idProveedor`) VALUES
(1, 'Volt', 'Energizante', '180ml', 2.00, b'1', 47, 1, 1),
(2, 'Avena', 'Avena', '240gr', 2.00, b'1', 1, 2, 1),
(3, 'Cafe', 'Café Instantáneo', '45 gr', 1.80, b'1', 176, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `rucProveedor` int(11) NOT NULL,
  `nombreProveedor` varchar(20) NOT NULL,
  `celularProveedor` char(9) NOT NULL,
  `estadoProveedor` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `rucProveedor`, `nombreProveedor`, `celularProveedor`, `estadoProveedor`) VALUES
(1, 2028563254, 'Alicorp S.A.A.', '912345678', b'1'),
(2, 2147483647, 'Backus y Johnston S.', '978901234', b'1'),
(3, 2147483647, 'Luz del Sur S.A.A.', '942367890', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(20) NOT NULL,
  `claveUsuario` varchar(20) NOT NULL,
  `estadoUsuario` bit(1) NOT NULL,
  `idCargo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `nombreUsuario`, `claveUsuario`, `estadoUsuario`, `idCargo`) VALUES
(1, 'Stephano', 'sanchez', b'1', 1),
(2, 'Alexander', 'fuentes', b'1', 2),
(3, 'Eberth', '123456', b'1', 3),
(4, 'Fabricio', 'fabricio', b'1', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `serie` varchar(20) NOT NULL,
  `numeroCorrelativo` varchar(10) NOT NULL,
  `tipoComprobante` char(1) NOT NULL,
  `idMetodoPago` int(11) NOT NULL,
  `idEmpleado` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `fechaVenta` date NOT NULL,
  `estadoVenta` bit(1) NOT NULL,
  `total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `serie`, `numeroCorrelativo`, `tipoComprobante`, `idMetodoPago`, `idEmpleado`, `idCliente`, `fechaVenta`, `estadoVenta`, `total`) VALUES
(1, 'B0001', '00001', 'B', 3, 1, 2, '2023-06-26', b'1', 9.60),
(2, 'B0001', '00002', 'B', 4, 1, 6, '2023-06-26', b'1', 4.00),
(3, 'B0001', '00003', 'B', 4, 1, 3, '2023-06-27', b'1', 3.60),
(4, 'B0001', '00004', 'B', 2, 1, 3, '2023-06-27', b'1', 7.20),
(5, 'B0001', '00005', 'B', 2, 1, 2, '2023-06-27', b'1', 3.60),
(6, 'B0001', '00006', 'B', 2, 1, 2, '2023-06-27', b'1', 5.40),
(7, 'B0001', '00007', 'B', 1, 1, 1, '2023-06-27', b'1', 6.00),
(8, 'B0001', '00008', 'B', 3, 1, 2, '2023-06-27', b'1', 3.60),
(9, 'B0001', '00009', 'B', 1, 1, 2, '2023-06-27', b'1', 7.20);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`idCargo`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`),
  ADD UNIQUE KEY `uc_UnicaCategoria` (`nombreCategoria`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `uc_dni_cliente` (`identificacionCliente`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`idDetalleVenta`),
  ADD KEY `fk_detalleVenta` (`idVenta`),
  ADD KEY `fk_detalleProducto` (`idProducto`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idEmpleado`),
  ADD UNIQUE KEY `uc_dni_empleado` (`dniEmpleado`),
  ADD KEY `fk_empleadoUsuario` (`idUsuario`);

--
-- Indices de la tabla `metodopago`
--
ALTER TABLE `metodopago`
  ADD PRIMARY KEY (`idMetodoPago`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `fk_categoria` (`idCategoria`),
  ADD KEY `fk_proveedor` (`idProveedor`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`),
  ADD UNIQUE KEY `uc_celularProveedor` (`celularProveedor`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD KEY `fk_cargoUsuario` (`idCargo`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `fk_ventaEmpleado` (`idEmpleado`),
  ADD KEY `fk_ventaCliente` (`idCliente`),
  ADD KEY `fk_venta_pago` (`idMetodoPago`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cargo`
--
ALTER TABLE `cargo`
  MODIFY `idCargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  MODIFY `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `metodopago`
--
ALTER TABLE `metodopago`
  MODIFY `idMetodoPago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD CONSTRAINT `fk_detalleProducto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `fk_detalleVenta` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `fk_empleadoUsuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `fk_categoria` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`),
  ADD CONSTRAINT `fk_proveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_cargoUsuario` FOREIGN KEY (`idCargo`) REFERENCES `cargo` (`idCargo`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_ventaCliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `fk_ventaEmpleado` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`),
  ADD CONSTRAINT `fk_venta_pago` FOREIGN KEY (`idMetodoPago`) REFERENCES `metodopago` (`idMetodoPago`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
