/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : drivertest

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 15/06/2022 20:13:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_history
-- ----------------------------
DROP TABLE IF EXISTS `t_history`;
CREATE TABLE `t_history`  (
  `th_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NULL DEFAULT NULL,
  `th_score` int(11) NULL DEFAULT NULL,
  `th_create_time` date NULL DEFAULT NULL,
  PRIMARY KEY (`th_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_history
-- ----------------------------
INSERT INTO `t_history` VALUES (1, 1, 3, '2022-06-14');
INSERT INTO `t_history` VALUES (2, 1, 7, '2022-06-14');
INSERT INTO `t_history` VALUES (3, 8, 5, '2022-06-15');

-- ----------------------------
-- Table structure for t_question
-- ----------------------------
DROP TABLE IF EXISTS `t_question`;
CREATE TABLE `t_question`  (
  `q_id` int(11) NOT NULL AUTO_INCREMENT,
  `q_body` varchar(900) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `q_opt1` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `q_opt2` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `q_opt3` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `q_opt4` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `q_cur` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`q_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_question
-- ----------------------------
INSERT INTO `t_question` VALUES (1, '醉酒驾驶机动车在道路上行驶会受到以下哪种处罚？', '处2年以下徒刑', '5年内不得重新获取驾照', '处2年以上徒刑', '处管制，并处罚金', 2);
INSERT INTO `t_question` VALUES (2, '驾驶机动车发生交通事故，以下哪种情况不可以自行协商解决？', '未造成人身伤亡', '车辆可以移动', '对事实及成因无争议', '其中一方使用伪造、变造的车牌', 4);
INSERT INTO `t_question` VALUES (3, '泥泞道路对安全行车的主要影响是什么？', '行驶阻力变小', '车轮极易滑转和侧滑', '能见度低，视野模糊', '路面附着力增大', 2);
INSERT INTO `t_question` VALUES (4, '初次申领机动车号牌、行驶证的，机动车所有人应当向________车辆管理所申请注册登记。', '使用地', '销售地', '户籍地', '住所地', 4);
INSERT INTO `t_question` VALUES (5, '申请人在道路上学习驾驶时，未取得学习驾驶证明的，由公安机关交通管理部门处多少元罚款？', '20元以上200元以下', '200元以上2000元以下', '1000元以上2000元以下', '2000元以上5000元以下', 2);
INSERT INTO `t_question` VALUES (6, '驾驶机动车在高速公路上遇到雨雪天气时，需要降低车速、保持安全距离的原因，以下说法错误的是什么？', '能见度下降，驾驶人难以及时发现前方车辆', '此类天气条件下的道路上，车辆的制动距离变长', '为车辆安全行驶提供足够的安全距离', '降低恶劣天气对车辆造成的损害', 4);
INSERT INTO `t_question` VALUES (7, '在大暴雨的天气驾车，刮水器无法正常工作时，应怎样做？', '立即减速行驶', '提高注意力谨慎驾驶', '立即减速靠边停车', '保持正常速度行驶', 3);
INSERT INTO `t_question` VALUES (8, '驾驶机动车遇到前方低速行驶的洒水车作业时，以下做法错误的是什么？', '注意避让', '若洒水车有指示箭头，在确保安全的情况下按箭头指示方向变更车道', '若洒水车无指示箭头，在确保安全的情况下选择合适的车道变更', '通过洒水车时应急加速通过', 4);
INSERT INTO `t_question` VALUES (9, '申请人有下列何种行为的，一年内不得再次申领机动车驾驶证？', '在考试过程中出现身体不适', '提供虚假材料申领机动车驾驶证', '不能按照教学大纲认真练习驾驶技能', '未参加理论培训', 2);
INSERT INTO `t_question` VALUES (10, '上道路行驶的机动车未悬挂机动车号牌的一次记多少分？', '12分', '3分', '6分', '9分', 1);
INSERT INTO `t_question` VALUES (11, '驶近没有人行横道的交叉路口时，发现有人横穿道路，应怎样做？', '减速或停车让行', '鸣喇叭示意其让道', '抢在行人之前通过', '立即变道绕过行人', 1);
INSERT INTO `t_question` VALUES (12, '驾驶机动车行经下列哪种路段时不得超车？', '高架路', '交叉路口', '环城高速', '中心街道', 2);
INSERT INTO `t_question` VALUES (13, '驾驶的车辆正在被其他车辆超越时，若此时后方有跟随行驶的车辆，应怎样做？', '继续加速行驶', '稍向右侧行驶，保证横向安全距离', '靠道路中心行驶', '加速向右侧让路', 2);
INSERT INTO `t_question` VALUES (14, '已注册登记的小型载客汽车有下列哪种情形，所有人不需要办理变更登记？', '机动车更换发动机', '加装前后防撞装置', '改变车身颜色', '更换车身或者车架', 2);
INSERT INTO `t_question` VALUES (15, '发现前方道路堵塞，正确的做法是什么？', '继续穿插绕行', '选择空挡逐车超越', '鸣喇叭示意前方车辆快速行驶', '按顺序停车等候', 4);
INSERT INTO `t_question` VALUES (16, '机动车驾驶人初次申领驾驶证后的实习期是多长时间？', '6个月', '12个月', '16个月', '18个月', 2);
INSERT INTO `t_question` VALUES (17, '下雨后路面湿滑，车辆行驶中紧急制动时，容易导致什么？', '引起发动机熄火', '不被其他车辆驾驶人发现', '因视线模糊而撞车', '发生侧滑、引发交通事故', 4);
INSERT INTO `t_question` VALUES (18, '遇有浓雾或特大雾天能见度过低，行车困难时，应怎样做？', '开启前照灯，继续行驶', '开启示廓灯、雾灯，靠右行驶', '开启危险报警闪光灯和雾灯，选择安全地点停车', '开启危险报警闪光灯，继续行驶', 3);
INSERT INTO `t_question` VALUES (19, '驾驶人有下列哪种违法行为一次记1分？', '不按规定避让校车的', '行经人行横道不按规定减速、停车、避让行人的', '在高速公路、城市快速路以外的道路上不按规定倒车、掉头的', '在高速公路上行驶低于规定最低时速的', 3);
INSERT INTO `t_question` VALUES (20, '驾驶机动车靠边停车时，应如何使用转向灯？', '不用开启灯光', '变换使用远近光灯', '提前开启右转向灯', '开启危险报警闪光灯', 3);
INSERT INTO `t_question` VALUES (21, '交通肇事致一人以上重伤，负事故全部或者主要责任，并具有下列哪种行为的，构成交通肇事罪。', '未带驾驶证', '未报警', '明知是安全装置不全或者安全机件失灵的机动车辆而驾驶的', '未抢救受伤人员的', 3);
INSERT INTO `t_question` VALUES (22, '驾驶机动车通过学校区域时，最高车速是多少？', '不得超过100公里/小时', '不得超过90公里/小时', '不得超过60公里/小时', '不得超过30公里/小时', 4);
INSERT INTO `t_question` VALUES (23, '车辆驶近停在车站的公交车辆时，为预防公交车突然起步或行人从车前穿出，应怎样做？', '减速，保持足够间距，随时准备停车', '保持正常车速行驶', '随时准备紧急制动', '鸣喇叭提醒，加速通过', 1);
INSERT INTO `t_question` VALUES (24, '机动车遇有停止信号时，应停在何处？', '停止线以外', '停止线以内', '路口右侧', '路口中间', 1);
INSERT INTO `t_question` VALUES (25, '行车中，遇非机动车抢行时，应怎样做？', '鸣喇叭警告', '加速通过', '减速让行', '临近时突然加速', 3);
INSERT INTO `t_question` VALUES (36, '测试题目2', '测试选项2', '测试选项2', '测试选项2', '测试选项2', 1);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'ljh', '123');
INSERT INTO `t_user` VALUES (2, 'zlt', '321');
INSERT INTO `t_user` VALUES (5, 'zhangsan', '123456');
INSERT INTO `t_user` VALUES (8, 'admin', 'admin');
INSERT INTO `t_user` VALUES (9, 'test', '654321');

SET FOREIGN_KEY_CHECKS = 1;
