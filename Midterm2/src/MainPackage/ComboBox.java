package MainPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class ComboBox extends JPanel {

	private JFrame frame;
	private String month = "Month";
	private String day = "Day";
	private String year = "Year";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox window = new ComboBox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] months = { "January", "February", "March", "April", "May", "June", "July"
				, "August", "September", "October", "November", "December"};
		String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", 
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		String[] years = { "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" };
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(49, 75, 61, 16);
		frame.getContentPane().add(lblMonth);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(49, 132, 61, 16);
		frame.getContentPane().add(lblDay);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(49, 192, 61, 16);
		frame.getContentPane().add(lblYear);
		
		JComboBox comboBox_month = new JComboBox(months);
		comboBox_month.setBounds(122, 71, 52, 27);
		frame.getContentPane().add(comboBox_month);
		
		JComboBox comboBox_day = new JComboBox(days);
		comboBox_day.setBounds(122, 128, 52, 27);
		frame.getContentPane().add(comboBox_day);
		
		JComboBox comboBox_year = new JComboBox(years);
		comboBox_year.setBounds(122, 188, 52, 27);
		frame.getContentPane().add(comboBox_year);
	}
}
