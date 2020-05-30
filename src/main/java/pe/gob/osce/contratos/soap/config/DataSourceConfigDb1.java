package pe.gob.osce.contratos.soap.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "pe.gob.osce.contratos.soap.db1.model" })
public class DataSourceConfigDb1 {

	@Primary
	@Bean(name = "dataSourceA")
	@ConfigurationProperties(prefix = "database1.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "entityManagerFactoryA")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("dataSourceA") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("pe.gob.osce.contratos.soap.db1.model")
				.persistenceUnit("datasourceA").build();
	}

	@Primary
	@Bean(name = "transactionManagerA")
	public PlatformTransactionManager transactionManager(
			@Qualifier("entityManagerFactoryA") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
