package app_servlet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;




public class DataDao {
   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
   EntityManager em=emf.createEntityManager();
   EntityTransaction et=em.getTransaction();
   
   
public void save(Users users) {
		et.begin();
		em.persist(users);
		et.commit();
	
}


//public Users fetch(int id) {
//	// TODO Auto-generated method stub
//	List<Users> lst=(List<Users>) em.createQuery("select x from Users where id=?1").setParameter(1, id);
//	
//	return ;
//}
public Users fetch(int id) {

	List<Users> list =  em.createQuery("select x from Users x where id=?1").setParameter(1, id)
			.getResultList();
	if (list.isEmpty()) {
		return null;
	} else {
		return list.get(0);
	}
}



public List<Users> fetch(){
	List<Users> lst=em.createQuery("select x from Users x").getResultList();
   return lst;
}


public List<Users> fetch(String name) {
	
	List<Users> list =  em.createQuery("select x from Users x where name=?1").setParameter(1,name)
			.getResultList();
	if (list.isEmpty()) {
		return null;
	} else {
		return list;
	}
	
}





   
   
}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																