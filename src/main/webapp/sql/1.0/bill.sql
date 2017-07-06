create table bill (
  id int primary key identity(1,1),
  delivery_date datetime,
  ticket_id bigint not null,
  company_id int,
  books varchar(255),
  used_quantity int,
  ton int,
  unit_price decimal(10,2),
  total_price decimal(10,2),
  state varchar(255),
  payment_date datetime,
  payment_amount decimal(10,2),
  payment_method varchar(1000),
  balance decimal(10,2)
)
