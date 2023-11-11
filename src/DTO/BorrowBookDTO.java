/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class BorrowBookDTO {
    private int book_id;
    private String book_name;
    private String author_name;
    private String publish_name;
    private String book_shelf;
    private int remain;
    private String image;
    public BorrowBookDTO(){
    }
    public BorrowBookDTO(int book_id, String book_name, String author_name, String publish_name, String book_shelf, int remain, String image) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author_name = author_name;
        this.publish_name = publish_name;
        this.book_shelf = book_shelf;
        this.remain = remain;
        this.image = image;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getPublish_name() {
        return publish_name;
    }

    public void setPublish_name(String publish_name) {
        this.publish_name = publish_name;
    }

    public String getBook_shelf() {
        return book_shelf;
    }

    public void setBook_shelf(String book_shelf) {
        this.book_shelf = book_shelf;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
