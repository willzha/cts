create table domestic_sale(
  id bigint primary key identity(1,1),
  date datetime not null,
  colliery varchar(1000),
  company varchar(1000),
  books varchar(1000),
  quantity int,
  ton int
)