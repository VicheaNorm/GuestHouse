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
-- Table structure for table `room_price`
--

DROP TABLE IF EXISTS `room_price`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room_price` (
  `room_type_id` int(11) NOT NULL,
  `typeof_living_id` int(11) NOT NULL,
  `price` float(10,2) NOT NULL,
  PRIMARY KEY (`typeof_living_id`,`room_type_id`),
  KEY `room_type_id` (`room_type_id`),
  CONSTRAINT `room_price_ibfk_2` FOREIGN KEY (`typeof_living_id`) REFERENCES `typeof_living` (`typeof_living_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `room_price_ibfk_3` FOREIGN KEY (`room_type_id`) REFERENCES `roomtype` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_price`
--

LOCK TABLES `room_price` WRITE;
/*!40000 ALTER TABLE `room_price` DISABLE KEYS */;
INSERT INTO `room_price` VALUES (3,3,5.00),(4,3,7.00),(5,3,10.00),(6,3,4.00),(7,3,5.50),(8,3,6.00),(3,4,8.00),(4,4,12.00),(5,4,17.00),(6,4,7.00),(7,4,9.00),(8,4,11.00),(3,5,15.00),(4,5,18.00),(5,5,28.00),(6,5,10.00),(7,5,17.00),(8,5,18.00),(3,6,20.00),(4,6,25.00),(5,6,35.00),(6,6,15.00),(7,6,22.00),(8,6,23.00),(3,7,50.00),(4,7,65.00),(5,7,100.00),(6,7,38.00),(7,7,49.00),(8,7,57.00);
/*!40000 ALTER TABLE `room_price` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-10 19:52:28
