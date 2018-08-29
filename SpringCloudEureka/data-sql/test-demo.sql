CREATE DATABASE /*!32312 IF NOT EXISTS*/`clouddb01` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `clouddb01`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(256) DEFAULT NULL,
  `db_source` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
insert  into `dept`(`deptno`,`dname`,`db_source`) values (1,'张三',DATABASE()),(2,'李四',DATABASE()),(3,'王五',DATABASE());







CREATE DATABASE /*!32312 IF NOT EXISTS*/`clouddb02` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `clouddb02`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(256) DEFAULT NULL,
  `db_source` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
insert  into `dept`(`deptno`,`dname`,`db_source`) values (1,'张三',DATABASE()),(2,'李四',DATABASE()),(3,'王五',DATABASE());




CREATE DATABASE /*!32312 IF NOT EXISTS*/`clouddb03` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `clouddb03`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(256) DEFAULT NULL,
  `db_source` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
insert  into `dept`(`deptno`,`dname`,`db_source`) values (1,'张三',DATABASE()),(2,'李四',DATABASE()),(3,'王五',DATABASE());