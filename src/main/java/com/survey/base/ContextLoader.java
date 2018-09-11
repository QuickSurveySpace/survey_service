package com.survey.base;

import com.youguu.core.dao.DataSourceLoader;
import com.youguu.core.dao.multi.MultiDataSourceTransactionManager;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration("surveyContextLoader")
@ComponentScan({"com.survey.*"})
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ContextLoader extends DataSourceLoader {

	public DataSource getDataSource(String selector){
		return load(selector, selector);
	}
	
	@Bean
	public SqlSessionFactory surveySessionFactory() throws Exception {
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
		bean.setDataSource(getDataSource("survey"));
		DefaultResourceLoader dc=new DefaultResourceLoader();
		bean.setConfigLocation(dc.getResource("classpath:mybatis/survey-mapper-config.xml"));
		return bean.getObject();
	}

	@Bean(name="surveyTX")
	public DataSourceTransactionManager superTransactionManager() {
		DataSourceTransactionManager transactionManager = new MultiDataSourceTransactionManager();
		transactionManager.setDataSource(getDataSource("survey"));
		return transactionManager;
	}

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
