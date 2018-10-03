package com.beyondsoft.springboot;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.beyondsoft.springboot.Model.Dept;
import com.beyondsoft.springboot.Service.IDeptService;


@SpringBootTest(classes=Application.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ApplicationTests {
	@Resource
	private IDeptService deptService;
	@Test
	public void contextLoads(){
	}
    @Test
    public void testList() throws Exception {
		for(Dept dt:this.deptService.list()) {
			System.out.println(dt.toString());
		}
    }
    @Test
    public void testAdd() throws Exception {
        Dept dept = new Dept();
        dept.setDname("刘新悦");
        System.out.println(this.deptService.add(dept));
    }

}
