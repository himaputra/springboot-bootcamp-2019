package com.tabeldata.bootcamp.belajarspringboot.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tabeldata.bootcamp.belajarspringboot.model.Anggota;

@Repository
@Transactional(readOnly = true)
public class AnggotaDao {
	@Autowired
	private JdbcTemplate jdbc;
	
	public List<Anggota> daftarAnggota() {
		String sql = "select * from anggota";
		return this.jdbc.query(sql, new AnggotaRowMapper());
	}
	
	@Transactional
	public void save(Anggota anggota) {
		String sql = "insert into anggota(id, nama, ttl, jenis_kelamin, alamat, agama, berlaku, created_by) values(?, ?, ?, ?, ?, ?, ?, ?)";
		this.jdbc.update(sql, new InsertAnggota(anggota));
	}
	
	public Anggota findByName(String nama) {
		String sql = "select * from anggota where nama like ?";
		return this.jdbc.queryForObject(sql, new AnggotaRowMapper(), new Object[] {
			new StringBuilder("%").append(nama).append("%").toString()
		});
	}
	
	@Transactional
	public void update(Anggota anggota) {
		String sql = "update anggota set "
				+ "nama = ?, "
				+ "ttl = ?, "
				+ "jenis_kelamin = ?, "
				+ "alamat = ?, "
				+ "agama = ?, "
				+ "berlaku = ?, "
				+ "last_updated_date = ?, "
				+ "last_updated_by = ? "
				+ "where id = ?";
		this.jdbc.update(sql, new UpdateAnggota(anggota));
	}
	
	@Transactional
	public void delete(String id) {
		String sql = "delete from anggota where id = ?";
		this.jdbc.update(sql, new Object[] {id});
	}
	
	private class UpdateAnggota implements PreparedStatementSetter {
		final Anggota anggota;
		
		public UpdateAnggota(Anggota anggota) {
			this.anggota = anggota;
		}
		
		@Override
		public void setValues(PreparedStatement ps) throws SQLException {
			ps.setString(1, anggota.getNama());
			ps.setDate(2, anggota.getTtl());
			ps.setString(3, anggota.getJenisKelamin());
			ps.setString(4, anggota.getAlamat());
			ps.setString(5, anggota.getAgama());
			ps.setDate(6, anggota.getBerlaku());
			ps.setTimestamp(7, anggota.getLastUpdatedDate());
			ps.setString(8, anggota.getLastUpdatedBy());
			ps.setString(9, anggota.getId());
		}
		
	}
	
	private class InsertAnggota implements PreparedStatementSetter {
		final Anggota anggota;
		
		public InsertAnggota(Anggota anggota) {
			this.anggota = anggota;
		}
		@Override
		public void setValues(PreparedStatement ps) throws SQLException {
			ps.setString(1, anggota.getId());
			ps.setString(2, anggota.getNama());
			ps.setDate(3, anggota.getTtl());
			ps.setString(4, anggota.getJenisKelamin());
			ps.setString(5, anggota.getAlamat());
			ps.setString(6, anggota.getAgama());
			ps.setDate(7, anggota.getBerlaku());
			ps.setString(8, anggota.getCreatedBy());
		}
		
	}
	
	private class AnggotaRowMapper implements RowMapper<Anggota> {
		@Override
		public Anggota mapRow(ResultSet rs, int rowNum) throws SQLException {
			Anggota aAnggota = new Anggota();
			aAnggota.setId(rs.getString("id"));
			aAnggota.setNama(rs.getString("nama"));
			aAnggota.setTtl(rs.getDate("ttl"));
			aAnggota.setJenisKelamin(rs.getString("jenis_kelamin"));
			aAnggota.setAlamat(rs.getString("alamat"));
			aAnggota.setAgama(rs.getString("agama"));
			aAnggota.setBerlaku(rs.getDate("berlaku"));
			aAnggota.setCreatedDate(rs.getTimestamp("created_date"));
			aAnggota.setCreatedBy(rs.getString("created_by"));
			aAnggota.setLastUpdatedDate(rs.getTimestamp("last_updated_date"));
			aAnggota.setLastUpdatedBy(rs.getString("last_updated_by"));
			return aAnggota;
		}
	}
}
