/**
 * 
 */
package co.desarrollo.payu.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import co.desarrollo.payu.dao.PaisesDAO;
import co.desarrollo.payu.dto.PayuPaisesClassDaoDto;
import co.desarrollo.payu.exception.ExceptionDao;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0 18 de jul. de 2016 15:20:00
 */
public class PaisesDao extends org.springframework.orm.hibernate3.support.HibernateDaoSupport implements PaisesDAO {

	
	public PaisesDao(){
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public boolean listarPaices() throws ExceptionDao {
		Session session = null;
		List<PayuPaisesClassDaoDto> payu = null;
		
		
		session = getSession();
		Criteria criteria = (Criteria) session.createSQLQuery("Select * from weepa.payu_bancos").addEntity(PayuPaisesClassDaoDto.class);
		payu = criteria.list();
		
		session.close();
		
		boolean t = false;
		if(payu.isEmpty()){
			t = false;
		} else {
			t = true;
		}
		// List<PayuPaisesClassDaoDto> lista = new
		// ArrayList<PayuPaisesClassDaoDto>();
		// Session session = null;
		// try {
		// session = getSessionFactory().openSession();
		//
		// Criteria criteria =
		// session.createCriteria(PayuPaisesClassDaoDto.class).add(Restrictions.like("strNombrePais",
		// "Colombia"));
		// lista = criteria.list();
		// if (lista.isEmpty()) {
		// t = false;
		// } else {
		// t = true;
		// }
		// for (PayuPaisesClassDaoDto payuPaisesClassDaoDto : lista) {
		// System.out.println("Id del Pais: " +
		// payuPaisesClassDaoDto.getIntIdPais() + " Pais: " +
		// payuPaisesClassDaoDto.getStrNombrePais());
		// }
		//
		// } catch (RuntimeException e) {
		// e.printStackTrace();
		// } finally {
		// session.close();
		// }
		return t;
	}
}
