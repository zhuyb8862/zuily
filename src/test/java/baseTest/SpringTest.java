package baseTest;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuily.item.bean.Items;
import com.zuily.item.bean.ItemsExample;
import com.zuily.item.bean.ItemsExample.Criteria;
import com.zuily.item.dao.ItemsMapper;

public class SpringTest {
	private ApplicationContext applicationContext = null;
	@Before
	public void before() {
		 applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void test() {
		ItemsMapper itemsMapper =  (ItemsMapper)applicationContext.getBean("itemsMapper");
		ItemsExample example = new ItemsExample();
		Criteria andDestinationIsNotNull = example.createCriteria().andIidIsNotNull();
		example.or(andDestinationIsNotNull);
		List<Items> selectByExample = itemsMapper.selectByExample(example);
		for (int i = 0 ,j = selectByExample.size(); i<j;i++) {
			Items items = selectByExample.get(i);
			System.out.println(items.toString());
			
		}
		Items item = itemsMapper.selectByPrimaryKey(10);
		System.out.println(item.toString());
		
	}

  	public void after() {

	}

}
