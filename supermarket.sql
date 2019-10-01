-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 30, 2019 at 07:41 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermarket`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `brand_id` int(11) NOT NULL,
  `brand_name` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`brand_id`, `brand_name`, `status`) VALUES
(2, 'Samsung', 'Active'),
(3, 'Sony', 'Active'),
(4, 'LG', 'Active'),
(5, 'Apple', 'Inactive'),
(6, 'Beats by Dre', 'Active'),
(7, 'Razer', 'Active'),
(8, 'Dolce & Gabanna', 'Active'),
(9, 'Casio Edificeee', 'Inactive'),
(12, 'Jordan', 'Inactive'),
(13, 'Ramtons', 'Active'),
(14, 'Apple', 'Active'),
(15, 'Quencher', 'Active'),
(16, 'Del Monte', 'Active'),
(17, 'Sunlight', 'Active'),
(18, 'Toss', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE `cashier` (
  `cashier_id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cashier`
--

INSERT INTO `cashier` (`cashier_id`, `username`, `password`, `status`) VALUES
(1, 'brye', 'Active', '123'),
(2, 'bob', '111', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `category_type` varchar(255) NOT NULL,
  `status` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_id`, `category_type`, `status`) VALUES
(3, 'Headphones', 'Active'),
(4, 'Cables', 'Active'),
(5, 'Cameras', 'Active'),
(6, 'Consoles', 'Active'),
(7, 'Smartphones', 'Active'),
(8, 'Shoes', 'Inactive'),
(9, 'Fragrances', 'Active'),
(12, 'Men\'s Watches', 'Active'),
(13, 'Shoes', 'Inactive'),
(14, 'Ironbox', 'Active'),
(15, 'Smartphones', 'Active'),
(16, 'Juice', 'Active'),
(17, 'Washing Soap', 'Active'),
(18, 'Novel', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `category_id` int(11) NOT NULL,
  `brand_id` int(11) NOT NULL,
  `cost_price` int(11) NOT NULL,
  `retail_price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `barcode` int(11) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_id`, `product_name`, `description`, `category_id`, `brand_id`, `cost_price`, `retail_price`, `quantity`, `barcode`, `status`) VALUES
(4, 'Beats Studio Wireless', 'Noma Sana bro', 3, 2, 400, 360, 292, 444, 'Inactive'),
(5, 'The One EDT', 'Men\'s Sexy Fragrance', 3, 2, 9000, 8000, 148, 555, 'Active'),
(6, 'Casio', 'Black Metal straps with white and blue hands', 10, 2, 20000, 19950, 2, 121, 'Inactive'),
(8, 'Air MAx', 'Dope shoes', 3, 2, 222222, 19999, 697, 321, 'Inactive'),
(9, 'Ramtons cordless ironbox', 'Bila wire ', 14, 13, 3500, 2500, 100, 987, 'Inactive'),
(10, 'Apple Watch Series 5 ', 'Apple\'s best smartwatch yet', 15, 5, 70000, 60000, 697, 101, 'Active'),
(11, 'Mango Juice', 'No additive. 100% pure', 16, 16, 400, 340, 495, 1, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `sales_id` int(11) NOT NULL,
  `date` datetime NOT NULL,
  `subtotal` int(11) NOT NULL,
  `pay` int(11) NOT NULL,
  `balance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`sales_id`, `date`, `subtotal`, `pay`, `balance`) VALUES
(19, '2019-09-13 00:00:00', 360, 1000, 640),
(20, '2019-09-13 00:00:00', 20719, 30000, 9281),
(21, '2019-09-13 00:00:00', 360, 400, 40),
(22, '2019-09-13 00:00:00', 720, 1000, 280),
(23, '2019-09-14 00:00:00', 17500, 20000, 2500),
(24, '2019-09-14 00:00:00', 720, 1000, 280),
(25, '2019-09-14 00:00:00', 720, 1000, 280),
(26, '2019-09-14 00:00:00', 720, 1000, 280),
(27, '2019-09-14 00:00:00', 36000, 40000, 4000),
(28, '2019-09-14 00:00:00', 36000, 40000, 4000),
(29, '2019-09-14 00:00:00', 400000, 500000, 100000),
(30, '2019-09-16 00:00:00', 180000, 200000, 20000),
(31, '2019-09-16 00:00:00', 720, 1000, 280),
(32, '2019-09-16 00:00:00', 8000, 10000, 2000),
(33, '2019-09-16 00:00:00', 19999, 20000, 1),
(34, '2019-09-17 00:00:00', 29739, 30000, 261),
(35, '2019-09-17 00:00:00', 1040, 2500, 1460),
(36, '2019-09-17 00:00:00', 21079, 30000, 8921);

-- --------------------------------------------------------

--
-- Table structure for table `sales_product`
--

CREATE TABLE `sales_product` (
  `sales_product_id` int(11) NOT NULL,
  `sales_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `sell_price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_product`
--

INSERT INTO `sales_product` (`sales_product_id`, `sales_id`, `product_id`, `sell_price`, `quantity`, `total`) VALUES
(2, 26, 444, 360, 2, 720),
(3, 27, 444, 360, 100, 36000),
(4, 28, 444, 360, 100, 36000),
(5, 29, 555, 8000, 50, 400000),
(6, 30, 101, 60000, 3, 180000),
(7, 31, 444, 360, 2, 720),
(8, 32, 555, 8000, 1, 8000),
(9, 33, 321, 19999, 1, 19999),
(10, 34, 1, 340, 3, 1020),
(11, 34, 444, 360, 2, 720),
(12, 34, 321, 19999, 1, 19999),
(13, 34, 555, 8000, 1, 8000),
(14, 35, 444, 360, 1, 360),
(15, 35, 1, 340, 2, 680),
(16, 36, 444, 360, 3, 1080),
(17, 36, 321, 19999, 1, 19999);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`brand_id`);

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
  ADD PRIMARY KEY (`cashier_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `category_id` (`category_id`),
  ADD KEY `brand_id` (`brand_id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`sales_id`);

--
-- Indexes for table `sales_product`
--
ALTER TABLE `sales_product`
  ADD PRIMARY KEY (`sales_product_id`),
  ADD KEY `sales_id` (`sales_id`),
  ADD KEY `product_id` (`product_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `brand_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `cashier`
--
ALTER TABLE `cashier`
  MODIFY `cashier_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `sales_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `sales_product`
--
ALTER TABLE `sales_product`
  MODIFY `sales_product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
