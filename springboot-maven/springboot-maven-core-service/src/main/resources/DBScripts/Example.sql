# Create table
CREATE TABLE user (
    id BIGINT(20) PRIMARY KEY NOT NULL COMMENT 'Primary key',
    name VARCHAR(30) DEFAULT NULL COMMENT 'name',
    age INT(11) DEFAULT NULL COMMENT 'age',
    email VARCHAR(50) DEFAULT NULL COMMENT 'email',
    manager_id BIGINT(20) DEFAULT NULL COMMENT 'manager Id',
    create_time DATETIME DEFAULT NULL COMMENT 'create time',
    CONSTRAINT manager_fk FOREIGN KEY (manager_id)
        REFERENCES user (id)
)  ENGINE=INNODB CHARSET=UTF8;

#Insert Example data
INSERT INTO user (id, name, age, email, manager_id
	, create_time)
VALUES (1087982257332887553, 'big boss', 40, 'boss@mybatisplus.com', NULL
		, '2019-01-11 14:20:20'),
	(1088248166370832385, '王天风', 25, 'wtf@mybatisplus.com', 1087982257332887553
		, '2019-02-05 11:12:22'),
	(1088250446457389058, '李艺伟', 28, 'lyw@mybatisplus.com', 1088248166370832385
		, '2019-02-14 08:31:16'),
	(1094590409767661570, '张雨琪', 31, 'zjq@mybatisplus.com', 1088248166370832385
		, '2019-01-14 09:15:15'),
	(1094592041087729666, '刘红雨', 32, 'lhm@mybatisplus.com', 1088248166370832385
		, '2019-01-14 09:48:16');