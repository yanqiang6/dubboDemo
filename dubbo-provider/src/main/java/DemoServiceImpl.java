/**
 * @author qiang.yan
 * @version 1.0
 * @date 2020/7/15 13:13 Create
 */
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        System.out.println("from client ：" + name);
        return "Hello " + name;
    }
}
