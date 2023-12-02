create database escola; /*cria a base de dados*/

use escola; /* acessa a base de dados */

create table aluno( /*cria tabela*/
    idaluno integer primary key auto_increment,
    nome varchar(60)not null,
    telefone varchar(14)not null,
    email varchar(60)not null,
    datanasc varchar(10)not null,
    cpf varchar(14)not null,
    rg varchar(30)not null,
    cep char(9)not null,
    numero smallint not null,
    complemento varchar(30));
   
INSERT INTO ALUNO(nome,telefone,email,rg,cpf,datanasc,cep,numero,complemento)
VALUES
('Fatima Melo','(21)99999-1111','fatima@gmail.com','000456745','111.111.111-99','10/10/1900','23085-610',31,'ap102'),
('Gabriel Melo','(21)99888-5555','gabriel@gmail.com','000991125','222.111.111-10','09/06/2001','23085-610',31,'ap102');


create table matricula(
    matricula integer primary key auto_increment,
    data date not null,
    idaluno integer not null,
    idcurso integer not null,
    foreign key(idaluno)references aluno(idaluno),
    foreign key(idcurso)references curso(idcurso));
   
    SELECT * FROM ALUNO;
    
    create table curso(
    idcurso integer primary key auto_increment,
    nomecurso varchar(60)not null,
    cargahoraria smallint not null,
    tipocurso varchar(40)not null);
   
  
    
    
    