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

public class EleveDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression email;
	public final StringExpression Biographie;
	public final StringExpression niveauScolaire;
	public final StringExpression dateNaissance;
	public final CollectionExpression projetEducatifs;
	
	public EleveDetachedCriteria() {
		super(class_diagram_orm.Eleve.class, class_diagram_orm.EleveCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		Biographie = new StringExpression("Biographie", this.getDetachedCriteria());
		niveauScolaire = new StringExpression("niveauScolaire", this.getDetachedCriteria());
		dateNaissance = new StringExpression("dateNaissance", this.getDetachedCriteria());
		projetEducatifs = new CollectionExpression("ORM_ProjetEducatifs", this.getDetachedCriteria());
	}
	
	public EleveDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, class_diagram_orm.EleveCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		Biographie = new StringExpression("Biographie", this.getDetachedCriteria());
		niveauScolaire = new StringExpression("niveauScolaire", this.getDetachedCriteria());
		dateNaissance = new StringExpression("dateNaissance", this.getDetachedCriteria());
		projetEducatifs = new CollectionExpression("ORM_ProjetEducatifs", this.getDetachedCriteria());
	}
	
	public ProjetEducatifDetachedCriteria createProjetEducatifsCriteria() {
		return new ProjetEducatifDetachedCriteria(createCriteria("ORM_ProjetEducatifs"));
	}
	
	public Eleve uniqueEleve(PersistentSession session) {
		return (Eleve) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Eleve[] listEleve(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Eleve[]) list.toArray(new Eleve[list.size()]);
	}
}

