package test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class driveradd extends driverxx implements ActionListener {

			private Connection ct = null;  
		    private PreparedStatement ps = null;  
		    private ResultSet rs = null;  

		    private JLabel a = new JLabel("¼��˾�����");
		    private JLabel b1 = new JLabel("˾������");
		    private JLabel c = new JLabel("��ϵ�绰");
		    private JLabel d = new JLabel("���ձ��");
		    private JLabel e1 = new JLabel("��ϵ��ַ");

		   
		    private JTextField d1=new JTextField("d");
		    private JTextField d2=new JTextField();
		    private JTextField d3=new JTextField();
		    private JTextField d4=new JTextField();
		    private JTextField d5=new JTextField();

	
		    private JButton bt = new JButton("����");
		    private JButton bt1 = new JButton("����");


			@Override
			public void actionPerformed(ActionEvent e) {
				
		   
		        
		     //�������
		        JFrame window=new JFrame();
		        JPanel w=new JPanel();
		        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		        //t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		        
		        w.setLayout(new GridLayout(6,2));
		        window.setTitle("����˾����Ϣ");
		        window.setSize(350,400);
		        window.setVisible(true); 
		        window.add(w);
		        w.add(a);
		        w.add(d1);
		        w.add(b1);
		        w.add(d2);
		        w.add(c);
		        w.add(d3);
		        w.add(d);
		        w.add(d4);
		        w.add(e1); 
		        w.add(d5);  
		   
		

		        
		        ok ok1=new ok();
			       bt.addActionListener(ok1);
			      re re1=new re();
			       bt1.addActionListener(re1);

		        w.add(bt);
		        w.add(bt1);
		             
		             
		}
			  //���ð�ť�¼�
				public class re implements ActionListener {
					public void actionPerformed(ActionEvent e) {
						
						d1.setText("d");
						d2.setText("");
					
						d4.setText("");
						d5.setText("");
					

					}
					}
			
			
			
			
		      //���Ӱ�ť�¼�����������ݲ��������
			public class ok implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					  String sql = "INSERT INTO driver(drid,drname,drnumber,drlicense,draddress) "
				                + "values(?,?,?,?,?)";   //���ݿ����
					  

					try{
						//int i=null;
			            Class.forName("com.mysql.jdbc.Driver");
			            System.out.println("JBDC ���سɹ�!");
			
			            
			        }catch(Exception a){
			            System.out.println("JBDC gg!");
			            a.printStackTrace();
			        }
					
			        try{
			            ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/wuliu","root",""); //�������ݿ�
			            ps=ct.prepareStatement(sql);  //�������ݿ�
			            
			             
			            ps.setString(1,d1.getText());		  
			            ps.setString(2,d2.getText());		          
			            ps.setString(3,d3.getText());
			            ps.setString(4,d4.getText());
			            ps.setString(5,d5.getText()); 



			            ps.executeUpdate();
	
			            JOptionPane.showMessageDialog(null, "���ӳɹ�");
			            
			            
			            b5.doClick();
			            
			        }catch (SQLException b){
			            b.printStackTrace();     
			            JOptionPane.showMessageDialog(null, "�����������е�˾�����", "����ʧ��", JOptionPane.ERROR_MESSAGE);
			        }finally{
			            try{
			                ct.close();
			                System.out.println("MySQL �رճɹ�");
			            }catch (SQLException c){
			                System.out.println("MySQL �ر�ʧ�� ");
			                c.printStackTrace();
			            }
			             
			        }

			}
			}
		        
		        
			}