
DROP TABLE IF EXISTS KULLANICI cascade ;
create table kullanici (
                           id      varchar(36) not null ,
                           adi        varchar(50) not null,
                           soyadi        varchar(50) not null,
                           email        varchar(50) not null,
                           telefon        varchar(15) not null,
                           constraint pk_kullanici primary key (id)
);
DROP TABLE IF EXISTS URUN cascade ;
create table urun(
                     id                     varchar(36) not null,
                     adi                    varchar(50) not null,
                     fiyat                    decimal not null,
                     expDate                    DATE,
                     constraint pk_urun primary key (id)
);

DROP TABLE IF EXISTS URUNYORUM cascade ;
create table Urunyorum(
                          id                       varchar(36),
                          yorum                   varchar(500),
                          yorumtarihi             DATE,
                          urunid                   varchar(36),
                          kullaniciid             varchar(36),
                          constraint pk_urunyorum primary key (id),
                          CONSTRAINT pk_urunyorum_kullanıcı FOREIGN KEY (kullaniciid) REFERENCES kullanıcı(id),
                          CONSTRAINT pk_urunyorum_urun FOREIGN KEY (urunid) REFERENCES urun(id)
);