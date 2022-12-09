/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028 (8.0.28)
 Source Host           : localhost:3306
 Source Schema         : my_blog

 Target Server Type    : MySQL
 Target Server Version : 80028 (8.0.28)
 File Encoding         : 65001

 Date: 09/12/2022 12:51:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_blog
-- ----------------------------
DROP TABLE IF EXISTS `tb_blog`;
CREATE TABLE `tb_blog` (
  `blog_id` bigint NOT NULL COMMENT '博客id',
  `user_id` bigint NOT NULL COMMENT '外键,发表用户ID',
  `blog_cover` varchar(255) DEFAULT NULL COMMENT '博客封面',
  `blog_title` text NOT NULL COMMENT '博客标题',
  `blog_description` varchar(256) DEFAULT '未添加相关描述的博客' COMMENT '博客描述',
  `blog_content` longtext NOT NULL COMMENT '博客内容',
  `blog_views` bigint DEFAULT '0' COMMENT '浏览量',
  `blog_comment_count` bigint DEFAULT '0' COMMENT '评论量',
  `blog_like_count` bigint DEFAULT '0' COMMENT '点赞数',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `version` int NOT NULL DEFAULT '0' COMMENT '版本号',
  `deleted` int DEFAULT '0' COMMENT '逻辑删除:0未删除;1删除',
  PRIMARY KEY (`blog_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='博客表';

-- ----------------------------
-- Records of tb_blog
-- ----------------------------
BEGIN;
INSERT INTO `tb_blog` (`blog_id`, `user_id`, `blog_cover`, `blog_title`, `blog_description`, `blog_content`, `blog_views`, `blog_comment_count`, `blog_like_count`, `create_time`, `update_time`, `version`, `deleted`) VALUES (2, 8888888888888888888, '../../images/blog/post-1.png', '基于Vue+SpringBoot前后端分离的个人博客系统', '未添加相关描述的博客', '#基于Vue+SpringBoot前后端分离的个人博客系统\\n##博客系统介绍', 994, 0, 0, '2022-09-09 15:12:59', '2022-09-10 11:04:24', 5, 0);
INSERT INTO `tb_blog` (`blog_id`, `user_id`, `blog_cover`, `blog_title`, `blog_description`, `blog_content`, `blog_views`, `blog_comment_count`, `blog_like_count`, `create_time`, `update_time`, `version`, `deleted`) VALUES (3, 8888888888888888888, '../../images/blog/post-1.png', '基于Vue+SpringBoot前后端分离的个人博客系统', '未添加相关描述的博客', '#基于Vue+SpringBoot前后端分离的个人博客系统\\n##博客系统介绍', 31, 0, 0, '2022-09-09 15:12:59', '2022-09-10 11:04:24', 1, 0);
INSERT INTO `tb_blog` (`blog_id`, `user_id`, `blog_cover`, `blog_title`, `blog_description`, `blog_content`, `blog_views`, `blog_comment_count`, `blog_like_count`, `create_time`, `update_time`, `version`, `deleted`) VALUES (4, 8888888888888888888, '../../images/blog/post-1.png', '基于Vue+SpringBoot前后端分离的个人博客系统', '未添加相关描述的博客', '#基于Vue+SpringBoot前后端分离的个人博客系统\\n##博客系统介绍', 10220, 0, 0, '2022-09-09 15:39:58', '2022-09-10 11:04:24', 0, 0);
INSERT INTO `tb_blog` (`blog_id`, `user_id`, `blog_cover`, `blog_title`, `blog_description`, `blog_content`, `blog_views`, `blog_comment_count`, `blog_like_count`, `create_time`, `update_time`, `version`, `deleted`) VALUES (5, 8888888888888888888, '../../images/blog/post-1.png', '基于Vue+SpringBoot前后端分离的个人博客系统', '未添加相关描述的博客', '#基于Vue+SpringBoot前后端分离的个人博客系统\\n##博客系统介绍', 30220, 0, 0, '2022-09-09 15:12:59', '2022-09-10 11:04:24', 0, 0);
COMMIT;

-- ----------------------------
-- Table structure for tb_blog_label
-- ----------------------------
DROP TABLE IF EXISTS `tb_blog_label`;
CREATE TABLE `tb_blog_label` (
  `blog_id` bigint NOT NULL COMMENT '博客ID',
  `label_id` bigint NOT NULL COMMENT '标签id',
  KEY `blog_id` (`blog_id`),
  KEY `label_id` (`label_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='博客设置标签表';

-- ----------------------------
-- Records of tb_blog_label
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for tb_comments
-- ----------------------------
DROP TABLE IF EXISTS `tb_comments`;
CREATE TABLE `tb_comments` (
  `comment_id` bigint NOT NULL COMMENT '评论ID',
  `user_id` bigint NOT NULL COMMENT '外键,博客拥有者ID',
  `blog_id` bigint NOT NULL COMMENT '外键,博客id',
  `comment_like_count` bigint NOT NULL DEFAULT '0' COMMENT '评论点赞数',
  `comment_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '评论日期',
  `comment_content` text NOT NULL COMMENT '评论内容',
  `parent_comment_id` bigint DEFAULT NULL COMMENT '父评论ID',
  PRIMARY KEY (`comment_id`),
  KEY `blog_id` (`blog_id`),
  KEY `comment_date` (`comment_date`),
  KEY `parent_comment_id` (`parent_comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='评论表';

-- ----------------------------
-- Records of tb_comments
-- ----------------------------
BEGIN;
INSERT INTO `tb_comments` (`comment_id`, `user_id`, `blog_id`, `comment_like_count`, `comment_date`, `comment_content`, `parent_comment_id`) VALUES (381083831983, 8888888888888888888, 1, 0, '2022-09-09 15:13:16', '非常棒呀', NULL);
INSERT INTO `tb_comments` (`comment_id`, `user_id`, `blog_id`, `comment_like_count`, `comment_date`, `comment_content`, `parent_comment_id`) VALUES (888999000222, 8888888888888888888, 1, 0, '2022-09-09 15:13:16', '还要继续加油呢', 381083831983);
COMMIT;

-- ----------------------------
-- Table structure for tb_labels
-- ----------------------------
DROP TABLE IF EXISTS `tb_labels`;
CREATE TABLE `tb_labels` (
  `label_id` bigint NOT NULL COMMENT '标签ID',
  `label_name` varchar(20) NOT NULL COMMENT '标签名称',
  `label_description` text NOT NULL COMMENT '标签描述',
  PRIMARY KEY (`label_id`),
  KEY `label_name` (`label_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='标签表';

-- ----------------------------
-- Records of tb_labels
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for tb_skill
-- ----------------------------
DROP TABLE IF EXISTS `tb_skill`;
CREATE TABLE `tb_skill` (
  `id` bigint NOT NULL,
  `skill` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `skill` (`skill`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_skill
-- ----------------------------
BEGIN;
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569671043285540866, 'AJAX');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569670854034350081, 'axios');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569667596461039617, 'HTML+CSS');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569667353816358914, 'javascript');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569560164615446530, 'javaSE');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569666745138962433, 'javaWeb');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569667932546424833, 'MyBatis');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569667955241803778, 'MyBatis-Plus');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569668068970356737, 'MySQL');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569668108623306753, 'Redis');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569666634971373570, 'spring');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569560483915132929, 'springboot');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569667735854538754, 'springMVC');
INSERT INTO `tb_skill` (`id`, `skill`) VALUES (1569666973787250689, 'Vue');
COMMIT;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` bigint NOT NULL COMMENT '用户ID',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `user_password` varchar(255) NOT NULL COMMENT '用户密码',
  `user_email` varchar(30) NOT NULL COMMENT '用户邮箱',
  `user_avatar` varchar(255) NOT NULL COMMENT '用户头像',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间:格式2022-09-09 06:35:04',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `user_birthday` date DEFAULT NULL COMMENT '用户生日',
  `user_nickname` varchar(20) NOT NULL COMMENT '用户昵称',
  `user_signature` varchar(100) DEFAULT NULL COMMENT '用户个性签名',
  PRIMARY KEY (`user_id`),
  KEY `user_name` (`user_name`),
  KEY `user_email` (`user_email`),
  KEY `user_nickname` (`user_nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';

-- ----------------------------
-- Records of tb_user
-- ----------------------------
BEGIN;
INSERT INTO `tb_user` (`user_id`, `user_name`, `user_password`, `user_email`, `user_avatar`, `create_time`, `update_time`, `user_birthday`, `user_nickname`, `user_signature`) VALUES (8888888888888888888, 'admin', 'b1c3rayemzga5xa58cts@f530361b8b475345187d567de8d44e86', '123@166.com', '../../../public/images/avatar.png', '2022-09-09 15:12:30', '2022-10-11 16:25:41', '2001-10-10', 'redyouzi', '路漫漫其修远兮 吾将上下而求索');
COMMIT;

-- ----------------------------
-- Table structure for tb_user_skill
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_skill`;
CREATE TABLE `tb_user_skill` (
  `user_id` bigint NOT NULL,
  `skill_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_user_skill
-- ----------------------------
BEGIN;
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569560164615446530);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569560483915132929);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569666634971373570);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569666745138962433);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569666973787250689);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569667353816358914);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569667596461039617);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569667735854538754);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569667932546424833);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569667955241803778);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569668068970356737);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569668108623306753);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569670854034350081);
INSERT INTO `tb_user_skill` (`user_id`, `skill_id`) VALUES (8888888888888888888, 1569671043285540866);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
