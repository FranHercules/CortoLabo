package interfaces;

import java.util.ArrayList;


public interface MetodosInterf <Generic>{
    public boolean create(Generic g);
    public boolean delete (Object key);
    public boolean update(Generic c);   
    public Generic read(Object key);
    public ArrayList<Generic> readAll();
}