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

public class ProjetEducatifDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression eleveId;
	public final AssociationExpression eleve;
	public final StringExpression titre;
	public final StringExpression description;
	public final FloatExpression montantObjectif;
	public final FloatExpression montantCollecte;
	public final StringExpression statut;
	public final StringExpression dateCreation;
	public final CollectionExpression dons;
	
	public ProjetEducatifDetachedCriteria() {
		super(class_diagram_orm.ProjetEducatif.class, class_diagram_orm.ProjetEducatifCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		eleveId = new IntegerExpression("eleve.", this.getDetachedCriteria());
		eleve = new AssociationExpression("eleve", this.getDetachedCriteria());
		titre = new StringExpression("titre", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		montantObjectif = new FloatExpression("montantObjectif", this.getDetachedCriteria());
		montantCollecte = new FloatExpression("montantCollecte", this.getDetachedCriteria());
		statut = new StringExpression("statut", this.getDetachedCriteria());
		dateCreation = new StringExpression("dateCreation", this.getDetachedCriteria());
		dons = new CollectionExpression("ORM_Dons", this.getDetachedCriteria());
	}
	
	public ProjetEducatifDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.ProjetEducatifCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		eleveId = new IntegerExpression("eleve.", this.getDetachedCriteria());
		eleve = new AssociationExpression("eleve", this.getDetachedCriteria());
		titre = new StringExpression("titre", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		montantObjectif = new FloatExpression("montantObjectif", this.getDetachedCriteria());
		montantCollecte = new FloatExpression("montantCollecte", this.getDetachedCriteria());
		statut = new StringExpression("statut", this.getDetachedCriteria());
		dateCreation = new StringExpression("dateCreation", this.getDetachedCriteria());
		dons = new CollectionExpression("ORM_Dons", this.getDetachedCriteria());
	}
	
	public EleveDetachedCriteria createEleveCriteria() {
		return new EleveDetachedCriteria(createCriteria("eleve"));
	}
	
	public DonDetachedCriteria createDonsCriteria() {
		return new DonDetachedCriteria(createCriteria("ORM_Dons"));
	}
	
	public ProjetEducatif uniqueProjetEducatif(PersistentSession session) {
		return (ProjetEducatif) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ProjetEducatif[] listProjetEducatif(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ProjetEducatif[]) list.toArray(new ProjetEducatif[list.size()]);
	}
}

