# twjitm
项目基于idea工作环境搭建的ssm整合框架，添加mybatis3，spring4，springmvc4，以及redis。
本项目是基于idea工作环境下搭建的ss整合框架，可以直接导入model进行使用，需要修改项目名称的需要统一的进行替换，否则可能会扫描不到包报异常，需要进行log配置
采用统一命名的方式进行配置
主要配置文件在resource下面的spring包中，项目是基于maven环境，若是本地没有maven的需要安装，同时若是下载包慢的需要添加镜像，常见的有阿里镜像路径，自行google

### 相关业务介绍
###  netty自定义消息协议系统

采用netty信息加载实现长连接实时通讯系统，客户端可以值任何场景，支持实时http通讯，tcp通讯，和udp通讯。通过http协议，实现websocket，用户可以进行聊天，群聊和单聊，利用分布式部署 。
1：支持分布式zookeeper进行服务节点配置。
2：采用自定义注解形式实现netty私有消息协议栈。
3：支持远程RPC调用。
4：支持redis。
5：支持db分离。
### 游戏数据帧同步系统
模拟游戏中的数据证同步技术，采用netty 支持udp协议和tcp协议和http协议，支持ssl认证，开发游戏中的实时对战游戏的基础版本，后期将进行项目分离，独立出来
更新---2018年5月16日
经过几天的整合，终于将长连接部分迁移到twjitm-core项目中了。

作者：twjitm qq:1029718215 时间2017年9月27日


