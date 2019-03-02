-- Membuat tabel baru
create table buku(
	id character varying(64) not null primary key,
	nama character varying(100) not null,
	isbn character varying(62),
	tahun_terbit int not null default 2000,
	nama_pengarang character varying(100),
	penerbit character varying(64),
	created_date timestamp not null default now(),
	created_by character varying(100) not null,
	last_updated_date timestamp,
	last_updated_by character varying(100)
);

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

-- Insert data ke dalam tabel
insert into buku(id, nama, isbn, nama_pengarang, penerbit, created_by)
values ('prog-spring', 'Spring', '4321', 'Himawan Eka Putra', 'INF', 'admin');

insert into anggota(id, nama, ttl, jenis_kelamin, alamat, agama, berlaku, created_by)
values ('3203012503770011', 'Guohui Chen', '25-03-1977', 'Laki-laki', 'Jl. Slamet', 'Kristen', '25-03-2019', 'Admin');