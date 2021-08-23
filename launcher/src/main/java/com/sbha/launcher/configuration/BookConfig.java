package com.sbha.launcher.configuration;

import com.sbha.domain.port.api.BookServicePort;
import com.sbha.domain.port.spi.BookPersistencePort;
import com.sbha.domain.service.BookServiceImpl;
import com.sbha.infrastructure.adapter.BookJpaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig
{
    @Bean
    public BookPersistencePort bookPersistence()
    {
        return new BookJpaAdapter();
    }

    @Bean
    public BookServicePort bookService()
    {
        return new BookServiceImpl(bookPersistence());
    }
}