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

public class AdministrateurCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression email;
	public final StringExpression motDePasse;
	
	public AdministrateurCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nom = new StringExpression("nom", this);
		email = new StringExpression("email", this);
		motDePasse = new StringExpression("motDePasse", this);
	}
	
	public AdministrateurCriteria(PersistentSession session) {
		this(session.createCriteria(Administrateur.class));
	}
	
	public AdministrateurCriteria() throws PersistentException {
		this(Ampianaro3PersistentManager.instance().getSession());
	}
	
	public Administrateur uniqueAdministrateur() {
		return (Administrateur) super.uniqueResult();
	}
	
	public Administrateur[] listAdministrateur() {
		java.util.List list = super.list();
		return (Administrateur[]) list.toArray(new Administrateur[list.size()]);
	}
}

