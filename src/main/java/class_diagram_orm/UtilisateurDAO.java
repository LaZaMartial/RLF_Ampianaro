package class_diagram_orm;

import java.util.List;
import org.orm.PersistentException;

public class UtilisateurDAO {
    public static Utilisateur getById(int id) throws PersistentException {
        return Utilisateur.getUtilisateurByORMID(id);
    }

    public static List<Utilisateur> getAll() throws PersistentException {
        return Utilisateur.queryUtilisateur(null, null);
    }

    public static void save(Utilisateur utilisateur) throws PersistentException {
        utilisateur.save();
    }

    public static void delete(Utilisateur utilisateur) throws PersistentException {
        utilisateur.delete();
    }
}
