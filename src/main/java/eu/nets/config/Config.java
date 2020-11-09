package eu.nets.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("eu.nets")
public class Config {

    @Bean
    DataSource dataSource() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("employees");
        dataSource.setServerName("mysql-employees");
        dataSource.setPort(3306);
        dataSource.setUser("root");
        dataSource.setPassword("college");
        dataSource.setServerTimezone("UTC");
        
        return dataSource;
    }

}
