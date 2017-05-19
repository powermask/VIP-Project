package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.sql.DataSource;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class mainFrame extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public mainFrame(DataSource datasource) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewVipList = new JButton("View all the VIP");
		btnViewVipList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					VipListFrame frame = vipListDisplay();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnViewVipList.setBounds(123, 103, 138, 65);
		contentPane.add(btnViewVipList);
		
		JButton btnViewEventList = new JButton("View all the events");
		btnViewEventList.setBounds(287, 103, 138, 65);
		contentPane.add(btnViewEventList);
		
		JButton btnNewVip = new JButton("New VIP");
		btnNewVip.setBounds(67, 286, 97, 25);
		contentPane.add(btnNewVip);
		
		JButton btnNewEvent = new JButton("New Event");
		btnNewEvent.setBounds(220, 286, 97, 25);
		contentPane.add(btnNewEvent);
		
		JButton btnNewPhoto = new JButton("New Photo");
		btnNewPhoto.setBounds(367, 286, 97, 25);
		contentPane.add(btnNewPhoto);
		
		JLabel lblVipWorld = new JLabel("VIP WORLD");
		lblVipWorld.setFont(new Font("Tahoma", Font.BOLD, 41));
		lblVipWorld.setBounds(143, 11, 251, 65);
		contentPane.add(lblVipWorld);
	}
	
	private VipListFrame vipListDisplay() throws SQLException{
		return new VipListFrame(this);
	}
}
