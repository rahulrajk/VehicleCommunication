package vehiclecommunication;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author rahulrajk
 */
public class VehicleClass {
    public static void main(String args[]){
    
    }
    
    public void vehicle(){
        
         JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Vehicle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();

        
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

            
        panel.setLayout(boxlayout);

        
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
        panel.setBackground(Color.white);       
        JLabel notices = new JLabel("Smart Vehicle Communication");
        JLabel notices1 = new JLabel("ID34567890");
        JButton jb1 = new JButton("Request");
        jb1.addActionListener(new java.awt.event.ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                 
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
                     String idstring = notices1.getText().toString();
                     System.out.println(idstring);
                    stmt.executeUpdate("Insert into communication(name) values('ID34567869')");
                    notices.setText("Request Pending");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
              }
          });
        
        panel.add(notices);
        panel.add(notices1);
        panel.add(jb1);       
        frame.setSize(700,700);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
}
