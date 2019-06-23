/*
Navicat MySQL Data Transfer

Source Server         : 172.26.28.204
Source Server Version : 50642
Source Host           : 172.26.28.204:3306
Source Database       : gas3iotyundata

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2019-01-11 14:50:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customers_user
-- ----------------------------
DROP TABLE IF EXISTS `customers_user`;
CREATE TABLE `customers_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `mobile` varchar(20) NOT NULL COMMENT '手机号',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Records of customers_user
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_calendars
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_calendars`;
CREATE TABLE `qrtz_calendars` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `CALENDAR_NAME` varchar(200) NOT NULL,
  `CALENDAR` blob NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`CALENDAR_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_calendars
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_cron_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_cron_triggers`;
CREATE TABLE `qrtz_cron_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `CRON_EXPRESSION` varchar(120) NOT NULL,
  `TIME_ZONE_ID` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`),
  CONSTRAINT `QRTZ_CRON_TRIGGERS_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) REFERENCES `qrtz_triggers` (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_cron_triggers
-- ----------------------------
INSERT INTO `qrtz_cron_triggers` VALUES ('Gasxgj3iotyunScheduler', 'TASK_1', 'DEFAULT', '0 0/30 * * * ?', 'Asia/Shanghai');
INSERT INTO `qrtz_cron_triggers` VALUES ('Gasxgj3iotyunScheduler', 'TASK_2', 'DEFAULT', '0 0/30 * * * ?', 'Asia/Shanghai');
INSERT INTO `qrtz_cron_triggers` VALUES ('schedulerFactoryBean', 'TASK_1', 'DEFAULT', '0 0/30 * * * ?', 'Asia/Shanghai');
INSERT INTO `qrtz_cron_triggers` VALUES ('schedulerFactoryBean', 'TASK_2', 'DEFAULT', '0 0/30 * * * ?', 'Asia/Shanghai');

-- ----------------------------
-- Table structure for qrtz_job_details
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_job_details`;
CREATE TABLE `qrtz_job_details` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `JOB_NAME` varchar(200) NOT NULL,
  `JOB_GROUP` varchar(200) NOT NULL,
  `DESCRIPTION` varchar(250) DEFAULT NULL,
  `JOB_CLASS_NAME` varchar(250) NOT NULL,
  `IS_DURABLE` varchar(1) NOT NULL,
  `IS_NONCONCURRENT` varchar(1) NOT NULL,
  `IS_UPDATE_DATA` varchar(1) NOT NULL,
  `REQUESTS_RECOVERY` varchar(1) NOT NULL,
  `JOB_DATA` blob,
  PRIMARY KEY (`SCHED_NAME`,`JOB_NAME`,`JOB_GROUP`),
  KEY `IDX_QRTZ_J_REQ_RECOVERY` (`SCHED_NAME`,`REQUESTS_RECOVERY`),
  KEY `IDX_QRTZ_J_GRP` (`SCHED_NAME`,`JOB_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_job_details
-- ----------------------------
INSERT INTO `qrtz_job_details` VALUES ('Gasxgj3iotyunScheduler', 'TASK_1', 'DEFAULT', null, 'com.gasxgj3iotyun.modules.job.utils.ScheduleJob', '0', '0', '0', '0', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000D4A4F425F504152414D5F4B455973720036636F6D2E67617378676A33696F7479756E2E6D6F64756C65732E6A6F622E656E746974792E5363686564756C654A6F62456E7469747900000000000000010200084C00086265616E4E616D657400124C6A6176612F6C616E672F537472696E673B4C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C000E63726F6E45787072657373696F6E71007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C000A6D6574686F644E616D6571007E00094C0006706172616D7371007E00094C000672656D61726B71007E00094C00067374617475737400134C6A6176612F6C616E672F496E74656765723B7870740008746573745461736B7372000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000158BAF593307874000E3020302F3330202A202A202A203F7372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B020000787000000000000000017400047465737474000672656E72656E74000FE69C89E58F82E695B0E6B58BE8AF95737200116A6176612E6C616E672E496E746567657212E2A0A4F781873802000149000576616C75657871007E0013000000007800);
INSERT INTO `qrtz_job_details` VALUES ('Gasxgj3iotyunScheduler', 'TASK_2', 'DEFAULT', null, 'com.gasxgj3iotyun.modules.job.utils.ScheduleJob', '0', '0', '0', '0', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000D4A4F425F504152414D5F4B455973720036636F6D2E67617378676A33696F7479756E2E6D6F64756C65732E6A6F622E656E746974792E5363686564756C654A6F62456E7469747900000000000000010200084C00086265616E4E616D657400124C6A6176612F6C616E672F537472696E673B4C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C000E63726F6E45787072657373696F6E71007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C000A6D6574686F644E616D6571007E00094C0006706172616D7371007E00094C000672656D61726B71007E00094C00067374617475737400134C6A6176612F6C616E672F496E74656765723B7870740008746573745461736B7372000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000158C377C4607874000E3020302F3330202A202A202A203F7372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B0200007870000000000000000274000574657374327074000FE697A0E58F82E695B0E6B58BE8AF95737200116A6176612E6C616E672E496E746567657212E2A0A4F781873802000149000576616C75657871007E0013000000017800);
INSERT INTO `qrtz_job_details` VALUES ('schedulerFactoryBean', 'TASK_1', 'DEFAULT', null, 'com.gasxgj3iotyun.modules.job.utils.ScheduleJob', '0', '0', '0', '0', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000D4A4F425F504152414D5F4B455973720036636F6D2E67617378676A33696F7479756E2E6D6F64756C65732E6A6F622E656E746974792E5363686564756C654A6F62456E7469747900000000000000010200084C00086265616E4E616D657400124C6A6176612F6C616E672F537472696E673B4C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C000E63726F6E45787072657373696F6E71007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C000A6D6574686F644E616D6571007E00094C0006706172616D7371007E00094C000672656D61726B71007E00094C00067374617475737400134C6A6176612F6C616E672F496E74656765723B7870740008746573745461736B7372000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000158BAF593307874000E3020302F3330202A202A202A203F7372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B020000787000000000000000017400047465737474000D67617378676A33696F7479756E74000FE69C89E58F82E695B0E6B58BE8AF95737200116A6176612E6C616E672E496E746567657212E2A0A4F781873802000149000576616C75657871007E0013000000007800);
INSERT INTO `qrtz_job_details` VALUES ('schedulerFactoryBean', 'TASK_2', 'DEFAULT', null, 'com.gasxgj3iotyun.modules.job.utils.ScheduleJob', '0', '0', '0', '0', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000D4A4F425F504152414D5F4B455973720036636F6D2E67617378676A33696F7479756E2E6D6F64756C65732E6A6F622E656E746974792E5363686564756C654A6F62456E7469747900000000000000010200084C00086265616E4E616D657400124C6A6176612F6C616E672F537472696E673B4C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C000E63726F6E45787072657373696F6E71007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C000A6D6574686F644E616D6571007E00094C0006706172616D7371007E00094C000672656D61726B71007E00094C00067374617475737400134C6A6176612F6C616E672F496E74656765723B7870740008746573745461736B7372000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000158C377C4607874000E3020302F3330202A202A202A203F7372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B0200007870000000000000000274000574657374327074000FE697A0E58F82E695B0E6B58BE8AF95737200116A6176612E6C616E672E496E746567657212E2A0A4F781873802000149000576616C75657871007E0013000000017800);

-- ----------------------------
-- Table structure for qrtz_locks
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_locks`;
CREATE TABLE `qrtz_locks` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `LOCK_NAME` varchar(40) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`LOCK_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_locks
-- ----------------------------
INSERT INTO `qrtz_locks` VALUES ('Gasxgj3iotyunScheduler', 'STATE_ACCESS');
INSERT INTO `qrtz_locks` VALUES ('Gasxgj3iotyunScheduler', 'TRIGGER_ACCESS');
INSERT INTO `qrtz_locks` VALUES ('schedulerFactoryBean', 'TRIGGER_ACCESS');

-- ----------------------------
-- Table structure for qrtz_paused_trigger_grps
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_paused_trigger_grps`;
CREATE TABLE `qrtz_paused_trigger_grps` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_paused_trigger_grps
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_scheduler_state
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_scheduler_state`;
CREATE TABLE `qrtz_scheduler_state` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `INSTANCE_NAME` varchar(200) NOT NULL,
  `LAST_CHECKIN_TIME` bigint(13) NOT NULL,
  `CHECKIN_INTERVAL` bigint(13) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`INSTANCE_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_scheduler_state
-- ----------------------------
INSERT INTO `qrtz_scheduler_state` VALUES ('Gasxgj3iotyunScheduler', 'DESKTOP-54J7H0S1546569067031', '1546572997797', '15000');
INSERT INTO `qrtz_scheduler_state` VALUES ('Gasxgj3iotyunScheduler', 'PC-PC1546569189004', '1546571302186', '15000');
INSERT INTO `qrtz_scheduler_state` VALUES ('Gasxgj3iotyunScheduler', 'tongxigang-PC1546569454602', '1546571369005', '15000');
INSERT INTO `qrtz_scheduler_state` VALUES ('Gasxgj3iotyunScheduler', 'zhangbindeMacBook-Pro.local1546569389067', '1546586039344', '15000');

-- ----------------------------
-- Table structure for qrtz_simple_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_simple_triggers`;
CREATE TABLE `qrtz_simple_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `REPEAT_COUNT` bigint(7) NOT NULL,
  `REPEAT_INTERVAL` bigint(12) NOT NULL,
  `TIMES_TRIGGERED` bigint(10) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`),
  CONSTRAINT `QRTZ_SIMPLE_TRIGGERS_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) REFERENCES `qrtz_triggers` (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_simple_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_simprop_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_simprop_triggers`;
CREATE TABLE `qrtz_simprop_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `STR_PROP_1` varchar(512) DEFAULT NULL,
  `STR_PROP_2` varchar(512) DEFAULT NULL,
  `STR_PROP_3` varchar(512) DEFAULT NULL,
  `INT_PROP_1` int(11) DEFAULT NULL,
  `INT_PROP_2` int(11) DEFAULT NULL,
  `LONG_PROP_1` bigint(20) DEFAULT NULL,
  `LONG_PROP_2` bigint(20) DEFAULT NULL,
  `DEC_PROP_1` decimal(13,4) DEFAULT NULL,
  `DEC_PROP_2` decimal(13,4) DEFAULT NULL,
  `BOOL_PROP_1` varchar(1) DEFAULT NULL,
  `BOOL_PROP_2` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`),
  CONSTRAINT `QRTZ_SIMPROP_TRIGGERS_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) REFERENCES `qrtz_triggers` (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_simprop_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_triggers`;
CREATE TABLE `qrtz_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `JOB_NAME` varchar(200) NOT NULL,
  `JOB_GROUP` varchar(200) NOT NULL,
  `DESCRIPTION` varchar(250) DEFAULT NULL,
  `NEXT_FIRE_TIME` bigint(13) DEFAULT NULL,
  `PREV_FIRE_TIME` bigint(13) DEFAULT NULL,
  `PRIORITY` int(11) DEFAULT NULL,
  `TRIGGER_STATE` varchar(16) NOT NULL,
  `TRIGGER_TYPE` varchar(8) NOT NULL,
  `START_TIME` bigint(13) NOT NULL,
  `END_TIME` bigint(13) DEFAULT NULL,
  `CALENDAR_NAME` varchar(200) DEFAULT NULL,
  `MISFIRE_INSTR` smallint(2) DEFAULT NULL,
  `JOB_DATA` blob,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`),
  KEY `IDX_QRTZ_T_J` (`SCHED_NAME`,`JOB_NAME`,`JOB_GROUP`),
  KEY `IDX_QRTZ_T_JG` (`SCHED_NAME`,`JOB_GROUP`),
  KEY `IDX_QRTZ_T_C` (`SCHED_NAME`,`CALENDAR_NAME`),
  KEY `IDX_QRTZ_T_G` (`SCHED_NAME`,`TRIGGER_GROUP`),
  KEY `IDX_QRTZ_T_STATE` (`SCHED_NAME`,`TRIGGER_STATE`),
  KEY `IDX_QRTZ_T_N_STATE` (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`,`TRIGGER_STATE`),
  KEY `IDX_QRTZ_T_N_G_STATE` (`SCHED_NAME`,`TRIGGER_GROUP`,`TRIGGER_STATE`),
  KEY `IDX_QRTZ_T_NEXT_FIRE_TIME` (`SCHED_NAME`,`NEXT_FIRE_TIME`),
  KEY `IDX_QRTZ_T_NFT_ST` (`SCHED_NAME`,`TRIGGER_STATE`,`NEXT_FIRE_TIME`),
  KEY `IDX_QRTZ_T_NFT_MISFIRE` (`SCHED_NAME`,`MISFIRE_INSTR`,`NEXT_FIRE_TIME`),
  KEY `IDX_QRTZ_T_NFT_ST_MISFIRE` (`SCHED_NAME`,`MISFIRE_INSTR`,`NEXT_FIRE_TIME`,`TRIGGER_STATE`),
  KEY `IDX_QRTZ_T_NFT_ST_MISFIRE_GRP` (`SCHED_NAME`,`MISFIRE_INSTR`,`NEXT_FIRE_TIME`,`TRIGGER_GROUP`,`TRIGGER_STATE`),
  CONSTRAINT `QRTZ_TRIGGERS_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `JOB_NAME`, `JOB_GROUP`) REFERENCES `qrtz_job_details` (`SCHED_NAME`, `JOB_NAME`, `JOB_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_triggers
-- ----------------------------
INSERT INTO `qrtz_triggers` VALUES ('Gasxgj3iotyunScheduler', 'TASK_1', 'DEFAULT', 'TASK_1', 'DEFAULT', null, '1545199200000', '-1', '5', 'PAUSED', 'CRON', '1545198983000', '0', null, '2', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000D4A4F425F504152414D5F4B455973720036636F6D2E67617378676A33696F7479756E2E6D6F64756C65732E6A6F622E656E746974792E5363686564756C654A6F62456E7469747900000000000000010200084C00086265616E4E616D657400124C6A6176612F6C616E672F537472696E673B4C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C000E63726F6E45787072657373696F6E71007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C000A6D6574686F644E616D6571007E00094C0006706172616D7371007E00094C000672656D61726B71007E00094C00067374617475737400134C6A6176612F6C616E672F496E74656765723B7870740008746573745461736B7372000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000158BAF593307874000E3020302F3330202A202A202A203F7372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B020000787000000000000000017400047465737474000D67617378676A33696F7479756E74000FE69C89E58F82E695B0E6B58BE8AF95737200116A6176612E6C616E672E496E746567657212E2A0A4F781873802000149000576616C75657871007E0013000000017800);
INSERT INTO `qrtz_triggers` VALUES ('Gasxgj3iotyunScheduler', 'TASK_2', 'DEFAULT', 'TASK_2', 'DEFAULT', null, '1545199200000', '-1', '5', 'PAUSED', 'CRON', '1545198983000', '0', null, '2', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000D4A4F425F504152414D5F4B455973720036636F6D2E67617378676A33696F7479756E2E6D6F64756C65732E6A6F622E656E746974792E5363686564756C654A6F62456E7469747900000000000000010200084C00086265616E4E616D657400124C6A6176612F6C616E672F537472696E673B4C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C000E63726F6E45787072657373696F6E71007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C000A6D6574686F644E616D6571007E00094C0006706172616D7371007E00094C000672656D61726B71007E00094C00067374617475737400134C6A6176612F6C616E672F496E74656765723B7870740008746573745461736B7372000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000158C377C4607874000E3020302F3330202A202A202A203F7372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B0200007870000000000000000274000574657374327074000FE697A0E58F82E695B0E6B58BE8AF95737200116A6176612E6C616E672E496E746567657212E2A0A4F781873802000149000576616C75657871007E0013000000017800);
INSERT INTO `qrtz_triggers` VALUES ('schedulerFactoryBean', 'TASK_1', 'DEFAULT', 'TASK_1', 'DEFAULT', null, '1546830000000', '-1', '5', 'WAITING', 'CRON', '1546828272000', '0', null, '2', '');
INSERT INTO `qrtz_triggers` VALUES ('schedulerFactoryBean', 'TASK_2', 'DEFAULT', 'TASK_2', 'DEFAULT', null, '1546830000000', '-1', '5', 'PAUSED', 'CRON', '1546828272000', '0', null, '2', '');

-- ----------------------------
-- Table structure for schedule_job
-- ----------------------------
DROP TABLE IF EXISTS `schedule_job`;
CREATE TABLE `schedule_job` (
  `job_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务id',
  `bean_name` varchar(200) DEFAULT NULL COMMENT 'spring bean名称',
  `method_name` varchar(100) DEFAULT NULL COMMENT '方法名',
  `params` varchar(2000) DEFAULT NULL COMMENT '参数',
  `cron_expression` varchar(100) DEFAULT NULL COMMENT 'cron表达式',
  `status` tinyint(4) DEFAULT NULL COMMENT '任务状态  0：正常  1：暂停',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='定时任务';

-- ----------------------------
-- Records of schedule_job
-- ----------------------------
INSERT INTO `schedule_job` VALUES ('1', 'testTask', 'test', 'gasxgj3iotyun', '0 0/30 * * * ?', '1', '有参数测试', '2016-12-01 23:16:46');
INSERT INTO `schedule_job` VALUES ('2', 'testTask', 'test2', null, '0 0/30 * * * ?', '1', '无参数测试', '2016-12-03 14:55:56');

-- ----------------------------
-- Table structure for schedule_job_log
-- ----------------------------
DROP TABLE IF EXISTS `schedule_job_log`;
CREATE TABLE `schedule_job_log` (
  `log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务日志id',
  `job_id` bigint(20) NOT NULL COMMENT '任务id',
  `bean_name` varchar(200) DEFAULT NULL COMMENT 'spring bean名称',
  `method_name` varchar(100) DEFAULT NULL COMMENT '方法名',
  `params` varchar(2000) DEFAULT NULL COMMENT '参数',
  `status` tinyint(4) NOT NULL COMMENT '任务状态    0：成功    1：失败',
  `error` varchar(2000) DEFAULT NULL COMMENT '失败信息',
  `times` int(11) NOT NULL COMMENT '耗时(单位：毫秒)',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`log_id`),
  KEY `job_id` (`job_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='定时任务日志';

-- ----------------------------
-- Records of schedule_job_log
-- ----------------------------
INSERT INTO `schedule_job_log` VALUES ('1', '1', 'testTask', 'test', 'renren', '0', null, '1015', '2018-12-19 14:00:00');
INSERT INTO `schedule_job_log` VALUES ('2', '1', 'testTask', 'test', 'renren', '0', null, '1005', '2018-12-19 14:30:00');
INSERT INTO `schedule_job_log` VALUES ('3', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1106', '2018-12-19 17:00:00');
INSERT INTO `schedule_job_log` VALUES ('4', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1075', '2018-12-19 17:30:01');
INSERT INTO `schedule_job_log` VALUES ('5', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1097', '2019-01-04 13:30:00');
INSERT INTO `schedule_job_log` VALUES ('6', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1029', '2019-01-04 14:00:00');
INSERT INTO `schedule_job_log` VALUES ('7', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1011', '2019-01-04 14:30:00');
INSERT INTO `schedule_job_log` VALUES ('8', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1024', '2019-01-04 15:00:00');
INSERT INTO `schedule_job_log` VALUES ('9', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1018', '2019-01-04 15:30:00');
INSERT INTO `schedule_job_log` VALUES ('10', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1011', '2019-01-04 16:00:00');
INSERT INTO `schedule_job_log` VALUES ('11', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1020', '2019-01-04 16:30:00');
INSERT INTO `schedule_job_log` VALUES ('12', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1081', '2019-01-07 11:00:00');
INSERT INTO `schedule_job_log` VALUES ('13', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1026', '2019-01-07 11:30:00');
INSERT INTO `schedule_job_log` VALUES ('14', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1043', '2019-01-07 12:00:00');
INSERT INTO `schedule_job_log` VALUES ('15', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1178', '2019-01-07 12:30:00');
INSERT INTO `schedule_job_log` VALUES ('16', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1038', '2019-01-07 13:00:00');
INSERT INTO `schedule_job_log` VALUES ('17', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1018', '2019-01-07 13:30:00');
INSERT INTO `schedule_job_log` VALUES ('18', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1110', '2019-01-07 14:00:00');
INSERT INTO `schedule_job_log` VALUES ('19', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1155', '2019-01-07 14:30:00');
INSERT INTO `schedule_job_log` VALUES ('20', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1014', '2019-01-07 15:00:00');
INSERT INTO `schedule_job_log` VALUES ('21', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1494', '2019-01-07 15:30:00');
INSERT INTO `schedule_job_log` VALUES ('22', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1010', '2019-01-07 16:00:00');
INSERT INTO `schedule_job_log` VALUES ('23', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1022', '2019-01-07 16:30:00');
INSERT INTO `schedule_job_log` VALUES ('24', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1022', '2019-01-07 17:00:00');
INSERT INTO `schedule_job_log` VALUES ('25', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1119', '2019-01-07 17:30:00');
INSERT INTO `schedule_job_log` VALUES ('26', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1017', '2019-01-07 18:00:00');
INSERT INTO `schedule_job_log` VALUES ('27', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1043', '2019-01-07 18:30:00');
INSERT INTO `schedule_job_log` VALUES ('28', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1014', '2019-01-07 19:00:00');
INSERT INTO `schedule_job_log` VALUES ('29', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1016', '2019-01-07 19:30:00');
INSERT INTO `schedule_job_log` VALUES ('30', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '2402', '2019-01-08 09:00:00');
INSERT INTO `schedule_job_log` VALUES ('31', '1', 'testTask', 'test', 'gasxgj3iotyun', '0', null, '1053', '2019-01-08 09:30:00');

-- ----------------------------
-- Table structure for sys_box
-- ----------------------------
DROP TABLE IF EXISTS `sys_box`;
CREATE TABLE `sys_box` (
  `box_id` varchar(100) NOT NULL COMMENT '箱子唯一id',
  `box_version` varchar(100) DEFAULT NULL COMMENT '箱子版本',
  `box_factory` varchar(100) DEFAULT NULL COMMENT '所属工厂',
  `box_conpany` varchar(100) DEFAULT NULL COMMENT '所属公司',
  `box_address` varchar(100) DEFAULT NULL COMMENT '箱子地址',
  `box_name` varchar(100) DEFAULT NULL COMMENT '箱子名称',
  `box_type` int(20) DEFAULT NULL COMMENT '箱子联系 1自建2，代管',
  `box_time` datetime DEFAULT NULL COMMENT '创建时间',
  `box_image` varchar(2000) DEFAULT NULL COMMENT '箱子图片',
  `process drawing` varchar(2000) DEFAULT NULL COMMENT '工艺图 ，设计图',
  PRIMARY KEY (`box_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_box
-- ----------------------------

-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_config`;
CREATE TABLE `sys_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `param_key` varchar(50) DEFAULT NULL COMMENT 'key',
  `param_value` varchar(2000) DEFAULT NULL COMMENT 'value',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态   0：隐藏   1：显示',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `param_key` (`param_key`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统配置信息表';

-- ----------------------------
-- Records of sys_config
-- ----------------------------
INSERT INTO `sys_config` VALUES ('1', 'CLOUD_STORAGE_CONFIG_KEY', '{\"aliyunAccessKeyId\":\"\",\"aliyunAccessKeySecret\":\"\",\"aliyunBucketName\":\"\",\"aliyunDomain\":\"\",\"aliyunEndPoint\":\"\",\"aliyunPrefix\":\"\",\"qcloudBucketName\":\"\",\"qcloudDomain\":\"\",\"qcloudPrefix\":\"\",\"qcloudSecretId\":\"\",\"qcloudSecretKey\":\"\",\"qiniuAccessKey\":\"NrgMfABZxWLo5B-YYSjoE8-AZ1EISdi1Z3ubLOeZ\",\"qiniuBucketName\":\"ios-app\",\"qiniuDomain\":\"http://7xqbwh.dl1.z0.glb.clouddn.com\",\"qiniuPrefix\":\"upload\",\"qiniuSecretKey\":\"uIwJHevMRWU0VLxFvgy0tAcOdGqasdtVlJkdy6vV\",\"type\":1}', '0', '云存储配置信息');

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上级公司ID，一级公司为0',
  `name` varchar(50) DEFAULT NULL COMMENT '公司名称',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `del_flag` tinyint(4) DEFAULT '0' COMMENT '是否删除  -1：已删除  0：正常',
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='公司管理';

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES ('1', '0', '智能燃气管理运营平台', '0', '0');
INSERT INTO `sys_dept` VALUES ('2', '1', '北京分公司', '1', '0');
INSERT INTO `sys_dept` VALUES ('3', '1', '上海分公司', '2', '0');
INSERT INTO `sys_dept` VALUES ('4', '3', '技术部', '0', '0');
INSERT INTO `sys_dept` VALUES ('5', '3', '销售部', '1', '0');
INSERT INTO `sys_dept` VALUES ('6', '1', '北京鑫广进燃气设备研究所', '0', '0');
INSERT INTO `sys_dept` VALUES ('7', '1', '北京云普华星信息技术有限公司', '0', '0');
INSERT INTO `sys_dept` VALUES ('8', '1', '鑫广进燃气设备研究所内蒙有限公司', '0', '0');
INSERT INTO `sys_dept` VALUES ('9', '7', '技术部门', '0', '0');
INSERT INTO `sys_dept` VALUES ('10', '7', '销售部门', '0', '0');
INSERT INTO `sys_dept` VALUES ('11', '8', '销售部', '0', '0');
INSERT INTO `sys_dept` VALUES ('12', '8', '软件技术部', '0', '0');
INSERT INTO `sys_dept` VALUES ('13', '8', '硬件技术部', '0', '0');
INSERT INTO `sys_dept` VALUES ('14', '8', '售后服务部', '0', '0');
INSERT INTO `sys_dept` VALUES ('15', '6', '硬件研发部', '0', '0');
INSERT INTO `sys_dept` VALUES ('16', '6', '软件研发部', '0', '0');
INSERT INTO `sys_dept` VALUES ('17', '6', '销售部', '0', '0');
INSERT INTO `sys_dept` VALUES ('18', '6', '售后服务部', '0', '0');

-- ----------------------------
-- Table structure for sys_device
-- ----------------------------
DROP TABLE IF EXISTS `sys_device`;
CREATE TABLE `sys_device` (
  `device_id` varchar(200) NOT NULL COMMENT '设备唯一标识',
  `device_type` int(20) NOT NULL COMMENT '设备类型：0智能调压器1.采集仪',
  `device_status` int(20) NOT NULL COMMENT '1使用2.停用',
  `device_dtuid` varchar(100) DEFAULT NULL COMMENT 'DTU编号',
  `sys_device_modelllist` varchar(200) DEFAULT NULL COMMENT '选择模型（数据类型记录表）',
  `device_road_id` varchar(200) DEFAULT NULL COMMENT '路信息外键',
  `device_sysname` varchar(200) DEFAULT NULL COMMENT '系统展示名称',
  `device_sim` varchar(200) DEFAULT NULL COMMENT 'sim卡编号',
  `device_datatablename` varchar(200) DEFAULT NULL COMMENT '生成的表名',
  `device_pic_phone` varchar(100) DEFAULT NULL COMMENT '负责人手机号',
  `device_pic_email` varchar(100) DEFAULT NULL COMMENT '负责人邮箱',
  `device_pic_weixin` varchar(100) DEFAULT NULL COMMENT '负责人微信',
  `device_ uniqueNO` varchar(100) DEFAULT NULL COMMENT '硬件生成唯一编码',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_device
-- ----------------------------

-- ----------------------------
-- Table structure for sys_device_model_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_device_model_relation`;
CREATE TABLE `sys_device_model_relation` (
  `device_model_id` varchar(100) NOT NULL DEFAULT '' COMMENT '唯一id',
  `model_id` varchar(100) DEFAULT NULL COMMENT '模型关联id',
  `device_id` varchar(100) NOT NULL DEFAULT '' COMMENT '设备关联id(就是采集仪)',
  PRIMARY KEY (`device_model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_device_model_relation
-- ----------------------------

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '字典名称',
  `type` varchar(100) NOT NULL COMMENT '字典类型',
  `code` varchar(100) NOT NULL COMMENT '字典码',
  `value` varchar(1000) NOT NULL COMMENT '字典值',
  `order_num` int(11) DEFAULT '0' COMMENT '排序',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `del_flag` tinyint(4) DEFAULT '0' COMMENT '删除标记  -1：已删除  0：正常',
  PRIMARY KEY (`id`),
  UNIQUE KEY `type` (`type`,`code`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='数据字典表';

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO `sys_dict` VALUES ('1', '性别', 'sex', '0', '女', '0', null, '0');
INSERT INTO `sys_dict` VALUES ('2', '性别', 'sex', '1', '男', '1', null, '0');
INSERT INTO `sys_dict` VALUES ('3', '性别', 'sex', '2', '未知', '3', null, '0');

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `operation` varchar(50) DEFAULT NULL COMMENT '用户操作',
  `method` varchar(200) DEFAULT NULL COMMENT '请求方法',
  `params` varchar(5000) DEFAULT NULL COMMENT '请求参数',
  `time` bigint(20) NOT NULL COMMENT '执行时长(毫秒)',
  `ip` varchar(64) DEFAULT NULL COMMENT 'IP地址',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 COMMENT='系统日志';

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('1', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":1,\"parentId\":0,\"parentName\":\"一级菜单\",\"name\":\"权限管理\",\"type\":0,\"icon\":\"icon-safetycertificate\",\"orderNum\":0}', '211', '0:0:0:0:0:0:0:1', '2018-12-19 17:24:54');
INSERT INTO `sys_log` VALUES ('2', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":1,\"parentId\":0,\"parentName\":\"一级菜单\",\"name\":\"权限管理\",\"type\":0,\"icon\":\"fa fa-cog\",\"orderNum\":0}', '256', '0:0:0:0:0:0:0:1', '2018-12-19 17:26:07');
INSERT INTO `sys_log` VALUES ('3', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":1,\"parentId\":0,\"parentName\":\"一级菜单\",\"name\":\"权限管理\",\"type\":0,\"icon\":\"fa fa-envelope-open\",\"orderNum\":0}', '20', '0:0:0:0:0:0:0:1', '2018-12-19 17:37:04');
INSERT INTO `sys_log` VALUES ('4', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":1,\"parentId\":0,\"parentName\":\"一级菜单\",\"name\":\"权限管理\",\"type\":0,\"icon\":\"icon-safetycertificate\",\"orderNum\":0}', '7', '0:0:0:0:0:0:0:1', '2018-12-19 17:37:41');
INSERT INTO `sys_log` VALUES ('5', 'admin', '修改密码', 'com.gasxgj3iotyun.modules.sys.controller.SysUserController.password()', '\"admin\"', '5', '0:0:0:0:0:0:0:1', '2018-12-19 17:52:13');
INSERT INTO `sys_log` VALUES ('6', 'admin', '修改密码', 'com.gasxgj3iotyun.modules.sys.controller.SysUserController.password()', '\"admin\"', '5', '0:0:0:0:0:0:0:1', '2018-12-19 17:52:21');
INSERT INTO `sys_log` VALUES ('7', 'admin', '保存角色', 'com.gasxgj3iotyun.modules.sys.controller.SysRoleController.save()', '{\"roleId\":1,\"roleName\":\"系统管理员Adminstartor\",\"remark\":\"超级系统管理员Adminstartor\",\"deptId\":1,\"deptName\":\"智能燃气管理运营平台\",\"menuIdList\":[],\"deptIdList\":[1,2,3,4,5,6],\"createTime\":\"Jan 7, 2019 2:23:38 PM\"}', '183', '0:0:0:0:0:0:0:1', '2019-01-07 00:23:39');
INSERT INTO `sys_log` VALUES ('8', 'admin', '修改角色', 'com.gasxgj3iotyun.modules.sys.controller.SysRoleController.update()', '{\"roleId\":1,\"roleName\":\"系统管理员角色Adminstartor\",\"remark\":\"超级系统管理员Adminstartor\",\"deptId\":1,\"deptName\":\"智能燃气管理运营平台\",\"menuIdList\":[],\"deptIdList\":[1,2,3,4,5,6],\"createTime\":\"Jan 7, 2019 2:23:39 PM\"}', '87', '0:0:0:0:0:0:0:1', '2019-01-07 00:24:02');
INSERT INTO `sys_log` VALUES ('9', 'admin', '保存角色', 'com.gasxgj3iotyun.modules.sys.controller.SysRoleController.save()', '{\"roleId\":2,\"roleName\":\"鑫广进燃气设备研究所内蒙有限公司\",\"remark\":\"鑫广进燃气设备研究所内蒙有限公司-角色\",\"deptId\":8,\"deptName\":\"鑫广进燃气设备研究所内蒙有限公司\",\"menuIdList\":[],\"deptIdList\":[8,11,12,13,14],\"createTime\":\"Jan 7, 2019 2:25:01 PM\"}', '95', '0:0:0:0:0:0:0:1', '2019-01-07 00:25:01');
INSERT INTO `sys_log` VALUES ('10', 'admin', '保存角色', 'com.gasxgj3iotyun.modules.sys.controller.SysRoleController.save()', '{\"roleId\":3,\"roleName\":\"北京鑫广进燃气设备研究所(角色)\",\"remark\":\"北京鑫广进燃气设备研究所-角色\",\"deptId\":6,\"deptName\":\"北京鑫广进燃气设备研究所\",\"menuIdList\":[],\"deptIdList\":[],\"createTime\":\"Jan 7, 2019 2:25:50 PM\"}', '47', '0:0:0:0:0:0:0:1', '2019-01-07 00:25:50');
INSERT INTO `sys_log` VALUES ('11', 'admin', '修改角色', 'com.gasxgj3iotyun.modules.sys.controller.SysRoleController.update()', '{\"roleId\":2,\"roleName\":\"鑫广进燃气设备研究所内蒙有限公司(角色)\",\"remark\":\"鑫广进燃气设备研究所内蒙有限公司-角色\",\"deptId\":8,\"deptName\":\"鑫广进燃气设备研究所内蒙有限公司\",\"menuIdList\":[],\"deptIdList\":[8,11,12,13,14],\"createTime\":\"Jan 7, 2019 2:25:01 PM\"}', '200', '0:0:0:0:0:0:0:1', '2019-01-07 00:26:21');
INSERT INTO `sys_log` VALUES ('12', 'admin', '修改角色', 'com.gasxgj3iotyun.modules.sys.controller.SysRoleController.update()', '{\"roleId\":2,\"roleName\":\"鑫广进内蒙燃气设备研究(角色)\",\"remark\":\"鑫广进燃气设备研究所内蒙有限公司-角色\",\"deptId\":8,\"deptName\":\"鑫广进燃气设备研究所内蒙有限公司\",\"menuIdList\":[],\"deptIdList\":[8,11,12,13,14],\"createTime\":\"Jan 7, 2019 2:25:01 PM\"}', '60', '0:0:0:0:0:0:0:1', '2019-01-07 00:26:58');
INSERT INTO `sys_log` VALUES ('13', 'admin', '保存角色', 'com.gasxgj3iotyun.modules.sys.controller.SysRoleController.save()', '{\"roleId\":4,\"roleName\":\"北京云普华星(角色)\",\"remark\":\"北京云普华星信息技术有限公司\",\"deptId\":7,\"deptName\":\"北京云普华星信自技术有限公司\",\"menuIdList\":[],\"deptIdList\":[],\"createTime\":\"Jan 7, 2019 2:28:00 PM\"}', '52', '0:0:0:0:0:0:0:1', '2019-01-07 00:28:01');
INSERT INTO `sys_log` VALUES ('14', 'admin', '暂停定时任务', 'com.gasxgj3iotyun.modules.job.controller.ScheduleJobController.pause()', '[1]', '138', '0:0:0:0:0:0:0:1', '2019-01-07 00:40:27');
INSERT INTO `sys_log` VALUES ('15', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":36,\"parentId\":-1,\"name\":\"字典管理\",\"url\":\"modules/sys/dict.html\",\"type\":1,\"icon\":\"fa fa-bookmark-o\",\"orderNum\":4}', '33', '0:0:0:0:0:0:0:1', '2019-01-07 00:41:42');
INSERT INTO `sys_log` VALUES ('16', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":36,\"parentId\":-1,\"name\":\"字典管理\",\"url\":\"modules/sys/dict.html\",\"type\":1,\"icon\":\"fa fa-bookmark-o\",\"orderNum\":3}', '27', '0:0:0:0:0:0:0:1', '2019-01-07 00:44:13');
INSERT INTO `sys_log` VALUES ('17', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":29,\"parentId\":-1,\"name\":\"系统日志\",\"url\":\"modules/sys/log.html\",\"perms\":\"sys:log:list\",\"type\":1,\"icon\":\"fa fa-file-text-o\",\"orderNum\":3}', '45', '0:0:0:0:0:0:0:1', '2019-01-07 00:44:41');
INSERT INTO `sys_log` VALUES ('18', 'admin', '修改密码', 'com.gasxgj3iotyun.modules.sys.controller.SysUserController.password()', '\"123456\"', '37', '0:0:0:0:0:0:0:1', '2019-01-08 09:45:53');
INSERT INTO `sys_log` VALUES ('19', 'admin', '删除菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.delete()', '30', '0', '0:0:0:0:0:0:0:1', '2019-01-08 09:49:31');
INSERT INTO `sys_log` VALUES ('20', 'admin', '暂停定时任务', 'com.gasxgj3iotyun.modules.job.controller.ScheduleJobController.pause()', '[1]', '94', '0:0:0:0:0:0:0:1', '2019-01-08 09:52:14');
INSERT INTO `sys_log` VALUES ('21', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":-1,\"parentId\":0,\"name\":\"系统设置\",\"type\":0,\"icon\":\"fa fa-cog\",\"orderNum\":1}', '12', '0:0:0:0:0:0:0:1', '2019-01-08 09:55:37');
INSERT INTO `sys_log` VALUES ('22', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":1,\"parentId\":0,\"name\":\"权限管理\",\"type\":0,\"icon\":\"fa fa-superpowers\",\"orderNum\":2}', '222', '0:0:0:0:0:0:0:1', '2019-01-08 09:55:49');
INSERT INTO `sys_log` VALUES ('23', 'admin', '保存菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.save()', '{\"menuId\":42,\"parentId\":0,\"name\":\"硬件产品\",\"type\":0,\"orderNum\":3}', '22', '0:0:0:0:0:0:0:1', '2019-01-08 09:56:49');
INSERT INTO `sys_log` VALUES ('24', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":42,\"parentId\":0,\"name\":\"硬件产品\",\"type\":0,\"icon\":\"fa fa-product-hunt\",\"orderNum\":3}', '62', '0:0:0:0:0:0:0:1', '2019-01-08 09:57:23');
INSERT INTO `sys_log` VALUES ('25', 'admin', '保存菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.save()', '{\"menuId\":43,\"parentId\":0,\"name\":\"产品列表\",\"url\":\"productlist\",\"perms\":\"\",\"type\":1,\"orderNum\":0}', '22', '0:0:0:0:0:0:0:1', '2019-01-08 10:15:42');
INSERT INTO `sys_log` VALUES ('26', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":43,\"parentId\":0,\"name\":\"产品列表\",\"url\":\"modules/hardwareProduct/productlist.html\",\"perms\":\"\",\"type\":1,\"orderNum\":0}', '13', '0:0:0:0:0:0:0:1', '2019-01-08 10:17:38');
INSERT INTO `sys_log` VALUES ('27', 'admin', '保存菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.save()', '{\"menuId\":44,\"parentId\":0,\"name\":\"硬件设备\",\"type\":0,\"orderNum\":3}', '11', '0:0:0:0:0:0:0:1', '2019-01-08 10:18:07');
INSERT INTO `sys_log` VALUES ('28', 'admin', '保存菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.save()', '{\"menuId\":45,\"parentId\":0,\"name\":\"设备列表\",\"url\":\"modules/hardwaredevices/deviceslist.html\",\"type\":1,\"orderNum\":0}', '10', '0:0:0:0:0:0:0:1', '2019-01-08 10:19:51');
INSERT INTO `sys_log` VALUES ('29', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":250,\"parentId\":0,\"name\":\"硬件设备\",\"type\":0,\"icon\":\"fa fa-deaf\",\"orderNum\":3}', '20', '0:0:0:0:0:0:0:1', '2019-01-08 10:24:36');
INSERT INTO `sys_log` VALUES ('30', 'admin', '保存菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.save()', '{\"menuId\":50,\"parentId\":0,\"name\":\"产品列表\",\"url\":\"sys/model/list\",\"perms\":\"sys:model:list\",\"type\":1,\"orderNum\":0}', '57', '0:0:0:0:0:0:0:1', '2019-01-10 20:45:21');
INSERT INTO `sys_log` VALUES ('31', 'admin', '保存菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.save()', '{\"menuId\":51,\"parentId\":0,\"name\":\"删除\",\"url\":\"sys/product/delete\",\"perms\":\"sys:model:delete\",\"type\":1,\"orderNum\":0}', '10', '0:0:0:0:0:0:0:1', '2019-01-10 20:46:33');
INSERT INTO `sys_log` VALUES ('32', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":51,\"parentId\":0,\"name\":\"删除\",\"url\":\"sys/product/delete\",\"perms\":\"sys:model:delete\",\"type\":1,\"orderNum\":0}', '56', '0:0:0:0:0:0:0:1', '2019-01-10 20:52:15');
INSERT INTO `sys_log` VALUES ('33', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', null, '7', '0:0:0:0:0:0:0:1', '2019-01-10 21:03:32');
INSERT INTO `sys_log` VALUES ('34', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', null, '8', '0:0:0:0:0:0:0:1', '2019-01-10 21:08:44');
INSERT INTO `sys_log` VALUES ('35', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', null, '158', '0:0:0:0:0:0:0:1', '2019-01-11 09:07:10');
INSERT INTO `sys_log` VALUES ('36', 'admin', '删除菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.delete()', '51', '165', '0:0:0:0:0:0:0:1', '2019-01-11 09:08:40');
INSERT INTO `sys_log` VALUES ('37', 'admin', '删除菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.delete()', '50', '15', '0:0:0:0:0:0:0:1', '2019-01-11 09:08:48');
INSERT INTO `sys_log` VALUES ('38', 'admin', '保存菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.save()', '{\"menuId\":52,\"parentId\":0,\"name\":\"test\",\"url\":\"modules/road/road.html\",\"type\":1,\"orderNum\":0}', '60', '0:0:0:0:0:0:0:1', '2019-01-11 11:44:59');
INSERT INTO `sys_log` VALUES ('39', 'admin', '修改菜单', 'com.gasxgj3iotyun.modules.sys.controller.SysMenuController.update()', '{\"menuId\":201,\"parentId\":200,\"name\":\"产品列表\",\"url\":\"modules/product/productlist.html\",\"perms\":\"sys:model:list\",\"type\":1,\"orderNum\":0}', '70', '0:0:0:0:0:0:0:1', '2019-01-11 13:34:39');
INSERT INTO `sys_log` VALUES ('40', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547185984738\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547185984675\"}', '20', '0:0:0:0:0:0:0:1', '2019-01-11 13:53:05');
INSERT INTO `sys_log` VALUES ('41', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547186358526\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547186358468\"}', '5', '0:0:0:0:0:0:0:1', '2019-01-11 13:59:19');
INSERT INTO `sys_log` VALUES ('42', 'admin', '删除用户', 'com.gasxgj3iotyun.modules.sys.controller.SysUserController.delete()', '[1121212121212]', '23', '0:0:0:0:0:0:0:1', '2019-01-11 13:59:23');
INSERT INTO `sys_log` VALUES ('43', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547186364564\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"username\":\"\",\"_\":\"1547186358469\"}', '11', '0:0:0:0:0:0:0:1', '2019-01-11 13:59:25');
INSERT INTO `sys_log` VALUES ('44', 'admin', '删除用户', 'com.gasxgj3iotyun.modules.sys.controller.SysUserController.delete()', '[1121212121212]', '10', '0:0:0:0:0:0:0:1', '2019-01-11 13:59:30');
INSERT INTO `sys_log` VALUES ('45', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547186373061\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"username\":\"\",\"_\":\"1547186358470\"}', '5', '0:0:0:0:0:0:0:1', '2019-01-11 13:59:33');
INSERT INTO `sys_log` VALUES ('46', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547186466584\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547186466513\"}', '31', '0:0:0:0:0:0:0:1', '2019-01-11 14:01:07');
INSERT INTO `sys_log` VALUES ('47', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547186695637\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547186695512\"}', '16', '0:0:0:0:0:0:0:1', '2019-01-11 14:04:56');
INSERT INTO `sys_log` VALUES ('48', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547186972504\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547186972387\"}', '22', '0:0:0:0:0:0:0:1', '2019-01-11 14:09:33');
INSERT INTO `sys_log` VALUES ('49', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547187212879\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547187212774\"}', '19', '0:0:0:0:0:0:0:1', '2019-01-11 14:13:33');
INSERT INTO `sys_log` VALUES ('50', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547187396690\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547187396506\"}', '19', '0:0:0:0:0:0:0:1', '2019-01-11 14:16:37');
INSERT INTO `sys_log` VALUES ('51', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547187761310\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547187761169\"}', '28', '0:0:0:0:0:0:0:1', '2019-01-11 14:22:41');
INSERT INTO `sys_log` VALUES ('52', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547188032506\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547188032271\"}', '28', '0:0:0:0:0:0:0:1', '2019-01-11 14:27:13');
INSERT INTO `sys_log` VALUES ('53', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547188120906\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547188120848\"}', '7', '0:0:0:0:0:0:0:1', '2019-01-11 14:28:41');
INSERT INTO `sys_log` VALUES ('54', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547188310293\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547188310168\"}', '18', '0:0:0:0:0:0:0:1', '2019-01-11 14:31:50');
INSERT INTO `sys_log` VALUES ('55', 'admin', '删除用户', 'com.gasxgj3iotyun.modules.sys.controller.SysUserController.delete()', '[1]', '3', '0:0:0:0:0:0:0:1', '2019-01-11 14:35:22');
INSERT INTO `sys_log` VALUES ('56', 'admin', '删除用户', 'com.gasxgj3iotyun.modules.sys.controller.SysUserController.delete()', '[1]', '0', '0:0:0:0:0:0:0:1', '2019-01-11 14:35:54');
INSERT INTO `sys_log` VALUES ('57', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547188967063\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547188966952\"}', '15', '0:0:0:0:0:0:0:1', '2019-01-11 14:42:47');
INSERT INTO `sys_log` VALUES ('58', 'admin', '模型列表', 'com.gasxgj3iotyun.modules.product.controller.ModelController.list()', '{\"_search\":\"false\",\"nd\":\"1547189067593\",\"limit\":\"10\",\"page\":\"1\",\"sidx\":\"\",\"order\":\"asc\",\"_\":\"1547189067415\"}', '5', '0:0:0:0:0:0:0:1', '2019-01-11 14:44:28');
INSERT INTO `sys_log` VALUES ('59', 'admin', '删除用户', 'com.gasxgj3iotyun.modules.product.controller.RoadController.delete()', '[\"1\"]', '11', '0:0:0:0:0:0:0:1', '2019-01-11 14:48:56');
INSERT INTO `sys_log` VALUES ('60', 'admin', '删除用户', 'com.gasxgj3iotyun.modules.product.controller.RoadController.delete()', '[\"10\"]', '8', '0:0:0:0:0:0:0:1', '2019-01-11 14:49:58');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(200) DEFAULT NULL COMMENT '菜单URL',
  `perms` varchar(500) DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `type` int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COMMENT='菜单管理';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('-1', '0', '系统设置', null, null, '0', 'fa fa-cog', '1');
INSERT INTO `sys_menu` VALUES ('1', '0', '权限管理', null, null, '0', 'fa fa-superpowers', '2');
INSERT INTO `sys_menu` VALUES ('2', '1', '管理员管理', 'modules/sys/user.html', null, '1', 'fa fa-user', '1');
INSERT INTO `sys_menu` VALUES ('3', '1', '角色管理', 'modules/sys/role.html', null, '1', 'fa fa-user-secret', '2');
INSERT INTO `sys_menu` VALUES ('4', '-1', '菜单管理', 'modules/sys/menu.html', null, '1', 'fa fa-th-list', '3');
INSERT INTO `sys_menu` VALUES ('5', '-1', 'SQL监控', 'druid/sql.html', null, '1', 'fa fa-bug', '4');
INSERT INTO `sys_menu` VALUES ('15', '2', '查看', null, 'sys:user:list,sys:user:info', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('16', '2', '新增', null, 'sys:user:save,sys:role:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('17', '2', '修改', null, 'sys:user:update,sys:role:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('18', '2', '删除', null, 'sys:user:delete', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('19', '3', '查看', null, 'sys:role:list,sys:role:info', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('20', '3', '新增', null, 'sys:role:save,sys:menu:perms', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('21', '3', '修改', null, 'sys:role:update,sys:menu:perms', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('22', '3', '删除', null, 'sys:role:delete', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('23', '4', '查看', null, 'sys:menu:list,sys:menu:info', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('24', '4', '新增', null, 'sys:menu:save,sys:menu:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('25', '4', '修改', null, 'sys:menu:update,sys:menu:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('26', '4', '删除', null, 'sys:menu:delete', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('27', '-1', '参数管理', 'modules/sys/config.html', 'sys:config:list,sys:config:info,sys:config:save,sys:config:update,sys:config:delete', '1', 'fa fa-sun-o', '6');
INSERT INTO `sys_menu` VALUES ('29', '-1', '系统日志', 'modules/sys/log.html', 'sys:log:list', '1', 'fa fa-file-text-o', '3');
INSERT INTO `sys_menu` VALUES ('31', '1', '公司管理', 'modules/sys/dept.html', null, '1', 'fa fa-file-code-o', '1');
INSERT INTO `sys_menu` VALUES ('32', '31', '查看', null, 'sys:dept:list,sys:dept:info', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('33', '31', '新增', null, 'sys:dept:save,sys:dept:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('34', '31', '修改', null, 'sys:dept:update,sys:dept:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('35', '31', '删除', null, 'sys:dept:delete', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('36', '-1', '字典管理', 'modules/sys/dict.html', null, '1', 'fa fa-bookmark-o', '3');
INSERT INTO `sys_menu` VALUES ('37', '36', '查看', null, 'sys:dict:list,sys:dict:info', '2', null, '6');
INSERT INTO `sys_menu` VALUES ('38', '36', '新增', null, 'sys:dict:save', '2', null, '6');
INSERT INTO `sys_menu` VALUES ('39', '36', '修改', null, 'sys:dict:update', '2', null, '6');
INSERT INTO `sys_menu` VALUES ('40', '36', '删除', null, 'sys:dict:delete', '2', null, '6');
INSERT INTO `sys_menu` VALUES ('52', '0', 'test', 'modules/road/road.html', null, '1', null, '0');
INSERT INTO `sys_menu` VALUES ('200', '0', '硬件产品', null, null, '0', 'fa fa-product-hunt', '3');
INSERT INTO `sys_menu` VALUES ('201', '200', '产品列表', 'modules/product/productlist.html', 'sys:model:list', '1', null, '0');
INSERT INTO `sys_menu` VALUES ('202', '201', '查看', null, 'sys:product:list,sys:product:info', '2', null, '6');
INSERT INTO `sys_menu` VALUES ('203', '201', '新增', null, 'sys:product:save', '2', null, '6');
INSERT INTO `sys_menu` VALUES ('204', '201', '修改', null, 'sys:product:update', '2', null, '6');
INSERT INTO `sys_menu` VALUES ('205', '201', '删除', null, 'sys:product:delete', '2', null, '6');
INSERT INTO `sys_menu` VALUES ('250', '0', '硬件设备', null, null, '0', 'fa fa-deaf', '3');
INSERT INTO `sys_menu` VALUES ('251', '250', '设备列表', 'modules/devices/deviceslist.html', null, '1', null, '0');

-- ----------------------------
-- Table structure for sys_model
-- ----------------------------
DROP TABLE IF EXISTS `sys_model`;
CREATE TABLE `sys_model` (
  `model_id` varchar(100) NOT NULL COMMENT '唯一',
  `model_name` varchar(50) NOT NULL COMMENT '模型名称',
  `model_identifying` varchar(100) NOT NULL COMMENT '模型标识',
  `model_datatype` varchar(100) NOT NULL COMMENT '数据类型',
  `model_spam` varchar(100) NOT NULL COMMENT '取值范围',
  `model_unit` varchar(255) DEFAULT NULL COMMENT '单位',
  `model_readorwrite` int(30) DEFAULT NULL COMMENT '读写类型：0读写1只读',
  `model_desc` varchar(200) DEFAULT NULL COMMENT '模型描述',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_model
-- ----------------------------
INSERT INTO `sys_model` VALUES ('1121212121212', '1', '1', '1', '1', '1', '1', '1', '2019-01-10 20:43:06');
INSERT INTO `sys_model` VALUES ('2', '2', '2', '2', '2', '2', '2', '2', '2019-01-10 20:43:23');

-- ----------------------------
-- Table structure for sys_oss
-- ----------------------------
DROP TABLE IF EXISTS `sys_oss`;
CREATE TABLE `sys_oss` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(200) DEFAULT NULL COMMENT 'URL地址',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文件上传';

-- ----------------------------
-- Records of sys_oss
-- ----------------------------

-- ----------------------------
-- Table structure for sys_product
-- ----------------------------
DROP TABLE IF EXISTS `sys_product`;
CREATE TABLE `sys_product` (
  `productId` varchar(100) NOT NULL COMMENT '产品id',
  `product_name` varchar(100) DEFAULT NULL COMMENT '产品名称',
  `version` varchar(100) DEFAULT NULL COMMENT '产品版本',
  `nodetype` varchar(100) DEFAULT NULL COMMENT '节点类型',
  `gateway` int(100) DEFAULT NULL COMMENT '是否接入网关 0是 1否 ',
  `type_id` varchar(100) DEFAULT NULL COMMENT '产品类型id关联',
  `network` int(100) DEFAULT NULL COMMENT '联网方式 1.3g 2.蜂巢 3.wifi',
  `status` int(100) DEFAULT NULL COMMENT '0 .发布 1.未发布 2.发布中 3.下线',
  `authentication` int(100) DEFAULT NULL COMMENT '是否id认证',
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_product
-- ----------------------------

-- ----------------------------
-- Table structure for sys_product_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_product_type`;
CREATE TABLE `sys_product_type` (
  `product_type_id` varchar(255) NOT NULL COMMENT '唯一标识',
  `product_type_name` varchar(255) DEFAULT NULL COMMENT '产品类型名称',
  PRIMARY KEY (`product_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sys_product_type
-- ----------------------------

-- ----------------------------
-- Table structure for sys_road
-- ----------------------------
DROP TABLE IF EXISTS `sys_road`;
CREATE TABLE `sys_road` (
  `road_id` varchar(255) NOT NULL COMMENT '唯一标识',
  `road_name` varchar(255) DEFAULT NULL COMMENT '路名称',
  `road_desc` varchar(255) DEFAULT NULL COMMENT '路描述',
  `road_box_id` varchar(255) DEFAULT NULL COMMENT '箱子外键',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`road_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_road
-- ----------------------------
INSERT INTO `sys_road` VALUES ('11', '11', '11', '11', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('12', '12', '12', '12', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('13', '13', '13', '13', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('14', '14', '14', '14', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('15', '15', '15', '15', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('2', '2', '2', '2', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('3', '3', '3', '3', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('4', '4', '4', '4', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('5', '5', '5', '5', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('6', '6', '6', '6', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('7', '7', '7', '7', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('8', '8', '8', '8', '2019-01-11 11:49:38');
INSERT INTO `sys_road` VALUES ('9', '9', '9', '9', '2019-01-11 11:49:38');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '公司ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '系统管理员角色Adminstartor', '超级系统管理员Adminstartor', '1', '2019-01-07 00:23:39');
INSERT INTO `sys_role` VALUES ('2', '鑫广进内蒙燃气设备研究(角色)', '鑫广进燃气设备研究所内蒙有限公司-角色', '8', '2019-01-07 00:25:01');
INSERT INTO `sys_role` VALUES ('3', '北京鑫广进燃气设备研究所(角色)', '北京鑫广进燃气设备研究所-角色', '6', '2019-01-07 00:25:50');
INSERT INTO `sys_role` VALUES ('4', '北京云普华星(角色)', '北京云普华星信息技术有限公司', '7', '2019-01-07 00:28:01');

-- ----------------------------
-- Table structure for sys_role_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_dept`;
CREATE TABLE `sys_role_dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '公司ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='角色与公司对应关系';

-- ----------------------------
-- Records of sys_role_dept
-- ----------------------------
INSERT INTO `sys_role_dept` VALUES ('7', '1', '1');
INSERT INTO `sys_role_dept` VALUES ('8', '1', '2');
INSERT INTO `sys_role_dept` VALUES ('9', '1', '3');
INSERT INTO `sys_role_dept` VALUES ('10', '1', '4');
INSERT INTO `sys_role_dept` VALUES ('11', '1', '5');
INSERT INTO `sys_role_dept` VALUES ('12', '1', '6');
INSERT INTO `sys_role_dept` VALUES ('23', '2', '8');
INSERT INTO `sys_role_dept` VALUES ('24', '2', '11');
INSERT INTO `sys_role_dept` VALUES ('25', '2', '12');
INSERT INTO `sys_role_dept` VALUES ('26', '2', '13');
INSERT INTO `sys_role_dept` VALUES ('27', '2', '14');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与菜单对应关系';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `salt` varchar(20) DEFAULT NULL COMMENT '盐',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(100) DEFAULT NULL COMMENT '手机号',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态  0：禁用   1：正常',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '公司ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统用户';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'e1153123d7d180ceeb820d577ff119876678732a68eef4e6ffc0b1f06a01f91b', 'YzcmCZNvbXocrsz9dm8e', 'root@xgjgas.com', '13612345678', '1', '1', '2016-11-11 11:11:11');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户与角色对应关系';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
