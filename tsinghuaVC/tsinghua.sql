/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50151
Source Host           : localhost:3306
Source Database       : tsinghua

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-08-05 15:52:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'java', '123456');
INSERT INTO `t_user` VALUES ('2', 'c++', '123456');
INSERT INTO `t_user` VALUES ('3', 'c', '123456');
