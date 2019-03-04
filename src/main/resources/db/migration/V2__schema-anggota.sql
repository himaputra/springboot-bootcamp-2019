create table anggota(
	id character varying(64) not null primary key,
	nama character varying(100) not null,
	ttl date not null,
	jenis_kelamin character varying(62) not null,
	alamat character varying(500) not null,
	agama character varying(64),
	berlaku date not null,
	created_date timestamp not null default now(),
	created_by character varying(100) not null,
	last_updated_date timestamp,
	last_updated_by character varying(100)
);