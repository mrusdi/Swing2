import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Data extends JFrame {
    JLabel ljudul,lnama,lnim,ljk,ljurusan,lalamat,ldosen;
    JTextField nama,nim,alamat,dosen;
    JRadioButton rbPria,rbWanita;
    String[] namaJurusan = {"Teknik Informatika","sistem informasi","Teknik Industri","Teknik Kimia"};
    JComboBox cmbJurusan;
    JButton tambah;
    JButton tampil;

    public void DataDiri(){
        ljudul = new JLabel("DATA DIRI MAHASISWA");
        lnama = new JLabel("Nama ");
        lnim = new JLabel("NIM ");
        ljk = new JLabel("Jenis Kelamin ");
        ljurusan = new JLabel("Jurusan ");
        ldosen = new JLabel("Dosen Wali");
        lalamat = new JLabel("Alamat ");
        tampil = new JButton("Tampil data");
        tambah = new JButton("Tambah data");
        nama = new JTextField();
        nim = new JTextField();
        alamat = new JTextField();
        dosen = new JTextField();
        rbPria = new JRadioButton("L");
        rbWanita = new JRadioButton("P");

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);


        cmbJurusan = new JComboBox(namaJurusan);


        setLayout(null);
        add(ljudul);
        add(lnama);
        add(lnim);
        add(ljk);
        add(ljurusan);
        add(lalamat);
        add(dosen);
        add(nama);
        add(nim);
        add(alamat);
        add(ldosen);
        add(rbPria);
        add(rbWanita);
        add(cmbJurusan);
        add(tampil);
        add(tambah);

        ljudul.setBounds(200,50,170,20);
        lnama.setBounds(100,70,130,30);
        lnim.setBounds(100,110,130,30);
        ljk.setBounds(100,150,120,30);
        ljurusan.setBounds(100,190,120,30);
        lalamat.setBounds(100,230,120,30);
        ldosen.setBounds(100,270,120,30);

        nama.setBounds(250,80,110,20);
        nim.setBounds(250,120,110,20);
        rbPria.setBounds(270,160,50,20);
        rbWanita.setBounds(330,160,50,20);
        cmbJurusan.setBounds(250,200,110,20);
        alamat.setBounds(250,230,200,20);
        dosen.setBounds(250,270,200,20);
        tampil.setBounds(370,320,150,20);
        tambah.setBounds(150,320,150,20);
        
        tampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String nam= nama.getText();
                String nm= nim.getText();
                String dsn =dosen.getText();
                String alm =alamat.getText();
                String jrs= cmbJurusan.getSelectedItem().toString();
                String ljk;
                if (rbPria.isSelected()){
                    ljk= " L ";
                    JOptionPane.showMessageDialog(rootPane,"hallo saya "+ nam+"\n beerjenis kelamin"+ ljk+"\n nim "+ nm+
                            "\n Beralamat di "+alm +"\n jurusan "+ jrs+ "\n dan dosen wali saya adalah" +dsn+"\n");
                }
                else if (rbWanita.isSelected()){
                    ljk= " P ";
                    JOptionPane.showMessageDialog(rootPane,"hallo saya "+ nm+"\n berjenis kelamin"+ ljk+"\n nim "+ nm+
                            "\n Beralamat di "+alm +"\n jurusan"+ jrs+ "\n dan dosen wali saya adalah " +dsn+"\n");
                }
                      
            }
            
        });
        
        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}