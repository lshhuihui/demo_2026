/*
Navicat MySQL Data Transfer

Source Server         : fun
Source Server Version : 50741
Source Host           : 47.109.84.152:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50741
File Encoding         : 65001

Date: 2023-03-25 22:47:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for lishihui_system_user
-- ----------------------------
DROP TABLE IF EXISTS `lishihui_system_user`;
CREATE TABLE `lishihui_system_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `delstatus` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `version` int(11) DEFAULT '1' COMMENT '乐观锁',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8 COMMENT='逻辑删去-默认是0，逻辑删去后标为1';

-- ----------------------------
-- Records of lishihui_system_user
-- ----------------------------
INSERT INTO `lishihui_system_user` VALUES ('1', '小李', '124', '女', '10', '1111113', '丽江', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('2', 't', '123', '5', '21', '不要修改t用户', '不要修改t用户', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('4', '小张', '999999', '男', '10', '1851919198', '火星水星', '2020-10-16', '99@qq.com', '0', '2021-10-31 20:35:36', '2021-10-31 20:55:52', '1');
INSERT INTO `lishihui_system_user` VALUES ('5', '小雪', '999999', '男', '20', '1851919198', '火星2', '2020-10-17', '99@qq.com', '1', '2021-10-31 20:35:36', '2021-10-31 20:35:36', '1');
INSERT INTO `lishihui_system_user` VALUES ('6', '大李', '999999', '女', '21', '1881919879', '武汉', '2021-10-31', '99@qq.com', '0', '2021-10-31 20:40:13', '2021-10-31 20:40:13', '1');
INSERT INTO `lishihui_system_user` VALUES ('22', '大李', null, '男', '29', '44058871', '丽江', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('24', '花猫', '123', '男', '29', '17687188085', '丽江', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('26', '天蓬', '999999', '1111', '50', '1111', '111', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('29', '1111', null, 'nan', '18', '', 'xx', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('30', 'ka', null, '1', '15', '2456', '3', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('32', 'admins', null, '女', '18', '12', '硅谷', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('33', '宝玉', '123456', '男', '22', '4521', null, null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('35', '', null, '666', '26', '', '', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('37', '', null, '女', '18', '', '沈阳大街', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('38', '日光', null, '男', '21', '', '地球核心', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('66', '小歪', null, '女', '21', '', '月球', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('67', '小花猫', '333', null, null, null, null, null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('68', '大花猫', null, '男', '19', '123', '123', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('70', 'tt1', null, '女', '78', '44058871', '丽江', null, null, '0', null, null, '1');
INSERT INTO `lishihui_system_user` VALUES ('71', '张俊杰', '123', '男', '12', '15812341234', '中国', null, null, '0', null, null, '1');
