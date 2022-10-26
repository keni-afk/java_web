-- Ventura Cayllahua Kenia Milagros
-- Ranilla Rivera Nick
-- Palacio Gonzales Shirley Carolina
-- Dipas Cristobal Jaerock Lee Henry


drop database if exists polleria_anita_wapurita; 

create database polleria_anita_wapurita;

use polleria_anita_wapurita;

drop table if exists distrito; 

create table distrito(
id_distrito int primary key auto_increment,
nombre_distrito varchar(50) binary character set utf8 collate utf8_bin NOT NULL,
cod_postal_distrito int(4) not null
)engine=InnoDB character set=utf8;

insert into distrito(nombre_distrito,cod_postal_distrito)
values('Villa el Salvador',42);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('Lurigancho Chosica',57);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('Ate',79);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('Comas',27);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('Los olivos',04);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('Santa Maria',37);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('Carabayllo',22);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('Puente Piedra',18);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('San Martin de Porres',06);
insert into distrito(nombre_distrito,cod_postal_distrito)
values('Pueblo Libre',84);

select * from distrito;

drop table if exists clientes; 

create table clientes(
idcliente int(12) primary key auto_increment,
nomcli varchar(40) binary character set utf8 collate utf8_bin not null,
apematcli varchar(40) binary character set utf8 collate utf8_bin NOT NULL,
apepatcli varchar(40) binary character set utf8 collate utf8_bin NOT NULL,
telcli varchar(12) ,
direcli varchar(45) ,
correocli varchar(40),
fechanac_cli datetime,
id_distrito int not null,
foreign key(id_distrito) references distrito(id_distrito)
)engine=InnoDB character set=utf8;

insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Juanita','Gonzales','Ranilla',933224750,'MzAnitaWapurita 250','JUANA2022@GMAIL.COM','1990-04-03','1');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Gabriel','Vega','Amillano','985674258','Av.Los Proceres','Vegagabriel@gmail.com','1990-08-30','2');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Ronaldo','Leon','Ardion','945783565','Snt.Domingo','ronaldofabian@gmail.com','2000-06-01','3');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Jimena','Ruiz','Soto','923528712','La perla','Ruizsotojimena26@gmail.com','2002-12-04','4');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Giselle','Iman','Bazalar','998325456','Moyopampa','giselle_iman_07@gmail.com','2004-07-28','5');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Pedro','Pimentel','Valdivia',992145987,'Jr. Cañete 301','PEPI555@GHOTMAIL.COM','1982-06-29','6');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Luciana','Grillito','Rodrigues',998465678,'Av. Tacna 488','RESITA15@GMAIL.COM','1992-01-02','7');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Rolando','Vera','Osorio',988745654,'Av. Brasil 3416','ROLANDOV@HOTMAIL.COM','1985-02-25','8');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Gabriel','Nuñez','Malpartida',933,'Av. Javier Prado Este 560','GABO57@GMAIL.COM','1991-09-28','9');
insert into Clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito)
values('Juanma','Gutierrez','Collage',935446789,'Jr. Morro Solar 906','G154COLLAGE@GMAIL.COM','1996-07-30','10');

select * from Clientes; 

drop table if exists roles; 

create table if not exists roles(
idrol int primary key auto_increment,
produccion_rol varchar(20) binary character set utf8 collate utf8_bin not null, 
administracion_rol varchar(20) binary character set utf8 collate utf8_bin not null, 
atencion_rol varchar(20) binary character set utf8 collate utf8_bin not null, 
servicio_rol varchar(20) binary character set utf8 collate utf8_bin not null
)engine=InnoDB character set=utf8;

insert into roles(produccion_rol,administracion_rol,atencion_rol,servicio_rol)
values('PRODUCCION','INACTIVO','INACTIVO','INACTIVO');
insert into roles(produccion_rol,administracion_rol,atencion_rol,servicio_rol)
values('INACTIVO','ADMINISTRACION','INACTIVO','INACTIVO');
insert into roles(produccion_rol,administracion_rol,atencion_rol,servicio_rol)
values('INACTIVO','INACTIVO','ATENCION','INACTIVO');
insert into roles(produccion_rol,administracion_rol,atencion_rol,servicio_rol)
values('INACTIVO','INACTIVO','INACTIVO','SERVICIO');


select * from roles;

drop table if exists empleados; 

create table empleados(
idemp int primary key auto_increment,
nomemp varchar(40) binary character set utf8 collate utf8_bin not null,
apematemp varchar(40) binary character set utf8 collate utf8_bin not null,
apepatemp varchar(40) binary character set utf8 collate utf8_bin not null,
telemp int(20) not null,
direemp varchar(50),
correoemp varchar(50),
fechanacimiento_emp datetime,
dniemp int(9) NOT NULL,
idrol int not null,
foreign key (idrol) references roles(idrol),
id_distrito int not null,
foreign key(id_distrito) references distrito(id_distrito)
)engine=InnoDB character set=utf8;

insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Alexander','Rodriguez','Palacios',955870720,'Auxiliar Av. 22 de Agosto','Alexander20@gmail.com','2000-07-02',76984516,'1','2');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Jonny','Sulfato','Huamani',923148789,'Av. las malvinas 500','JONNYLEFT@GMAIL.COM','1988-10-15','41421444','2','3');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Luis','Gomes','Salva',989445665,'Av. grau 533','LUIS55@GMAIL.COM','1992-08-22','45123478','3','1');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Thiago','Dicaprio','Quispe',984849654,'Av. los portales 520','THIAGOPKMZ@GMAIL.COM','1992-02-21','25789436','4','5');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Fidel','Tavara','Grinaldo',972358498,'Av. La Cantuta 1000','Fide124@HOTMAIL.COM','1995-07-25','23485796','4','4');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Luchin','Gonzales','Quispe',917581256,'Av. Industrial 1250','Luis157@GMAIL.COM','1985-08-12','5327845','2','6');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Sandra','Valverde','Chipana',997514536,'Av. la frontera 200','GATITAFE1587@GMAIL.COM','1988-10-01','32547856','2','8');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Godines','Salvatierra','Rodrigues',987457819,'Av. las torres 400','GODSAL1@GMAIL.COM','1981-05-17','36615448','1','9');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Pedro','Rojas','Soria',987451254,'Av. brasil 1390','Pedroro1@GMAIL.COM','1996-05-22','41421444','3','7');
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito)
values('Oscar','Gomez','Rivera',921248547,'Av. Paseo de la Republica 1512','OSCAR22@GMAIL.COM','1997-09-18','41547891','3','10');

select * from empleados;

drop table if exists cartaproducto; 

create table cartaproducto(
idpro int primary key auto_increment,
nompro varchar(40) binary character set utf8 collate utf8_bin not null,
numpro int not null,
precio varchar(12)
)engine=InnoDB character set=utf8;

insert into cartaproducto(nompro,numpro,precio)
values('Pollo','1','$45');

insert into cartaproducto(nompro,numpro,precio)
values('Arroz chaufa','2','$25');

insert into cartaproducto(nompro,numpro,precio)
values('Sangria','3','$30');

insert into cartaproducto(nompro,numpro,precio)
values('Chicha morada','4','$12');

insert into cartaproducto(nompro,numpro,precio)
values('Papasextra','5','$45');

insert into cartaproducto(nompro,numpro,precio)
values('Gaseosa','6','$15');

insert into cartaproducto(nompro,numpro,precio)
values('Pollo + chicha','7','$50');

insert into cartaproducto(nompro,numpro,precio)
values('Ensalada','8','$45');

insert into cartaproducto(nompro,numpro,precio)
values('Pie de limon','9','$12');

insert into cartaproducto(nompro,numpro,precio)
values('Camotes fritos','10','$30');

select * from cartaproducto;

drop table if exists pedidos; 

create table pedidos(
idped int(10) primary key auto_increment,
fechaped datetime,
prodpe varchar(40),
numped int(10)not null,
descuped varchar(10),
idcliente int(2) not null,
foreign key (idcliente) references clientes(idcliente)
)engine=InnoDB character set=utf8;

insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-08-15','1/4depollo','4622','10%','3');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-10-01','1polloentero','4622','10%','8');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-07-10','1/4 de pollo','4622','10%','4');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-01-18','1 y 1/2 de pollo','4622','25%','5');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('22-06-01','1/2 de pollo','4622','10%','2');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-06-23','1 pollo entero','4622','0%','9');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-05-01','1/4 de pollo','4622','50%','1');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-09-18','1 pollo entero','4622','0%','10');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-06-22','1/8 de pollo','4622','20%','7');
insert into pedidos(fechaped,prodpe,numped,descuped,idcliente)
values('2022-04-03','1/8 de pollo','4622','15%','6');

select * from pedidos;

drop table if exists detalle_pedidos; 

create table detalle_pedidos(
iddepe int primary key auto_increment,
cantdepe int(30) not null,
preciodepe varchar(40),
descripe varchar(80),
adicipe varchar(50),
idcliente int(2) not null,
foreign key (idcliente) references clientes(idcliente),
idped int(10) not null,
foreign key(idped) references pedidos(idped)
)engine=InnoDB character set=utf8;

insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('10','S/200','1/4 de pollo+papas+gaseosa de 1 1/2 litro','ninguno','3','383292');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('2','S/72','un pollo entero con papas y gaseosa de 1 litro','papas','8','393957');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('1','S/45','un cuarto de pollo con papas y gaseosa de 1/2 litro','ninguno','4','853145');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('6','S/158','un octavo de pollo con papas y gaseosa de 1 litro','papas','6','457521');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('10','S/500','un pollo y medio con papas y gaseosa de 2 litro','ensalada','5','926854');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('10','S/200','medio pollo con papas y gaseosa de 1 litro','papas','2','126983');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('4','S/83','un pollo entero con papas y gaseosa de 1 1/2 litro','ninguno','9','383174');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('5','S/87','un cuarto de pollo con papas y gaseosa de 1/2 litro','papas','1','419765');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('2','S/90','un pollo entero con papas y gaseosa de 1 litro','aguadito','10','234915');
insert into detalle_pedidos(cantdepe,preciodepe,descripe,adicipe,idcliente,idped)
values('3','S/51','un octavo de pollo con papas y gaseosa de 1/2 litro','ninguno','7','724561');

select * from detalle_pedidos;

drop table if exists caja; 

create table caja(
idcaja int(10) primary key auto_increment,
numcaja int(10) not null
)engine=InnoDB character set=utf8;

insert into caja(numcaja)
values(3);
insert into caja(numcaja)
values(2);
insert into caja(numcaja)
values(1);

select * from caja;

drop table if exists boleta_pago; 

create table boleta_pago(
codbo int primary key auto_increment,
centralbo varchar(40),
idped int(10) not null,
foreign key (idped) references pedidos(idped),
idcaja int(10) not null,
foreign key (idcaja) references caja(idcaja)
)engine=InnoDB character set=utf8;

insert into boleta_pago(centralbo,idped,idcaja)
values('Av.Larco','383292','2');
insert into boleta_pago(centralbo,idped,idcaja)
values('Av. junín','393957','1');
insert into boleta_pago(centralbo,idped,idcaja)
values('Av. bolognesi','853145','3');
insert into boleta_pago(centralbo,idped,idcaja)
values('Av. Wiese','457521','2');
insert into boleta_pago(centralbo,idped,idcaja)
values('Av. huarochiri ','926854','1');
insert into boleta_pago(centralbo,idped,idcaja)
values('Av. surquillo','126983','1');
insert into boleta_pago(centralbo,idped,idcaja)
values('Jiron junin','383174','1');
insert into boleta_pago(centralbo,idped,idcaja)
values('Jiron Camana','419765','3');
insert into boleta_pago(centralbo,idped,idcaja)
values('Jiron Puno','234915','3');
insert into boleta_pago(centralbo,idped,idcaja)
values('Ate','724561','3');

select * from boleta_pago;