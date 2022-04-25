# dev-envs-deploy [![Fork me on Gitee](https://gitee.com/islibin/dev-envs-deploy/widgets/widget_1.svg)](https://gitee.com/islibin/dev-envs-deploy)


#### 介绍
提供常用开发环境部署，支持单机和集群，包括以下常用中间件：

| 中间件  | 版本 |
| --- | --- |
| Portainer                 | 1.24.2                        |
| MySQL                     | 8.0.27                        |
| Redis                     | 6.2.6                         |
| Minio                     | RELEASE.2022-04-16T04-26-02Z  |
| xxl-job-admin             | 2.3.0                         |
| Nginx                     | 1.21.6                        |
| Zookeeper                 | 3.6.3                         |
| Spring-Boot-Admin         | 2.6.7                         |
| RocketMQ                  | 4.9.3                         |
| RocketMQ-Dashboard        | 1.0.0                        |

#### 准备工作
```bash
# 创建主目录
mkdir docker
# 进入主目录
cd docker/
# 源码安装方式
git clone https://gitee.com/islibin/dev-envs-deploy.git
```

#### 部署
```bash
# 安装portainer
cd /docker/dev-envs-deploy/portainer
sh deploy.sh start
# 安装mysql、redis、minio、xxljob、zookeeper
cd /docker/dev-envs-deploy/standalone
sh deploy.sh start
# 安装nginx
cd /docker/dev-envs-deploy/nginx
sh deploy.sh start
sh deploy.sh start
# 安装rocketmq集群及控制台
cd /docker/dev-envs-deploy/mq/rocketmq
sh deploy.sh start
# 安装扩展程序：spring-boot-admin 监控
cd /docker/dev-envs-deploy/extend
sh deploy.sh start
```

#### 各中间价默认密码

**Portainer**
```
http://127.0.0.1:9999/
```

**MySQL** 
```
127.0.0.1:3306
root/12345678
```

**Redis** 
```
127.0.0.1:6379
12345678
```

**Minio**
```
http://127.0.0.1:9001/login
minio/12345678
```

**xxl-job-admin**  
```
http://127.0.0.1:9091/xxl-job-admin/
admin/123456
```

**spring-boot-admin**
```
http://127.0.0.1:9090/admin  
admin/admin123456
```

**RocketMQ-Dashboard** 
```
http://127.0.0.1:9093/
admin/admin
```

