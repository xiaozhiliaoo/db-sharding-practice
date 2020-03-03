CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `country_code` varchar(8) NOT NULL DEFAULT '' COMMENT '手机号对应的国家编码',
  `mobile_number` varchar(16) NOT NULL DEFAULT '' COMMENT '手机号码',
  `email` varchar(128) NOT NULL DEFAULT '' COMMENT '邮箱',
  `login_pword` varchar(225) NOT NULL DEFAULT '' COMMENT '登陆密码',
  PRIMARY KEY (`id`))  ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='用户表'