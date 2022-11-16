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
cod_postal_distrito int(4) not null,
estado_distrito bit(2) not null
)engine=InnoDB character set=utf8;

insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Villa el Salvador',42,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Lurigancho Chosica',57,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Ate',79,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Comas',27,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Los olivos',04,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Santa Maria',37,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Carabayllo',22,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Puente Piedra',18,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('San Martin de Porres',06,1);
insert into distrito(nombre_distrito,cod_postal_distrito,estado_distrito)
values('Pueblo Libre',84,1);

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
estado_clientes bit not null,
id_distrito int not null,
foreign key(id_distrito) references distrito(id_distrito)
)engine=InnoDB character set=utf8;

insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Juanita','Gonzales','Ranilla',933224750,'MzAnitaWapurita 250','JUANA2022@GMAIL.COM','1990-04-03','1',1);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Gabriel','Vega','Amillano','985674258','Av.Los Proceres','Vegagabriel@gmail.com','1990-08-30','2',0);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Ronaldo','Leon','Ardion','945783565','Snt.Domingo','ronaldofabian@gmail.com','2000-06-01','3',0);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Jimena','Ruiz','Soto','923528712','La perla','Ruizsotojimena26@gmail.com','2002-12-04','4',1);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Giselle','Iman','Bazalar','998325456','Moyopampa','giselle_iman_07@gmail.com','2004-07-28','5',1);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Pedro','Pimentel','Valdivia',992145987,'Jr. Cañete 301','PEPI555@GHOTMAIL.COM','1982-06-29','6',0);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Luciana','Grillito','Rodrigues',998465678,'Av. Tacna 488','RESITA15@GMAIL.COM','1992-01-02','7',1);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Rolando','Vera','Osorio',988745654,'Av. Brasil 3416','ROLANDOV@HOTMAIL.COM','1985-02-25','8',0);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Gabriel','Nuñez','Malpartida',933,'Av. Javier Prado Este 560','GABO57@GMAIL.COM','1991-09-28','9',0);
insert into clientes(nomcli,apematcli,apepatcli,telcli,direcli,correocli,fechanac_cli,id_distrito,estado_clientes)
values('Juanma','Gutierrez','Collage',935446789,'Jr. Morro Solar 906','G154COLLAGE@GMAIL.COM','1996-07-30','10',1);

select * from clientes; 

SELECT nomcli,correocli FROM clientes;


drop table if exists roles; 

create table if not exists roles(
idrol int primary key auto_increment,
produccion_rol varchar(20) binary character set utf8 collate utf8_bin not null, 
administracion_rol varchar(20) binary character set utf8 collate utf8_bin not null, 
estado_roles bit not null,
atencion_rol varchar(20) binary character set utf8 collate utf8_bin not null, 
servicio_rol varchar(20) binary character set utf8 collate utf8_bin not null
)engine=InnoDB character set=utf8;

insert into roles(produccion_rol,administracion_rol,atencion_rol,servicio_rol,estado_roles)
values('PRODUCCION','INACTIVO','INACTIVO','INACTIVO',0);
insert into roles(produccion_rol,administracion_rol,atencion_rol,servicio_rol,estado_roles)
values('INACTIVO','ADMINISTRACION','INACTIVO','INACTIVO',0);
insert into roles(produccion_rol,administracion_rol,atencion_rol,servicio_rol,estado_roles)
values('INACTIVO','INACTIVO','ATENCION','INACTIVO',0);
insert into roles(produccion_rol,administracion_rol,atencion_rol,servicio_rol,estado_roles)
values('INACTIVO','INACTIVO','INACTIVO','SERVICIO',0);


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
estado_empleados bit not null,
idrol int not null,
foreign key (idrol) references roles(idrol),
id_distrito int not null,
foreign key(id_distrito) references distrito(id_distrito)
)engine=InnoDB character set=utf8;

insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Alexander','Rodriguez','Palacios',955870720,'Auxiliar Av. 22 de Agosto','Alexander20@gmail.com','2000-07-02',76984516,'1','2',1);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Jonny','Sulfato','Huamani',923148789,'Av. las malvinas 500','JONNYLEFT@GMAIL.COM','1988-10-15','41421444','2','3',1);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Luis','Gomes','Salva',989445665,'Av. grau 533','LUIS55@GMAIL.COM','1992-08-22','45123478','3','1',1);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Thiago','Dicaprio','Quispe',984849654,'Av. los portales 520','THIAGOPKMZ@GMAIL.COM','1992-02-21','25789436','4','5',1);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Fidel','Tavara','Grinaldo',972358498,'Av. La Cantuta 1000','Fide124@HOTMAIL.COM','1995-07-25','23485796','4','4',1);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Luchin','Gonzales','Quispe',917581256,'Av. Industrial 1250','Luis157@GMAIL.COM','1985-08-12','5327845','2','6',1);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Sandra','Valverde','Chipana',997514536,'Av. la frontera 200','GATITAFE1587@GMAIL.COM','1988-10-01','32547856','2','8',0);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Godines','Salvatierra','Rodrigues',987457819,'Av. las torres 400','GODSAL1@GMAIL.COM','1981-05-17','36615448','1','9',1);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Pedro','Rojas','Soria',987451254,'Av. brasil 1390','Pedroro1@GMAIL.COM','1996-05-22','41421444','3','7',1);
insert into empleados(nomemp,apematemp,apepatemp,telemp,direemp,correoemp,fechanacimiento_emp,dniemp,idrol,id_distrito,estado_empleados)
values('Oscar','Gomez','Rivera',921248547,'Av. Paseo de la Republica 1512','OSCAR22@GMAIL.COM','1997-09-18','41547891','3','10',1);

select * from empleados;

-- SELECT * FROM empleados where idrol='3';
-- -- eliminando un valor de la tabla de forma logica
update empleados set estado_empleados=0 where idrol='3';

-- buscando el dato del idrol con id 3
select * from empleados where idrol='3'; 

drop table if exists categoria_productos; 

create table categoria_productos(
idcate_pro int primary key auto_increment,
bebidas varchar(30) binary character set utf8 collate utf8_bin not null,
pollos varchar(30) binary character set utf8 collate utf8_bin not null,
parrillas varchar(30) binary character set utf8 collate utf8_bin not null,
complementos varchar(30)
)engine=InnoDB character set=utf8;

select * from categoria_productos;

drop table if exists cartaproducto; 

create table cartaproducto(
idcarta int primary key auto_increment,
nompro varchar(40) binary character set utf8 collate utf8_bin not null,
numpro int not null,
estado_cartaproducto bit not null,
precio varchar(12),
idcate_pro int not null,
foreign key (idcate_pro) references categoria_productos(idcate_pro)
)engine=InnoDB character set=utf8;

select * from cartaproducto;

drop table if exists pedidos; 

create table pedidos(
idped int(10) primary key auto_increment,
fechaped datetime,
numped int(10)not null,
descuped varchar(10),
estado_pedidos bit not null,
idcliente int(2) not null,
foreign key (idcliente) references clientes(idcliente),
idemp int not null,
foreign key (idemp) references empleados(idemp)
)engine=InnoDB character set=utf8;

select * from pedidos;

drop table if exists detalle_pedidos; 

create table detalle_pedidos(
-- iddepe int primary key auto_increment,
cantdepe int(30) not null,
preciodepe varchar(40),
estado_de_pedidos bit not null,
idped int(10) not null,
foreign key(idped) references pedidos(idped),
idcarta int not null,
foreign key(idcarta) references cartaproducto(idcarta)
)engine=InnoDB character set=utf8;

select * from detalle_pedidos;

-- FALTA TABLA FACTURA/BOLETA/TICKETS
-- FALTA TABLA METODO DE PAGOS