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

public class ProjetEducatifCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression eleveId;
	public final AssociationExpression eleve;
	public final StringExpression titre;
	public final StringExpression description;
	public final FloatExpression montantObjectif;
	public final FloatExpression montantCollecte;
	public final StringExpression status;
	public final StringExpression dateCreation;
	public final CollectionExpression dons;
	
	public ProjetEducatifCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		eleveId = new IntegerExpression("eleve.", this);
		eleve = new AssociationExpression("eleve", this);
		titre = new StringExpression("titre", this);
		description = new StringExpression("description", this);
		montantObjectif = new FloatExpression("montantObjectif", this);
		montantCollecte = new FloatExpression("montantCollecte", this);
		status = new StringExpression("status", this);
		dateCreation = new StringExpression("dateCreation", this);
		dons = new CollectionExpression("ORM_Dons", this);
	}
	
	public ProjetEducatifCriteria(PersistentSession session) {
		this(session.createCriteria(ProjetEducatif.class));
	}
	
	public ProjetEducatifCriteria() throws PersistentException {
		this(Ampianaro3PersistentManager.instance().getSession());
	}
	
	public EleveCriteria createEleveCriteria() {
		return new EleveCriteria(createCriteria("eleve"));
	}
	
	public DonCriteria createDonsCriteria() {
		return new DonCriteria(createCriteria("ORM_Dons"));
	}
	
	public ProjetEducatif uniqueProjetEducatif() {
		return (ProjetEducatif) super.uniqueResult();
	}
	
	public ProjetEducatif[] listProjetEducatif() {
		java.util.List list = super.list();
		return (ProjetEducatif[]) list.toArray(new ProjetEducatif[list.size()]);
	}
}

