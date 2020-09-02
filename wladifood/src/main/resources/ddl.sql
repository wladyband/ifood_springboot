create table cozinha (id  bigserial not null, nome varchar(255), primary key (id))
create table restaurante (id  bigserial not null, nome varchar(255), taxa_frete numeric(19, 2), cozinha_id int8, primary key (id))
alter table if exists restaurante add constraint FK76grk4roudh659skcgbnanthi foreign key (cozinha_id) references cozinha
insert into cozinha (id, nome) values (1, 'Tailandesa')
insert into cozinha (id, nome) values (2, 'Indiana')
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', 10, 1)
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', 9.50, 1)
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', 15, 2)
