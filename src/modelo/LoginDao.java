package modelo;


public class LoginDao {
	
	public String authenticateUser(Usuario usuario) {
		
		UsuarioDao usuarioDao= new HibernateUsuarioDao();
		
		Usuario u = usuarioDao.selectById(usuario.getUsuario());
		System.out.println("uno"+u);

		if(u!=null) {
			if(u.getClave().contentEquals(usuario.getClave())) {
				return "SUCCESS";
				
			}
			
		}
		
		return "ERROR";
		
	}

}
