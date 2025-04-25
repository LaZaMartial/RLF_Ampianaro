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

public class Eleve extends class_diagram_orm.Utilisateur {
	public Eleve() {
	}
	
	public static Eleve loadEleveByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return loadEleveByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve getEleveByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return getEleveByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve loadEleveByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return loadEleveByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve getEleveByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return getEleveByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve loadEleveByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Eleve) session.load(class_diagram_orm.Eleve.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve getEleveByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Eleve) session.get(class_diagram_orm.Eleve.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve loadEleveByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Eleve) session.load(class_diagram_orm.Eleve.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve getEleveByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Eleve) session.get(class_diagram_orm.Eleve.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEleve(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return queryEleve(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEleve(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return queryEleve(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve[] listEleveByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return listEleveByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve[] listEleveByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return listEleveByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEleve(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Eleve as Eleve");
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
	
	public static List queryEleve(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Eleve as Eleve");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Eleve", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve[] listEleveByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEleve(session, condition, orderBy);
			return (Eleve[]) list.toArray(new Eleve[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve[] listEleveByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEleve(session, condition, orderBy, lockMode);
			return (Eleve[]) list.toArray(new Eleve[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve loadEleveByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return loadEleveByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve loadEleveByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return loadEleveByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve loadEleveByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Eleve[] eleves = listEleveByQuery(session, condition, orderBy);
		if (eleves != null && eleves.length > 0)
			return eleves[0];
		else
			return null;
	}
	
	public static Eleve loadEleveByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Eleve[] eleves = listEleveByQuery(session, condition, orderBy, lockMode);
		if (eleves != null && eleves.length > 0)
			return eleves[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEleveByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return iterateEleveByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEleveByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro2PersistentManager.instance().getSession();
			return iterateEleveByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEleveByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Eleve as Eleve");
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
	
	public static java.util.Iterator iterateEleveByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Eleve as Eleve");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Eleve", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eleve loadEleveByCriteria(EleveCriteria eleveCriteria) {
		Eleve[] eleves = listEleveByCriteria(eleveCriteria);
		if(eleves == null || eleves.length == 0) {
			return null;
		}
		return eleves[0];
	}
	
	public static Eleve[] listEleveByCriteria(EleveCriteria eleveCriteria) {
		return eleveCriteria.listEleve();
	}
	
	public static Eleve createEleve() {
		return new class_diagram_orm.Eleve();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			class_diagram_orm.ProjetEducatif[] lProjetEducatifss = projetEducatifs.toArray();
			for(int i = 0; i < lProjetEducatifss.length; i++) {
				lProjetEducatifss[i].setEleve(null);
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
			class_diagram_orm.ProjetEducatif[] lProjetEducatifss = projetEducatifs.toArray();
			for(int i = 0; i < lProjetEducatifss.length; i++) {
				lProjetEducatifss[i].setEleve(null);
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
		if (key == ORMConstants.KEY_ELEVE_PROJETEDUCATIFS) {
			return ORM_projetEducatifs;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String biographie;
	
	private String niveauScolaire;
	
	private String dateNaissance;
	
	private java.util.Set ORM_projetEducatifs = new java.util.HashSet();
	
	public void setBiographie(String value) {
		this.biographie = value;
	}
	
	public String getBiographie() {
		return biographie;
	}
	
	public void setNiveauScolaire(String value) {
		this.niveauScolaire = value;
	}
	
	public String getNiveauScolaire() {
		return niveauScolaire;
	}
	
	public void setDateNaissance(String value) {
		this.dateNaissance = value;
	}
	
	public String getDateNaissance() {
		return dateNaissance;
	}
	
	private void setORM_ProjetEducatifs(java.util.Set value) {
		this.ORM_projetEducatifs = value;
	}
	
	private java.util.Set getORM_ProjetEducatifs() {
		return ORM_projetEducatifs;
	}
	
	public final class_diagram_orm.ProjetEducatifSetCollection projetEducatifs = new class_diagram_orm.ProjetEducatifSetCollection(this, _ormAdapter, ORMConstants.KEY_ELEVE_PROJETEDUCATIFS, ORMConstants.KEY_PROJETEDUCATIF_ELEVE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
