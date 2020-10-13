/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2008                    */
/* Created on:     12/16/2017 6:47:50 PM                        */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MAPPING') and o.name = 'FK_MAPPING_METADATA_IN')
alter table MAPPING
   drop constraint FK_MAPPING_METADATA_IN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MAPPING') and o.name = 'FK_MAPPING_METADATA_OUT')
alter table MAPPING
   drop constraint FK_MAPPING_METADATA_OUT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MAPPING') and o.name = 'FK_MAPPING_UNITS_PROCCESS')
alter table MAPPING
   drop constraint FK_MAPPING_UNITS_PROCCESS
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('METADATA') and o.name = 'FK_UNITS_PROCCESS_SOURCES')
alter table METADATA
   drop constraint FK_UNITS_PROCCESS_SOURCES
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('SQL_PARAMETERS') and o.name = 'FK_SQL_PARFAMETERS_SOURCES')
alter table SQL_PARAMETERS
   drop constraint FK_SQL_PARFAMETERS_SOURCES
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('UNITS_PROCCESS') and o.name = 'FK_UNITS_PROCCESS_SOURCES_INPUT')
alter table UNITS_PROCCESS
   drop constraint FK_UNITS_PROCCESS_SOURCES_INPUT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('UNITS_PROCCESS') and o.name = 'FK_UNITS_PROCCESS_SOURCES_OUTPUT')
alter table UNITS_PROCCESS
   drop constraint FK_UNITS_PROCCESS_SOURCES_OUTPUT
go

if exists (select 1
            from  sysobjects
           where  id = object_id('DATASOURCES')
            and   type = 'U')
   drop table DATASOURCES
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MAPPING')
            and   type = 'U')
   drop table MAPPING
go

if exists (select 1
            from  sysobjects
           where  id = object_id('METADATA')
            and   type = 'U')
   drop table METADATA
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PROPERTIES')
            and   type = 'U')
   drop table PROPERTIES
go

if exists (select 1
            from  sysobjects
           where  id = object_id('SOURCES')
            and   type = 'U')
   drop table SOURCES
go

if exists (select 1
            from  sysobjects
           where  id = object_id('SQL_PARAMETERS')
            and   type = 'U')
   drop table SQL_PARAMETERS
go

if exists (select 1
            from  sysobjects
           where  id = object_id('UNITS_PROCCESS')
            and   type = 'U')
   drop table UNITS_PROCCESS
go

/*==============================================================*/
/* Table: DATASOURCES                                           */
/*==============================================================*/
create table DATASOURCES (
   DATASOURCE           varchar(20)          not null,
   NAME                 varchar(100)         null,
   "USER"               varchar(50)          null,
   PASSWORD             varchar(50)          null,
   URL                  varchar(100)         null,
   DRIVER               varchar(100)         null,
   constraint PK_DATASOURCES primary key nonclustered (DATASOURCE)
)
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Registro de Conexiones a base de datos
   SQLSERVER
                                  -&#&',
   'user', @CurrentUser, 'table', 'DATASOURCES'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'PK - Clave de la Conexión a Base de Datos
   
   Usar nombres cortos como claves , ejem. SADB',
   'user', @CurrentUser, 'table', 'DATASOURCES', 'column', 'DATASOURCE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Nombre descriptivo para identificar la conexión',
   'user', @CurrentUser, 'table', 'DATASOURCES', 'column', 'NAME'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Nombre de Usuario',
   'user', @CurrentUser, 'table', 'DATASOURCES', 'column', 'USER'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Contraseña de Conexión',
   'user', @CurrentUser, 'table', 'DATASOURCES', 'column', 'PASSWORD'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Cadena de Conexión a la Base de Datos',
   'user', @CurrentUser, 'table', 'DATASOURCES', 'column', 'URL'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Driver de conexión',
   'user', @CurrentUser, 'table', 'DATASOURCES', 'column', 'DRIVER'
go

/*==============================================================*/
/* Table: MAPPING                                               */
/*==============================================================*/
create table MAPPING (
   PROCESS              varchar(20)          not null,
   ORDER_ID             int                  null,
   FORMAT               varchar(50)          null,
   SOURCEINPUT          varchar(20)          null,
   COLUMNNAME_INPUT     varchar(50)          null,
   SOURCEOUT            varchar(20)          null,
   COLUMNNAME_OUTPUT    varchar(50)          null,
   constraint PK_MAPPING primary key nonclustered (PROCESS)
)
go

/*==============================================================*/
/* Table: METADATA                                              */
/*==============================================================*/
create table METADATA (
   SOURCE               varchar(20)          not null,
   COLUMNAME            varchar(50)          not null,
   ORDER_ID             int                  not null,
   SQLTYPE              varchar(100)         not null,
   constraint PK_METADATA primary key nonclustered (SOURCE, COLUMNAME)
)
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Registro de metadatos de las fuentes de datos,
   Orden ',
   'user', @CurrentUser, 'table', 'METADATA'
go

/*==============================================================*/
/* Table: PROPERTIES                                            */
/*==============================================================*/
create table PROPERTIES (
   PROPERTY             varchar(20)          not null,
   PROPERTY_PARENT      varchar(20)          null,
   CATEGORY             varchar(50)          null,
   SQLTYPE              varchar(20)          null
      constraint CKC_SQLTYPE_PROPERTI check (SQLTYPE is null or (SQLTYPE in ('VARCHAR','LONGVARCHAR','NUMERIC','DECIMAL','BIT','TINYINT','SMALLINT','INTEGER','BIGINT','REAL','FLOAT','DOUBLE','BINARY','VARBINARY','LONGVARBINARY','DATE','TIME','TIMESTAMP'))),
   TYPE                 varchar(20)          null
      constraint CKC_TYPE_PROPERTI check (TYPE is null or (TYPE in ('DIRECT','SQLVALUE'))),
   DATASOURCE           varchar(20)          null,
   IS_MULTIVALUE        int                  null,
   VALUE                varchar(1000)        null,
   constraint PK_PROPERTIES primary key nonclustered (PROPERTY)
)
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'PK - Nombre del parametro',
   'user', @CurrentUser, 'table', 'PROPERTIES', 'column', 'PROPERTY'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Parametro Padre',
   'user', @CurrentUser, 'table', 'PROPERTIES', 'column', 'PROPERTY_PARENT'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Campo utilizado para catalogar las propiedades',
   'user', @CurrentUser, 'table', 'PROPERTIES', 'column', 'CATEGORY'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Tipo de Dato ANSI SQL (VARCHAR,INTEGER, etc) ',
   'user', @CurrentUser, 'table', 'PROPERTIES', 'column', 'SQLTYPE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'DIRECT, SQLVALUE   see notes',
   'user', @CurrentUser, 'table', 'PROPERTIES', 'column', 'TYPE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Origen de datos, solo cuando el TYPE es "SQLVALUE"',
   'user', @CurrentUser, 'table', 'PROPERTIES', 'column', 'DATASOURCE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Indicador de un parametro de multiples valores',
   'user', @CurrentUser, 'table', 'PROPERTIES', 'column', 'IS_MULTIVALUE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'El valor o dato asociado al parametro',
   'user', @CurrentUser, 'table', 'PROPERTIES', 'column', 'VALUE'
go

/*==============================================================*/
/* Table: SOURCES                                               */
/*==============================================================*/
create table SOURCES (
   SOURCE               varchar(20)          not null,
   NAME                 varchar(100)         not null,
   TYPEDATA             varchar(100)         null,
   TYPESOURCE           varchar(100)         null,
   FILENAME             varchar(100)         null,
   PATH                 varchar(500)         null,
   HEADER               tinyint              null,
   FORMAT               varchar(100)         null,
   DELIMITER            varchar(10)          null,
   LEFT_ENCLOSURE       varchar(10)          null,
   RIGHT_ENCLOUSURE     varchar(10)          null,
   SHEET_NAME           varchar(50)          null,
   DATASOURCE           int                  null,
   SCRIPTSQL            varchar(500)         null,
   constraint PK_SOURCES primary key nonclustered (SOURCE)
)
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Se registra todo tipo de Fuente de Datos
   Archivos de T',
   'user', @CurrentUser, 'table', 'SOURCES'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'PK - Nombre de la Fuente de Datos',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'SOURCE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Nombre identificador',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'NAME'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'FK - (SQL, TextFile, MSEXCEL)',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'TYPEDATA'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Tipo de Fuente de Datos, Entrada (INPUT), Salida (OUTPUT)',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'TYPESOURCE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Nombre del archivo
   ',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'FILENAME'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   '(Source = FileText) - Ruta Entrada/Salida',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'PATH'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Para indicar que la primera fila tiene nombre de las columnas de la info',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'HEADER'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Tipode Codificación del archivo de Salida (UTF8,ANSI,etc',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'FORMAT'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Caracter delimitador (ejem , |, TAB)',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'DELIMITER'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Caracter identificador a la izquierda',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'LEFT_ENCLOSURE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Caracter identificador a la derecha',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'RIGHT_ENCLOUSURE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Solo MSEXCEL - Nombre de la hoja de trabajo ',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'SHEET_NAME'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Conexión a Base de Datos',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'DATASOURCE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Consulta SQL de Extracción/Inyección de Datos',
   'user', @CurrentUser, 'table', 'SOURCES', 'column', 'SCRIPTSQL'
go

/*==============================================================*/
/* Table: SQL_PARAMETERS                                        */
/*==============================================================*/
create table SQL_PARAMETERS (
   SOURCE               varchar(20)          not null,
   PARAMETER            varchar(20)          not null,
   ID_ORDER             int                  null,
   TYPE                 varchar(20)          null
      constraint CKC_TYPE_SQL_PARA check (TYPE is null or (TYPE in ('DIRECT','PROPERTY'))),
   SQLTYPE              varchar(20)          null
      constraint CKC_SQLTYPE_SQL_PARA check (SQLTYPE is null or (SQLTYPE in ('VARCHAR','LONGVARCHAR','NUMERIC','DECIMAL','BIT','TINYINT','SMALLINT','INTEGER','BIGINT','REAL','FLOAT','DOUBLE','BINARY','VARBINARY','LONGVARBINARY','DATE','TIME','TIMESTAMP'))),
   IS_MULTIVALUE        int                  null,
   VALUE                varchar(1000)        null,
   constraint PK_SQL_PARAMETERS primary key nonclustered (SOURCE, PARAMETER)
)
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'FK - Nombre de la Fuente de Datos',
   'user', @CurrentUser, 'table', 'SQL_PARAMETERS', 'column', 'SOURCE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'PK - Nombre del parametro',
   'user', @CurrentUser, 'table', 'SQL_PARAMETERS', 'column', 'PARAMETER'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Posición del parametro',
   'user', @CurrentUser, 'table', 'SQL_PARAMETERS', 'column', 'ID_ORDER'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'DIRECT, PROPERTIE   see notes',
   'user', @CurrentUser, 'table', 'SQL_PARAMETERS', 'column', 'TYPE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Tipo de Dato ANSI SQL (VARCHAR,INTEGER, etc) ',
   'user', @CurrentUser, 'table', 'SQL_PARAMETERS', 'column', 'SQLTYPE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Indicador de un parametro de multiples valores',
   'user', @CurrentUser, 'table', 'SQL_PARAMETERS', 'column', 'IS_MULTIVALUE'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'El dato o valor asociado al parametro SQL',
   'user', @CurrentUser, 'table', 'SQL_PARAMETERS', 'column', 'VALUE'
go

/*==============================================================*/
/* Table: UNITS_PROCCESS                                        */
/*==============================================================*/
create table UNITS_PROCCESS (
   PROCESS              varchar(20)          not null,
   DESCRIPTION          varchar(500)         null,
   SOURCE_INPUT         varchar(20)          not null,
   SOURCE_OUTPUT        varchar(20)          not null,
   constraint PK_UNITS_PROCCESS primary key nonclustered (PROCESS)
)
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Registro de unidades de Proceso
   Entiendase como unidad',
   'user', @CurrentUser, 'table', 'UNITS_PROCCESS'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'PK - Nombre de la Unidad de Proceso',
   'user', @CurrentUser, 'table', 'UNITS_PROCCESS', 'column', 'PROCESS'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Descripciòn de la Unidad de Proceso',
   'user', @CurrentUser, 'table', 'UNITS_PROCCESS', 'column', 'DESCRIPTION'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Fuente de Datos de Entrada',
   'user', @CurrentUser, 'table', 'UNITS_PROCCESS', 'column', 'SOURCE_INPUT'
go

declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'Fuente de Datos de Salida',
   'user', @CurrentUser, 'table', 'UNITS_PROCCESS', 'column', 'SOURCE_OUTPUT'
go

alter table MAPPING
   add constraint FK_MAPPING_METADATA_IN foreign key (SOURCEINPUT, COLUMNNAME_INPUT)
      references METADATA (SOURCE, COLUMNAME)
go

alter table MAPPING
   add constraint FK_MAPPING_METADATA_OUT foreign key (SOURCEOUT, COLUMNNAME_OUTPUT)
      references METADATA (SOURCE, COLUMNAME)
go

alter table MAPPING
   add constraint FK_MAPPING_UNITS_PROCCESS foreign key (PROCESS)
      references UNITS_PROCCESS (PROCESS)
go

alter table METADATA
   add constraint FK_UNITS_PROCCESS_SOURCES foreign key (SOURCE)
      references SOURCES (SOURCE)
go

alter table SQL_PARAMETERS
   add constraint FK_SQL_PARFAMETERS_SOURCES foreign key (SOURCE)
      references SOURCES (SOURCE)
go

alter table UNITS_PROCCESS
   add constraint FK_UNITS_PROCCESS_SOURCES_INPUT foreign key (SOURCE_OUTPUT)
      references SOURCES (SOURCE)
         on update cascade on delete cascade
go

alter table UNITS_PROCCESS
   add constraint FK_UNITS_PROCCESS_SOURCES_OUTPUT foreign key (SOURCE_INPUT)
      references SOURCES (SOURCE)
         on update cascade on delete cascade
go

