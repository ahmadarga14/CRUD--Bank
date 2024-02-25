package DAO;
//NIM:2111500845
//Nama: Ahmad Aulia Dhaksina Arga
import java.util.List;
public interface DAO_Interface <A> {
    public void insert(A Object);
    public void update(A Object);
    public void delete(String nim);
    public List<A> getAll();
    public List<A> getCari(String key);
}
