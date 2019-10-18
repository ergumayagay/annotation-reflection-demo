/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package main.java;

/**
 * @author emiliogumayagay
 * @version $Id: Book.java, v 0.1 2019-10-10 15:57 emiliogumayagay Exp $$
 */
@About(
        author = "Emil",
        description = "for testing purposes"
)
public class Book {

    private long id;

    private String title;

    private Book(long id, String title){
        this.id = id;
        this.title = title;
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>title</tt>.
     *
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     *
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @MethodType(type="staticFactory")
    public static Book of(long id, String title){
        return new Book(id, title);
    }
}