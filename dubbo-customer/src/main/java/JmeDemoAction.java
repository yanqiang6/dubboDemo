import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiang.yan
 * @version 1.0
 * @date 2020/7/15 17:00 Create
 */
public class JmeDemoAction extends AbstractJavaSamplerClient {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] { "applicationConsumer.xml" });
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult sr = new SampleResult();
        try {
            sr.sampleStart();
            context.start();
            DemoService demoService = (DemoService) context.getBean("demoService");
            String hello = demoService.sayHello(",How much is the current time?");
            sr.setResponseData("from provider:"+hello, null);
            sr.setDataType(SampleResult.TEXT);
            sr.setSuccessful(true);
            sr.sampleEnd();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sr;

    }
}
