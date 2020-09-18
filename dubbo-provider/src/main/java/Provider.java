import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiang.yan
 * @version 1.0
 * @date 2020/7/15 13:36 Create
 */
public class Provider {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.out.println(" app run ");
        System.in.read(); // 按任意键退出
    }
}
