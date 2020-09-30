package database.dao;

public abstract class AbstractDAO {
    public abstract List<Object> Select (final Object parametro) throws SQLException;

    public abstract void Insert(final Object parametro) throws SQLException;
    public abstract void Update(final Object parametro) throws SQLException;
    public abstract void Delete(final Object parametro) throws SQLException;

    public void Set(final preparedStatement ao_pst, final int an_position, final Object parametro) {
    if(parametro == null) {
    pst.setNull(position, Types.NULL);

    }
    else if(valor instanceof String) {
    pst.setString(position, (String) valor);
    }

}

}