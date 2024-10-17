package ru.mediasoft.demostarterexceptionhandler.exception;

public class ProductArticleAlreadyExistsException extends RuntimeException{
    public ProductArticleAlreadyExistsException(Long article){
        super(String.format("Product with article [%s] already exist", article));
    }
}
