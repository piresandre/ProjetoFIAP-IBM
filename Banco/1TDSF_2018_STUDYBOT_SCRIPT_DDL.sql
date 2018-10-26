/*
STUDY BOT 
ANDRE PIRES RM 79988
DOUGLAS REIS RM 80517
HENRIQUE RODRIGUES RM 81072
VALTER PEREIRA RM 77806
WILSON ALVEZ RM 77889
*/


/*
DROP TABLE t_stb_aluno CASCADE CONSTRAINTS;

DROP TABLE t_stb_aula CASCADE CONSTRAINTS;

DROP TABLE t_stb_curso CASCADE CONSTRAINTS;

DROP TABLE t_stb_disciplina CASCADE CONSTRAINTS;

DROP TABLE t_stb_item_pedido CASCADE CONSTRAINTS;

DROP TABLE t_stb_pagamento CASCADE CONSTRAINTS;

DROP TABLE t_stb_pedido CASCADE CONSTRAINTS;

DROP TABLE t_stb_professor CASCADE CONSTRAINTS;

DROP TABLE t_stb_aluno CASCADE CONSTRAINTS;

DROP TABLE t_stb_professor CASCADE CONSTRAINTS;

DROP TABLE T_STB_MATERIAL CASCADE CONSTRAINTS;
*/

CREATE TABLE t_stb_aluno (
    ds_historico           VARCHAR2(30) NOT NULL,
    ds_grau_escolaridade   VARCHAR2(30) NOT NULL,
    dt_ano_formacao        DATE NOT NULL,
    cd_aluno      NUMBER(6) NOT NULL,
    nm_aluno      VARCHAR2(30) NOT NULL,
    nm_apelido      VARCHAR2(30) NOT NULL,
    nr_rg            VARCHAR2(30) NOT NULL,
    nr_cpf          NUMBER(13) NOT NULL,
    dt_nascimento   DATE NOT NULL,
    ds_email        VARCHAR2(30) NOT NULL,
    nr_telefone     NUMBER(9) NOT NULL,
    nr_senha        VARCHAR2(60) NOT NULL,
    ds_sexo         CHAR(1),
    nr_idade        NUMBER(3) NOT NULL
);

ALTER TABLE t_stb_aluno ADD CONSTRAINT pk_stb_aluno PRIMARY KEY ( cd_aluno );

CREATE TABLE t_stb_aula (
    cd_aula         NUMBER(6) NOT NULL,
    nm_aula         VARCHAR2(30) NOT NULL,
    ds_duracao      VARCHAR2(30) NOT NULL,
    cd_disciplina   NUMBER(6) NOT NULL,
    cd_curso        NUMBER(6) NOT NULL,
    cd_professor   NUMBER NOT NULL
);

ALTER TABLE t_stb_aula
    ADD CONSTRAINT pk_stb_aula PRIMARY KEY ( cd_aula,
                                             cd_curso,
                                             cd_disciplina );

CREATE TABLE t_stb_curso (
    cd_curso   NUMBER(6) NOT NULL,
    nm_curso   VARCHAR2(30) NOT NULL,
    ds_curso   VARCHAR2(30) NOT NULL,
    vl_curso   NUMBER(6,2) NOT NULL
);

ALTER TABLE t_stb_curso ADD CONSTRAINT ck_stb_curso_1 CHECK ( vl_curso > 0 );

ALTER TABLE t_stb_curso ADD CONSTRAINT pk_stb_curso PRIMARY KEY ( cd_curso );

CREATE TABLE t_stb_disciplina (
    cd_disciplina   NUMBER(6) NOT NULL,
    nm_disciplina   VARCHAR2(30) NOT NULL,
    ds_area         VARCHAR2(30) NOT NULL
);

ALTER TABLE t_stb_disciplina ADD CONSTRAINT pk_stb_disciplina PRIMARY KEY ( cd_disciplina );

CREATE TABLE t_stb_item_pedido (
    cd_item_pedido   NUMBER(2) NOT NULL,
    vl_item_pedido   NUMBER(6,2) NOT NULL,
    nr_item          NUMBER(6) NOT NULL,
    qt_vendida       NUMBER(6),
    cd_pagamento     NUMBER(5) NOT NULL,
    cd_pedido        NUMBER(30) NOT NULL,
    cd_curso         NUMBER(6) NOT NULL
);

ALTER TABLE t_stb_item_pedido ADD CONSTRAINT ck_stb_item_pedido_1 CHECK ( vl_item_pedido > 0 );

ALTER TABLE t_stb_item_pedido
    ADD CONSTRAINT pk_stb_item_pedido PRIMARY KEY ( cd_item_pedido,
                                                    cd_pagamento,
                                                    cd_pedido );

CREATE TABLE t_stb_pagamento (
    cd_pagamento   NUMBER(5) NOT NULL,
    ds_tipo_pag    VARCHAR2(30) NOT NULL
);

ALTER TABLE t_stb_pagamento ADD CONSTRAINT pk_stb_pagamento PRIMARY KEY ( cd_pagamento );

CREATE TABLE t_stb_pedido (
    cd_pedido                NUMBER(30) NOT NULL,
    dt_pedido                DATE NOT NULL,
    vl_total_pedido          NUMBER(6,2) NOT NULL,
    cd_pagamento             NUMBER(5) NOT NULL,
    cd_aluno   NUMBER(6) NOT NULL
);

ALTER TABLE t_stb_pedido ADD CONSTRAINT ck_stb_pedido_1 CHECK ( vl_total_pedido > 0 );

ALTER TABLE t_stb_pedido ADD CONSTRAINT pk_stb_pedido PRIMARY KEY ( cd_pagamento,
                                                                    cd_pedido );

CREATE TABLE t_stb_professor (
    ds_comprovante_pagamento   VARCHAR2(30) NOT NULL,
    cd_professor                 NUMBER(6) NOT NULL,
    nm_professor      VARCHAR2(30) NOT NULL,
    nm_apelido      VARCHAR2(30) NOT NULL,
    nr_rg            VARCHAR2(30) NOT NULL,
    nr_cpf          NUMBER(13) NOT NULL,
    dt_nascimento   DATE NOT NULL,
    ds_email        VARCHAR2(30) NOT NULL,
    nr_telefone     NUMBER(9) NOT NULL,
    nr_senha        VARCHAR2(60) NOT NULL,
    ds_sexo         CHAR(1),
    nr_idade        NUMBER(3) NOT NULL
);

ALTER TABLE T_STB_PROFESSOR ADD CONSTRAINT PK_STB_PROFESSOR PRIMARY KEY ( cd_professor );


/*
CREATE TABLE t_stb_usuario (
    cd_usuario      NUMBER(6) NOT NULL,
    nm_usuario      VARCHAR2(30) NOT NULL,
    nm_apelido      VARCHAR2(30) NOT NULL,
    nr_rg           NUMBER(13) NOT NULL,
    nr_cpf          NUMBER(13) NOT NULL,
    dt_nascimento   DATE NOT NULL,
    ds_email        VARCHAR2(30) NOT NULL,
    nr_telefone     NUMBER(9) NOT NULL,
    nr_senha        NUMBER NOT NULL,
    ds_sexo         CHAR(1),
    nr_idade        NUMBER(3) NOT NULL
);

*/

CREATE TABLE T_STB_MATERIAL(
cd_material number(5) not null,
ds_path varchar(60) not null,
ds_tipo varchar (60) not null,
cd_curso number (6) not null,
cd_usuario number(6) not null,
cd_disciplina number(6) not null
);

ALTER TABLE T_STB_MATERIAL ADD CONSTRAINT PK_STB_MATERIAL PRIMARY KEY (cd_material );

ALTER TABLE t_stb_aluno ADD CONSTRAINT ck_stb_aluno_1 CHECK ( nr_idade > 12 );
ALTER TABLE t_stb_professor ADD CONSTRAINT ck_stb_professor_1 CHECK ( nr_idade > 12 );

ALTER TABLE t_stb_aluno
    ADD CONSTRAINT ck_stb_aluno_2 CHECK ( upper(ds_sexo) = 'M'
                                            OR upper(ds_sexo) = 'F' );

ALTER TABLE t_stb_professor
    ADD CONSTRAINT ck_stb_professor_2 CHECK ( upper(ds_sexo) = 'M'
                                            OR upper(ds_sexo) = 'F' );


ALTER TABLE t_stb_aluno ADD CONSTRAINT ck_stb_aluno_3 CHECK ( nr_senha >= 8 );
ALTER TABLE t_stb_professor ADD CONSTRAINT ck_stb_professor_3 CHECK ( nr_senha >= 8 );


--ALTER TABLE t_stb_usuario ADD CONSTRAINT pk_stb_usuario PRIMARY KEY ( cd_usuario );

ALTER TABLE t_stb_aluno ADD CONSTRAINT un_stb_aluno UNIQUE ( nm_aluno );
ALTER TABLE t_stb_professor ADD CONSTRAINT un_stb_professor UNIQUE ( nm_professor );

ALTER TABLE t_stb_aluno ADD CONSTRAINT un_stb_alunov1 UNIQUE ( nr_rg );
ALTER TABLE t_stb_professor ADD CONSTRAINT un_stb_professorv1 UNIQUE ( nr_rg );

ALTER TABLE t_stb_aluno ADD CONSTRAINT un_stb_alunov2 UNIQUE ( nm_apelido );
ALTER TABLE t_stb_professor ADD CONSTRAINT un_stb_professorv2 UNIQUE ( nm_apelido );

ALTER TABLE t_stb_aluno ADD CONSTRAINT un_stb_alunov4 UNIQUE ( nr_cpf );
ALTER TABLE t_stb_professor ADD CONSTRAINT un_stb_professorv4 UNIQUE ( nr_cpf );

ALTER TABLE t_stb_aluno ADD CONSTRAINT un_stb_alunov5 UNIQUE ( nr_senha );
ALTER TABLE t_stb_professor ADD CONSTRAINT un_stb_professorv5 UNIQUE ( nr_senha );

/*
ALTER TABLE t_stb_aluno
    ADD CONSTRAINT fk_stb_aluno_usuario FOREIGN KEY ( cd_usuario )
        REFERENCES t_stb_usuario ( cd_usuario );
*/

ALTER TABLE t_stb_aula
    ADD CONSTRAINT fk_stb_aula_curso FOREIGN KEY ( cd_curso )
        REFERENCES t_stb_curso ( cd_curso );

ALTER TABLE t_stb_aula
    ADD CONSTRAINT fk_stb_aula_discip FOREIGN KEY ( cd_disciplina )
        REFERENCES t_stb_disciplina ( cd_disciplina );

ALTER TABLE t_stb_item_pedido
    ADD CONSTRAINT fk_stb_item_pedido_curso FOREIGN KEY ( cd_curso )
        REFERENCES t_stb_curso ( cd_curso );

ALTER TABLE t_stb_item_pedido
    ADD CONSTRAINT fk_stb_item_pedido_pedido FOREIGN KEY ( cd_pagamento,
                                                           cd_pedido )
        REFERENCES t_stb_pedido ( cd_pagamento,
                                  cd_pedido );

ALTER TABLE t_stb_pedido
    ADD CONSTRAINT fk_stb_pedido_aluno FOREIGN KEY ( cd_aluno )
        REFERENCES t_stb_aluno ( cd_aluno );

ALTER TABLE t_stb_pedido
    ADD CONSTRAINT fk_stb_pedido_pagamento FOREIGN KEY ( cd_pagamento )
        REFERENCES t_stb_pagamento ( cd_pagamento );

ALTER TABLE t_stb_aula
    ADD CONSTRAINT fk_stb_aula_prof FOREIGN KEY ( cd_professor )
        REFERENCES t_stb_professor ( cd_professor );

ALTER TABLE t_stb_material
    ADD CONSTRAINT fk_stb_material_aula FOREIGN KEY ( cd_aula )
        REFERENCES t_stb_aula(cd_aula);


/*
ALTER TABLE t_stb_professor
    ADD CONSTRAINT fk_stb_prof_usuario FOREIGN KEY ( cd_usuario )
        REFERENCES t_stb_usuario ( cd_usuario );
*/