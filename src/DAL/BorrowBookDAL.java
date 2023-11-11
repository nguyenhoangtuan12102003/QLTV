/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.BookDTO;
import DTO.BorrowBookDTO;
import DTO.BorrowDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class BorrowBookDAL {

    public static ArrayList<BorrowBookDTO> getAllBook() {
        ArrayList<BorrowBookDTO> list = new ArrayList<>();
        Connection con = null;
        try {
            con = Data.getconnection();
            String sql = "select sach.MaSach,sach.TenSach,tacgia.TenTacGia,nhaxuatban.TenNXB,loai.TenLoai,sach.SoLuong,sach.HinhAnh from sach,nhaxuatban,loai,tacgia WHERE sach.MaLoai = loai.MaLoai  AND sach.MaNXB = nhaxuatban.MaNXB AND sach.MaTacGia = tacgia.MaTacGia";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                BorrowBookDTO dto = new BorrowBookDTO();
                dto.setBook_id(rs.getInt("MaSach"));
                dto.setBook_name(rs.getString("TenSach"));
                dto.setAuthor_name(rs.getString("TenTacGia"));
                dto.setPublish_name(rs.getString("TenNXB"));
                dto.setBook_shelf(rs.getString("TenLoai"));
                dto.setRemain(rs.getInt("SoLuong"));
                dto.setImage(rs.getString("HinhAnh"));
                list.add(dto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        } finally {
            Data.closeconection(con);
        }
        return list;
    }
    
}
