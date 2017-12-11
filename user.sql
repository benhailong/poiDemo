/*
Navicat MySQL Data Transfer

Source Server         : 3306
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-03-15 23:24:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '123456', '13997544649', '1111@qq.com', '男', '湖北');
INSERT INTO `user` VALUES ('2', '李四', '144444', '13779844646', '22222@163.com', '男', '北京');
INSERT INTO `user` VALUES ('3', '王五', '188888', '13459755647', '66666@qq.com', '女', '上海');
INSERT INTO `user` VALUES ('4', '赵六', '155555', '18664488621', '88888@163.com', '男', '广东');
