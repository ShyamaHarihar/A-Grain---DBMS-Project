package dbconn;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class input extends JFrame {

	private JPanel contentPane;
	private JTextField id_tf;
	private JTextField phno;
	private JTextField uno;
	private JTextField crops;
	private JTextField fertilizer;
	private JTextField irrigation;
	private JTextField soil;
	private JTextField pro;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					input frame = new input();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public input() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton JButton = new JButton("SUBMIT");
		JButton.setToolTipText("Click here to insert record");
		JButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(id_tf.getText());
				int phone_no=Integer.parseInt(phno.getText());
				int unique_no=Integer.parseInt(uno.getText());
				String c=crops.getText();
				String f=fertilizer.getText();
				String i=irrigation.getText();
				String s=soil.getText();
				String p=pro.getText();
				String url = "jdbc:mysql://localhost:3306/mysql?allowPublicKeyRetrieval=true&useSSL=false";
			    String username = "shyama";
			    String passwd = "root";
			    Connection connect = null;
			    Statement st = null;
			    try 
			{
			connect = DriverManager.getConnection(url, username, passwd);
			st=connect.createStatement();
			String query1="insert into r2 values("+id+","+phone_no+");";
			String query2="insert into r3 values("+unique_no+",'"+c+"');";
			String query3="insert into r4 values("+unique_no+",'"+f+"');";
			String query4="insert into r5 values("+unique_no+",'"+i+"');";
			String query5="insert into r6 values("+unique_no+",'"+s+"');";
			String query6="insert into r7 values("+unique_no+",'"+p+"');";
			String query7="insert into farmer_profile values("+"'"+c+"',"+"'"+f+"',"+"'"+i+"',"+"'"+s+"');";
			JOptionPane.showMessageDialog(null,"Row Inserted");
			st.executeUpdate(query1);
			st.executeUpdate(query2);
			st.executeUpdate(query3);
			st.executeUpdate(query4);
			st.executeUpdate(query5);
			st.executeUpdate(query6);
			st.executeUpdate(query7);
			}
			    catch(SQLException e1) 
				{
				e1.printStackTrace();
				}finally
				{
				      try {
				        if (st != null) {
				          st.close();
				        }
				        if (connect!= null) {
				          connect.close();
				        }
				      } catch (Exception e2) {
				        e2.printStackTrace();
				      }
				}}});
		
		id_tf = new JTextField();
		id_tf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter id");
		
		JLabel lblNewLabel_1 = new JLabel("Enter phone_no");
		
		phno = new JTextField();
		phno.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter unique no:");
		
		uno = new JTextField();
		uno.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("crops harvested");
		
		crops = new JTextField();
		crops.setColumns(10);
		
		fertilizer = new JTextField();
		fertilizer.setColumns(10);
		
		irrigation = new JTextField();
		irrigation.setColumns(10);
		
		soil = new JTextField();
		soil.setColumns(10);
		
		pro = new JTextField();
		pro.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("fertilizer:");
		
		JLabel lblNewLabel_5 = new JLabel("irrigation method:");
		
		JLabel lblNewLabel_6 = new JLabel("Soil type:");
		
		JLabel lblNewLabel_7 = new JLabel("products purchased:");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(373, Short.MAX_VALUE)
					.addComponent(JButton, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addGap(254))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(94)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(id_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(phno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(uno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(155)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(crops, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(irrigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_5))
									.addPreferredGap(ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_6)
											.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addComponent(soil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(80))))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(fertilizer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4))
									.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_7)
										.addComponent(pro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(71))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1))
							.addContainerGap(600, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_6))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(id_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(crops, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(soil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(30))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_7)
							.addGap(18)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(phno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(fertilizer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(34))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addGap(18)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(uno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(irrigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(JButton)
					.addGap(42))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
