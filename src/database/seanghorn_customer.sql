-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: seanghorn
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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `cus_id` int(11) NOT NULL AUTO_INCREMENT,
  `cus_name` varchar(50) NOT NULL,
  `cus_gender` enum('Male','Female') DEFAULT NULL,
  `cus_phone` int(11) DEFAULT NULL,
  `cus_email` varchar(50) DEFAULT NULL,
  `cus_address` varchar(255) DEFAULT NULL,
  `cus_IC` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Seanghim','Male',98612277,'s.seanghim',NULL,NULL),(2,'Heng Davuth',NULL,966677233,NULL,NULL,'IC143'),(3,'Ly SeangHeng',NULL,87701708,NULL,NULL,'iC341'),(4,'Ly Seyha',NULL,987867,NULL,NULL,'IC546'),(5,'Noun',NULL,987654,NULL,NULL,'ICCC234'),(6,'Khy Souling',NULL,70898989,NULL,NULL,'IC89765'),(7,'Deomn',NULL,9877733,NULL,NULL,'IC404'),(8,'Seanghorn',NULL,9876543,NULL,NULL,'IC789'),(9,'H',NULL,985,NULL,NULL,'556'),(10,'d',NULL,54,NULL,NULL,'7'),(11,'t',NULL,6,NULL,NULL,'7'),(12,'Sewa',NULL,34,NULL,NULL,'7895'),(13,'reetyry',NULL,22,NULL,NULL,'2'),(14,'Vuth',NULL,98678756,NULL,NULL,'iC143'),(15,'Vuth',NULL,666,NULL,NULL,'143'),(16,'VuthHeng',NULL,9876533,NULL,NULL,'143'),(17,'desa',NULL,9887123,NULL,NULL,'IC456'),(18,' Sreang   SeangHorn','Female',NULL,NULL,' PP  Cambodia',' IC143'),(19,' Sreang   SeangHron','Female',NULL,NULL,' PP  Cambodia',' IC143'),(20,' Sreang  Peng Sron','Male',NULL,NULL,' KPC  Cambodia',' IC354'),(21,'ly  Seha','Male',NULL,NULL,' PP  Cambodia',' IC495'),(22,' sea  f','Male',NULL,NULL,' r  e',' r'),(23,' d  d','Male',NULL,NULL,' d  d',' d'),(24,' 2  s','Male',NULL,NULL,' s  s',' s'),(25,' h  e','Male',NULL,NULL,' pp  Cambodia',' IV432'),(26,' Srea  s','Male',NULL,NULL,'ee   d',' Ive'),(27,'   ','Male',NULL,NULL,'   ',' '),(28,'   ','Male',NULL,NULL,'   ',' '),(29,'   ','Male',NULL,NULL,'   ',' '),(30,'   ','Male',NULL,NULL,'   ',' '),(31,'   ','Male',NULL,NULL,'   ',' '),(32,'   ','Male',NULL,NULL,'   ',' '),(33,'   ','Male',NULL,NULL,'   ',' '),(34,'   ','Male',NULL,NULL,'   ',' '),(35,'   ','Male',NULL,NULL,'   ',' '),(36,'   ','Male',NULL,NULL,'   ',' '),(37,'   ','Male',NULL,NULL,'   ',' '),(38,'   ','Male',NULL,NULL,'   ',' '),(39,'   ','Male',NULL,NULL,'   ',' '),(40,'   ','Male',NULL,NULL,'   ',' '),(41,'   ','Male',NULL,NULL,'   ',' '),(42,'   ','Male',NULL,NULL,'   ',' '),(43,'   ','Male',NULL,NULL,'   ',' '),(44,'   ','Male',NULL,NULL,'   ',' '),(45,'   ','Male',NULL,NULL,'   ',' '),(46,'   ','Male',NULL,NULL,'   ',' '),(47,' Sre  aad','Male',NULL,NULL,' pp  fra',' 453'),(48,' dre  s','Male',NULL,NULL,' a  a',' 3');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-04 11:40:14
