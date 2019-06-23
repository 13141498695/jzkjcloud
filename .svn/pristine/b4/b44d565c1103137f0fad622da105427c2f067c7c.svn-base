/*
Navicat MySQL Data Transfer

Source Server         : 172.26.28.204
Source Server Version : 50642
Source Host           : 172.26.28.204:3306
Source Database       : gas3iotyundata

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2019-01-10 17:40:16
*/

SET FOREIGN_KEY_CHECKS=0;

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
-- Table structure for sys_device
-- ----------------------------
DROP TABLE IF EXISTS `sys_device`;
CREATE TABLE `sys_device` (
  `device_id` varchar(200) NOT NULL COMMENT '设备唯一标识',
  `device_type` int(20) NOT NULL COMMENT '设备类型：0智能调压器1.采集仪',
  `device_status` int(20) NOT NULL COMMENT '1使用2.停用',
  `device_dtuid` varchar(100) DEFAULT NULL COMMENT 'DTU编号',
  `sys_device_modellList` varchar(200) DEFAULT NULL COMMENT '选择模型（数据类型记录表）',
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
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='系统日志';

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
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COMMENT='菜单管理';

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
-- Table structure for sys_product_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_product_type`;
CREATE TABLE `sys_product_type` (
  `product_type_id` varchar(255) NOT NULL COMMENT '唯一标识',
  `product_type_name` varchar(255) DEFAULT NULL COMMENT '产品类型名称',
  PRIMARY KEY (`product_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

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
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户与角色对应关系';
