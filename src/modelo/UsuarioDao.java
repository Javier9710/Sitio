package modelo;

import java.util.List;

public interface UsuarioDao {
	
	public Usuario selectById(String Usuario);
	
	public List<Usuario> selctAll();
	
	public void insert(Usuario usuario);
	
	public void update(Usuario usuario);
	
	public void delete(Usuario usuario);
	
	

}
