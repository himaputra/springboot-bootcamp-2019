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



-- Insert data ke dalam tabel
insert into buku(id, nama, isbn, nama_pengarang, penerbit, created_by)
values ('prog-spring', 'Spring', '4321', 'Himawan Eka Putra', 'INF', 'admin');

