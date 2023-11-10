/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class StatisDTO {

    private int quantityStaff;
    private int quantityReader;
    private int quantityBook;
    private int quantityAccount;

    private int borrow_id;
    private Date date_start;
    private Date date_end;
    
    private int soLuongSachNhap;
    private String ngayNhap;

    public StatisDTO(int quantityStaff, int quantityReader, int quantityBook, int quantityAccount, int borrow_id, Date date_start, Date date_end, int soLuongSachNhap, String ngayNhap) {
        this.quantityStaff = quantityStaff;
        this.quantityReader = quantityReader;
        this.quantityBook = quantityBook;
        this.quantityAccount = quantityAccount;
        this.borrow_id = borrow_id;
        this.date_start = date_start;
        this.date_end = date_end;
        this.soLuongSachNhap = soLuongSachNhap;
        this.ngayNhap = ngayNhap;
    }

    public StatisDTO() {
    }

    public int getQuantityStaff() {
        return quantityStaff;
    }

    public void setQuantityStaff(int quantityStaff) {
        this.quantityStaff = quantityStaff;
    }

    public int getQuantityReader() {
        return quantityReader;
    }

    public void setQuantityReader(int quantityReader) {
        this.quantityReader = quantityReader;
    }

    public int getQuantityBook() {
        return quantityBook;
    }

    public void setQuantityBook(int quantityBook) {
        this.quantityBook = quantityBook;
    }

    public int getBorrow_id() {
        return borrow_id;
    }

    public void setBorrow_id(int borrow_id) {
        this.borrow_id = borrow_id;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public int getQuantityAccount() {
        return quantityAccount;
    }

    public void setQuantityAccount(int quantityAccount) {
        this.quantityAccount = quantityAccount;
    }

    public int getSoLuongSachNhap() {
        return soLuongSachNhap;
    }

    public void setSoLuongSachNhap(int soLuongSachNhap) {
        this.soLuongSachNhap = soLuongSachNhap;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}
