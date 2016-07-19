/**
 * 
 */
package co.desarrollo.payu.testunitarios;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.desarrollo.payu.dao.hibernate.PaisesDao;
import co.desarrollo.payu.exception.ExceptionDao;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 18 de jul. de 2016 15:37:14
 */
public class TestPaises {
	@Autowired
	private PaisesDao paisesDao;
	/**
	 * Test method for {@link co.desarrollo.payu.dao.hibernate.PaisesDao#listarPaices()}.
	 */
	@Test
	public void testListarPaices() {
		try {
			System.out.println( "Ya inicie" );
			assertTrue(paisesDao.listarPaices());
			System.out.println( "Ya termine" );
		} catch (ExceptionDao e) {
			e.printStackTrace();
		}
	}

}
