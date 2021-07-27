import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.time.LocalDate;

public class FormWarga {
    private JPanel panelUtama;
    private JLabel wargaRT04;
    private JPanel bagianInput;
    private JPanel bagianTabel;
    private JTable tableWarga;
    private JLabel labelTanggal;
    private JLabel labelNama;
    private JTextField inputNama;
    private JTextField tanggalTerkini;
    private JLabel jumlahWarga;
    private JLabel labelTahun;
    private JTextField tampilanJiwa;
    private JTextField tampilkanTahun;

    //menggunakan library javax.swing.LocalDate
    //untuk menampilkan tanggal terkini.
    // (diambil dari komputer kita sendiri)

    //format default/standarnya adalah YYYY-mm-dd
    // tahun-bulan-hari
    LocalDate tanggal =LocalDate.now();

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormWarga");
        frame.setContentPane(new FormWarga().panelUtama);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void tampilkanData(){
        //atur teks supaya rata tengah
        DefaultTableCellRenderer rataTengah=new DefaultTableCellRenderer();
        rataTengah.setHorizontalAlignment(JLabel.CENTER);

        //membuat <th> /table head untuk JTable
        DefaultTableModel kerangkaTabel = new DefaultTableModel();
        kerangkaTabel.addColumn("Nomor");
        kerangkaTabel.addColumn("Nama Warga");
        kerangkaTabel.addColumn("Alamat Rumah");

        tableWarga.setModel(kerangkaTabel);
    }

    public FormWarga() {
        String jadiText=String.valueOf(tanggal);
        tanggalTerkini.setText(jadiText);




        //mengubah teks di dalam JTextField bernama tanggalTerkini
        //menjadi rata tengah
        tanggalTerkini.setHorizontalAlignment(JTextField.CENTER);


    }
}
