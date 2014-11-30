import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MemberInformation extends JFrame implements Runnable {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField searchfield;
	private JTable table_3;
	public static Member member;

	/**
	 * Launch the application.
	 */
	public void run(){
		super.setVisible(true);
	}
	public static void main(String[] args) {
		MemberInformation main = new MemberInformation();
		main.run();
	}

	/**
	 * Create the frame.
	 */
	public MemberInformation() {
		setTitle("Member Information");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String memberinform="";

		for(int i=0;i<RegistMember.memberList.size();i++){
			memberinform+=RegistMember.memberList.get(i).toString()+"\n";
		}

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Sitka Small", Font.PLAIN, 17));
		tabbedPane.setBounds(0, 11, 784, 550);
		contentPane.add(tabbedPane);

		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		tabbedPane.addTab("Sort by ID", null, panel_1, null);
		tabbedPane.setEnabledAt(0, true);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 589, 545);
		panel_1.add(scrollPane);

		String[] columnname ={"ID","Name","Lastname","Gender","Age","Phone","Member type"};

		ArrayList<Member> sortid = new ArrayList<Member>();
		sortid = RegistMember.memberList;
		sortid.get(0).sortID(sortid);

		String data[][] = new String[sortid.size()][7];

		for(int i=0;i<sortid.size();i++){
			data[i][0]=sortid.get(i).getId();
			data[i][1]=sortid.get(i).getName();
			data[i][2]=sortid.get(i).getLastname();
			data[i][3]=sortid.get(i).getGender();
			data[i][4]=sortid.get(i).getAge()+"";
			data[i][5]=sortid.get(i).getPhonenumber();
			data[i][6]=sortid.get(i).getType();
		}

		table = new JTable(data,columnname){

			public boolean isCellEditable(int data,int column){
				return false;
			}
			public Component prepareRenderer(TableCellRenderer r,int data,int column){
				Component c = super.prepareRenderer(r, data, column);
				c.setBackground(Color.WHITE);
				if(isCellSelected(data,column)){
					c.setBackground(Color.YELLOW);
				}
				return c;
			}
		};
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				int row = table.rowAtPoint(arg0.getPoint());
				int count = arg0.getClickCount();
				if(count>=2){
					
					Object o = table.getModel().getValueAt(row, 0);
					String id = o.toString();
					member = searchID(RegistMember.memberList, id);
					ViewMember view = new ViewMember();
					view.run();
				}
				
			}
		});
		table.setFont(new Font("Ebrima", Font.PLAIN, 14));
		table.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane.setViewportView(table);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Sort by Name", null, panel_2, null);
		panel_2.setLayout(null);


		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 589, 545);
		panel_2.add(scrollPane_1);

		ArrayList<Member> sortname = new ArrayList<Member>();
		sortname = RegistMember.memberList;
		sortname.get(0).sortName(sortname);

		String data2[][] = new String[sortname.size()][7];
		for(int i=0;i<sortname.size();i++){
			data2[i][0]=sortname.get(i).getId();
			data2[i][1]=sortname.get(i).getName();
			data2[i][2]=sortname.get(i).getLastname();
			data2[i][3]=sortname.get(i).getGender();
			data2[i][4]=sortname.get(i).getAge()+"";
			data2[i][5]=sortname.get(i).getPhonenumber();
			data2[i][6]=sortname.get(i).getType();
		}


		table_1 = new JTable(data2,columnname){
			public boolean isCellEditable(int data,int column){
				return false;
			}
			public Component prepareRenderer(TableCellRenderer r,int data,int column){
				Component c = super.prepareRenderer(r, data, column);
				c.setBackground(Color.WHITE);
				if(isCellSelected(data,column)){
					c.setBackground(Color.YELLOW);
				}
				return c;
			}
		};
		
		table_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				int row = table_1.rowAtPoint(arg0.getPoint());
				int count = arg0.getClickCount();
				if(count>=2){
					Object o = table_1.getModel().getValueAt(row, 0);
					String id = o.toString();
					member = searchID(RegistMember.memberList, id);
					ViewMember view = new ViewMember();
					view.run();
				}
				
			}
		});
		table_1.setFont(new Font("Ebrima", Font.PLAIN, 14));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane_1.setViewportView(table_1);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Sort by Membertype", null, panel_3, null);
		tabbedPane.setEnabledAt(2, true);
		panel_3.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 589, 545);
		panel_3.add(scrollPane_2);

		ArrayList<Member> sorttype = new ArrayList<Member>();
		sorttype = RegistMember.memberList;
		sorttype.get(0).sortType(sorttype);

		String data3[][] = new String[sorttype.size()][7];
		for(int i=0;i<sorttype.size();i++){
			data3[i][0]=sorttype.get(i).getId();
			data3[i][1]=sorttype.get(i).getName();
			data3[i][2]=sorttype.get(i).getLastname();
			data3[i][3]=sorttype.get(i).getGender();
			data3[i][4]=sorttype.get(i).getAge()+"";
			data3[i][5]=sorttype.get(i).getPhonenumber();
			data3[i][6]=sorttype.get(i).getType();
		}


		table_2 = new JTable(data3,columnname){
			public boolean isCellEditable(int data,int column){
				return false;
			}
			public Component prepareRenderer(TableCellRenderer r,int data,int column){
				Component c = super.prepareRenderer(r, data, column);
				c.setBackground(Color.WHITE);
				if(isCellSelected(data,column)){
					c.setBackground(Color.YELLOW);
				}
				return c;
			}
		};
		table_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				int row = table_2.rowAtPoint(arg0.getPoint());
				int count = arg0.getClickCount();
				if(count>=2){
					
					Object o = table_2.getModel().getValueAt(row, 0);
					String id = o.toString();
					member = searchID(RegistMember.memberList, id);
					ViewMember view = new ViewMember();
					view.run();
				}
				
			}
		});
		table_2.setFont(new Font("Ebrima", Font.PLAIN, 14));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane_2.setViewportView(table_2);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Search Member", null, panel_4, null);
		panel_4.setLayout(null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 62, 589, 483);
		panel_4.add(scrollPane_3);



		ArrayList<Member> found = new ArrayList<Member>();
		String data4[][] = new String[found.size()][7];


		table_3 = new JTable(data4,columnname);
		table_3.setFont(new Font("Ebrima", Font.PLAIN, 14));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane_3.setViewportView(table_3);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 589, 62);
		panel_4.add(panel);
		panel.setLayout(null);

		searchfield = new JTextField();
		searchfield.setBounds(56, 24, 307, 20);
		panel.add(searchfield);
		searchfield.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<Member> found = new ArrayList<Member>();
				String hint = searchfield.getText();
				found = RegistMember.memberList.get(0).searchMember(RegistMember.memberList, hint);
				String data4[][] = new String[found.size()][7];
				for(int i=0;i<found.size();i++){
					data4[i][0]=found.get(i).getId();
					data4[i][1]=found.get(i).getName();
					data4[i][2]=found.get(i).getLastname();
					data4[i][3]=found.get(i).getGender();
					data4[i][4]=found.get(i).getAge()+"";
					data4[i][5]=found.get(i).getPhonenumber();
					data4[i][6]=found.get(i).getType();
				}
				table_3 = new JTable(data4,columnname){
					public boolean isCellEditable(int data,int column){
						return false;
					}
					public Component prepareRenderer(TableCellRenderer r,int data,int column){
						Component c = super.prepareRenderer(r, data, column);
						c.setBackground(Color.WHITE);
						if(isCellSelected(data,column)){
							c.setBackground(Color.YELLOW);
						}
						return c;
					}
				};
				table_3.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent arg0) {
						int row = table_3.rowAtPoint(arg0.getPoint());
						int count = arg0.getClickCount();
						if(count>=2){
							Object o = table_3.getModel().getValueAt(row, 0);
							String id = o.toString();
							member = searchID(RegistMember.memberList, id);
							ViewMember view = new ViewMember();
							view.run();
						}
						
					}
				});
				table_3.setFont(new Font("Ebrima", Font.PLAIN, 14));
				table_3.getColumnModel().getColumn(0).setPreferredWidth(25);
				scrollPane_3.setViewportView(table_3);
			}
		});
		btnSearch.setBounds(394, 23, 76, 23);
		panel.add(btnSearch);


	}
	
	public Member searchID(ArrayList<Member> member,String word){
		ArrayList<Member> found = new ArrayList<Member>();
		for(int i=0;i<member.size();i++){
			if(member.get(i).getName().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
			else if(member.get(i).getLastname().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
			else if(member.get(i).getId().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
			else if(member.get(i).getType().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
			else if(member.get(i).getGender().equalsIgnoreCase(word)){
				found.add(member.get(i));
			}
		}
		return found.get(0);
		
	}
}
