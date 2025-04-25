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

public class DonateurDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression email;
	public final CollectionExpression dons;
	
	public DonateurDetachedCriteria() {
		super(class_diagram_orm.Donateur.class, class_diagram_orm.DonateurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		dons = new CollectionExpression("ORM_Dons", this.getDetachedCriteria());
	}
	
	public DonateurDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.DonateurCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		dons = new CollectionExpression("ORM_Dons", this.getDetachedCriteria());
	}
	
	public DonDetachedCriteria createDonsCriteria() {
		return new DonDetachedCriteria(createCriteria("ORM_Dons"));
	}
	
	public Donateur uniqueDonateur(PersistentSession session) {
		return (Donateur) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Donateur[] listDonateur(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Donateur[]) list.toArray(new Donateur[list.size()]);
	}
}

