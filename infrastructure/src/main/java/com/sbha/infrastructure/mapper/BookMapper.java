package com.sbha.infrastructure.mapper;

import com.sbha.domain.data.BookDto;
import com.sbha.infrastructure.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper
{
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto bookToBookDto(Book book);
    Book bookDtoToBook(BookDto bookDto);
    List<BookDto> bookListToBookDtoList(List<Book> bookList);
    List<Book> BookDtoListTobookList(List<BookDto> BookDtoList);
}