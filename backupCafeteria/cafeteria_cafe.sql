CREATE DATABASE  IF NOT EXISTS `cafeteria` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `cafeteria`;
-- MariaDB dump 10.19  Distrib 10.4.27-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: cafeteria
-- ------------------------------------------------------
-- Server version	10.4.27-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cafe`
--

DROP TABLE IF EXISTS `cafe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cafe` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `historia` varchar(5000) DEFAULT NULL,
  `sabor` varchar(5000) DEFAULT NULL,
  `referencia` varchar(1000) DEFAULT NULL,
  `imagem` varchar(3000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cafe`
--

LOCK TABLES `cafe` WRITE;
/*!40000 ALTER TABLE `cafe` DISABLE KEYS */;
INSERT INTO `cafe` VALUES ('1','Arábica','O café arábica foi catalogado por volta de 1750 e é originário da Etiópia. A espécie corresponde a aproximadamente ¾ dos grãos produzidos em todo o mundo e é tida como a mais nobre da família dos cafés devido à sua complexidade de sabor e aroma.O cultivo de seus grãos é feito entre 600 e 2 mil metros de altitude. A escolha de altitude impacta diretamente nas características do café, pois quanto mais alto, maior a concentração de minerais nos grãos e mais ameno é o clima para o seu desenvolvimento, o que ajuda na acentuação de sabor, acidez e aroma do café. Alguns dos cafés mais consumidos no Brasil e de melhor qualidade são originários dessa variedade, como o Novo Mundo, o Bourbon, o Catuaí, o Catucaí, o Topázio, o Icatu e o Acaiá.','O café arábica possui um sabor suave, ligeiramente ácido e naturalmente adocicado. Isso se deve pois seus grãos possuem uma concentração  de açúcares muito maior do que a do robusta. Além disso, o café  arábica também possui um aroma mais suave e frutado e a concentração de cafeína em seus grãos é bem menor do que a de outras espécies de café.','https://www.mokaclube.com.br/blog/tipos-de-graos-de-cafe/','https://drive.google.com/uc?id=1GpFAJvsn6BjrupX5XRyPj1QZEAu7gNpq'),('11',NULL,'Café de Guarulhos API REST GRU','Guarulhos REST',NULL,NULL),('13','Renato Café','Café de Guarulhos API REST GRU','Guarulhos REST',NULL,NULL),('2','Bourbon','O Arábica é um café que origina outras variedades, sendo uma delas a Bourbon. Sua origem remete à Ilha de Bourbon, no leste de Madagascar. Em 1859, ele chegou em território nacional e passou a ser altamente cultivado na região do Cerrado Mineiro, em Minas Gerais.','O aroma é bem intenso e o sabor complexo, com notas de avelã. A acidez é baixa, o corpo é médio e a bebida costuma ser adocicada com tons de chocolate.Esta variedade se divide em outras duas, sendo o Bourbon Vermelho e o Amarelo. A grande diferença entre elas é que a segunda tende a ser mais doce e seu plantio é mais fácil, por ser mais resistente.No entanto, ambos os tipos de Bourbon possuem muita qualidade e são um dos cafés mais especiais cultivados em território nacional.','https://www.mokaclube.com.br/blog/tipos-de-graos-de-cafe','https://drive.google.com/uc?id=11eFaTspPj8nfE_Bz13ydTxMKUJ22ez9m'),('3','Acaiá','O Acaiá é outra variedade do Arábica, nascida de uma mutação natural do Mundo Novo. A plantação acontece, também, acima de 800 metros do nível do mar e este tipo de grão encontrou prosperidade para se desenvolver em solo brasileiro, tendo características que não são encontradas em outras localidades. Por isso, é considerado um café especial e até raro.','A fruta tende a ser bem grande e o resultado da bebida preparada com esta variedade é um café suave, com notas frutadas, corpo equilibrado e acidez mediana.É muito utilizado para criar blends poderosos e saborosos, sempre combinados com tipos de grãos mais fortes. ','https://www.mokaclube.com.br/blog/tipos-de-graos-de-cafe','https://drive.google.com/uc?id=12EaKRl2PN4u1IF63khfB1gKhp8sV7wGo'),('4','Catuaí','Criado pelo IAC (Instituto Agronômico de Campinas), o Catuaí é uma espécie desenvolvida completamente em território brasileiro. Atualmente, 45% das lavouras cafeeiras produzem esta espécie. Os estudos para que o grão surgisse começaram em 1949 e, em 1972, ele foi lançado oficialmente para os consumidores no mercado. Segundo o pesquisador Gerson Giomo, a variedade é resultado do cruzamento entre o Mundo Novo e o Caturra.O plantio do Catuaí é mais simples. O método foi desenvolvido para facilitar o cultivo para os produtores, com plantas mais baixas e mais resistentes. As plantações situadas acima de 1.000 metros geram bebidas com mais qualidade.O nome do café, inclusive, é uma homenagem aos indígenas tupis-guarani, e significa muito bom.','Assim como o Bourbon, existe o Catuaí Vermelho e o Amarelo, sendo o primeiro mais encorpado e com amargor mais acentuado, e o segundo mais suave e delicado no paladar.','https://www.mokaclube.com.br/blog/tipos-de-graos-de-cafe','https://drive.google.com/uc?id=1AHPPQQ9nQ1qEwV8LJb-08X-DJiI4TACc'),('5','Robusta',' É um dos grãos mais produzidos no mundo e isso acontece porque é um tipo que se adapta a diferentes ambientes, devido sua resistência.Assim como o Arábica, o Robusta também está presente em outros grãos de café que são resultados de misturas.O café solúvel, muito consumido no cotidiano brasileiro, é produzido principalmente com o Robusta, o que explica o amargor característico. No entanto, isso não quer dizer que este café possui menos qualidade.Na realidade, o café especial da linha Robusta e suas variedades são muito cobiçados e, quando cultivados com cuidado, geram cafés ricos em características e qualidades.','Para efeitos de comparação, o café Robusta tem o dobro de cafeína do que o Arábica e, justamente por isso, é considerado uma bebida forte. Ao provar uma bebida feita com o Robusta, certamente você vai perceber uma textura suave, baixa acidez e um corpo pesado por conta das notas amargas.','https://www.mokaclube.com.br/blog/tipos-de-graos-de-cafe','https://drive.google.com/uc?id=15UtqFhOUfC16IkSavZaOSrY1J0ymNNxM'),('6','Geisha','Apesar do nome nos fazer lembrar o Japão, esta variedade de café não tem nenhuma relação com o país oriental. Pelo contrário, o café Geisha é originário da Etiópia e tem sido produzido na América Latina, especialmente no Panamá.Seu cultivo não é muito popular por conta do baixo rendimento, no entanto, na província panamenha de Chiriquí, o café Geisha é estrela e sua produção é exportada para diversos países. Em 2018, esta variedade recebeu o troféu no Cup of Excellence como o melhor café do Brasil, produzido em terras mineiras.','Quanto às características, a bebida é considerada delicada, com aromas florais e notas frutadas.','https://www.mokaclube.com.br/blog/tipos-de-graos-de-cafe','https://drive.google.com/uc?id=1r9PdQKhofeT0isQ5GWi-3xvX-2pyKMZm'),('7','kona','O café Kona é cultivado na cidade de mesmo nome localizada no Havaí, Estados Unidos. A região é conhecida pelo colo vulcânico, que confere características especiais a esse grão, considerado um dos melhores do mundo! ','Na boca, o Kona é aveludado e traz um sabor de frutas. É um dos cafés mais caros do mundo','https://www.mokaclube.com.br/blog/tipos-de-graos-de-cafe','https://drive.google.com/uc?id=10xRkdKkhU0xCthfdDvezY91QudfqfPha'),('8',NULL,'Café de Guarulhos API REST GRU','Guarulhos REST',NULL,NULL),('9',NULL,'Café de Guarulhos API REST GRU','Guarulhos REST',NULL,NULL),('null','Renato Café','Café de Guarulhos API REST GRU','Guarulhos REST',NULL,NULL);
/*!40000 ALTER TABLE `cafe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-03 14:51:44
