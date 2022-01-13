import com.nothinglin.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class firstSpring {

    public static void main(String[] args) {
        //加载Spring配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Spring容器中对应id下的内容
        UserDao userDao = (UserDao)app.getBean("userDao");
        //调用目标对象的方法
        userDao.save();
    }
}
