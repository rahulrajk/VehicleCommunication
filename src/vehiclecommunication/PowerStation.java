/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclecommunication;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author sabari
 */
class PowerStation {
    public static void main(String args[]){
    
    }
 public void powerStation(){
      JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BoxLayout Example X_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        String[] answers = {"id13223r4","12345","234567"};               
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
        panel.setBackground(Color.white);               
        JLabel notices = new JLabel("Smart Vehicle Communication");
        JLabel notices1 = new JLabel("Power Station");
        JLabel vehicleid = new JLabel("vehicleid");   
        JButton validate = new JButton("Validate");

            Connection conn = null;
                  java.sql.Statement stmt = null;
                  try {
                      conn = DriverManager.getConnection("jdbc:postgresql://ec2-23-23-241-119.compute-1.amazonaws.com:5432/d6cqs3jsm4so3m?user=pyxpphiifojawl&password=acfc1462296b8015eb6b1b3329573b0f05b058fa5d1958e4832011ad05e800bf&sslmode=require", "pyxpphiifojawl", "acfc1462296b8015eb6b1b3329573b0f05b058fa5d1958e4832011ad05e800bf");
                      stmt = conn.createStatement();
                       Class.forName("org.postgresql.Driver");
                  } catch (Exception ex) {
                      ex.printStackTrace();
                  }
                   try {                       
                       if(stmt.execute("select name from communication")){                          
                           ResultSet rs = stmt.executeQuery("select name from communication");
                           while(rs.next()){
                               String name = rs.getString("name");
                               System.out.println(name);
                               vehicleid.setText(name);
                           }
                       }
                       else{
                           System.out.println("try again");
                       }
                      notices.setText("Data inserted successfully");
                  } catch (Exception ex) {
                      ex.printStackTrace();
                  }
         panel.add(notices);
          panel.add(notices1);
          panel.add(vehicleid);
          frame.setSize(700,700);
          frame.add(panel);
          frame.pack();
          frame.setVisible(true);   
    }      
}
