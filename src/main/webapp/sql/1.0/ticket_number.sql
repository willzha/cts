create table ticket_number(
  id bigint primary key identity(1,1),
  groups varchar(8) not null,
  number int not null,
  version int not null DEFAULT 1
);
