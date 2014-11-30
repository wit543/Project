import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;


public class RegistMember extends JFrame implements Runnable {

	private JPanel contentPane;
	private JTextField Name_1;
	private JTextField LastName_1;
	private JTextField Age_1;
	private JTextField NationID_1;
	private JTextField Email_1;
	private JTextField Phonenum_1;
	private JTextField Country_1;
	private JTextField Province_1;
	private JTextField District_1;
	private JTextField Postal_1;
	private JTextField Name_2;
	private JTextField LastName_2;
	private JTextField Age_2;
	private JTextField NationID_2;
	private JTextField Email_2;
	private JTextField Phonenum_2;
	private JTextField Country_2;
	private JTextField Province_2;
	private JTextField District_2;
	private JTextField Postal_2;
	private JTextField Name_3;
	private JTextField LastName_3;
	private JTextField Age_3;
	private JTextField NationID_3;
	private JTextField Email_3;
	private JTextField Phonenum_3;
	private JTextField Country_3;
	private JTextField Province_3;
	private JTextField District_3;
	private JTextField Postal_3;
	private JTextField StudentID;
	private JTextField School;
	private JTextField Year;
	private int memberclass;
	private static int ID=1000;
	private String gender_1,gender_2,gender_3;
	public static ArrayList<Member> memberList;
	private int confirm;
	private File regularfile,studentfile,elderlyfile,memberfile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		RegistMember main = new RegistMember();
		main.run();
	}
	
	public void run(){
		super.setVisible(true);
	}
	

	/**
	 * Create the frame.
	 */
	public RegistMember() {
		memberList = new ArrayList<Member>();
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistMember.class.getResource("/images/register.png")));
		setTitle("Register");
		setBounds(180, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//check text file
		ID=1000;
		readText();

		ArrayList<Integer> day = new ArrayList<Integer>();
		for(int i=1;i<=31;i++){
			day.add(i);
		}

		ArrayList<Integer> month = new ArrayList<Integer>();
		for(int i=1;i<=12;i++){
			month.add(i);
		}

		ArrayList<Integer> year = new ArrayList<Integer>();
		for(int i=1996;i>=1956;i--){
			year.add(i);
		}

		ArrayList<Integer> yearst = new ArrayList<Integer>();
		for(int i=2008;i>=1992;i--){
			yearst.add(i);
		}

		ArrayList<Integer> yearold = new ArrayList<Integer>();
		for(int i=1955;i>=1920;i--){
			yearold.add(i);
		}

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(UIManager.getColor("ScrollBar.trackHighlight"));
		tabbedPane.setBackground(Color.CYAN);
		tabbedPane.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		tabbedPane.setBounds(2, 11, 782, 550);
		contentPane.add(tabbedPane);

		//Regular Member Tab
		JPanel regularpanel = new JPanel();
		regularpanel.setBackground(new Color(153, 204, 204));
		tabbedPane.addTab("Regular Member", null, regularpanel, null);
		regularpanel.setLayout(null);


		JLabel lblDayOfBirth = new JLabel("Birthday :");
		lblDayOfBirth.setBounds(44, 112, 58, 14);
		regularpanel.add(lblDayOfBirth);

		JLabel lblPhoneNumber = new JLabel("Phone number :");
		lblPhoneNumber.setBounds(44, 299, 110, 14);
		regularpanel.add(lblPhoneNumber);

		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(44, 41, 49, 35);
		regularpanel.add(lblName);

		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(44, 239, 58, 21);
		regularpanel.add(lblEmail);

		JLabel lblLastname = new JLabel("Lastname :");
		lblLastname.setBounds(274, 46, 66, 24);
		regularpanel.add(lblLastname);

		JLabel lblIdCard = new JLabel("Nation ID Card :");
		lblIdCard.setBounds(44, 175, 110, 14);
		regularpanel.add(lblIdCard);

		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(440, 112, 58, 14);
		regularpanel.add(lblGender);

		JLabel lblAge = new JLabel("Age :");
		lblAge.setBounds(309, 112, 31, 14);
		regularpanel.add(lblAge);

		JLabel lblProvince = new JLabel("Province :");
		lblProvince.setBounds(210, 352, 75, 27);
		regularpanel.add(lblProvince);

		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(44, 358, 58, 14);
		regularpanel.add(lblCountry);

		JLabel lblDistrict = new JLabel("District :");
		lblDistrict.setBounds(376, 355, 58, 21);
		regularpanel.add(lblDistrict);

		JLabel lblZipCode = new JLabel("ZIP code :");
		lblZipCode.setBounds(527, 355, 76, 21);
		regularpanel.add(lblZipCode);

		Name_1 = new JTextField();
		Name_1.setBounds(92, 48, 144, 20);
		regularpanel.add(Name_1);
		Name_1.setColumns(10);

		LastName_1 = new JTextField();
		LastName_1.setBounds(350, 48, 148, 20);
		regularpanel.add(LastName_1);
		LastName_1.setColumns(10);

		Age_1 = new JTextField();
		Age_1.setBounds(354, 109, 42, 20);
		regularpanel.add(Age_1);
		Age_1.setColumns(10);
		Age_1.setEditable(false);

		JRadioButton chckbxM_1 = new JRadioButton("Male");
		chckbxM_1.setBackground(new Color(153, 204, 204));
		chckbxM_1.setBounds(512, 108, 57, 23);
		regularpanel.add(chckbxM_1);

		JRadioButton chckbxF_1 = new JRadioButton("Female");
		chckbxF_1.setBackground(new Color(153, 204, 204));
		chckbxF_1.setBounds(571, 108, 66, 23);
		regularpanel.add(chckbxF_1);

		chckbxM_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxM_1.setSelected(true);
				chckbxF_1.setSelected(false);
				gender_1 = "Male";
			}
		});

		chckbxF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxM_1.setSelected(false);
				chckbxF_1.setSelected(true);
				gender_1 = "Female";
			}
		});

		NationID_1 = new JTextField();
		NationID_1.setBounds(142, 172, 195, 20);
		regularpanel.add(NationID_1);
		NationID_1.setColumns(10);

		Email_1 = new JTextField();
		Email_1.setBounds(92, 239, 144, 20);
		regularpanel.add(Email_1);
		Email_1.setColumns(10);

		Phonenum_1 = new JTextField();
		Phonenum_1.setBounds(142, 296, 129, 20);
		regularpanel.add(Phonenum_1);
		Phonenum_1.setColumns(10);

		Country_1 = new JTextField();
		Country_1.setBounds(100, 355, 94, 20);
		regularpanel.add(Country_1);
		Country_1.setColumns(10);

		Province_1 = new JTextField();
		Province_1.setBounds(271, 355, 94, 20);
		regularpanel.add(Province_1);
		Province_1.setColumns(10);

		District_1 = new JTextField();
		District_1.setBounds(432, 355, 86, 20);
		regularpanel.add(District_1);
		District_1.setColumns(10);

		Postal_1 = new JTextField();
		Postal_1.setBounds(588, 355, 86, 20);
		regularpanel.add(Postal_1);
		Postal_1.setColumns(10);

		JComboBox comboBox_1 = new JComboBox(day.toArray());
		comboBox_1.setBounds(112, 109, 42, 20);
		regularpanel.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox(month.toArray());
		comboBox_2.setBounds(158, 109, 42, 20);
		regularpanel.add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox(year.toArray());
		comboBox_3.setBounds(204, 109, 60, 20);
		regularpanel.add(comboBox_3);
		JButton btnSave_1 = new JButton("SAVE");
		btnSave_1.setBounds(205, 464, 106, 36);
		regularpanel.add(btnSave_1);

		JButton btnCancel_1 = new JButton("CANCEL");
		btnCancel_1.setBounds(412, 464, 106, 36);
		regularpanel.add(btnCancel_1);

		
		//Student Member Tab
		JPanel studentpanel = new JPanel();
		studentpanel.setBackground(new Color(204, 255, 255));
		tabbedPane.addTab("Student Member", null, studentpanel, null);
		studentpanel.setLayout(null);

		JLabel label = new JLabel("Birthday :");
		label.setBounds(44, 112, 58, 14);
		studentpanel.add(label);

		JLabel label_1 = new JLabel("Phone number :");
		label_1.setBounds(44, 299, 110, 14);
		studentpanel.add(label_1);

		JLabel label_2 = new JLabel("Name :");
		label_2.setBounds(44, 41, 49, 35);
		studentpanel.add(label_2);

		JLabel label_3 = new JLabel("Email :");
		label_3.setBounds(44, 239, 58, 21);
		studentpanel.add(label_3);

		JLabel label_5 = new JLabel("Lastname :");
		label_5.setBounds(274, 46, 66, 24);
		studentpanel.add(label_5);

		JLabel label_6 = new JLabel("Nation ID Card :");
		label_6.setBounds(44, 175, 110, 14);
		studentpanel.add(label_6);

		JLabel label_7 = new JLabel("Gender :");
		label_7.setBounds(440, 112, 58, 14);
		studentpanel.add(label_7);

		JLabel label_8 = new JLabel("Age :");
		label_8.setBounds(309, 112, 31, 14);
		studentpanel.add(label_8);


		JLabel label_9 = new JLabel("Province :");
		label_9.setBounds(210, 352, 75, 27);
		studentpanel.add(label_9);

		JLabel label_10 = new JLabel("Country :");
		label_10.setBounds(44, 358, 58, 14);
		studentpanel.add(label_10);

		JLabel label_11 = new JLabel("District :");
		label_11.setBounds(376, 355, 58, 21);
		studentpanel.add(label_11);

		JLabel label_12 = new JLabel("ZIP code :");
		label_12.setBounds(527, 355, 76, 21);
		studentpanel.add(label_12);

		Name_2 = new JTextField();
		Name_2.setColumns(10);
		Name_2.setBounds(92, 48, 144, 20);
		studentpanel.add(Name_2);

		LastName_2 = new JTextField();
		LastName_2.setColumns(10);
		LastName_2.setBounds(350, 48, 148, 20);
		studentpanel.add(LastName_2);

		Age_2 = new JTextField();
		Age_2.setColumns(10);
		Age_2.setBounds(354, 109, 42, 20);
		studentpanel.add(Age_2);
		Age_2.setEditable(false);

		JRadioButton chckbxM_2 = new JRadioButton("Male");
		chckbxM_2.setBackground(new Color(204, 255, 255));
		chckbxM_2.setBounds(512, 108, 57, 23);
		studentpanel.add(chckbxM_2);

		JRadioButton chckbxF_2 = new JRadioButton("Female");
		chckbxF_2.setBackground(new Color(204, 255, 255));
		chckbxF_2.setBounds(571, 108, 66, 23);
		studentpanel.add(chckbxF_2);

		chckbxM_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxM_2.setSelected(true);
				chckbxF_2.setSelected(false);
				gender_2 = "Male";
			}
		});

		chckbxF_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxM_2.setSelected(false);
				chckbxF_2.setSelected(true);
				gender_2 = "Female";
			}
		});

		NationID_2 = new JTextField();
		NationID_2.setColumns(10);
		NationID_2.setBounds(142, 172, 195, 20);
		studentpanel.add(NationID_2);

		Email_2 = new JTextField();
		Email_2.setColumns(10);
		Email_2.setBounds(92, 239, 144, 20);
		studentpanel.add(Email_2);

		Phonenum_2 = new JTextField();
		Phonenum_2.setColumns(10);
		Phonenum_2.setBounds(142, 296, 129, 20);
		studentpanel.add(Phonenum_2);

		Country_2 = new JTextField();
		Country_2.setColumns(10);
		Country_2.setBounds(100, 355, 94, 20);
		studentpanel.add(Country_2);

		Province_2 = new JTextField();
		Province_2.setColumns(10);
		Province_2.setBounds(271, 355, 94, 20);
		studentpanel.add(Province_2);

		District_2 = new JTextField();
		District_2.setColumns(10);
		District_2.setBounds(432, 355, 86, 20);
		studentpanel.add(District_2);

		Postal_2 = new JTextField();
		Postal_2.setColumns(10);
		Postal_2.setBounds(588, 355, 86, 20);
		studentpanel.add(Postal_2);

		JComboBox comboBox_4 = new JComboBox(day.toArray());
		comboBox_4.setBounds(112, 109, 42, 20);
		studentpanel.add(comboBox_4);

		JComboBox comboBox_5 = new JComboBox(month.toArray());
		comboBox_5.setBounds(158, 109, 42, 20);
		studentpanel.add(comboBox_5);

		JComboBox comboBox_6 = new JComboBox(yearst.toArray());
		comboBox_6.setBounds(204, 109, 60, 20);
		studentpanel.add(comboBox_6);

		JLabel lblNewLabel = new JLabel("Student ID :");
		lblNewLabel.setBounds(44, 409, 75, 14);
		studentpanel.add(lblNewLabel);

		StudentID = new JTextField();
		StudentID.setBounds(114, 406, 110, 20);
		studentpanel.add(StudentID);
		StudentID.setColumns(10);

		JLabel lblSchool = new JLabel("School : ");
		lblSchool.setBounds(257, 409, 58, 14);
		studentpanel.add(lblSchool);

		School = new JTextField();
		School.setBounds(309, 406, 165, 20);
		studentpanel.add(School);
		School.setColumns(10);

		JLabel lblYear = new JLabel("Year : ");
		lblYear.setBounds(512, 409, 57, 14);
		studentpanel.add(lblYear);

		Year = new JTextField();
		Year.setBounds(553, 406, 42, 20);
		studentpanel.add(Year);
		Year.setColumns(10);

		JButton btnSave_2 = new JButton("SAVE");
		btnSave_2.setBounds(205, 464, 106, 36);
		studentpanel.add(btnSave_2);

		JButton btnCancel_2 = new JButton("CANCEL");
		btnCancel_2.setBounds(412, 464, 106, 36);
		studentpanel.add(btnCancel_2);

		
		//Elderly Member Tab
		JPanel elderlypanel = new JPanel();
		elderlypanel.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Elderly Member", null, elderlypanel, null);
		elderlypanel.setLayout(null);

		JLabel label_13 = new JLabel("Birthday :");
		label_13.setBounds(44, 112, 58, 14);
		elderlypanel.add(label_13);

		JLabel label_14 = new JLabel("Phone number :");
		label_14.setBounds(44, 299, 110, 14);
		elderlypanel.add(label_14);

		JLabel label_15 = new JLabel("Name :");
		label_15.setBounds(44, 41, 49, 35);
		elderlypanel.add(label_15);

		JLabel label_16 = new JLabel("Email :");
		label_16.setBounds(44, 239, 58, 21);
		elderlypanel.add(label_16);

		JLabel label_18 = new JLabel("Lastname :");
		label_18.setBounds(274, 46, 66, 24);
		elderlypanel.add(label_18);

		JLabel label_19 = new JLabel("Nation ID Card :");
		label_19.setBounds(44, 175, 110, 14);
		elderlypanel.add(label_19);

		JLabel label_20 = new JLabel("Gender :");
		label_20.setBounds(440, 112, 58, 14);
		elderlypanel.add(label_20);

		JLabel label_21 = new JLabel("Age :");
		label_21.setBounds(309, 112, 31, 14);
		elderlypanel.add(label_21);

		JLabel label_22 = new JLabel("Province :");
		label_22.setBounds(210, 352, 75, 27);
		elderlypanel.add(label_22);

		JLabel label_23 = new JLabel("Country :");
		label_23.setBounds(44, 358, 58, 14);
		elderlypanel.add(label_23);

		JLabel label_24 = new JLabel("District :");
		label_24.setBounds(376, 355, 58, 21);
		elderlypanel.add(label_24);

		JLabel label_25 = new JLabel("ZIP code :");
		label_25.setBounds(527, 355, 76, 21);
		elderlypanel.add(label_25);

		Name_3 = new JTextField();
		Name_3.setColumns(10);
		Name_3.setBounds(92, 48, 144, 20);

		elderlypanel.add(Name_3);

		LastName_3 = new JTextField();
		LastName_3.setColumns(10);
		LastName_3.setBounds(350, 48, 148, 20);
		elderlypanel.add(LastName_3);

		Age_3 = new JTextField();
		Age_3.setColumns(10);
		Age_3.setBounds(354, 109, 42, 20);
		elderlypanel.add(Age_3);
		Age_3.setEditable(false);

		JRadioButton chckbxM_3 = new JRadioButton("Male");
		chckbxM_3.setBackground(new Color(204, 255, 204));
		chckbxM_3.setBounds(512, 108, 57, 23);
		elderlypanel.add(chckbxM_3);

		JRadioButton chckbxF_3 = new JRadioButton("Female");
		chckbxF_3.setBackground(new Color(204, 255, 204));
		chckbxF_3.setBounds(571, 108, 66, 23);
		elderlypanel.add(chckbxF_3);

		chckbxM_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxM_3.setSelected(true);
				chckbxF_3.setSelected(false);
				gender_3 = "Male";
			}
		});

		chckbxF_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxM_3.setSelected(false);
				chckbxF_3.setSelected(true);
				gender_3 = "Female";
			}
		});

		NationID_3 = new JTextField();
		NationID_3.setColumns(10);
		NationID_3.setBounds(142, 172, 195, 20);
		elderlypanel.add(NationID_3);

		Email_3 = new JTextField();
		Email_3.setColumns(10);
		Email_3.setBounds(92, 239, 144, 20);
		elderlypanel.add(Email_3);

		Phonenum_3 = new JTextField();
		Phonenum_3.setColumns(10);
		Phonenum_3.setBounds(142, 296, 129, 20);
		elderlypanel.add(Phonenum_3);

		Country_3 = new JTextField();
		Country_3.setColumns(10);
		Country_3.setBounds(100, 355, 94, 20);
		elderlypanel.add(Country_3);

		Province_3 = new JTextField();
		Province_3.setColumns(10);
		Province_3.setBounds(271, 355, 94, 20);
		elderlypanel.add(Province_3);

		District_3 = new JTextField();
		District_3.setColumns(10);
		District_3.setBounds(432, 355, 86, 20);
		elderlypanel.add(District_3);

		Postal_3 = new JTextField();
		Postal_3.setColumns(10);
		Postal_3.setBounds(588, 355, 86, 20);
		elderlypanel.add(Postal_3);

		JComboBox comboBox_7 = new JComboBox(day.toArray());
		comboBox_7.setBounds(112, 109, 42, 20);
		elderlypanel.add(comboBox_7);

		JComboBox comboBox_8 = new JComboBox(month.toArray());
		comboBox_8.setBounds(158, 109, 42, 20);
		elderlypanel.add(comboBox_8);

		JComboBox comboBox_9 = new JComboBox(yearold.toArray());
		comboBox_9.setBounds(204, 109, 60, 20);
		elderlypanel.add(comboBox_9);

		JButton btnSave_3 = new JButton("SAVE");
		btnSave_3.setBounds(205, 464, 106, 36);
		elderlypanel.add(btnSave_3);

		JButton btnCancel_3 = new JButton("CANCEL");
		btnCancel_3.setBounds(412, 464, 106, 36);
		elderlypanel.add(btnCancel_3);

		Day Currentday = new Day(26,11,2014);

		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Regularday = new Day((int)comboBox_1.getSelectedItem(),(int)comboBox_2.getSelectedItem(),(int)comboBox_3.getSelectedItem());
				Age_1.setText(((Currentday.getDayTillTheMoviePermier(Regularday))/360)+"");
			}
		});

		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Regularday = new Day((int)comboBox_1.getSelectedItem(),(int)comboBox_2.getSelectedItem(),(int)comboBox_3.getSelectedItem());
				Age_1.setText(((Currentday.getDayTillTheMoviePermier(Regularday))/360)+"");
			}
		});

		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Regularday = new Day((int)comboBox_1.getSelectedItem(),(int)comboBox_2.getSelectedItem(),(int)comboBox_3.getSelectedItem());
				Age_1.setText(((Currentday.getDayTillTheMoviePermier(Regularday))/360)+"");
			}
		});

		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Studentday = new Day((int)comboBox_4.getSelectedItem(),(int)comboBox_5.getSelectedItem(),(int)comboBox_6.getSelectedItem());
				Age_2.setText(((Currentday.getDayTillTheMoviePermier(Studentday))/360)+"");
			}
		});

		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Studentday = new Day((int)comboBox_4.getSelectedItem(),(int)comboBox_5.getSelectedItem(),(int)comboBox_6.getSelectedItem());
				Age_2.setText(((Currentday.getDayTillTheMoviePermier(Studentday))/360)+"");
			}
		});

		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Studentday = new Day((int)comboBox_4.getSelectedItem(),(int)comboBox_5.getSelectedItem(),(int)comboBox_6.getSelectedItem());
				Age_2.setText(((Currentday.getDayTillTheMoviePermier(Studentday))/360)+"");
			}
		});

		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Elderlyday = new Day((int)comboBox_7.getSelectedItem(),(int)comboBox_8.getSelectedItem(),(int)comboBox_9.getSelectedItem());
				Age_3.setText(((Currentday.getDayTillTheMoviePermier(Elderlyday))/360)+"");
			}

		});

		comboBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Elderlyday = new Day((int)comboBox_7.getSelectedItem(),(int)comboBox_8.getSelectedItem(),(int)comboBox_9.getSelectedItem());
				Age_3.setText(((Currentday.getDayTillTheMoviePermier(Elderlyday))/360)+"");
			}
		});

		comboBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Day Elderlyday = new Day((int)comboBox_7.getSelectedItem(),(int)comboBox_8.getSelectedItem(),(int)comboBox_9.getSelectedItem());
				Age_3.setText(((Currentday.getDayTillTheMoviePermier(Elderlyday))/360)+"");
			}
		});

		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					showconfirmDialog();
					if(confirm==0){
						if(Name_1.getText().equals("")||LastName_1.getText().equals("")||gender_1.equals("")||NationID_1.getText().equals("")||
								Phonenum_1.getText().equals("")||Province_1.getText().equals("")||Postal_1.getText().equals("")||Country_1.getText().equals("")||District_1.getText().equals("")||Email_1.getText().equals("")){
							showDialog();
						}
						else{
							ID++;
							MemberRegular newmember = new MemberRegular(ID+"",Name_1.getText(),LastName_1.getText(),gender_1,Integer.parseInt(Age_1.getText()),NationID_1.getText(),
									Phonenum_1.getText(),0.8,0,"Regular",Province_1.getText(),Postal_1.getText(),Country_1.getText(),District_1.getText(),
									Email_1.getText(),120);
							memberList.add(newmember);
							showsuccess();
							dispose();
							//add text
							try{
								Scanner input = new Scanner(regularfile);
								String data="";
								while(input.hasNext()){
									data += input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextInt()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+" "+input.nextInt()+" "+input.next()+" "+
											input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+"\r\n";
								}
								regularfile = new File("src/data/regular.txt");
								FileWriter fw = new FileWriter(regularfile);
								PrintWriter pw = new PrintWriter(fw);
								pw.println(data+ID+""+" "+Name_1.getText()+" "+LastName_1.getText()+" "+gender_1+" "+Integer.parseInt(Age_1.getText())+" "+NationID_1.getText()+" "+
										Phonenum_1.getText()+" "+0.8+" "+0+" "+"Regular"+" "+Province_1.getText()+" "+Postal_1.getText()+" "+Country_1.getText()+" "+District_1.getText()+" "+
										Email_1.getText()+" "+120);

								pw.close();
								fw.close();

							} catch(Exception e){

							}
							try{
								Scanner input = new Scanner(memberfile);
								String data="";
								while(input.hasNext()){
									data += input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextInt()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+" "+input.nextInt()+" "+input.next()+" "+
											input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+"\r\n";
								}
								memberfile = new File("src/data/member.txt");
								FileWriter fw = new FileWriter(memberfile);
								PrintWriter pw = new PrintWriter(fw);
								pw.println(data+ID+""+" "+Name_1.getText()+" "+LastName_1.getText()+" "+gender_1+" "+Integer.parseInt(Age_1.getText())+" "+NationID_1.getText()+" "+
										Phonenum_1.getText()+" "+0.8+" "+0+" "+"Regular"+" "+Province_1.getText()+" "+Postal_1.getText()+" "+Country_1.getText()+" "+District_1.getText()+" "+
										Email_1.getText()+" "+120);

								pw.close();
								fw.close();

							} catch(Exception e){

							}

						}

					}

				} catch (Exception e) {
					showDialog();
				}

			}
		});

		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});

		btnSave_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					showconfirmDialog();
					if(confirm==0){
						if(Name_2.getText().equals("")||LastName_2.getText().equals("")||gender_2.equals("")||NationID_2.getText().equals("")||
								Phonenum_2.getText().equals("")||Province_2.getText().equals("")||Postal_2.getText().equals("")||Country_2.getText().equals("")||District_2.getText().equals("")||Email_2.getText().equals("")){
							showDialog();
						}
						else{
							ID++;
							MemberStudent newmember = new MemberStudent(ID+"",Name_2.getText(),LastName_2.getText(),gender_2,Integer.parseInt(Age_2.getText()),NationID_2.getText(),
									Phonenum_2.getText(),0.7,0,"Student",Province_2.getText(),Postal_2.getText(),Country_2.getText(),District_2.getText(),
									Email_2.getText(),100,StudentID.getText(),School.getText(),Year.getText());
							memberList.add(newmember);
							showsuccess();
							dispose();
							//add text
							try{
								Scanner input = new Scanner(studentfile);
								String data="";
								while(input.hasNext()){
									data += input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextInt()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+" "+input.nextInt()+" "+input.next()+" "+
											input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+" "+input.next()+" "+input.next()+" "+input.next()+"\r\n";
								}
								studentfile = new File("src/data/student.txt");
								FileWriter fw = new FileWriter(studentfile);
								PrintWriter pw = new PrintWriter(fw);
								pw.println(data+ID+""+" "+Name_2.getText()+" "+LastName_2.getText()+" "+gender_2+" "+Integer.parseInt(Age_2.getText())+" "+NationID_2.getText()+" "+
										Phonenum_2.getText()+" "+0.7+" "+0+" "+"Student"+" "+Province_2.getText()+" "+Postal_2.getText()+" "+Country_2.getText()+" "+District_2.getText()+" "+
										Email_2.getText()+" "+100+" "+StudentID.getText()+" "+School.getText()+" "+Year.getText());

								pw.close();
								fw.close();

							} catch(Exception e){

							}
							try{
								Scanner input = new Scanner(memberfile);
								String data="";
								while(input.hasNext()){
									data += input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextInt()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+" "+input.nextInt()+" "+input.next()+" "+
											input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+"\r\n";
								}
								memberfile = new File("src/data/member.txt");
								FileWriter fw = new FileWriter(memberfile);
								PrintWriter pw = new PrintWriter(fw);
								pw.println(data+ID+""+" "+Name_2.getText()+" "+LastName_2.getText()+" "+gender_2+" "+Integer.parseInt(Age_2.getText())+" "+NationID_2.getText()+" "+
										Phonenum_2.getText()+" "+0.7+" "+0+" "+"Student"+" "+Province_2.getText()+" "+Postal_2.getText()+" "+Country_2.getText()+" "+District_2.getText()+" "+
										Email_2.getText()+" "+100);

								pw.close();
								fw.close();

							} catch(Exception e){

							}
						}
					}

				} catch (Exception e) {
					showDialog();
				}
			}
		});

		btnCancel_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});

		btnSave_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					showconfirmDialog();
					if(confirm==0){
						if(Name_3.getText().equals("")||LastName_3.getText().equals("")||gender_3.equals("")||NationID_3.getText().equals("")||
								Phonenum_3.getText().equals("")||Province_3.getText().equals("")||Postal_3.getText().equals("")||Country_3.getText().equals("")||District_3.getText().equals("")||Email_3.getText().equals("")){
							showDialog();
						}
						else{
							ID++;
							MemberElderly newmember = new MemberElderly(ID+"",Name_3.getText(),LastName_3.getText(),gender_3,Integer.parseInt(Age_3.getText()),NationID_3.getText(),
									Phonenum_3.getText(),0.6,0,"Elderly",Province_3.getText(),Postal_3.getText(),Country_3.getText(),District_3.getText(),
									Email_3.getText(),90);
							memberList.add(newmember);
							showsuccess();
							dispose();
							//add text

							try{
								Scanner input = new Scanner(elderlyfile);
								String data="";
								while(input.hasNext()){
									data += input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextInt()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+" "+input.nextInt()+" "+input.next()+" "+
											input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+"\r\n";
								}
								elderlyfile = new File("src/data/elderly.txt");
								FileWriter fw = new FileWriter(elderlyfile);
								PrintWriter pw = new PrintWriter(fw);
								pw.println(data+ID+""+" "+Name_3.getText()+" "+LastName_3.getText()+" "+gender_3+" "+Integer.parseInt(Age_3.getText())+" "+NationID_3.getText()+" "+
										Phonenum_3.getText()+" "+0.6+" "+0+" "+"Elderly"+" "+Province_3.getText()+" "+Postal_3.getText()+" "+Country_3.getText()+" "+District_3.getText()+" "+
										Email_3.getText()+" "+90);

								pw.close();
								fw.close();

							} catch(Exception e){

							}
							
							try{
								Scanner input = new Scanner(memberfile);
								String data="";
								while(input.hasNext()){
									data += input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextInt()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+" "+input.nextInt()+" "+input.next()+" "+
											input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextDouble()+"\r\n";
								}
								memberfile = new File("src/data/member.txt");
								FileWriter fw = new FileWriter(memberfile);
								PrintWriter pw = new PrintWriter(fw);
								pw.println(data+ID+""+" "+Name_3.getText()+" "+LastName_3.getText()+" "+gender_3+" "+Integer.parseInt(Age_3.getText())+" "+NationID_3.getText()+" "+
										Phonenum_3.getText()+" "+0.6+" "+0+" "+"Elderly"+" "+Province_3.getText()+" "+Postal_3.getText()+" "+Country_3.getText()+" "+District_3.getText()+" "+
										Email_3.getText()+" "+90);

								pw.close();
								fw.close();

							} catch(Exception e){

							}
						}
					}

				} catch (Exception e) {
					showDialog();
				}
			}
		});

		btnCancel_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});	
	}

	
	//Dialog Method
	public void showDialog(){
		JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Warning", JOptionPane.PLAIN_MESSAGE);
	}

	public void showconfirmDialog(){
		confirm =JOptionPane.showConfirmDialog(this,"Fill in correctly ?","Confirm",JOptionPane.YES_NO_OPTION);

	}
	
	public void showsuccess(){
		JOptionPane.showMessageDialog(this, "                 Registion Successful !!", "Success", JOptionPane.PLAIN_MESSAGE);
	}

	
	//clear Method
	public void clearMember(){

		regularfile = new File("src/data/regular.txt");
		try{
			FileWriter fw = new FileWriter(regularfile);
			fw.write("");
			fw.close();
		}
		catch(Exception e){

		}
		studentfile = new File("src/data/student.txt");
		try{
			FileWriter fw = new FileWriter(studentfile);
			fw.write("");
			fw.close();
		}
		catch(Exception e){

		}
		elderlyfile = new File("src/data/elderly.txt");
		try{
			FileWriter fw = new FileWriter(elderlyfile);
			fw.write("");
			fw.close();
		}
		catch(Exception e){

		}
		memberfile = new File("src/data/member.txt");
		try{
			FileWriter fw = new FileWriter(memberfile);
			fw.write("");
			fw.close();
		}
		catch(Exception e){

		}
		memberList.clear();
		ID=1000;
	}

	public void clearRegularMember(){

		regularfile = new File("src/data/regular.txt");
		try{
			FileWriter fw = new FileWriter(regularfile);
			fw.write("");
			fw.close();
		}
		catch(Exception e){

		}
		int index=0;
		for(int i=0;i<memberList.size();i++){
			if(memberList.get(i-index).getType().equals("Regular")){
				memberList.remove(i-index);
				index=1;
			}
		}
	}
	
	public void clearStudentMember(){

		studentfile = new File("src/data/student.txt");
		try{
			FileWriter fw = new FileWriter(studentfile);
			fw.write("");
			fw.close();
		}
		catch(Exception e){

		}
		int index=0;
		for(int i=0;i<memberList.size();i++){
			if(memberList.get(i-index).getType().equals("Student")){
				memberList.remove(i-index);
				index=1;
			}
		}
	}
	
	public void clearElderlyMember(){

		elderlyfile = new File("src/data/elderly.txt");
		try{
			FileWriter fw = new FileWriter(elderlyfile);
			fw.write("");
			fw.close();
		}
		catch(Exception e){

		}
		int index=0;
		for(int i=0;i<memberList.size();i++){
			if(memberList.get(i-index).getType().equals("Elderly")){
				memberList.remove(i-index);
				index=1;
			}
		}
	}
	
	//read text file
	public void readText(){
		regularfile = new File("src/data/regular.txt");
		studentfile = new File("src/data/student.txt");
		elderlyfile = new File("src/data/elderly.txt");
		memberfile = new File("src/data/member.txt");
		try{
			String data="";
			Scanner input1 = new Scanner(regularfile);
			Scanner input2 = new Scanner(studentfile);
			Scanner input3 = new Scanner(elderlyfile);
			Scanner input4 = new Scanner(memberfile);
			while(input1.hasNext()){
				MemberRegular member= new MemberRegular(input1.next(),input1.next(),input1.next(),input1.next(),input1.nextInt(),input1.next(),input1.next(),input1.nextDouble(),input1.nextInt(),input1.next(),
						input1.next(),input1.next(),input1.next(),input1.next(),input1.next(),input1.nextDouble());
				memberList.add(member);
				
			}
			while(input2.hasNext()){
				MemberStudent member= new MemberStudent(input2.next(),input2.next(),input2.next(),input2.next(),input2.nextInt(),input2.next(),input2.next(),input2.nextDouble(),input2.nextInt(),input2.next(),
						input2.next(),input2.next(),input2.next(),input2.next(),input2.next(),input2.nextDouble(),input2.next(),input2.next(),input2.next());
				memberList.add(member);
				
			}
			while(input3.hasNext()){
				MemberElderly member= new MemberElderly(input3.next(),input3.next(),input3.next(),input3.next(),input3.nextInt(),input3.next(),input3.next(),input3.nextDouble(),input3.nextInt(),input3.next(),
						input3.next(),input3.next(),input3.next(),input3.next(),input3.next(),input3.nextDouble());
				memberList.add(member);
				
			}
			while(input4.hasNext()){
				Member member= new Member(input4.next(),input4.next(),input4.next(),input4.next(),input4.nextInt(),input4.next(),input4.next(),input4.nextDouble(),input4.nextInt(),input4.next(),
						input4.next(),input4.next(),input4.next(),input4.next(),input4.next(),input4.nextDouble());
				ID++;
			}
		}
		catch(Exception e){

		}
	}

}
