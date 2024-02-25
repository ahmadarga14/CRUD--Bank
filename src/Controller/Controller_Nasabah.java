package Controller;
//NIM:2111500845
//Nama: Ahmad Aulia Dhaksina Arga
import DAO.DAO_Interface;
import DAO.DAO_Nasabah;
import Model.varNasabah;
import View.FrmNasabah;
import java.util.List;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controller_Nasabah {
    FrmNasabah form;
    DAO_Interface<varNasabah> model;
    List<varNasabah> list;
    String[] header; 
    
    public Controller_Nasabah(FrmNasabah form){
        this.form = form;
        model = new DAO_Nasabah();
        list = model.getAll();
        header = new String[]{"No_Rekening", "Nama_Nasabah_nasabah","Jenis_Rekening","Saldo"};
        form.getTblNasabah().setShowGrid(true);
        form.getTblNasabah().setShowVerticalLines(true);
        form.getTblNasabah().setGridColor(Color.blue);
    }
    
    public void isicomboJenisRekening() {
        form.getCbojenisrekening().removeAllItems();
        form.getCbojenisrekening().addItem("Tabungan");
        form.getCbojenisrekening().addItem("Giro");
        form.getCbojenisrekening().addItem("Deposito");
        
        
    }
    
    public void reset(){
        form.getTxtNo_Rekening().setText("");
        form.getTxtNama_Nasabah().setText("");
        form.getCbojenisrekening().setSelectedItem("Pilih");
        isicomboJenisRekening();
        form.getTxtSaldo().setText("");
        form.getTxtNo_Rekening().requestFocus();
        isiTabel();
    }
    
    public void isiTabel(){
        list = model.getAll();
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header) {
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }            
        };
        Object[] data = new Object[header.length];
        for(varNasabah objNasabah : list){
            data[0] = objNasabah.getvNo_Rekening();
            data[1] = objNasabah.getvNama_Nasabah();
            data[2] = objNasabah.getvJenis_Rekening();
            data[3] = objNasabah.getvSaldo();

            tblModel.addRow(data);
        }
        form.getTblNasabah().setModel(tblModel);
    }
    
    public void isiField(int row){
        form.getTxtNo_Rekening().setText(list.get(row).getvNo_Rekening());
        form.getTxtNama_Nasabah().setText(list.get(row).getvNama_Nasabah());
        form.getTxtSaldo().setText(list.get(row).getvSaldo());
    
    }
    
    public void insert(){
        varNasabah objNasabah = new varNasabah();
        
        objNasabah.setvNo_Rekening(form.getTxtNo_Rekening().getText());
        objNasabah.setvNama_Nasabah(form.getTxtNama_Nasabah().getText());
        objNasabah.setvJenis_Rekening(""+form.getCbojenisrekening().getSelectedItem());;
        objNasabah.setvSaldo(form.getTxtSaldo().getText());

        
        model.insert(objNasabah);
    }

    public void update(){
        varNasabah objNasabah = new varNasabah();
        
        objNasabah.setvNo_Rekening(form.getTxtNo_Rekening().getText());
        objNasabah.setvNama_Nasabah(form.getTxtNama_Nasabah().getText());
        objNasabah.setvJenis_Rekening(""+form.getCbojenisrekening().getSelectedItem());
        objNasabah.setvSaldo(form.getTxtSaldo().getText());

        
        model.update(objNasabah);
    }

    public void delete(){
        
        
        if(!form.getTxtNo_Rekening().getText().trim().isEmpty()){
            String No_Rekening = (""+form.getTxtNo_Rekening().getText());
            
            model.delete(No_Rekening);
        }
        else{
            JOptionPane.showMessageDialog(form, "Pilih data yang akan di hapus");
        }
    }

    public void isiTabelCari(){
        list = model.getCari(form.getTxtNo_Rekening().getText().trim());
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header);
        Object[] data = new Object[header.length];
        for(varNasabah objNasabah : list){
            data[0] = objNasabah.getvNo_Rekening();
            data[1] = objNasabah.getvNama_Nasabah();
            data[2] = objNasabah.getvJenis_Rekening();
            data[3] = objNasabah.getvSaldo();
            tblModel.addRow(data);
        }
        form.getTblNasabah().setModel(tblModel);
    }

}

