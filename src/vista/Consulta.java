/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Consulta extends JFrame{
    public JLabel lblNombre, lblDirector, lblMarca, lblStock, lblExistencia;
    
    public JTextField nombre, director, descripcion, stock;
    public JComboBox marca;
    
    ButtonGroup existencia = new ButtonGroup();
    public JRadioButton no;
    public JRadioButton si;
    public JTable resultados;
    
    public JPanel table;
    
    public JButton actualizar, insertar, limpiar, eliminar;
    
    private static final int ANCHOC = 130, ALTOC = 30;
    
    DefaultTableModel tm;
    
    public Consulta(){
        super("Cinepolix");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        Container container = getContentPane();
        container.add(lblNombre);
        container.add(lblMarca);
        container.add(lblExistencia);
        container.add(nombre);
        container.add(director);
        container.add(marca);
        container.add(stock);
        container.add(si);
        container.add(no);
        container.add(insertar);
        container.add(actualizar);
        container.add(eliminar);
        container.add(limpiar);
        container.add(table);
        setSize(800,500);
        eventos();
    }
    
    public final void agregarLabels(){
        lblNombre = new JLabel("Nombre");
        lblMarca= new JLabel("Director");
        lblStock = new JLabel("Stock");
        lblExistencia = new JLabel("Stock en tienda");
        lblNombre.setBounds(10, 10, ANCHOC, ALTOC);
        lblMarca.setBounds(10,60,ANCHOC,ALTOC);
        lblStock.setBounds(10,100,ANCHOC,ALTOC);
        lblExistencia.setBounds(10,140,ANCHOC,ALTOC);
        
    }
    
    public final void formulario(){
        nombre = new JTextField();
        director = new JTextField();
        marca = new JComboBox();
        stock = new JTextField();
        si = new JRadioButton("si",true);
        no = new JRadioButton("no");
        resultados = new JTable();
        insertar = new JButton("Insertar");
        actualizar = new JButton("Actualizar");
        eliminar = new JButton("Eliminar");
        limpiar = new JButton("Buscar");
        
        table = new JPanel();
        //agregar elementos al combox marca
        marca.addItem("Sin seleccion");
        marca.addItem("G");
        marca.addItem("PG");
        marca.addItem("14A");
        marca.addItem("18A");
        marca.addItem("R");
        marca.addItem("A");
        //agregando los radio a un grupo
        existencia = new ButtonGroup();
        existencia.add(si);
        existencia.add(no);
        
        nombre.setBounds(140, 10, ANCHOC, ALTOC);
        director.setBounds(140, 60, ANCHOC, ALTOC);
        marca.setBounds(300, 10, ANCHOC, ALTOC);
        si.setBounds(140,140,50,ALTOC);
        no.setBounds(210,140,50,ALTOC);
        
        
        insertar.setBounds(10, 210, ANCHOC,ALTOC);
        actualizar.setBounds(300, 210, ANCHOC,ALTOC);
        eliminar.setBounds(150, 210, ANCHOC,ALTOC);
        limpiar.setBounds(450, 210, ANCHOC,ALTOC);
        resultados=new JTable();
        table.setBounds(10, 250, 500,200);
        table.add(new JScrollPane(resultados));
        
    }
    
    
    public void eventos(){
        insertar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
   
        });
        
        actualizar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
        
    eliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
     
    });
    
    limpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

    });
    }
    public void limpiarCampos(){
        nombre.setText("");
        marca.setSelectedItem("FRAM");
        stock.setText("");
    }
    
}
