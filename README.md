# dev-envs-deploy 

#### 介绍

提供常用开发环境部署，支持单机和集群，包括以下常用中间件：

| 中间件                   | 版本 |
|-----------------------| --- |
| Portainer             | 1.24.2                        |
| MySQL5.7              | 5.7                           |
| MySQL                 | 8.0.27                        |
| Redis                 | 6.2.6                         |
| Minio                 | last version                  |
| xxl-job-admin         | last version                  |
| power-job             | last version                  |
| dubbo-admin           | last version                  |
| Nginx                 | 1.21.6                        |
| Zookeeper             | 3.6.3                         |
| Spring-Boot-Admin     | 2.6.7                         |
| RocketMQ-cluster      | 4.9.3                         |
| RocketMQ-Dashboard    | last version                  |
| Elasticsearch-cluster | 7.8.0                         |
| Elasticsearch-head    | last version                  |
| Dejavu                | last version                  |
| Kafka-cluster         | 2.8.0                         |
| Kafka-manager         | last version                  |
| Zookeeper-cluster     | 3.6.3                         |
| mongdb                | last version                  |


#### 网络分配
公用一个网段
``` yml
networks:
  my_net:
    driver: bridge
    ipam:
      config:
        - subnet: 172.30.0.0/16
```

网段分配：

standlone: 172.30.0.10 ~ 172.30.0.30

monitor: 172.30.0.31 ~ 172.30.0.40

cluster/elasticsearch: 172.30.0.41 ~ 172.30.0.50

cluster/kafka: 172.30.0.51 ~ 172.30.0.60

cluster/nacos: 172.30.0.61 ~ 172.30.0.70

cluster/rocketmq: 172.30.0.71 ~ 172.30.0.80

cluster/zookeeper: 172.30.0.81 ~ 172.30.0.90
