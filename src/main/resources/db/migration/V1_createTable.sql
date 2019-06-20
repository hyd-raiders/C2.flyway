create table t_stu(
  stuid      number(10)   primary key,
  stuname    varchar2(20) not null,
  stusex     varchar2(2)  default '男' check(stusex in('男','女'))
);