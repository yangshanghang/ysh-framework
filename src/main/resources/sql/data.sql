-- ----------------------------
-- Table structure for CMS_SCENE
-- ----------------------------
DROP TABLE IF EXISTS `CMS_SCENE`;
CREATE TABLE `CMS_SCENE` (
  `ID` varchar(32) NOT NULL COMMENT '唯一标识',
  `CS_TERMINAL` char(2) NOT NULL COMMENT '终端(0：客户端，1：官网，2：APP，3：汇信网)',
  `CS_MODULE` char(2) NOT NULL COMMENT '模块(0：广告，1：应用，2：活动，3：资源，4：资讯)',
  `CS_HEIGHT` int(5) NOT NULL COMMENT '尺寸：高',
  `CS_WIDTH` int(5) NOT NULL COMMENT '尺寸：宽',
  `CS_IDENTIFICATION` varchar(50) NOT NULL COMMENT '场景标识',
  `CS_NAME` varchar(50) NOT NULL COMMENT '场景名称',
  `CS_STATUS` char(1) NOT NULL COMMENT '状态(0：无效，1：有效)',
  `CS_CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `CS_CREATOR` varchar(20) NOT NULL COMMENT '创建者',
  `CS_OPERATE_TIME` datetime NOT NULL COMMENT '操作时间',
  `CS_OPERATOR` varchar(20) NOT NULL COMMENT '操作者',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='场景配置表';

-- ----------------------------
-- Records of CMS_SCENE
-- ----------------------------
INSERT INTO `CMS_SCENE` VALUES ('15ae9b824f1311e7bdaf00188b839ae8', '0', '1', '70', '70', 'LLC_APP_03', '客户端首页应用', '1', '2017-06-12 10:04:51', 'yangshanghang', '2017-06-15 17:24:05', 'wywang1025');
INSERT INTO `CMS_SCENE` VALUES ('181e85922be311e7961e00188b839ae8', '1', '2', '100', '100', '客户端活动WL', '客户端活动WL', '1', '2017-04-28 15:21:13', '15067420237', '2017-04-28 15:21:13', '15067420237');
INSERT INTO `CMS_SCENE` VALUES ('1c835912502011e7bdaf00188b839ae8', '1', '4', '100', '160', 'LLW_INFO_01', '汇信网_公司新闻', '1', '2017-06-13 18:10:39', 'yangshanghang', '2017-06-16 13:55:53', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('27e836bc2be311e7961e00188b839ae8', '2', '2', '100', '100', 'LLC_ACT_0122', 'APP活动WL', '1', '2017-04-28 15:21:39', '15067420237', '2017-05-03 14:01:00', 'xyf123');
INSERT INTO `CMS_SCENE` VALUES ('2ff2eeec1f4511e7961e00188b839ae8', '2', '1', '150', '100', 'LLA_APP_01', 'APP应用_01', '1', '2017-04-12 13:59:57', 'ysh', '2017-05-12 17:11:49', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('336630b8c5b511e7874400188b839ae8', '0', '3', '70', '100', 'LLC_RES_JCB_ZS_QDXZ', '基础版_证书_驱动下载', '1', '2017-11-10 09:23:13', 'zhangmengwen', '2017-11-10 09:23:13', 'zhangmengwen');
INSERT INTO `CMS_SCENE` VALUES ('38dfb036509a11e7bdaf00188b839ae8', '1', '4', '100', '160', 'LLW_INFO_02', '汇信网_媒体报道', '1', '2017-06-14 08:44:23', 'yangshanghang', '2017-06-16 13:55:59', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('3d99b8be2be311e7961e00188b839ae8', '1', '3', '100', '100', '官网资源WL', '官网资源WL', '1', '2017-04-28 15:22:15', '15067420237', '2017-04-28 15:22:15', '15067420237');
INSERT INTO `CMS_SCENE` VALUES ('3df21a602be611e7961e00188b839ae8', '2', '3', '9999', '9999', 'APP_11', 'APP资源11', '1', '2017-04-28 15:43:45', 'zlj123', '2017-04-28 15:44:32', 'zlj123');
INSERT INTO `CMS_SCENE` VALUES ('3ff905902be011e7961e00188b839ae8', '2', '0', '200', '200', 'APP广告', 'APP广告', '1', '2017-04-28 15:00:51', '15067420237', '2017-04-28 15:00:51', '15067420237');
INSERT INTO `CMS_SCENE` VALUES ('4186242e2be011e7961e00188b839ae8', '2', '0', '8888', '8888', 'APP_01', 'app广告zlj', '1', '2017-04-28 15:00:54', 'zlj123', '2017-04-28 15:54:27', 'zlj123');
INSERT INTO `CMS_SCENE` VALUES ('4a4558b42be011e7961e00188b839ae8', '2', '1', '200', '200', 'APP应用', 'APP应用', '1', '2017-04-28 15:01:08', '15067420237', '2017-04-28 15:01:08', '15067420237');
INSERT INTO `CMS_SCENE` VALUES ('541a0d762be011e7961e00188b839ae8', '2', '2', '200', '200', 'APP活动', 'APP活动', '1', '2017-04-28 15:01:25', '15067420237', '2017-04-28 15:01:25', '15067420237');
INSERT INTO `CMS_SCENE` VALUES ('54561a102f1811e7961e00188b839ae8', '0', '2', '501', '501', 'LLC_ACT_01', '客户端活动_02', '1', '2017-05-02 17:20:01', 'zlj123', '2017-05-04 18:11:33', 'wywang1025');
INSERT INTO `CMS_SCENE` VALUES ('5e0851b22be011e7961e00188b839ae8', '2', '3', '100', '100', 'APP资源', 'APP资源', '1', '2017-04-28 15:01:41', '15067420237', '2017-04-28 15:01:41', '15067420237');
INSERT INTO `CMS_SCENE` VALUES ('6e026b7a574611e8b7f900188b839ae8', '2', '4', '55', '55', 'GSLL_PUBLISH_IMGTXT', '微信_工商联连_最新发布_图文', '1', '2018-05-14 15:13:26', 'yangshanghang', '2018-05-14 15:23:16', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('6e7f6d422bdf11e7961e00188b839ae8', '1', '3', '9999', '9999', 'yyf', 'yyf', '1', '2017-04-28 14:55:00', 'yyf123', '2017-04-28 15:26:21', 'yyf123');
INSERT INTO `CMS_SCENE` VALUES ('8a553f383a0311e7bdaf00188b839ae8', '1', '0', '200', '300', 'LLW_ADVT_02', '汇信网_首页_公司动态', '1', '2017-05-17 18:25:00', 'yangshanghang', '2017-05-17 18:25:00', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('8f59682c561b11e7bdaf00188b839ae8', '0', '4', '222', '222', '234234', '234234', '1', '2017-06-21 08:53:22', 'yangshanghang', '2017-06-21 08:53:22', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('a12a2826c5b411e7874400188b839ae8', '0', '1', '70', '70', 'LLC_APP_JCB_ZS_ZSFW', '基础版_证书_证书服务', '1', '2017-11-10 09:19:08', 'zhangmengwen', '2017-11-10 09:23:45', 'zhangmengwen');
INSERT INTO `CMS_SCENE` VALUES ('a6aa35de256911e7961e00188b839ae8', '0', '3', '80', '100', 'LLC_RES_01', '客户端资源_01', '1', '2017-04-20 09:36:22', 'yangshanghang', '2017-05-04 18:11:29', 'wywang1025');
INSERT INTO `CMS_SCENE` VALUES ('b98246b42fb011e7961e00188b839ae8', '1', '2', '50', '50', 'test', '官网测试活动', '1', '2017-05-03 11:30:56', 'xyf123', '2017-05-03 11:37:24', 'xyf123');
INSERT INTO `CMS_SCENE` VALUES ('bad15d121e8e11e7961e00188b839ae8', '1', '1', '90', '60', 'LLL_APP_01', '官网应用_01', '1', '2017-04-03 16:13:46', 'ysh', '2017-04-21 18:49:30', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('c5edc9e2233411e7961e00188b839ae8', '2', '2', '50', '50', 'LLC_ACT_03', '客户端活动_01', '1', '2017-04-17 14:12:45', 'zhangmengwen', '2017-05-03 13:35:49', 'xyf123');
INSERT INTO `CMS_SCENE` VALUES ('c93ddb8025ac11e7961e00188b839ae8', '0', '0', '50', '50', 'LLC_ADVT_01', '客户端首页底部广告', '1', '2017-04-20 17:36:57', 'yangshanghang', '2017-06-12 17:36:52', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('cf0ce77e2fc311e7961e00188b839ae8', '1', '1', '11', '11', '测试', '测试', '1', '2017-05-03 13:47:33', '15057904965', '2017-05-04 16:02:19', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('cfbddbce233411e7961e00188b839ae8', '0', '1', '70', '70', 'LLC_APP_01', '客户端全部应用', '1', '2017-04-17 14:12:56', 'lilihao', '2017-06-15 17:24:26', 'wywang1025');
INSERT INTO `CMS_SCENE` VALUES ('d60a56f63aea11e7bdaf00188b839ae8', '1', '0', '142', '224', 'LLW_ADVT_01', '汇信网_首页_轮播', '1', '2017-05-16 14:49:30', 'yangshanghang', '2017-05-16 16:25:59', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('e3fbd6a6710211e7b29400188b839ae8', '0', '0', '100', '200', 'LLC_ADVT_02', '客户端首页顶部广告', '1', '2017-07-25 14:36:25', 'yangshanghang', '2017-12-18 09:05:31', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('ebd67806574711e8b7f900188b839ae8', '2', '4', '155', '274', 'GSLL_PUBLISH_IMG', '微信_工商联连_最新发布_图片', '1', '2018-05-14 15:24:07', 'yangshanghang', '2018-05-14 15:24:11', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('edc09256256411e7961e00188b839ae8', '0', '1', '30', '30', 'LLC_APP_02', '客户端业务', '1', '2017-04-20 09:02:34', 'yangshanghang', '2017-06-12 17:38:04', 'yangshanghang');
INSERT INTO `CMS_SCENE` VALUES ('f9a8be182bef11e7961e00188b839ae8', '1', '1', '9999', '9999', 'LLC_APP_0122', 'app_应用', '1', '2017-04-28 16:53:25', '15067420237', '2017-05-03 13:46:25', 'xyf123');