﻿import java.awt.*;
import java.awt.event.*;
public class TongHieuTichThuong extends Frame implements ActionListener{
    Label lblA=new Label("A=");
    Label lblB=new Label("b=");
    Label lblKQ=new Label("KQ");
    TextField txtA=new TextField();
    TextField txtB=new TextField();
    TextField txtKQ=new TextField();
    Button btnTong=new Button("Tong");
    Button btnHieu=new Button("Hieu");
    Button btnTich=new Button("Tich");
    Button btnThuong=new Button("Thuong");
    public TongHieuTichThuong()
    {
        this.add(lblA);
        this.add(txtA);
        this.add(lblB);
        this.add(txtB);
        this.add(btnTong);
        btnTong.addActionListener(this);
        this.add(btnHieu);
        btnHieu.addActionListener(this);
        this.add(btnTich);
        btnTich.addActionListener(this);
        this.add(btnThuong);
        btnThuong.addActionListener(this);
        this.add(lblKQ);
        this.add(txtKQ);
        txtKQ.setEditable(false);
        this.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnTong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c + ""); 
        }
         if(e.getSource()==btnHieu)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a-b;
            txtKQ.setText(c + ""); 
            

        }
          if(e.getSource()==btnTich)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a*b;
            txtKQ.setText(c + ""); 
            

        }
           if(e.getSource()==btnThuong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            float c=(float)a/b;
            txtKQ.setText(c + ""); 
            

        }
    }
    public static void main(String[] args) {
        TongHieuTichThuong thtt=new TongHieuTichThuong();
        thtt.setTitle("TongHieuTichThuong");
        thtt.setSize(300,200);
        
        thtt.setVisible(true);
    }
}