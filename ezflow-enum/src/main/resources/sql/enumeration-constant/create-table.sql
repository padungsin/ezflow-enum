CREATE TABLE `enumeration_constant` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fact` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `field` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `value` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
