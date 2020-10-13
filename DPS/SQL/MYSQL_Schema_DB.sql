/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     12/16/2017 6:48:17 PM                        */
/*==============================================================*/


drop table if exists DATASOURCES;

drop table if exists MAPPING;

drop table if exists METADATA;

drop table if exists PROPERTIES;

drop table if exists SOURCES;

drop table if exists SQL_PARAMETERS;

drop table if exists UNITS_PROCCESS;

/*==============================================================*/
/* Table: DATASOURCES                                           */
/*==============================================================*/
create table DATASOURCES
(
   DATASOURCE           varchar(20) not null comment 'PK - Clave de la Conexión a Base de Datos
            
            Usar nombres cortos como claves , ejem. SADB',
   NAME                 varchar(100) comment 'Nombre descriptivo para identificar la conexión',
   USER                 varchar(50) comment 'Nombre de Usuario',
   PASSWORD             varchar(50) comment 'Contraseña de Conexión',
   URL                  varchar(100) comment 'Cadena de Conexión a la Base de Datos',
   DRIVER               varchar(100) comment 'Driver de conexión',
   primary key (DATASOURCE)
);

alter table DATASOURCES comment 'Registro de Conexiones a base de datos
SQLSERVER
                                -&#&';

/*==============================================================*/
/* Table: MAPPING                                               */
/*==============================================================*/
create table MAPPING
(
   PROCESS              varchar(20) not null,
   ORDER_ID             int,
   FORMAT               varchar(50),
   SOURCEINPUT          varchar(20),
   COLUMNNAME_INPUT     varchar(50),
   SOURCEOUT            varchar(20),
   COLUMNNAME_OUTPUT    varchar(50),
   primary key (PROCESS)
);

/*==============================================================*/
/* Table: METADATA                                              */
/*==============================================================*/
create table METADATA
(
   SOURCE               varchar(20) not null,
   COLUMNAME            varchar(50) not null,
   ORDER_ID             int not null,
   SQLTYPE              varchar(100) not null,
   primary key (SOURCE, COLUMNAME)
);

alter table METADATA comment 'Registro de metadatos de las fuentes de datos,
Orden ';

/*==============================================================*/
/* Table: PROPERTIES                                            */
/*==============================================================*/
create table PROPERTIES
(
   PROPERTY             varchar(20) not null comment 'PK - Nombre del parametro',
   PROPERTY_PARENT      varchar(20) comment 'Parametro Padre',
   CATEGORY             varchar(50) comment 'Campo utilizado para catalogar las propiedades',
   SQLTYPE              varchar(20) comment 'Tipo de Dato ANSI SQL (VARCHAR,INTEGER, etc) ',
   TYPE                 varchar(20) comment 'DIRECT, SQLVALUE   see notes',
   DATASOURCE           varchar(20) comment 'Origen de datos, solo cuando el TYPE es "SQLVALUE"',
   IS_MULTIVALUE        int comment 'Indicador de un parametro de multiples valores',
   VALUE                varchar(1000) comment 'El valor o dato asociado al parametro',
   primary key (PROPERTY)
);

/*==============================================================*/
/* Table: SOURCES                                               */
/*==============================================================*/
create table SOURCES
(
   SOURCE               varchar(20) not null comment 'PK - Nombre de la Fuente de Datos',
   NAME                 varchar(100) not null comment 'Nombre identificador',
   TYPEDATA             varchar(100) comment 'FK - (SQL, TextFile, MSEXCEL)',
   TYPESOURCE           varchar(100) comment 'Tipo de Fuente de Datos, Entrada (INPUT), Salida (OUTPUT)',
   FILENAME             varchar(100) comment 'Nombre del archivo
            ',
   PATH                 varchar(500) comment '(Source = FileText) - Ruta Entrada/Salida',
   HEADER               tinyint comment 'Para indicar que la primera fila tiene nombre de las columnas de la info',
   FORMAT               varchar(100) comment 'Tipode Codificación del archivo de Salida (UTF8,ANSI,etc',
   DELIMITER            varchar(10) comment 'Caracter delimitador (ejem , |, TAB)',
   LEFT_ENCLOSURE       varchar(10) comment 'Caracter identificador a la izquierda',
   RIGHT_ENCLOUSURE     varchar(10) comment 'Caracter identificador a la derecha',
   SHEET_NAME           varchar(50) comment 'Solo MSEXCEL - Nombre de la hoja de trabajo ',
   DATASOURCE           int comment 'Conexión a Base de Datos',
   SCRIPTSQL            varchar(500) comment 'Consulta SQL de Extracción/Inyección de Datos',
   primary key (SOURCE)
);

alter table SOURCES comment 'Se registra todo tipo de Fuente de Datos
Archivos de T';

/*==============================================================*/
/* Table: SQL_PARAMETERS                                        */
/*==============================================================*/
create table SQL_PARAMETERS
(
   SOURCE               varchar(20) not null comment 'FK - Nombre de la Fuente de Datos',
   PARAMETER            varchar(20) not null comment 'PK - Nombre del parametro',
   ID_ORDER             int comment 'Posición del parametro',
   TYPE                 varchar(20) comment 'DIRECT, PROPERTIE   see notes',
   SQLTYPE              varchar(20) comment 'Tipo de Dato ANSI SQL (VARCHAR,INTEGER, etc) ',
   IS_MULTIVALUE        int comment 'Indicador de un parametro de multiples valores',
   VALUE                varchar(1000) comment 'El dato o valor asociado al parametro SQL',
   primary key (SOURCE, PARAMETER)
);

/*==============================================================*/
/* Table: UNITS_PROCCESS                                        */
/*==============================================================*/
create table UNITS_PROCCESS
(
   PROCESS              varchar(20) not null comment 'PK - Nombre de la Unidad de Proceso',
   DESCRIPTION          varchar(500) comment 'Descripciòn de la Unidad de Proceso',
   SOURCE_INPUT         varchar(20) not null comment 'Fuente de Datos de Entrada',
   SOURCE_OUTPUT        varchar(20) not null comment 'Fuente de Datos de Salida',
   primary key (PROCESS)
);

alter table UNITS_PROCCESS comment 'Registro de unidades de Proceso
Entiendase como unidad';

alter table MAPPING add constraint FK_MAPPING_METADATA_IN foreign key (SOURCEINPUT, COLUMNNAME_INPUT)
      references METADATA (SOURCE, COLUMNAME);

alter table MAPPING add constraint FK_MAPPING_METADATA_OUT foreign key (SOURCEOUT, COLUMNNAME_OUTPUT)
      references METADATA (SOURCE, COLUMNAME);

alter table MAPPING add constraint FK_MAPPING_UNITS_PROCCESS foreign key (PROCESS)
      references UNITS_PROCCESS (PROCESS);

alter table METADATA add constraint FK_UNITS_PROCCESS_SOURCES foreign key (SOURCE)
      references SOURCES (SOURCE);

alter table SQL_PARAMETERS add constraint FK_SQL_PARFAMETERS_SOURCES foreign key (SOURCE)
      references SOURCES (SOURCE) on delete restrict on update restrict;

alter table UNITS_PROCCESS add constraint FK_UNITS_PROCCESS_SOURCES_INPUT foreign key (SOURCE_OUTPUT)
      references SOURCES (SOURCE) on delete cascade on update cascade;

alter table UNITS_PROCCESS add constraint FK_UNITS_PROCCESS_SOURCES_OUTPUT foreign key (SOURCE_INPUT)
      references SOURCES (SOURCE) on delete cascade on update cascade;

