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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DonDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression projetEducatifId;
	public final AssociationExpression projetEducatif;
	public final IntegerExpression donateurId;
	public final AssociationExpression donateur;
	public final FloatExpression montant;
	public final StringExpression dateEnvoi;
	
	public DonDetachedCriteria() {
		super(class_diagram_orm.Don.class, class_diagram_orm.DonCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		projetEducatifId = new IntegerExpression("projetEducatif.ID", this.getDetachedCriteria());
		projetEducatif = new AssociationExpression("projetEducatif", this.getDetachedCriteria());
		donateurId = new IntegerExpression("donateur.", this.getDetachedCriteria());
		donateur = new AssociationExpression("donateur", this.getDetachedCriteria());
		montant = new FloatExpression("montant", this.getDetachedCriteria());
		dateEnvoi = new StringExpression("dateEnvoi", this.getDetachedCriteria());
	}
	
	public DonDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.DonCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		projetEducatifId = new IntegerExpression("projetEducatif.ID", this.getDetachedCriteria());
		projetEducatif = new AssociationExpression("projetEducatif", this.getDetachedCriteria());
		donateurId = new IntegerExpression("donateur.", this.getDetachedCriteria());
		donateur = new AssociationExpression("donateur", this.getDetachedCriteria());
		montant = new FloatExpression("montant", this.getDetachedCriteria());
		dateEnvoi = new StringExpression("dateEnvoi", this.getDetachedCriteria());
	}
	
	public ProjetEducatifDetachedCriteria createProjetEducatifCriteria() {
		return new ProjetEducatifDetachedCriteria(createCriteria("projetEducatif"));
	}
	
	public DonateurDetachedCriteria createDonateurCriteria() {
		return new DonateurDetachedCriteria(createCriteria("donateur"));
	}
	
	public Don uniqueDon(PersistentSession session) {
		return (Don) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Don[] listDon(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Don[]) list.toArray(new Don[list.size()]);
	}
}

