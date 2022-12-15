package teamwork_12122022;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class TextEditor extends JFrame {
    public TextEditor() {
        super("Metin Düzenleyici");

        JMenuBar menuBar = new JMenuBar();

        JMenu dosyaMenu = new JMenu("Dosya");
        JMenu düzenMenu = new JMenu("Düzen");
        JMenu biçimMenu = new JMenu("Biçim");

        menuBar.add(dosyaMenu);
        menuBar.add(düzenMenu);
        menuBar.add(biçimMenu);

        JMenuItem aç = new JMenuItem("Aç");
        JMenuItem kaydet = new JMenuItem("Kaydet");
        JMenuItem çıkış = new JMenuItem("Çıkış");

        dosyaMenu.add(aç);
        dosyaMenu.add(kaydet);
        dosyaMenu.addSeparator();
        dosyaMenu.add(çıkış);

        JMenuItem kes = new JMenuItem("Kes");
        JMenuItem kopyala = new JMenuItem("Kopyala");
        JMenuItem yapistir = new JMenuItem("Yapıştır");

        düzenMenu.add(kes);
        düzenMenu.add(kopyala);
        düzenMenu.add(yapistir);

        JMenuItem yazitipi = new JMenuItem("Yazı Tipi");
        JMenuItem renk = new JMenuItem("Renk");
        JMenuItem arkaplan = new JMenuItem("Arkaplan");

        biçimMenu.add(yazitipi);
        biçimMenu.add(renk);
        biçimMenu.add(arkaplan);



        setJMenuBar(menuBar);

        JTextArea textArea = new JTextArea(20, 80);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(textArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screensize.width-getWidth())/2, (screensize.height-getHeight())/2);


        aç.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(TextEditor.this);

            }
        });

        kaydet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showSaveDialog(TextEditor.this);

            }
        });

        çıkış.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

