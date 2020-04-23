package Calculadoraestandar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CalculadoraEstandar extends JFrame implements ActionListener {

	//CREANDO  FORMULARIO
	JPanel base = (JPanel) this.getContentPane();
	
	//CREANDO LA PANTALLA (TEXTFIELD)
	
	JTextField pantalla = new JTextField();
	
	//CREANDO BOTONES
	
	JButton buno = new JButton("1");
	JButton bdos = new JButton("2");
	JButton btres = new JButton("3");
	JButton bborrar = new JButton("borrar");
	JButton bcuatro = new JButton("4");
	JButton bcinco = new JButton("5");
	JButton bseis = new JButton("6");
	JButton bsuma = new JButton("+");
	JButton bsiete = new JButton("7");
	JButton bocho = new JButton("8");
	JButton bnueve = new JButton("9");
	JButton bresta = new JButton("-");
	JButton bmult = new JButton("*");
	JButton bcero = new JButton("0");
	JButton bdiv = new JButton("/");
	JButton bpunto = new JButton(".");
	JButton bigual = new JButton("=");
	
	public CalculadoraEstandar () {
		
		//PROPIEDADES DEL FORMULARIO
		
		base.setLayout(null);              //ACOMODAR MAUNALMENTE LOS ELEMENTOS
		setSize(350,450);
		setTitle("CALCULADORA");           //PONIENDO TITULO  
		setVisible(true);                  //PARA QUE SEA VISIBLE EL FORMULARIO
	
		//PROPIEDADES DE PANTALLA
		
		pantalla.setBounds(22, 8, 288, 70);
		pantalla.setFont(new Font("calibri",Font.BOLD,25));
		add(pantalla);
		
		//PROPIEDAD DE BOTONES
		
		buno.setBounds(22, 83, 60, 60);
		buno.setFont(new Font("calibri",Font.BOLD,20));
		add(buno);
		buno.addActionListener(this);
		
		bdos.setBounds(87, 83, 60, 60);
		bdos.setFont(new Font("calibri",Font.BOLD,20));
		add(bdos);
		bdos.addActionListener(this);
		
		btres.setBounds(152, 83, 60, 60);
		btres.setFont(new Font("calibri",Font.BOLD,20));
		add(btres);
		btres.addActionListener(this);
		
		bborrar.setBounds(217, 83, 92, 60);
		bborrar.setFont(new Font("calibri",Font.BOLD,20));
		add(bborrar);
		bborrar.addActionListener(this);
		
		bcuatro.setBounds(22, 148, 60, 60);
		bcuatro.setFont(new Font("calibri",Font.BOLD,20));
		add(bcuatro);
		bcuatro.addActionListener(this);
		
		bcinco.setBounds(87, 148, 60, 60);		
		bcinco.setFont(new Font("calibri",Font.BOLD,20));
		add(bcinco);
		bcinco.addActionListener(this);
		
		bseis.setBounds(152, 148, 60, 60);
		bseis.setFont(new Font("calibri",Font.BOLD,20));
		add(bseis);
		bseis.addActionListener(this);
		
		bsuma.setBounds(217, 148, 92, 60);
		bsuma.setFont(new Font("calibri",Font.BOLD,20));
		add(bsuma);
		bsuma.addActionListener(this);
		
		bsiete.setBounds(22, 213, 60, 60);
		bsiete.setFont(new Font("calibri",Font.BOLD,20));
		add(bsiete);
		bsiete.addActionListener(this);
		
		bocho.setBounds(87, 213, 60, 60);
		bocho.setFont(new Font("calibri",Font.BOLD,20));
		add(bocho);
		bocho.addActionListener(this);
		
		bnueve.setBounds(152, 213, 60, 60);
		bnueve.setFont(new Font("calibri",Font.BOLD,20));
		add(bnueve);
		bnueve.addActionListener(this);
		
		bresta.setBounds(217, 213, 92, 60);
		bresta.setFont(new Font("calibri",Font.BOLD,20));
		add(bresta);
		bresta.addActionListener(this);
		
		bmult.setBounds(22, 278, 60, 60);
		bmult.setFont(new Font("calibri",Font.BOLD,20));
		add(bmult);
		bmult.addActionListener(this);
		
		bcero.setBounds(87, 278, 60, 60);
		bcero.setFont(new Font("calibri",Font.BOLD,20));
		add(bcero);
		bcero.addActionListener(this);
		
		bdiv.setBounds(152, 278, 60, 60);
		bdiv.setFont(new Font("calibri",Font.BOLD,20));
		add(bdiv);
		bdiv.addActionListener(this);
		
		bpunto.setBounds(217, 278, 92, 60);
		bpunto.setFont(new Font("calibri",Font.BOLD,20));
		add(bpunto);
		bpunto.addActionListener(this);
		
		bigual.setBounds(22, 343, 288, 60);
		bigual.setFont(new Font("calibri",Font.BOLD,20));
		add(bigual);
		bigual.addActionListener(this);
		
	}
	
	
	public static void main(String[] args) {
		new  CalculadoraEstandar();

	}

	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == buno) {            //si el clic viene del boton x
			
			                                    
			if(pantalla.getText() == "") {      //voy a preguntar si la pantalla esta vacia, si lo esta!
				
				                                  
			pantalla.setText("1");              //Voy a poner el numero x    
		
			}
			
			else {                                               //si no esta vacia    
				pantalla.setText(pantalla.getText() + "1");      //voy a poner en la pantalla lo que tiene la patalla, mas x
				
				
			}
			
		}
			
		if (e.getSource() == bdos) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("2");
			
			}
		
			else {
			
				pantalla.setText(pantalla.getText() + "2");
			}
		
		}
		
		if(e.getSource() == btres) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("3");
			}
			
			else {
				pantalla.setText(pantalla.getText() + "3");
			}
		}
		
		if(e.getSource() == bcuatro) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("4");
			}
			
			else {
				pantalla.setText(pantalla.getText() + 4);
			}
		}
		
		if(e.getSource() == bcinco) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("5");
				
			}
			else {
				pantalla.setText(pantalla.getText() + 5);
			}
			
		}
		
		if(e.getSource() == bseis) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("6");
			}
			
			else {
				pantalla.setText(pantalla.getText() + 6);
				
			}
		}
		
		if(e.getSource() == bsiete) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("7");
			}
			
			else {
				pantalla.setText(pantalla.getText() + 7);
			}
		}
		
		if(e.getSource() == bocho) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("8");
			}
			
			else {
				pantalla.setText(pantalla.getText() + 8);
			}
		}
		
		if(e.getSource() == bnueve) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("9");
			}
			
			else {
				pantalla.setText(pantalla.getText() + 9);
			}
		}
		
		if(e.getSource() == bcero) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("0");
			}
			else {
				pantalla.setText(pantalla.getText() + 0);
			}
		}
		
		if(e.getSource() == bsuma) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("+");
			}
			else {
				pantalla.setText(pantalla.getText() + "+");
			}
		}
		
		if(e.getSource() == bresta) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("-");
			}
			else {
				pantalla.setText(pantalla.getText() + "-");
			}
		}
		
		if(e.getSource() == bmult) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("*");
			}
			else {
				pantalla.setText(pantalla.getText() + "*");
			}
		}
		
		if(e.getSource() == bdiv) {
			
			if(pantalla.getText() == "") {
				pantalla.setText("/");
			}
			else {
				pantalla.setText(pantalla.getText() + "/");
			}
		}
		
		if(e.getSource() == bpunto) {
			
			if(pantalla.getText() == "") {
				pantalla.setText(".");
			}
			else {
				pantalla.setText(pantalla.getText() + ".");
			}
		}
		
		if(e.getSource() == bborrar) {
			
			pantalla.setText("");
		}
		
		if(e.getSource() == bigual) {
			
			String cadena = pantalla.getText();
			
			
				for(int i=0; i < cadena.length()  ; ++i) {
					
					char caracter = cadena.charAt(i);
						
						if(caracter == '+') {
							 
							String primeraparte = cadena.substring(0,i);
							String segundaparte = cadena.substring(i+1,cadena.length());
							
							double resultado = Double.parseDouble(primeraparte) + Double.parseDouble(segundaparte);
							
							pantalla.setText(Double.toString(resultado));
							
						}
						
						if(caracter == '-') {
							 
							String primeraparte = cadena.substring(0,i);
							String segundaparte = cadena.substring(i+1,cadena.length());
							
							double resultado = Double.parseDouble(primeraparte) - Double.parseDouble(segundaparte);
							
							pantalla.setText(Double.toString(resultado));
							
						}
						
						if(caracter == '*') {
							 
							String primeraparte = cadena.substring(0,i);
							String segundaparte = cadena.substring(i+1,cadena.length());
							
							double resultado = Double.parseDouble(primeraparte) * Double.parseDouble(segundaparte);
							
							pantalla.setText(Double.toString(resultado));
							
						}
						
						if(caracter == '/') {
							 
							String primeraparte = cadena.substring(0,i);
							String segundaparte = cadena.substring(i+1,cadena.length());
							
								double cero = Double.parseDouble(segundaparte);
								
								if(cero == 0) {
									
									pantalla.setText("No exite division entre 0");
								}
								else {
									
								
							
									double resultado = Double.parseDouble(primeraparte) / Double.parseDouble(segundaparte);
							
									pantalla.setText(Double.toString(resultado));
							
								}
								
						}
					
						
				}
		}
		
		
	}

}
