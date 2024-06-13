# JAVA-12306
真实12306项目，包含复杂业务的高并发抢票系统，项目会从需求分析开始，到业务设计与代码实现，涉及通用的后端技术与中间件实现，比如Redis缓存、MQ、Canal、ElasticSearch等技术，欢迎广大it爱好者阅读



backend：后台管理（可运行）

frontend：前台管理（可运行）

common：公共类（不可运行，为其他模块提供服务）

sync：数据服务（可运行）



项目运行说明：

### 1、基础数据源

sql/基础数据源.sql

如果需要使用课程里的数据，使用：sql/基础数据源含数据.sql

train_user是登录用户，train_traveller是乘客用户

### 2、订单数据源

sql/订单库.sql

支付时实际支付的是train_order，每张票的详情在train_order_detail中

### 3、座位数据源

sql/座位库-分库1.sql（1，6）

sql/座位库-分库2.sql（2，7）

sql/座位库-分库3.sql（3，8）

sql/座位库-分库4.sql（4，9）

sql/座位库-分库5.sql（5，10）

