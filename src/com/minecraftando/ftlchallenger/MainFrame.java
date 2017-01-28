package com.minecraftando.ftlchallenger;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.PlainDocument;

import com.minecraftando.utils.JTextFieldLimit;

public class MainFrame {

	private JFrame mainFrame;
	private JTextField txtSeed;
	private static Font font;
	private JTextField txtNomeShip;
	private JTextField txtShipType;
	private JTextField txtPilotName;
	private JLabel btnGenerateFromSeed;
	private JLabel imagemBarco;
	private JLabel ch1title;
	private JLabel challenge1text;
	private JLabel challenge2text;
	private JLabel ch2title;
	private JLabel challenge3text;
	private JLabel ch3title;
	private JLabel separator;
	private Color gray = new Color(128,128,128);
	private JLabel bg_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				
		mainFrame = new JFrame();
		mainFrame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 8));
		mainFrame.setTitle("FTLCG: Faster Than Light Challenge Generator");
		mainFrame.setBounds(100, 100, 800, 480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		Image img = null;
		try{
			BufferedImage ftl = ImageIO.read(getClass().getResource("/ftl.png"));
			img = ftl;
		}catch (Exception e) {
			e.printStackTrace();
		}
		mainFrame.setIconImage(img);
		
		
		
		
//		mainFrame.setContentPane(bg);
		
		setFont();

		txtSeed = new JTextField(5);
		PlainDocument doc = (PlainDocument) txtSeed.getDocument();
		doc.setDocumentFilter(new JTextFieldLimit(5));
		txtSeed.setToolTipText("Here stands your seed. You can copy this for future runs, and use Generate from Seed!");
		txtSeed.setText("88888");
		Font fp = new Font(font.getFontName(), Font.PLAIN, 100);
		txtSeed.setFont(fp);
		txtSeed.setBounds(450, 43, 310, 100);
		txtSeed.setHorizontalAlignment(JTextField.CENTER);
		txtSeed.setOpaque(false);
		txtSeed.setBackground(new Color(0,0,0,0));
		txtSeed.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		txtSeed.setForeground(Color.white);
		mainFrame.getContentPane().add(txtSeed);

		imagemBarco = new JLabel("");
		imagemBarco.setOpaque(false);
		imagemBarco.setAlignmentX(Component.CENTER_ALIGNMENT);
		imagemBarco.setIcon(null);
		imagemBarco.setBounds(32, 50, 138, 100);
		mainFrame.getContentPane().add(imagemBarco);
		imagemBarco.setBackground(new Color(255,255,255,0));		
		imagemBarco.setHorizontalTextPosition(SwingConstants.CENTER);
		imagemBarco.setHorizontalAlignment(SwingConstants.CENTER);

		txtNomeShip = new JTextField();
		txtNomeShip.setEditable(false);
		txtNomeShip.setBounds(173, 54, 147, 45);
		mainFrame.getContentPane().add(txtNomeShip);
		txtNomeShip.setColumns(10);
		txtNomeShip.setOpaque(false);
		txtNomeShip.setForeground(Color.white);
		txtNomeShip.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txtNomeShip.setBackground(new Color(255, 255, 255, 0));
		Font txtNomeShipFont = new Font(font.getName(),Font.PLAIN,18);
		txtNomeShip.setFont(txtNomeShipFont);

		txtShipType = new JTextField();
		txtShipType.setEditable(false);
		txtShipType.setHorizontalAlignment(SwingConstants.CENTER);
		txtShipType.setOpaque(false);
		txtShipType.setBounds(270, 110, 50, 50);
		txtShipType.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txtShipType.setBackground(new Color(255,255,255,0));
		Font txtShipTypeFont = new Font(font.getName(),Font.PLAIN,18);
		txtShipType.setFont(txtShipTypeFont);
		txtShipType.setForeground(Color.white);
		mainFrame.getContentPane().add(txtShipType);
		txtShipType.setColumns(10);

		txtPilotName = new JTextField();
		txtPilotName.setEditable(false);
		txtPilotName.setBounds(173, 110, 93, 42);
		txtPilotName.setOpaque(false);
		txtPilotName.setFont(txtShipTypeFont);
		txtPilotName.setBackground(new Color(255,255,255,0));
		txtPilotName.setForeground(Color.white);
		txtPilotName.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		mainFrame.getContentPane().add(txtPilotName);
		txtPilotName.setColumns(10);

		challenge1text = new JLabel("");
		challenge1text.setHorizontalAlignment(SwingConstants.CENTER);
		challenge1text.setForeground(gray);
		Font challengefont = new Font(font.getFontName(), Font.PLAIN, 12);
		challenge1text.setBorder(null);
		challenge1text.setAlignmentX(0.5f);
		challenge1text.setBounds(29, 220, 278, 50);
		mainFrame.getContentPane().add(challenge1text);
		challenge1text.setFont(challengefont);

		btnGenerateFromSeed = new JLabel("");
		btnGenerateFromSeed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				goRandom();
			}
		});
		// /Clique
		btnGenerateFromSeed.setBounds(450, 226, 310, 45);
		mainFrame.getContentPane().add(btnGenerateFromSeed);

		JLabel btnGenerateNewSeed = new JLabel("");
		btnGenerateNewSeed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random random = new Random();
				int randomSeed = random.nextInt(100000);
				txtSeed.setText(randomSeed + "");
				goRandom();
			}
		});
		btnGenerateNewSeed.setBounds(450, 284, 310, 111);
		mainFrame.getContentPane().add(btnGenerateNewSeed);

		ch1title = new JLabel("Challenge 1 Title");
		ch1title.setHorizontalAlignment(SwingConstants.CENTER);
		ch1title.setForeground(Color.WHITE);
		ch1title.setFont(challengefont);
		ch1title.setOpaque(false);
		ch1title.setBounds(20, 200, 300, 19);
		mainFrame.getContentPane().add(ch1title);

		challenge2text = new JLabel("");
		challenge2text.setHorizontalAlignment(SwingConstants.CENTER);
		challenge2text.setForeground(gray);
		challenge2text.setFont(challengefont);
		challenge2text.setBorder(null);
		challenge2text.setAlignmentX(0.5f);
		challenge2text.setBounds(32, 301, 278, 50);
		mainFrame.getContentPane().add(challenge2text);

		ch2title = new JLabel("Challenge 2 Title");
		ch2title.setOpaque(false);
		ch2title.setHorizontalAlignment(SwingConstants.CENTER);
		ch2title.setForeground(Color.WHITE);
		ch2title.setFont(challengefont);
		ch2title.setBounds(20, 281, 300, 19);
		mainFrame.getContentPane().add(ch2title);

		challenge3text = new JLabel("");
		challenge3text.setHorizontalAlignment(SwingConstants.CENTER);
		challenge3text.setForeground(gray);
		challenge3text.setFont(challengefont);
		challenge3text.setBorder(null);
		challenge3text.setAlignmentX(0.5f);
		challenge3text.setBounds(32, 381, 274, 50);
		mainFrame.getContentPane().add(challenge3text);

		ch3title = new JLabel("Challenge 3 Title");
		ch3title.setOpaque(false);
		ch3title.setHorizontalAlignment(SwingConstants.CENTER);
		ch3title.setForeground(Color.WHITE);
		ch3title.setFont(challengefont);
		ch3title.setBounds(20, 361, 300, 19);
		mainFrame.getContentPane().add(ch3title);
		
		separator = new JLabel("");
		Image im = null;;
		try {
			BufferedImage everything = ImageIO.read(getClass().getResourceAsStream("/Everything.png"));
			im = everything;
		}catch (Exception e ) {
			e.printStackTrace();
		}
		separator.setIcon(new ImageIcon(im));
		separator.setBounds(0, 0, 784, 442);
		mainFrame.getContentPane().add(separator);
		
		bg_1 = new JLabel("");
		bg_1.setBounds(0, 0, 784, 442);
		mainFrame.getContentPane().add(bg_1);
		

		BufferedImage img1 = null;
		try {
			img1 = ImageIO.read(getClass().getResourceAsStream("/Background.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg = img1.getScaledInstance(bg_1.getWidth(), bg_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon background = new ImageIcon(dimg);
		bg_1.setIcon(background);

	}

	private void setFont() {
		try {
		     GraphicsEnvironment ge = 
		         GraphicsEnvironment.getLocalGraphicsEnvironment();
		     InputStream file = getClass().getResourceAsStream("CW_BITMP.TTF");
		     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, file));
		} catch (IOException|FontFormatException e) {
		     //Handle exception
		}
		
		font = new Font("Bitmap", Font.PLAIN, 64);
		
		
	}

	public JLabel getBtnGenerateFromSeed() {
		return btnGenerateFromSeed;
	}

	private void goRandom() {
		Integer seed = Integer.parseInt(txtSeed.getText());
		
		if (seed == 12345) {
			goRandomSeeded();
			return;
		}

		Random random = new Random(seed);

		int nBarcos = Boats.values().length;
		Boats boat = Boats.values()[random.nextInt(nBarcos)];
		String nome = boat.getNome();
		String type = boat.getType();
		String nomeDoPiloto = FTLChallenger.choose("/names.txt", random);
		ImageIcon icon = boat.getImage();

		Challenge ch = new Challenge(ChallengeType.random(random), boat, random);
		String[] challenge1 = ch.getChallenge();
		ch1title.setText(challenge1[0]);
		challenge1text.setText("<html><center>" + challenge1[1] + "</center></html>");

		Challenge ch2 = new Challenge(ChallengeType.random(random), boat, random);
		String[] challenge2 = ch2.getChallenge();
		ChallengeType teste1 = ch.getType();
		ChallengeType teste2 = ch2.getType();
		while (teste1.equals(teste2)) {
			ch2 = new Challenge(ChallengeType.random(random), boat, random);
			teste2 = ch2.getType();
			challenge2 = ch2.getChallenge();
		}
		ch2title.setText(challenge2[0]);
		challenge2text.setText("<html><center>" + challenge2[1] + "</center></html>");

		Challenge ch3 = new Challenge(ChallengeType.random(random), boat, random);
		String[] challenge3 = ch3.getChallenge();
		ChallengeType ch2title = ch2.getType();
		ChallengeType ch1title = ch.getType();
		ChallengeType ch3title = ch3.getType();

		while (ch3title.equals(ch2title) || ch3title.equals(ch1title)) {
			ch3 = new Challenge(ChallengeType.random(random), boat, random);
			ch3title = ch3.getType();
			challenge3 = ch3.getChallenge();
		}
		this.ch3title.setText(challenge3[0]);
		challenge3text.setText("<html><center>" + challenge3[1] + "</center></html>");

		txtNomeShip.setText(nome);
		txtShipType.setText(type);
		imagemBarco.setIcon(icon);
		txtPilotName.setText(nomeDoPiloto);
	}

	private void goRandomSeeded() {

		Boats boat = Boats.FEDERATION_CRUISER_A;
		String nome = boat.getNome();
		String type = boat.getType();
		String nomeDoPiloto = "Yanto";
		ImageIcon icon = boat.getImage();
		
		ch1title.setText("That needs an upgrade!");
		challenge1text.setText("<html><center>" + "You must upgrade your Weapons to the max first!" +  "</center></html>");

		ch2title.setText("Moral High Ground");
		challenge2text.setText("<html><center>" + "No cloaking or mind controlling allowed" + "</center></html>");


		this.ch3title.setText("A painful enemy");
		challenge3text.setText("<html><center>" + "You cannot attack Engi ships" + "</center></html>");

		txtNomeShip.setText(nome);
		txtShipType.setText(type);
		imagemBarco.setIcon(icon);
		txtPilotName.setText(nomeDoPiloto);
		
	}

	public JLabel getImagemBarco() {
		return imagemBarco;
	}

	public JLabel getCh1title() {
		return ch1title;
	}

	public JLabel getCh2title() {
		return ch2title;
	}

	public JLabel getChallenge2image_1() {
		return challenge3text;
	}


	public JLabel getCh3title() {
		return ch3title;
	}
}
