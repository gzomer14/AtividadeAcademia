packge database.dao
import java.sql.SQLException;
import java.util.list;

public class UsuarioDAO extends AbstractDAO {
//passo 1
    private String is_select = "select * from tb_usuario";
    private String is_selectWhere = "select * from tb_usuario where nm_usuario = ? and ds_senha= ?";
// passo 2
    private PreparedStatement pst_select;
    private PreparedStatement pst_selectWhere;
// passo 3
    public UsuarioDAO(final Connection conn) {
    pst_select = conn.prepareStatement(is_select);
    pst_selectWhere = conn.prepareStatement(is_selectWhere);
}

    public Usuario SelectLogin(final String nm_usuario, final String ds_senha){

    Usuario usuario = null;
    return usuario;
}

    @Override
    public List<Object> Select(Object parametro) throws SQLException{

    ArrayList<Object> arlUsuarios = new ArrayList<Object>();

    ResultSet resultado = null;
    if(parametro != null) {
    }
    else {
        resultado = pst_select.executeQuery();
    }
    if(resultado != null) {

    while(resultado.next()) {
    Usuario usuario = new Usuario();
    usuario.setCd_usuario(resultado.getInt("cd_usuario"));
    usuario.setNm_usuario(resultado.getString("nm_usuario"));
    usuario.setDs_usuario(resultado.getString("ds_senha"));
    arlUsuarios.add(usuario);
    }

    }



    resultado.close();
    return arlUsuarios;
    }
    @Override
    public void Insert(Object parametro) throws SQLException{

    }
    @Override
    public void Update(Object parametro) throws SQLException{

    }
    @Override
    public void Delete(Object parametro) throws SQLException{

    }

}