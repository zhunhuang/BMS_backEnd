CREATE TABLE user (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_name` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '密码',
  `role` int UNSIGNED NOT NULL DEFAULT 0
);

CREATE TABLE goods_sale_info (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `goods_name` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户名',
  `total_sale` int UNSIGNED NOT NULL DEFAULT 0
);
