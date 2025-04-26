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

public class Don {
	public Don() {
	}
	
	public static Don loadDonByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return loadDonByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don getDonByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return getDonByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return loadDonByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don getDonByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return getDonByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Don) session.load(class_diagram_orm.Don.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don getDonByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Don) session.get(class_diagram_orm.Don.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Don) session.load(class_diagram_orm.Don.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don getDonByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Don) session.get(class_diagram_orm.Don.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDon(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return queryDon(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDon(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return queryDon(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don[] listDonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return listDonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don[] listDonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return listDonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDon(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Don as Don");
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
	
	public static List queryDon(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Don as Don");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Don", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don[] listDonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDon(session, condition, orderBy);
			return (Don[]) list.toArray(new Don[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don[] listDonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDon(session, condition, orderBy, lockMode);
			return (Don[]) list.toArray(new Don[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return loadDonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return loadDonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Don[] dons = listDonByQuery(session, condition, orderBy);
		if (dons != null && dons.length > 0)
			return dons[0];
		else
			return null;
	}
	
	public static Don loadDonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Don[] dons = listDonByQuery(session, condition, orderBy, lockMode);
		if (dons != null && dons.length > 0)
			return dons[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return iterateDonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Ampianaro3PersistentManager.instance().getSession();
			return iterateDonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Don as Don");
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
	
	public static java.util.Iterator iterateDonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From class_diagram_orm.Don as Don");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Don", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByCriteria(DonCriteria donCriteria) {
		Don[] dons = listDonByCriteria(donCriteria);
		if(dons == null || dons.length == 0) {
			return null;
		}
		return dons[0];
	}
	
	public static Don[] listDonByCriteria(DonCriteria donCriteria) {
		return donCriteria.listDon();
	}
	
	public static Don createDon() {
		return new class_diagram_orm.Don();
	}
	
	public boolean save() throws PersistentException {
		try {
			Ampianaro3PersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			Ampianaro3PersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			Ampianaro3PersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			Ampianaro3PersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getProjetEducatif() != null) {
				getProjetEducatif().dons.remove(this);
			}
			
			if(getDonateur() != null) {
				getDonateur().dons.remove(this);
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
			if(getProjetEducatif() != null) {
				getProjetEducatif().dons.remove(this);
			}
			
			if(getDonateur() != null) {
				getDonateur().dons.remove(this);
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DON_DONATEUR) {
			this.donateur = (class_diagram_orm.Donateur) owner;
		}
		
		else if (key == ORMConstants.KEY_DON_PROJETEDUCATIF) {
			this.projetEducatif = (class_diagram_orm.ProjetEducatif) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private class_diagram_orm.ProjetEducatif projetEducatif;
	
	private class_diagram_orm.Donateur donateur;
	
	private float montant;
	
	private String dateEnvoi;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setMontant(float value) {
		this.montant = value;
	}
	
	public float getMontant() {
		return montant;
	}
	
	public void setDateEnvoi(String value) {
		this.dateEnvoi = value;
	}
	
	public String getDateEnvoi() {
		return dateEnvoi;
	}
	
	public void setDonateur(class_diagram_orm.Donateur value) {
		if (donateur != null) {
			donateur.dons.remove(this);
		}
		if (value != null) {
			value.dons.add(this);
		}
	}
	
	public class_diagram_orm.Donateur getDonateur() {
		return donateur;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Donateur(class_diagram_orm.Donateur value) {
		this.donateur = value;
	}
	
	private class_diagram_orm.Donateur getORM_Donateur() {
		return donateur;
	}
	
	public void setProjetEducatif(class_diagram_orm.ProjetEducatif value) {
		if (projetEducatif != null) {
			projetEducatif.dons.remove(this);
		}
		if (value != null) {
			value.dons.add(this);
		}
	}
	
	public class_diagram_orm.ProjetEducatif getProjetEducatif() {
		return projetEducatif;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_ProjetEducatif(class_diagram_orm.ProjetEducatif value) {
		this.projetEducatif = value;
	}
	
	private class_diagram_orm.ProjetEducatif getORM_ProjetEducatif() {
		return projetEducatif;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
