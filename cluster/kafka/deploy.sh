#!/bin/bash
# shellcheck disable=SC2164
#使用说明，用来提示输入参数
usage() {
    echo "Usage: sh 执行脚本.sh [start|stop|down|rm]"
    exit 1
}

# 启动所有容器
start(){
    docker-compose up -d
}

# 停止所有容器
stop(){
    docker-compose stop
}

# 停止并删除所有容器
down(){
    docker-compose down
}

# 删除所有模块
rm(){
    docker-compose rm
}

#根据输入参数，选择执行对应方法，不输入则执行使用说明
case "$1" in
"start")
    start
;;
"stop")
    stop
;;
"down")
    down
;;
"rm")
    rm
;;
*)
    usage
;;
esac