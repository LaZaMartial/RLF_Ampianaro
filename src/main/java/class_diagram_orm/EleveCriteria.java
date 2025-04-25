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

public class EleveCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final StringExpression email;
	public final StringExpression Biographie;
	public final StringExpression niveauScolaire;
	public final StringExpression dateNaissance;
	public final CollectionExpression projetEducatifs;
	
	public EleveCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nom = new StringExpression("nom", this);
		email = new StringExpression("email", this);
		Biographie = new StringExpression("Biographie", this);
		niveauScolaire = new StringExpression("niveauScolaire", this);
		dateNaissance = new StringExpression("dateNaissance", this);
		projetEducatifs = new CollectionExpression("ORM_ProjetEducatifs", this);
	}
	
	public EleveCriteria(PersistentSession session) {
		this(session.createCriteria(Eleve.class));
	}
	
	public EleveCriteria() throws PersistentException {
		this(Ampianaro2PersistentManager.instance().getSession());
	}
	
	public ProjetEducatifCriteria createProjetEducatifsCriteria() {
		return new ProjetEducatifCriteria(createCriteria("ORM_ProjetEducatifs"));
	}
	
	public Eleve uniqueEleve() {
		return (Eleve) super.uniqueResult();
	}
	
	public Eleve[] listEleve() {
		java.util.List list = super.list();
		return (Eleve[]) list.toArray(new Eleve[list.size()]);
	}
}

