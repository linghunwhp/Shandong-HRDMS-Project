-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 2017-06-01 10:44:24
-- 服务器版本： 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hrdms`
--
CREATE DATABASE IF NOT EXISTS `hrdms` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `hrdms`;

-- --------------------------------------------------------

--
-- 表的结构 `apply`
--

CREATE TABLE IF NOT EXISTS `apply` (
  `apply_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `original_num` int(11) NOT NULL,
  `current_num` int(11) NOT NULL,
  `decrease_type` int(11) DEFAULT NULL,
  `main_factor` int(11) DEFAULT NULL,
  `main_describe` varchar(256) DEFAULT NULL,
  `second_factor` int(11) DEFAULT NULL,
  `second_describe` varchar(255) DEFAULT NULL,
  `third_factor` int(11) DEFAULT NULL,
  `third_describe` varchar(255) DEFAULT NULL,
  `other` varchar(255) DEFAULT NULL,
  `period_id` int(11) NOT NULL,
  PRIMARY KEY (`apply_id`),
  KEY `period_id_idx` (`period_id`),
  KEY `decrease_type_idx` (`decrease_type`),
  KEY `main_factor_idx` (`main_factor`,`second_factor`,`third_factor`),
  KEY `second_factor_idx` (`second_factor`),
  KEY `third_factor_idx` (`third_factor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- 转存表中的数据 `apply`
--

INSERT INTO `apply` (`apply_id`, `user_id`, `original_num`, `current_num`, `decrease_type`, `main_factor`, `main_describe`, `second_factor`, `second_describe`, `third_factor`, `third_describe`, `other`, `period_id`) VALUES
(1, 1, 11000, 15000, 1, 1, '未知ing...', 2, '未知ing...', 3, '未知ing...', '未知ing...', 1),
(2, 1, 15000, 20000, 1, 1, '不知道ing...', 2, '不知道ing...', 3, '不知道ing...', '不知道ing...', 1);

-- --------------------------------------------------------

--
-- 表的结构 `approval`
--

CREATE TABLE IF NOT EXISTS `approval` (
  `approval _id` int(11) NOT NULL AUTO_INCREMENT,
  `apply_id` int(11) NOT NULL,
  `approval_status` tinyint(3) NOT NULL,
  `approval_describe` varchar(512) DEFAULT NULL,
  `approval_level` tinyint(2) NOT NULL DEFAULT '0',
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`approval _id`),
  KEY `user_id_idx` (`user_id`),
  KEY `apply_id_idx` (`apply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `decrease_type`
--

CREATE TABLE IF NOT EXISTS `decrease_type` (
  `de_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `de_type_name` varchar(255) NOT NULL,
  PRIMARY KEY (`de_type_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `decrease_type`
--

INSERT INTO `decrease_type` (`de_type_id`, `de_type_name`) VALUES
(1, '行业前景差');

-- --------------------------------------------------------

--
-- 表的结构 `enterprise`
--

CREATE TABLE IF NOT EXISTS `enterprise` (
  `enterprise_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `enterprise_address` varchar(128) NOT NULL,
  `enterprise_code` varchar(45) NOT NULL,
  `enterprise_name` varchar(128) NOT NULL,
  `enterprise_industry` int(11) NOT NULL,
  `enterprise_property` int(11) NOT NULL,
  `enterprise_business` varchar(256) NOT NULL,
  `enterprise_contactor` varchar(64) NOT NULL,
  `contactor_address` varchar(256) NOT NULL,
  `enterprise_post_code` varchar(45) NOT NULL,
  `enterprise_phone` varchar(45) NOT NULL,
  `enterprise_fax` varchar(45) NOT NULL,
  `enterprise_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`enterprise_id`),
  KEY `property_id_idx` (`enterprise_property`),
  KEY `industry_small_id_idx` (`enterprise_industry`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- 转存表中的数据 `enterprise`
--

INSERT INTO `enterprise` (`enterprise_id`, `user_id`, `enterprise_address`, `enterprise_code`, `enterprise_name`, `enterprise_industry`, `enterprise_property`, `enterprise_business`, `enterprise_contactor`, `contactor_address`, `enterprise_post_code`, `enterprise_phone`, `enterprise_fax`, `enterprise_email`) VALUES
(2, 1, '广东深圳', '100081', '会展中心', 1, 1, '教学科研', '黄复贵', '3# 107', '100081', '13051189772', '122211111', '1151650717@qq.com');

-- --------------------------------------------------------

--
-- 表的结构 `enterprise_industry_big`
--

CREATE TABLE IF NOT EXISTS `enterprise_industry_big` (
  `industry_big_id` int(11) NOT NULL AUTO_INCREMENT,
  `industry_big_name` varchar(128) NOT NULL,
  PRIMARY KEY (`industry_big_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `enterprise_industry_big`
--

INSERT INTO `enterprise_industry_big` (`industry_big_id`, `industry_big_name`) VALUES
(1, '国企');

-- --------------------------------------------------------

--
-- 表的结构 `enterprise_industry_small`
--

CREATE TABLE IF NOT EXISTS `enterprise_industry_small` (
  `industry_small_id` int(11) NOT NULL,
  `industry_small_name` varchar(128) NOT NULL,
  `industry_father` int(11) NOT NULL,
  PRIMARY KEY (`industry_small_id`),
  KEY `industry_big_id_idx` (`industry_father`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `enterprise_industry_small`
--

INSERT INTO `enterprise_industry_small` (`industry_small_id`, `industry_small_name`, `industry_father`) VALUES
(0, '中信证券', 1),
(1, '中国石油', 1);

-- --------------------------------------------------------

--
-- 表的结构 `enterprise_property`
--

CREATE TABLE IF NOT EXISTS `enterprise_property` (
  `property_id` int(11) NOT NULL AUTO_INCREMENT,
  `property_name` varchar(256) NOT NULL,
  PRIMARY KEY (`property_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `enterprise_property`
--

INSERT INTO `enterprise_property` (`property_id`, `property_name`) VALUES
(1, '国家教育');

-- --------------------------------------------------------

--
-- 表的结构 `factor`
--

CREATE TABLE IF NOT EXISTS `factor` (
  `factor_id` int(11) NOT NULL AUTO_INCREMENT,
  `factor_name` varchar(255) NOT NULL,
  PRIMARY KEY (`factor_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- 转存表中的数据 `factor`
--

INSERT INTO `factor` (`factor_id`, `factor_name`) VALUES
(1, '人才过少'),
(2, '机器设备不足'),
(3, '政策不支持');

-- --------------------------------------------------------

--
-- 表的结构 `function`
--

CREATE TABLE IF NOT EXISTS `function` (
  `func_id` int(11) NOT NULL AUTO_INCREMENT,
  `func_url` varchar(255) NOT NULL,
  `func_father_id` int(11) NOT NULL,
  `func_name` varchar(128) NOT NULL,
  `func_sort` int(11) DEFAULT NULL,
  `func_state` bit(2) NOT NULL,
  `func_level` tinyint(5) NOT NULL,
  `func_describe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`func_id`),
  KEY `func_father_id_idx` (`func_father_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `notice`
--

CREATE TABLE IF NOT EXISTS `notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT,
  `notice_title` varchar(128) NOT NULL,
  `notice_content` text NOT NULL,
  `user_id` int(11) NOT NULL,
  `release_time` datetime NOT NULL,
  PRIMARY KEY (`notice_id`),
  KEY `user_id_idx` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `period`
--

CREATE TABLE IF NOT EXISTS `period` (
  `period_id` int(11) NOT NULL AUTO_INCREMENT,
  `period_start_time` date NOT NULL,
  `period_end_time` date NOT NULL,
  `period_state` int(11) NOT NULL,
  PRIMARY KEY (`period_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `period`
--

INSERT INTO `period` (`period_id`, `period_start_time`, `period_end_time`, `period_state`) VALUES
(1, '2017-05-31', '2017-06-30', 1);

-- --------------------------------------------------------

--
-- 表的结构 `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(128) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `role_func_id`
--

CREATE TABLE IF NOT EXISTS `role_func_id` (
  `role_func_id` int(11) NOT NULL AUTO_INCREMENT,
  `func_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`role_func_id`),
  KEY `func_id_idx` (`func_id`),
  KEY `role_id_idx` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `t_user`
--

CREATE TABLE IF NOT EXISTS `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `user_type` tinyint(3) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `t_user`
--

INSERT INTO `t_user` (`user_id`, `username`, `password`, `user_type`) VALUES
(1, '黄复贵', '123', 0);

--
-- 限制导出的表
--

--
-- 限制表 `apply`
--
ALTER TABLE `apply`
  ADD CONSTRAINT `decrease_type` FOREIGN KEY (`decrease_type`) REFERENCES `decrease_type` (`de_type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `period_id` FOREIGN KEY (`period_id`) REFERENCES `period` (`period_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `second_factor` FOREIGN KEY (`second_factor`) REFERENCES `factor` (`factor_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `third_factor` FOREIGN KEY (`third_factor`) REFERENCES `factor` (`factor_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- 限制表 `enterprise`
--
ALTER TABLE `enterprise`
  ADD CONSTRAINT `industry_small_id` FOREIGN KEY (`enterprise_industry`) REFERENCES `enterprise_industry_small` (`industry_small_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `property_id` FOREIGN KEY (`enterprise_property`) REFERENCES `enterprise_property` (`property_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `enterprise_industry_small`
--
ALTER TABLE `enterprise_industry_small`
  ADD CONSTRAINT `industry_big_id` FOREIGN KEY (`industry_father`) REFERENCES `enterprise_industry_big` (`industry_big_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `function`
--
ALTER TABLE `function`
  ADD CONSTRAINT `func_father_id` FOREIGN KEY (`func_father_id`) REFERENCES `function` (`func_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `notice`
--
ALTER TABLE `notice`
  ADD CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `role_func_id`
--
ALTER TABLE `role_func_id`
  ADD CONSTRAINT `func_id` FOREIGN KEY (`func_id`) REFERENCES `function` (`func_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
