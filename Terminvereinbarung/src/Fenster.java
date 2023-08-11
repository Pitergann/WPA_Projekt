import java.awt.EventQueue;					//von auserhalb importierte Medien
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTable;

public class Fenster extends JFrame {

	/**erstellen von Instanzvariablen welche über 
	 * alle Methoden innerhalb dieser Classe genutzt werden können
	 */
	private static final long serialVersionUID = 1L;		
	private CardLayout cl;
	private JPanel contentPane;
	private JPanel wilko;				
	private JPanel carInfo;
	private JPanel kalender;
	private JPanel kontakt;
	private JPanel zsm;
	private static boolean cb1;	
	private static boolean cb2;
	private static boolean cb3;
	private static boolean cb4;
	private Termin termin;
	private JDateChooser dateChooser;
    private String chdate;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		//Main Methode Initialisiert den Main Frame auf welchem sich alles abspielt
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenster frame = new Fenster();
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
	public Fenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//Einstellungen für den Main Frame
		setBounds(100, 100, 520, 300);							// größe
		
		
		
		
		/*
		 * hier wir die "Tafel" welche beschrieben wir erstellt, sie bietet 
		 * auch den Raum für die später folgenden Seiten in form von weiteren Panels
		 * 
		 * */
		contentPane = new JPanel();								
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));		// Rand der Tafel zu ihrem Ramen Fenster
		cl = new CardLayout(0, 0);								// Das Layout damit mehrere Karten übereinander gestapelt werden können
		setContentPane(contentPane);
		contentPane.setLayout(cl);								// layout auf die Tafel gebracht
		
		
		wilko = new JPanel();									//erste Sichtbare Tafel in unserem Kartensystem
		contentPane.add(wilko, "1");							// erste Tafel hier vergabe des Indexes 1 in system der Karten in der contentPane
		
		wilko.setBackground(new Color(135, 206, 235));			//farbe für hintergrund bei allen folgenden gleich
		wilko.setLayout(null);									//layout hier in x und y koordinaten für alle elemente auf dieser Seite
																// Layout und farme wird für alle folgenden seiten übernommen
		JLabel lblWilko = new JLabel("Willkommen");						//erstes Element auf der Seite ein Text keiner interagtion
		lblWilko.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));	//Formatierung des textes
		lblWilko.setForeground(Color.WHITE);
		lblWilko.setHorizontalAlignment(SwingConstants.CENTER);
		lblWilko.setBounds(194, 50, 114, 26);
		wilko.add(lblWilko);									//bringt element auf die jeweilige seite ähnlich bei jedem element
		
		JButton btnTermin = new JButton("Termin vereinbaren");	// knopf mit formatierung benötigt etwas das die interaktion mit der Maus bemerkt
		btnTermin.setBounds(153, 140, 200, 23);
		wilko.add(btnTermin);
		
		JLabel lblNewLabel_1 = new JLabel("Autowerkstatt Schmidt");			
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(171, 99, 164, 14);
		wilko.add(lblNewLabel_1);
		
		btnTermin.addActionListener(new ActionListener() {		//ermöglicht dem Knopf  Interaktion mit ihm war zu nehmen

			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "2");						//definiert was bei interaktion passiert hier wir zu seite mit index 2 in System content pane gewechselt
			}
			
		});
		
		carInfo = new JPanel();									// nächste seit index zwei ähnliche formatierung
		contentPane.add(carInfo, "2");
		carInfo.setBackground(new Color(135, 206, 235));
		carInfo.setLayout(null);
		/*
		 * mehr Elemente um alle informationen über das Auto auf zu nehmen. 
		 * zu jedem Textfeld gibt es eine beschriftung in form eines Label
		 * */
		JLabel lblInfo = new JLabel("bitte tragen sie die Informationen");
		lblInfo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblInfo.setVerticalAlignment(SwingConstants.TOP);
		lblInfo.setHorizontalAlignment(SwingConstants.LEFT);
		lblInfo.setBounds(12, 11, 251, 20);
		lblInfo.setForeground(Color.WHITE);
		carInfo.add(lblInfo);
		
		JLabel lblMarke = new JLabel("Marke");
		lblMarke.setForeground(Color.WHITE);
		lblMarke.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMarke.setBounds(30, 60, 37, 14);
		carInfo.add(lblMarke);
		
		JLabel lblModell = new JLabel("Modell");
		lblModell.setForeground(Color.WHITE);
		lblModell.setHorizontalAlignment(SwingConstants.TRAILING);
		lblModell.setBounds(18, 90, 49, 14);
		carInfo.add(lblModell);
		
		JLabel lblBaujahr = new JLabel("Baujahr");
		lblBaujahr.setForeground(Color.WHITE);
		lblBaujahr.setHorizontalAlignment(SwingConstants.TRAILING);
		lblBaujahr.setBounds(18, 120, 49, 14);
		carInfo.add(lblBaujahr);
		
		JLabel lblKennezichen = new JLabel("Kennzeichen");
		lblKennezichen.setForeground(Color.WHITE);
		lblKennezichen.setHorizontalAlignment(SwingConstants.TRAILING);
		lblKennezichen.setBounds(-3, 150, 70, 14);
		carInfo.add(lblKennezichen);
		
		JLabel lblCarDisc = new JLabel("über ihr Auto ein:");
		lblCarDisc.setForeground(Color.WHITE);
		lblCarDisc.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblCarDisc.setBounds(12, 29, 131, 14);
		carInfo.add(lblCarDisc);
		/*
		 * Textfelder ermöglichen die eingabe von Informationen
		 * hier noch zu implementieren sind ActionListener welche die informationen an die Atribute der Objekte verknüpfen
		 * */
		JTextField textMarke = new JTextField();
		textMarke.setBounds(77, 57, 150, 20);
		carInfo.add(textMarke);
		textMarke.setColumns(10);
		
		
		JTextField textModell = new JTextField();
		textModell.setBounds(77, 87, 150, 20);
		carInfo.add(textModell);
		textModell.setColumns(10);
		
		JTextField textBaujahr = new JTextField();
		textBaujahr.setBounds(77, 117, 150, 20);
		carInfo.add(textBaujahr);
		textBaujahr.setColumns(10);
		
		JTextField textKennz = new JTextField();
		textKennz.setBounds(77, 147, 150, 20);
		carInfo.add(textKennz);
		textKennz.setColumns(10);
		
		JLabel lblDinstleist = new JLabel("Welche dienstleistung ist Gewünscht");
		lblDinstleist.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblDinstleist.setForeground(Color.WHITE);
		lblDinstleist.setBounds(256, 14, 245, 14);
		carInfo.add(lblDinstleist);
		
		/*
		 *Checkboxen um zu wählen was getan werden sol, da auch mehrere sachen auf einmal bearbeitet werden können multiblechoic
		 *sie verfügen uber einen action listener welcher dann das Attribut anpasst 
		 * */
		
		JCheckBox chckbxÖl = new JCheckBox("Öl-/ Reifenwechsel");
		chckbxÖl.setBounds(279, 56, 197, 23);
		carInfo.add(chckbxÖl);
		cb1 = false;
		chckbxÖl.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(cb1==false) {								//if schleife da die aktion beim hächen setzen eine andere is als wenn man das häckchen entfernt
					cb1=true;									// setzt man das häckchen wird die dauer des termins um den für die Reparatur gesetzten wert erhöht
					termin.setDuration(termin.durationÖl());
					//System.out.println(termin.Duration);    um funktion zu testen
				}
				else{
					cb1=false;									// wird häckchen wieder entfernt geht die Zeit auf ursprungs niveu zurück
					termin.dontChoose();
					//System.out.println(termin.Duration);
				}
			}
			
		});
			// wiederholt sich für alle chckbx.....
		JCheckBox chckbxReinigung = new JCheckBox("Grundreinigung");
		chckbxReinigung.setBounds(279, 86, 197, 23);
		carInfo.add(chckbxReinigung);
		cb2 = false;
		chckbxReinigung.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(cb2==false) {
					cb2=true;
					termin.setDuration(termin.durationClean());
					//System.out.println(termin.Duration);
				}
				else{
					cb2=false;
					termin.dontChoose();
					//System.out.println(termin.Duration);
				}
			}
			
		});
		
		JCheckBox chckbxTüv = new JCheckBox("TÜV / Hauptuntersuchung");
		chckbxTüv.setBounds(279, 116, 197, 23);
		carInfo.add(chckbxTüv);
		cb3 = false;
		chckbxTüv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(cb3==false) {
					cb3=true;
					termin.setDuration(termin.durationTÜV());
					//System.out.println(termin.Duration);
				}
				else{
					cb3=false;
					termin.dontChoose();
					//System.out.println(termin.Duration);
				}
			}
			
		});
		
		JCheckBox chckbxGespräch = new JCheckBox("Beratungsgespräch / Trubbleshoot");
		chckbxGespräch.setBounds(279, 146, 197, 20);
		carInfo.add(chckbxGespräch);
		cb4 = false;
		chckbxGespräch.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(cb4==false) {
					cb4=true;
					termin.setDuration(termin.durationGespr());
					//System.out.println(termin.Duration);
				}
				else{
					cb4=false;
					termin.dontChoose();
					//System.out.println(termin.Duration);
				}
			}
			
		});
		
		// std. next Knopf änbdert die seite auf nächte mittels index
		JButton btnNext2 = new JButton("Next");
		btnNext2.setBounds(215, 200, 70, 20);
		carInfo.add(btnNext2);
		
		
		btnNext2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "3");
			}
			
		});
		//dritte seite ächnliche formatierung neue elemente
		kalender = new JPanel();
		kalender.setBackground(new Color(135, 206, 235));
		kalender.setLayout(null);
		contentPane.add(kalender, "3");
		
		 //dateStorage = new DateStorage();						//benötigen ein lager welches das datum speichert und in ein String wandelt

		 if(termin == null){									// da der Termin am anfang nicht gewählt ist wir hier ein grund Element eingefügt für NullPointerException
		        termin = new Termin("8", "01.07.1999", 0);
		    }
		 
		 dateChooser = new JDateChooser();						// element um das Datum auzuwählen aus Java Bibliothek und zugehörige formatierung
	        dateChooser.setBounds(141, 82, 200, 30);
	        kalender.add(dateChooser);

				
		JLabel lblDate = new JLabel("Bitte wählen sie ihren Wunsch Tag");
		lblDate.setForeground(Color.WHITE);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDate.setBounds(141, 36, 218, 14);
		kalender.add(lblDate);
		
		JLabel lblTime = new JLabel("Und eine Uhrzeit");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTime.setBounds(183, 128, 134, 14);
		kalender.add(lblTime);
		
		
		/*
		 * knöpfe um jeweilige uhrzeit aus zu wöhlen nach vorgegebenen timeslots der werkstatt 
		 * (können natürlich mehr und oder weniger sein)
		 * sie setzen wen die aktion durch geführt wurde das Attribut auf gewünschten wert
		 * kann sich mehrfach umentschieden werden überschreiben sich gegenseitig
		 * 
		 * */
		
		JButton btn8 = new JButton("8Uhr");
		btn8.setBounds(54, 162, 89, 23);
		kalender.add(btn8);
		btn8.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				termin.setTime("8");
			}
			
	});
		
		JButton btn10 = new JButton("10Uhr");
		btn10.setBounds(150, 162, 89, 23);
		kalender.add(btn10);
		btn10.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				termin.setTime("10");
			}
			
	});
		
		JButton btn12 = new JButton("12Uhr");
		btn12.setBounds(249, 162, 89, 23);
		kalender.add(btn12);
		btn12.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				termin.setTime("12");
			}
			
	});
		
		JButton btn14 = new JButton("14Uhr");
		btn14.setBounds(348, 162, 89, 23);
		kalender.add(btn14);
		btn14.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				termin.setTime("14");
			}
			
	});
			
			//zu nächsten seite
		JButton btnNext3 = new JButton("Next");
		btnNext3.setBounds(215, 200, 70, 20);
		kalender.add(btnNext3);
		
		
		btnNext3.addActionListener(new ActionListener() {
	
		
			public void actionPerformed(ActionEvent e) {
				
				SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); // welchseln des Formates des Datum zu String
				 chdate = dFormat.format(dateChooser.getDate());
				 termin.setDate(chdate);
				 System.out.print(termin.getDate());//kontrolle
				cl.show(contentPane, "4");
			}
			
	});
		
		//standart format label zu jedem eingabefeld
	kontakt = new JPanel();
	contentPane.add(kontakt, "4");
	kontakt.setBackground(new Color(135, 206, 235));
	
	kontakt.setLayout(null);
	
	JLabel lblKontaktinfo = new JLabel("Bitte geben sie ihre Kontaktinformationen an");
	lblKontaktinfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblKontaktinfo.setForeground(Color.WHITE);
	lblKontaktinfo.setBounds(10, 11, 280, 14);
	kontakt.add(lblKontaktinfo);
	
	JLabel lblNewName = new JLabel("Name");
	lblNewName.setHorizontalAlignment(SwingConstants.TRAILING);
	lblNewName.setBounds(46, 61, 49, 14);
	kontakt.add(lblNewName);
	
	JLabel lblVorname = new JLabel("Vorname");
	lblVorname.setHorizontalAlignment(SwingConstants.TRAILING);
	lblVorname.setBounds(46, 86, 49, 14);
	kontakt.add(lblVorname);
	
	JLabel lblStrNr = new JLabel("Straße, Hausnr.");
	lblStrNr.setHorizontalAlignment(SwingConstants.TRAILING);
	lblStrNr.setBounds(18, 111, 77, 14);
	kontakt.add(lblStrNr);
	
	JLabel lblPlz = new JLabel("Postleitzahl");
	lblPlz.setBounds(31, 136, 64, 14);
	kontakt.add(lblPlz);
	
	// eingabefeldern müssen listener hinzu gefügt werden welche attribute weitergeben
	
	
	JTextField textName = new JTextField();
	textName.setBounds(105, 58, 96, 20);
	kontakt.add(textName);
	textName.setColumns(10);
	
	JTextField textVorname = new JTextField();
	textVorname.setBounds(105, 83, 96, 20);
	kontakt.add(textVorname);
	textVorname.setColumns(10);
	
	JTextField textStrNr = new JTextField();
	textStrNr.setBounds(105, 108, 96, 20);
	kontakt.add(textStrNr);
	textStrNr.setColumns(10);
	
	JTextField textPlz = new JTextField();
	textPlz.setBounds(105, 133, 96, 20);
	kontakt.add(textPlz);
	textPlz.setColumns(10);
	
	JLabel lblTel = new JLabel("Telefon");
	lblTel.setHorizontalAlignment(SwingConstants.TRAILING);
	lblTel.setBounds(258, 61, 49, 14);
	kontakt.add(lblTel);
	
	JLabel lblMob = new JLabel("Mobil");
	lblMob.setHorizontalAlignment(SwingConstants.TRAILING);
	lblMob.setBounds(258, 86, 49, 14);
	kontakt.add(lblMob);
	
	JLabel lblMail = new JLabel("Mail");
	lblMail.setHorizontalAlignment(SwingConstants.TRAILING);
	lblMail.setBounds(279, 111, 28, 14);
	kontakt.add(lblMail);
	
	JTextField textTel = new JTextField();
	textTel.setBounds(317, 58, 96, 20);
	kontakt.add(textTel);
	textTel.setColumns(10);
	
	JTextField textMob = new JTextField();
	textMob.setBounds(317, 83, 96, 20);
	kontakt.add(textMob);
	textMob.setColumns(10);
	
	JTextField textMail = new JTextField();
	textMail.setBounds(317, 108, 96, 20);
	kontakt.add(textMail);
	textMail.setColumns(10);
	
	JCheckBox chckbxAGB = new JCheckBox("stimme den AGB´s & Datenspeicherungsrichtlinien zu");
	chckbxAGB.setBackground(new Color(135, 206, 235));
	chckbxAGB.setBounds(105, 165, 298, 23);
	kontakt.add(chckbxAGB);
	//einfügen von bedingnung dass nur weiter möglich wenn box mit hacken versehen
	
	//nächste Seite
	JButton btnNext4 = new JButton("Next");
	btnNext4.setBounds(215, 200, 70, 20);
	kontakt.add(btnNext4);
	
	btnNext4.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			System.out.print(termin.getDate());
			cl.show(contentPane, "5");
		}
		
	});
		//neue seite gleiche Formatireung
	zsm = new JPanel();
	contentPane.add(zsm, "5");
	zsm.setBackground(new Color(135, 206, 235));
	zsm.setLayout(null);
	
	//label welches alle eingaben zusammenfast für den nutzer
	JLabel lblNewLabel = new JLabel("Ihr Termin für den " + termin.getDate()   +"  "+ termin.getTime( )+ " Uhr gebucht.");
	
	// beinhaltet dynamische elemente welche mit methoden aus den klassen gefüllt werden
	// und seine Formatierung
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel.setBounds(32, 87, 428, 14);
	zsm.add(lblNewLabel);
	
	
	//zurück zu startseite mit index 1
	JButton btnStart = new JButton("Startseite");
	btnStart.setBounds(193, 192, 103, 23);
	zsm.add(btnStart);
	
	btnStart.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			System.out.println(termin.getDate());
			cl.show(contentPane, "1");
		}
		
	});
	
	
	

	
	}
}
