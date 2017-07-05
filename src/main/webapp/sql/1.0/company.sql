create table company(
  id bigint primary key identity(1,1),
  name varchar(1000) not null,
  type int not null
)