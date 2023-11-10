/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import java.util.ArrayList;
import DAL.AccountDAL;
import DAL.Data;
import DTO.AccountDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author hoangtuan
 */
public class AccountBUS {
    
    private AccountDAL TAIKHOAN = new AccountDAL();
    private ArrayList<AccountDTO> listTAIKHOAN = new ArrayList<AccountDTO>();
    
    public void showmess(String s) {
        JOptionPane.showMessageDialog(null, s);
    }
    
    public ArrayList<AccountDTO> getDanhSachTL() {
        
        return TAIKHOAN.getdanhsachTK();
    }
    
}
