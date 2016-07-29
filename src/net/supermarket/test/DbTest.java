package net.supermarket.test;
import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import net.supermarket.dao.UserDAO;
import net.supermarket.model.User;
import net.supermarket.util.TextUtil;

public class DbTest {
	public static void main(String[] args) {
		
		String pass = "a:0:{}";
//		String session = "40cd750bba9870f18aada2478b24840a";
		String data = "sz231612";
		System.out.println(DigestUtils.md5Hex(pass));
		System.out.println(DigestUtils.md5Hex(DigestUtils.md5Hex(data)+"4793"));
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd"));
		
		String table = "user_id";
		System.out.println(TextUtil.firstToUpperCase(table));
		
		
		
		User pojo = new User();
		pojo.setUser_name("pluns");
		pojo.setEmail("pluns@qq.com");
		pojo.setRole_id(15);
		pojo.setLast_ip("localhost");
		pojo.setAdd_time((int) (System.currentTimeMillis()/1000));
		pojo.setAction_list("all");
		pojo.setLast_login((int) (System.currentTimeMillis()/1000));
		pojo.setPassword(DigestUtils.md5Hex("admin"));
		
		UserDAO dao = new UserDAO();
		try {
			dao.save(pojo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
