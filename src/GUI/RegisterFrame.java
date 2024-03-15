package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegisterFrame extends MyFrame implements ActionListener{
	JTextField ten,hoten,tendem,sodt;
	JLabel Labeltendem,Labelho,Labelten,Labelsodt;
	JButton xacnhan,huy;
	public RegisterFrame(){
		ten=new JTextField();
		ten.setBounds(150,100,200,25);
		ten.setBorder(BorderFactory.createLineBorder(Color.black,5));
		ten.setFont(new Font("times new roman",Font.PLAIN,15));
		
		Labelten=new JLabel("Ten:");
		Labelten.setBounds(50,100,75,25);
		Labelten.setFont(new Font("times new roman",Font.PLAIN,15));
		
		hoten=new JTextField();
		hoten.setBounds(150,135,200,25);
		hoten.setBorder(BorderFactory.createLineBorder(Color.black,5));
		hoten.setFont(new Font("times new roman",Font.PLAIN,15));
		
		Labelho=new JLabel("Ho:");
		Labelho.setBounds(50,135,75,25);
		Labelho.setFont(new Font("times new roman",Font.PLAIN,15));
		
		tendem=new JTextField();
		tendem.setBounds(150,170,200,25);
		tendem.setBorder(BorderFactory.createLineBorder(Color.black,5));
		tendem.setFont(new Font("times new roman",Font.PLAIN,15));
		
		Labeltendem=new JLabel("Ten dem:");
		Labeltendem.setBounds(50,170,75,25);
		Labeltendem.setFont(new Font("times new roman",Font.PLAIN,15));
		
		sodt=new JTextField();
		sodt.setBounds(150,205,200,25);
		sodt.setBorder(BorderFactory.createLineBorder(Color.black,5));
		sodt.setFont(new Font("times new roman",Font.PLAIN,15));
		
		Labelsodt=new JLabel("So dien thoai:");
		Labelsodt.setBounds(50,205,100,25);
		Labelsodt.setFont(new Font("times new roman",Font.PLAIN,15));
		
		xacnhan=new JButton("XAC NHAN");
		xacnhan.setBounds(150,240,100,25);
		xacnhan.addActionListener(this);
		
		huy=new JButton("HUY");
		huy.setBounds(260,240,100,25);
		huy.addActionListener(this);
		
		this.setTitle("Dang ky thanh vien");
		this.add(Labelho);
		this.add(Labeltendem);
		this.add(Labelsodt);
		this.add(Labelten);
		this.add(ten);
		this.add(hoten);
		this.add(tendem);
		this.add(sodt);
		this.add(xacnhan);
		this.add(huy);
		this.setSize(420,500);
		this.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==xacnhan) {
			String ten,ho,tendem,sodt;
			ten=this.ten.getText();
			ho=this.hoten.getText();
			tendem=this.tendem.getText();
			sodt=this.sodt.getText();
			
		}
		if(e.getSource()==huy) {
			new IntroFrame();
			this.dispose();
		}
	}
}
