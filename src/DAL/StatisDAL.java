/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.StatisDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class StatisDAL {

    public static int getQuantityStaff() {
        Connection conn = Data.getconnection();
        String sql = "select count(*) from nhanvien where trangthai=1";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            return -1;
        }
        return 0;
    }

    public static int getQuantityBook() {
        Connection conn = Data.getconnection();
        String sql = "select count(*) from sach where trangthai=1";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            return -1;
        }
        return 0;
    }

    public static int getQuantityReader() {
        Connection conn = Data.getconnection();
        String sql = "select count(*) from docgia where trangthai=1";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            return -1;
        }
        return 0;
    }

    public static int getQuantityAcount() {
        Connection conn = Data.getconnection();
        String sql = "select count(*) from taikhoan";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            return -1;
        }
        return 0;
    }

    public static ArrayList<StatisDTO> thongKeNhap() {
        Connection conn = Data.getconnection();
        String sql = "SELECT NgayNhap,COUNT(*) AS so_luong  FROM phieunhap GROUP BY NgayNhap";
        try {
            ArrayList<StatisDTO> list = new ArrayList<>();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                StatisDTO statis = new StatisDTO();
                statis.setNgayNhap(rs.getString("NgayNhap"));
                statis.setSoLuongSachNhap(rs.getInt("so_luong"));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
}
