use mysql;
update user set host='%' where user='root';
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY 'L0rfBGXhvrt9f7L8';
flush privileges;