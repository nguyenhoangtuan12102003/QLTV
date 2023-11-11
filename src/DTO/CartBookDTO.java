/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class CartBookDTO {
    private int book_id;
    private int reader_id;
    private String book_shelf;
    private String date_start;
    private String date_end;
    private int quantity;

    public CartBookDTO(int book_id, int reader_id, String book_shelf, String date_start, String date_end, int quantity) {
        this.book_id = book_id;
        this.reader_id = reader_id;
        this.book_shelf = book_shelf;
        this.date_start = date_start;
        this.date_end = date_end;
        this.quantity = quantity;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getReader_id() {
        return reader_id;
    }

    public void setReader_id(int reader_id) {
        this.reader_id = reader_id;
    }

    public String getBook_shelf() {
        return book_shelf;
    }

    public void setBook_shelf(String book_shelf) {
        this.book_shelf = book_shelf;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
