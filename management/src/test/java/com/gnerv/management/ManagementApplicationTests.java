package com.gnerv.management;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.gnerv.management.platform.model.User;
import com.gnerv.management.platform.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagementApplicationTests {

    @Autowired
    UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void insertUserTest() {
        User user = new User();
        user.setUserId("10001");
        user.setAccount("admin1");
        user.setPassword("admin1");
        user.setUserName("admin1");
        user.setUserStatus("0");
        boolean b = userService.insertUser(user);
        System.out.println(b);
    }

    @Test
    public void deleteUserByUserIdTest() {
        String userId = "10001";
        boolean b = userService.deleteUserByUserId(userId);
        System.out.println(b);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setUserId("5ebb4691c43e435896da65e1e44b9f3b");
        user.setAccount("admin1");
        user.setPassword("123456");
        user.setUserName("654321");
        user.setUserStatus("1");
        boolean b = userService.updateUser(user);
        System.out.println(b);
    }

    @Test
    public void getUserByUserId() {
        String userId = "5ebb4691c43e435896da65e1e44b9f3b";
        User user = userService.getUserByUserId(userId);
        System.out.println(user);
    }

    @Test
    public void listUser() {
        User user = new User();
        //user.setAccount("a");
        user.setUserStatus("0");
        List<User> users = userService.listUser(user);
        System.out.println(users);
    }

    @Test
    public void listAllUser() {
        List<User> users = userService.listAllUser();
        System.out.println(users);
    }

    @Test
    public void checkAccount() {
	    String account = "user";
        boolean b = userService.checkAccount(account);
        System.out.println(b);
    }

    @Test
    public void generateCode() {
        String packageName = "com.gnerv.platform";
        boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
        generateByTables(serviceNameStartWithI, packageName, "platform_user_info");
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://59.110.173.46:3306/gnerv?useUnicode=true&characterEncoding=utf8";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("123456")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor("gnerv")
                .setOutputDir("d:\\codeGen")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }
}
