package com.ZeNobody.AuthSystem.configuration;

import com.ZeNobody.AuthSystem.repository.UserRepository;
import com.ZeNobody.AuthSystem.repository.impl.UserRepositoryImpl;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;
import java.util.List;

@Configuration
public class UserDBConfiguration {

    @Bean
    public Jdbi jdbi(DataSource dataSource, List<RowMapper<?>> rowMappers) {
        TransactionAwareDataSourceProxy proxy = new TransactionAwareDataSourceProxy(dataSource);
        Jdbi jdbi = Jdbi.create(proxy);
        jdbi.installPlugin(new SqlObjectPlugin());
        for (RowMapper<?> rowMapper : rowMappers) {
            jdbi.registerRowMapper(rowMapper);
        }

        return jdbi;
    }
    @Bean
    public UserRepository initUserRepositoryRepository(Jdbi jdbi){
        return jdbi.onDemand(UserRepositoryImpl.class);
    }

}