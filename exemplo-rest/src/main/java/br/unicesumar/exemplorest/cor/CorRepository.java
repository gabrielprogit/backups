package br.unicesumar.exemplorest.cor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CorRepository {
	private Connection conn;
	
	
	public CorRepository(Connection conn) throws Exception {
		this.conn = conn;
		this.createTable();
	}


	private void createTable() throws Exception {
		this.conn.createStatement().execute("create table if not exists "
				+ "cor ("
				+ "id varchar(40) not null primary key, "
				+ "nome varchar(255) not null unique"
				+ ")");
	}
	public void save(Cor c) {
		PreparedStatement insert = null;
		try {
			insert = this.conn.prepareStatement("insert into cor (id, nome) values (?,?)");
			insert.setString(1, c.getId());
			insert.setString(2, c.getNome());
			insert.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				insert.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	public List<Cor> findAll() {
		List<Cor> resultado = new ArrayList<>();
		
		PreparedStatement psSelect = null;
		try {
			psSelect = this.conn.prepareStatement("select id, nome from cor");
			ResultSet rs = psSelect.executeQuery();
			while (rs.next()) {
				Cor recuperada = new Cor(rs.getString("id"), rs.getString("nome"));
				resultado.add(recuperada);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				psSelect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultado;
	}


	public Cor findById(String id) {
		Cor resultado = null;
		
		PreparedStatement psSelect = null;
		try {
			psSelect = this.conn.prepareStatement("select id, nome from cor where id = ?");
			psSelect.setString(1, id);
			ResultSet rs = psSelect.executeQuery();
			if (rs.next()) {
				Cor recuperada = new Cor(rs.getString("id"), rs.getString("nome"));
				return recuperada;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				psSelect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}


	public boolean remove(String id) {
		PreparedStatement psDelete = null;
		try {
			psDelete = this.conn.prepareStatement("delete from cor where id = ?");
			psDelete.setString(1, id);			
			return psDelete.executeUpdate() == 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				psDelete.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}


	public boolean update(Cor cor) {
		PreparedStatement psUpdate = null;
		try {
			psUpdate = this.conn.prepareStatement("update cor set nome = ? where id = ?");
			psUpdate.setString(1, cor.getNome());			
			psUpdate.setString(2, cor.getId());			
			return psUpdate.executeUpdate() == 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				psUpdate.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	

}




