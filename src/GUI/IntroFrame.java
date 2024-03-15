package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class IntroFrame extends MyFrame implements ActionListener{
	JButton LoginButton,RegisterButton;
	JPanel LoginPanel,UsernamePanel,PasswordPanel;
	JLabel UsernameLabel,PasswordLabel;
	JTextField Username;
	JPasswordField Password;
	public IntroFrame(){
		Username=new JTextField();
		Username.setBounds(125,100,200,25);
		Username.setBorder(BorderFactory.createLineBorder(Color.black,5));

		Password=new JPasswordField();
		Password.setBounds(125,150,200,25);
		Password.setBorder(BorderFactory.createLineBorder(Color.black,5));
		
		UsernameLabel=new JLabel("Username:");
		UsernameLabel.setBounds(50,100,75,25);
		Username.setFont(new Font("times new roman",Font.PLAIN,15));
		PasswordLabel=new JLabel("Password:");
		PasswordLabel.setBounds(50,150,75,25);	
		
		LoginButton=new JButton("Login");
		LoginButton.setBounds(125,200,100,25);
		LoginButton.addActionListener(this);
		LoginButton.setFocusable(false);
		
		RegisterButton=new JButton("Register");
		RegisterButton.setBounds(235,200,100,25);
		RegisterButton.addActionListener(this);
		RegisterButton.setFocusable(false);
		
		this.setTitle("Dang nhap thanh vien"); 
		this.add(UsernameLabel);
		this.add(PasswordLabel);
		this.add(Username);
		this.add(Password);
		this.add(RegisterButton);
		this.add(LoginButton);
		this.setSize(420,420);
		this.setLayout(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==LoginButton) {
			String tentk = Username.getText() ;
			String matkhau=String.valueOf(Password.getPassword());
			if(tentk.equals("lmao") && matkhau.equals("123")) {
				System.out.println("hehe");
			}
		}
		if(e.getSource()==RegisterButton) {
			new RegisterFrame();
			this.dispose();
		}
	}
}
