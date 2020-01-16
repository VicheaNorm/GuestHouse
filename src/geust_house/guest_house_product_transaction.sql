-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: guest_house
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product_transaction`
--

DROP TABLE IF EXISTS `product_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_transaction` (
  `product_id` int(11) NOT NULL,
  `transaction_date` datetime DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `price` float(10,2) DEFAULT NULL,
  `cus_id` int(11) DEFAULT NULL,
  `stock_type_id` int(11) DEFAULT NULL,
  KEY `fk_stock_type` (`stock_type_id`),
  KEY `fk_product_id` (`product_id`),
  KEY `fk_cus_id_transaction` (`cus_id`),
  CONSTRAINT `fk_cus_id_transaction` FOREIGN KEY (`cus_id`) REFERENCES `customer` (`cus_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_stock_type` FOREIGN KEY (`stock_type_id`) REFERENCES `stock_type` (`Stock_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_transaction`
--

LOCK TABLES `product_transaction` WRITE;
/*!40000 ALTER TABLE `product_transaction` DISABLE KEYS */;
INSERT INTO `product_transaction` VALUES (1,'2020-01-10 13:27:20',100,0.40,1,2),(2,'2020-01-10 13:27:20',50,0.40,1,2),(3,'2020-01-10 13:27:20',10,0.20,1,2),(4,'2020-01-10 13:27:20',15,0.40,1,2),(5,'2020-01-10 13:27:20',20,0.60,1,2),(1,'2020-01-10 13:29:40',-2,0.50,6,1),(2,'2020-01-10 13:29:40',-2,0.50,6,1),(3,'2020-01-10 13:29:40',-2,0.25,6,1);
/*!40000 ALTER TABLE `product_transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-10 19:52:29
