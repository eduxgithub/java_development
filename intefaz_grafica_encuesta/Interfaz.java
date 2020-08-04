package intefaz_grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Sistema Operativo:");
		label1.setBounds(26, 28, 111, 14);
		contentPane.add(label1);
		
		JRadioButton radioButton1 = new JRadioButton("Windows");
		buttonGroup.add(radioButton1);
		radioButton1.setBounds(26, 49, 109, 23);
		contentPane.add(radioButton1);
		
		JRadioButton radioButton_2 = new JRadioButton("Unix");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(26, 75, 109, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Solaris");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(26, 101, 109, 23);
		contentPane.add(radioButton_3);
		
		JLabel label2 = new JLabel("Especialidad:");
		label2.setBounds(26, 146, 108, 14);
		contentPane.add(label2);
		
		JCheckBox checkBox1 = new JCheckBox("Programación");
		checkBox1.setBounds(26, 167, 125, 23);
		contentPane.add(checkBox1);
		
		JCheckBox checkBox2 = new JCheckBox("Diseñador");
		checkBox2.setBounds(26, 193, 97, 23);
		contentPane.add(checkBox2);
		
		JCheckBox checkBox3 = new JCheckBox("Contador");
		checkBox3.setBounds(26, 219, 97, 23);
		contentPane.add(checkBox3);
		
		JLabel label3 = new JLabel("Horas dedicadas en el ordenador:");
		label3.setBounds(26, 272, 212, 14);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("");
		label4.setBounds(266, 272, 46, 14);
		contentPane.add(label4);
		
		JSlider slider1 = new JSlider();
		slider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				label4.setText(slider1.getValue()+"");
			}
		});
		slider1.setMinorTickSpacing(1);
		slider1.setValue(0);
		slider1.setMajorTickSpacing(2);
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider1.setMaximum(14);
		slider1.setBounds(26, 297, 212, 45);
		contentPane.add(slider1);
		
		JButton button1 = new JButton("Generar");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// seleccionar el boton elegido
				Enumeration e = buttonGroup.getElements();
				JRadioButton radioButtonSeleccionado = null;
				
		        while (e.hasMoreElements() == true){
		            JRadioButton r = (JRadioButton) e.nextElement();
		            if (r.isSelected()){
		            	radioButtonSeleccionado = r;
		            }
		        }
		        
		        // seleccionar los checkbox elegidos
		        String checkBoxSeleccionado="";
		        
		        if (checkBox1.isSelected()) {
		        	checkBoxSeleccionado += checkBox1.getText()+"\n";
		        }
		        
		        if (checkBox1.isSelected()) {
		        	checkBoxSeleccionado += checkBox2.getText()+"\n";
		        }
		        
		        if (checkBox1.isSelected()) {
		        	checkBoxSeleccionado += checkBox3.getText()+"\n";
		        }
		        
				Object message = radioButtonSeleccionado.getText()+"\n"+checkBoxSeleccionado+label4.getText();
				JOptionPane.showMessageDialog(getComponent(0), message );
			}
		});
		button1.setBounds(223, 365, 89, 23);
		contentPane.add(button1);
		
		
	}
}
