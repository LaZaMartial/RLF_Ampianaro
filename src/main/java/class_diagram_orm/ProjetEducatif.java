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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ProjetEducatif {
	public ProjetEducatif() {
	}
	
	public static ProjetEducatif loadProjetEducatifByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return loadProjetEducatifByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif getProjetEducatifByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return getProjetEducatifByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif loadProjetEducatifByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return loadProjetEducatifByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif getProjetEducatifByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return getProjetEducatifByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif loadProjetEducatifByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ProjetEducatif) session.load(class_diagram_orm.ProjetEducatif.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif getProjetEducatifByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ProjetEducatif) session.get(class_diagram_orm.ProjetEducatif.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif loadProjetEducatifByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProjetEducatif) session.load(class_diagram_orm.ProjetEducatif.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif getProjetEducatifByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProjetEducatif) session.get(class_diagram_orm.ProjetEducatif.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjetEducatif(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return queryProjetEducatif(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjetEducatif(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return queryProjetEducatif(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif[] listProjetEducatifByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return listProjetEducatifByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif[] listProjetEducatifByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return listProjetEducatifByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjetEducatif(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.ProjetEducatif as ProjetEducatif");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjetEducatif(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.ProjetEducatif as ProjetEducatif");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ProjetEducatif", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif[] listProjetEducatifByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProjetEducatif(session, condition, orderBy);
			return (ProjetEducatif[]) list.toArray(new ProjetEducatif[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif[] listProjetEducatifByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProjetEducatif(session, condition, orderBy, lockMode);
			return (ProjetEducatif[]) list.toArray(new ProjetEducatif[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif loadProjetEducatifByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return loadProjetEducatifByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif loadProjetEducatifByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return loadProjetEducatifByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif loadProjetEducatifByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ProjetEducatif[] projetEducatifs = listProjetEducatifByQuery(session, condition, orderBy);
		if (projetEducatifs != null && projetEducatifs.length > 0)
			return projetEducatifs[0];
		else
			return null;
	}
	
	public static ProjetEducatif loadProjetEducatifByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ProjetEducatif[] projetEducatifs = listProjetEducatifByQuery(session, condition, orderBy, lockMode);
		if (projetEducatifs != null && projetEducatifs.length > 0)
			return projetEducatifs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProjetEducatifByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return iterateProjetEducatifByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjetEducatifByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return iterateProjetEducatifByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjetEducatifByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.ProjetEducatif as ProjetEducatif");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjetEducatifByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.ProjetEducatif as ProjetEducatif");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ProjetEducatif", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjetEducatif loadProjetEducatifByCriteria(ProjetEducatifCriteria projetEducatifCriteria) {
		ProjetEducatif[] projetEducatifs = listProjetEducatifByCriteria(projetEducatifCriteria);
		if(projetEducatifs == null || projetEducatifs.length == 0) {
			return null;
		}
		return projetEducatifs[0];
	}
	
	public static ProjetEducatif[] listProjetEducatifByCriteria(ProjetEducatifCriteria projetEducatifCriteria) {
		return projetEducatifCriteria.listProjetEducatif();
	}
	
	public static ProjetEducatif createProjetEducatif() {
		return new class_diagram_orm.ProjetEducatif();
	}
	
	public boolean save() throws PersistentException {
		try {
			Ampianaro2PersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			Ampianaro2PersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			Ampianaro2PersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			Ampianaro2PersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getEleve() != null) {
				getEleve().projetEducatifs.remove(this);
			}
			
			class_diagram_orm.Don[] lDonss = dons.toArray();
			for(int i = 0; i < lDonss.length; i++) {
				lDonss[i].setProjetEducatif(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getEleve() != null) {
				getEleve().projetEducatifs.remove(this);
			}
			
			class_diagram_orm.Don[] lDonss = dons.toArray();
			for(int i = 0; i < lDonss.length; i++) {
				lDonss[i].setProjetEducatif(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROJETEDUCATIF_DONS) {
			return ORM_dons;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PROJETEDUCATIF_ELEVE) {
			this.eleve = (class_diagram_orm.Eleve) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private class_diagram_orm.Eleve eleve;
	
	private String titre;
	
	private String description;
	
	private float montantObjectif;
	
	private float montantCollecte;
	
	private String statut;
	
	private String dateCreation;
	
	private java.util.Set ORM_dons = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitre(String value) {
		this.titre = value;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setMontantObjectif(float value) {
		this.montantObjectif = value;
	}
	
	public float getMontantObjectif() {
		return montantObjectif;
	}
	
	public void setMontantCollecte(float value) {
		this.montantCollecte = value;
	}
	
	public float getMontantCollecte() {
		return montantCollecte;
	}
	
	public void setStatut(String value) {
		this.statut = value;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public void setDateCreation(String value) {
		this.dateCreation = value;
	}
	
	public String getDateCreation() {
		return dateCreation;
	}
	
	private void setORM_Dons(java.util.Set value) {
		this.ORM_dons = value;
	}
	
	private java.util.Set getORM_Dons() {
		return ORM_dons;
	}
	
	public final class_diagram_orm.DonSetCollection dons = new class_diagram_orm.DonSetCollection(this, _ormAdapter, ORMConstants.KEY_PROJETEDUCATIF_DONS, ORMConstants.KEY_DON_PROJETEDUCATIF, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEleve(class_diagram_orm.Eleve value) {
		if (eleve != null) {
			eleve.projetEducatifs.remove(this);
		}
		if (value != null) {
			value.projetEducatifs.add(this);
		}
	}
	
	public class_diagram_orm.Eleve getEleve() {
		return eleve;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Eleve(class_diagram_orm.Eleve value) {
		this.eleve = value;
	}
	
	private class_diagram_orm.Eleve getORM_Eleve() {
		return eleve;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
