create table ticket(
  id bigint primary key identity(1,1),
  pickup_date datetime not null,
  company_id int,
  quantity int not null,
  start_number int not null,
  end_number int not null,
  delivery_date datetime
)