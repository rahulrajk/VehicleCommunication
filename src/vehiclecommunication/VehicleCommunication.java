package vehiclecommunication;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.sql.ResultSet;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author rahulrajk
 */
public class VehicleCommunication {

    public static void main(String[] args) {
            JFrame.setDefaultLookAndFeelDecorated(true);
          JFrame frame = new JFrame("BoxLayout Example X_AXIS");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


          JPanel panel = new JPanel();


          BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);


          panel.setLayout(boxlayout);


          panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
          panel.setBackground(Color.cyan);
          JButton jb1 = new JButton("Vehicle");
          JButton jb2 = new JButton("Power Station");
          JLabel notices = new JLabel("Smart Vehicle Communication");

          jb1.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("clicked");
                    VehicleClass vc = new VehicleClass();
                    vc.vehicle();
  //                  Connection conn = null;
  //                java.sql.Statement stmt = null;
  //                try {
  //                    conn = DriverManager.getConnection("jdbc:postgresql://ec2-23-23-241-119.compute-1.amazonaws.com:5432/d6cqs3jsm4so3m?user=pyxpphiifojawl&password=acfc1462296b8015eb6b1b3329573b0f05b058fa5d1958e4832011ad05e800bf&sslmode=require", "pyxpphiifojawl", "acfc1462296b8015eb6b1b3329573b0f05b058fa5d1958e4832011ad05e800bf");
  //                    stmt = conn.createStatement();
  //                     Class.forName("org.postgresql.Driver");
  //                } catch (Exception ex) {
  //                    ex.printStackTrace();
  //                }
  //                 try {
  //                    stmt.executeUpdate("Insert into communication(name) values('saiteja')");
  //                    notices.setText("Data inserted successfully");
  //                } catch (Exception ex) {
  //                    ex.printStackTrace();
  //                }
                }
            });
          jb2.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    PowerStation ps = new PowerStation();
                    ps.powerStation();
  //                     Connection conn = null;
  //                java.sql.Statement stmt = null;
  //                try {
  //                    conn = DriverManager.getConnection("jdbc:postgresql://ec2-23-23-241-119.compute-1.amazonaws.com:5432/d6cqs3jsm4so3m?user=pyxpphiifojawl&password=acfc1462296b8015eb6b1b3329573b0f05b058fa5d1958e4832011ad05e800bf&sslmode=require", "pyxpphiifojawl", "acfc1462296b8015eb6b1b3329573b0f05b058fa5d1958e4832011ad05e800bf");
  //                    stmt = conn.createStatement();
  //                     Class.forName("org.postgresql.Driver");
  //                } catch (Exception ex) {
  //                    ex.printStackTrace();
  //                }
  //                 try {
  //                     
  //                     if(stmt.execute("select name from communication")){
  //                        
  //                         ResultSet rs = stmt.executeQuery("select name from communication");
  //                         while(rs.next()){
  //                             String name = rs.getString("name");
  //                             System.out.println(name);
  //                         }
  //                     }
  //                     else{
  //                         System.out.println("try again");
  //                     }
  //                    notices.setText("Data inserted successfully");
  //                } catch (Exception ex) {
  //                    ex.printStackTrace();
  //                }
  //                  
                }
            });

          panel.add(notices);
          panel.add(jb1);
          panel.add(jb2);
          frame.setSize(700,700);
          frame.add(panel);
          frame.pack();
          frame.setVisible(true);

    }
    
}
