package com.maguasoft.springboot;

import com.maguasoft.magua.orm.SupportDao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

public class MaguaAutoConfigurationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(MaguaAutoConfiguration.class));

    @Test
    public void testMaguaAutoConfiguration() {
        this.contextRunner.run(context -> {
            String[] autoConfiguration = context.getBeanNamesForType(SupportDao.class);
            Assert.assertTrue(autoConfiguration.length > 0);

            SupportDao supportDao = context.getBean(SupportDao.class);
            Assert.assertNotNull(supportDao);

            // List<Employee> employee = supportDao.executeSql("select * from employee limit 1");
            // System.out.println(employee);
        });
    }
}
