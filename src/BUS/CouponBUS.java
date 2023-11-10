/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAL.CouponDAL;

import DTO.CouponDTO;

/**
 *
 * @author hoangtuan
 */
public class CouponBUS {

    CouponDAL couponDAL = new CouponDAL();
    private ArrayList<CouponDTO> listpm = new ArrayList<CouponDTO>();

    public ArrayList<CouponDTO> getListCoupon() {

        return listpm = couponDAL.getListCoupon();
    }

    public int addCoupon(CouponDTO pm) {
        try {
            if (pm.getCoupon_id() < 0) {
                JOptionPane.showMessageDialog(null, "Mã nhân viên sai");
                return -1;
            }
            if (pm.getSuperlier_id() < 0) {
                JOptionPane.showMessageDialog(null, "Mã nhà cung cấp sai");
                return -1;
            }
            if (pm.getDate_add() == null) {
                JOptionPane.showMessageDialog(null, "Không được để trống ngày nhập");
                return -1;
            }
            if (couponDAL.addCoupon(pm) > 0) {
                JOptionPane.showMessageDialog(null, "Thêm phiếu nhập thành công");
                return 1;
            }
            JOptionPane.showMessageDialog(null, "Thêm phiếu nhập thất bại");
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }

    public int editCoupon(CouponDTO pm) {
        if (couponDAL.editCoupon(pm) > 0) {
            JOptionPane.showMessageDialog(null, "Sửa phiếu nhập thành công");
            return 1;
        }
        JOptionPane.showMessageDialog(null, "Sửa phiếu nhập thất bại");
        return -1;
    }

    public int deleteCoupon(CouponDTO pm) {
        if (couponDAL.deleteCoupon(pm) > 0) {
            JOptionPane.showMessageDialog(null, "Xoá phiếu nhập thành công");
            return 1;
        }
        JOptionPane.showMessageDialog(null, "Xoá phiếu nhập thất bại");
        return -1;
    }

    public static CouponBUS iBus = null;

    public static CouponBUS gI() {
        if (iBus == null) {
            iBus = new CouponBUS();
        }

        return iBus;
    }

    public CouponDTO getCoupon(int id) {
        // TODO Auto-generated method stub
        return CouponDAL.getCoupon(id);
    }
}
