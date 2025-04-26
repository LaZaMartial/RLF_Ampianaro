/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Purchased
 */
package class_diagram_orm;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UtilisateurCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression email;
	public final StringExpression motDePasse;
	
	public UtilisateurCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nom = new StringExpression("nom", this);
		email = new StringExpression("email", this);
		motDePasse = new StringExpression("motDePasse", this);
	}
	
	public UtilisateurCriteria(PersistentSession session) {
		this(session.createCriteria(Utilisateur.class));
	}
	
	public UtilisateurCriteria() throws PersistentException {
		this(Ampianaro3PersistentManager.instance().getSession());
	}
	
	public Utilisateur uniqueUtilisateur() {
		return (Utilisateur) super.uniqueResult();
	}
	
	public Utilisateur[] listUtilisateur() {
		java.util.List list = super.list();
		return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
	}
}

