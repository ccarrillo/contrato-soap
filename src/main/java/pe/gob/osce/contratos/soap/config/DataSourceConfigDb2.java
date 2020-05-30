package pe.gob.osce.contratos.soap.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "pe.gob.osce.contratos.soap.db2.model" })
public class DataSourceConfigDb2 {

	@Bean(name = "dataSourceB")
	@ConfigurationProperties(prefix = "database2.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "entityManagerFactoryB")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("dataSourceB") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("pe.gob.osce.contratos.soap.db2.model")
				.persistenceUnit("datasourceB").build();
	}

	@Bean(name = "transactionManagerB")
	public PlatformTransactionManager transactionManager(
			@Qualifier("entityManagerFactoryB") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
