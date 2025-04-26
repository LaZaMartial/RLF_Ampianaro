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

public class DonateurCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression email;
	public final StringExpression motDePasse;
	public final CollectionExpression dons;
	
	public DonateurCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nom = new StringExpression("nom", this);
		email = new StringExpression("email", this);
		motDePasse = new StringExpression("motDePasse", this);
		dons = new CollectionExpression("ORM_Dons", this);
	}
	
	public DonateurCriteria(PersistentSession session) {
		this(session.createCriteria(Donateur.class));
	}
	
	public DonateurCriteria() throws PersistentException {
		this(Ampianaro3PersistentManager.instance().getSession());
	}
	
	public DonCriteria createDonsCriteria() {
		return new DonCriteria(createCriteria("ORM_Dons"));
	}
	
	public Donateur uniqueDonateur() {
		return (Donateur) super.uniqueResult();
	}
	
	public Donateur[] listDonateur() {
		java.util.List list = super.list();
		return (Donateur[]) list.toArray(new Donateur[list.size()]);
	}
}

