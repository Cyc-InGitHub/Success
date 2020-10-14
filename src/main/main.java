/**  
* <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Cyc 
* @date 2020年10月14日  
* @version 1.0  

*/
package main;

import java.util.List;

import entity.entity;
import service.Average;
import service.Highest;
import service.RanK;
import service.Select;
import service.impl.AverageImpl;
import service.impl.HighestImpl;
import service.impl.RankImpl;
import service.impl.SelectImpl;

/**
 * <p>
 * Title: main
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author Cyc
 * @date 2020年10月14日
 */
public class main {

	public static void main(String[] args) {
		Average a = new AverageImpl();
		Highest h = new HighestImpl();
		RanK r = new RankImpl();
		Select s = new SelectImpl();
		List<entity> list = Identifying.Identifying();
		entity e =new entity();
		System.out.println(list);
		int average = a.Average(list);
		int highest = h.Highest(list);
		List<entity> rank = r.RanK(list);
		entity select = s.Select(e);

	}
}
