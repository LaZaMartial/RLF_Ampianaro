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

public class DonCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression donateurId;
	public final AssociationExpression donateur;
	public final IntegerExpression projetEducatifId;
	public final AssociationExpression projetEducatif;
	public final FloatExpression montant;
	public final StringExpression dateEnvoi;
	
	public DonCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		donateurId = new IntegerExpression("donateur.", this);
		donateur = new AssociationExpression("donateur", this);
		projetEducatifId = new IntegerExpression("projetEducatif.ID", this);
		projetEducatif = new AssociationExpression("projetEducatif", this);
		montant = new FloatExpression("montant", this);
		dateEnvoi = new StringExpression("dateEnvoi", this);
	}
	
	public DonCriteria(PersistentSession session) {
		this(session.createCriteria(Don.class));
	}
	
	public DonCriteria() throws PersistentException {
		this(Ampianaro2PersistentManager.instance().getSession());
	}
	
	public DonateurCriteria createDonateurCriteria() {
		return new DonateurCriteria(createCriteria("donateur"));
	}
	
	public ProjetEducatifCriteria createProjetEducatifCriteria() {
		return new ProjetEducatifCriteria(createCriteria("projetEducatif"));
	}
	
	public Don uniqueDon() {
		return (Don) super.uniqueResult();
	}
	
	public Don[] listDon() {
		java.util.List list = super.list();
		return (Don[]) list.toArray(new Don[list.size()]);
	}
}

