package DAO;
//NIM:2111500845
//Nama: Ahmad Aulia Dhaksina Arga
import Koneksi.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Model.varNasabah;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO_Nasabah implements DAO_Interface<varNasabah>{
    Connection connection;
    public DAO_Nasabah(){
        connection = Database.KoneksiDB();
    }
    
    String INSERT = "INSERT INTO Nasabah(No_Rekening, Nama_Nasabah,Jenis_Rekening,Saldo) VALUES(?,?,?,?)";
    String UPDATE = "UPDATE Nasabah set Nama_Nasabah=?, Jenis_Rekening=?,Saldo=? WHERE No_Rekening=?";
    String DELETE = "DELETE FROM Nasabah WHERE No_Rekening=?";
    String SELECT = "SELECT * FROM Nasabah";
    String CARI = "SELECT * FROM Nasabah WHERE No_Rekening=?";
    
    @Override
    public void insert(varNasabah object) {
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(CARI);
            st.setString(1, object.getvNo_Rekening());
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                System.out.println("Data sudah pernah di simpan");
            }
            else{
                st = null;
                st = connection.prepareStatement(INSERT);
                st.setString(1, object.getvNo_Rekening());
                st.setString(2, object.getvNama_Nasabah());
                st.setString(3, object.getvJenis_Rekening());
                st.setString(4, object.getvSaldo());
                st.executeUpdate();
                System.out.println("Data Berhasil di simpan");
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
public void update(varNasabah object) {
    PreparedStatement st = null;
    try{
        st = connection.prepareStatement(UPDATE);
        st.setString(1, object.getvNama_Nasabah());
        st.setString(2, object.getvJenis_Rekening());
        st.setString(3, object.getvSaldo());
        st.setString(4, object.getvNo_Rekening()); // Menetapkan No_Rekening
        st.executeUpdate();
        System.out.println("Data Berhasil di ubah");
        st.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}

    @Override
    public void delete(String No_Rekening) {
        PreparedStatement st = null;
        try{
            st = null;
            st = connection.prepareStatement(DELETE);
            st.setString(1, No_Rekening);
            st.executeUpdate();
            System.out.println("Data Berhasil di hapus");
            st.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<varNasabah> getAll() {
        List<varNasabah> list = null;
        PreparedStatement st = null;
        try{
            st = null;
            list = new ArrayList<varNasabah>();
            st = connection.prepareStatement(SELECT);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                varNasabah objMhs = new varNasabah();
                objMhs.setvNo_Rekening(rs.getString("No_Rekening"));
                objMhs.setvNama_Nasabah(rs.getString("Nama_Nasabah"));
                objMhs.setvJenis_Rekening(rs.getString("Jenis_Rekening"));
                objMhs.setvSaldo(rs.getString("Saldo"));
                list.add(objMhs);
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<varNasabah> getCari(String key) {
        List<varNasabah> list = null;
        PreparedStatement st = null;
        try{
            st = null;
            list = new ArrayList<varNasabah>();
            st = connection.prepareStatement(CARI);
            st.setString(1, key);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                varNasabah objMhs = new varNasabah();
                objMhs.setvNo_Rekening(rs.getString("No_Rekening"));
                objMhs.setvNama_Nasabah(rs.getString("Nama_Nasabah"));
                objMhs.setvJenis_Rekening(rs.getString("Jenis_Rekening"));
                objMhs.setvSaldo(rs.getString("Saldo"));
                list.add(objMhs);
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }     
}