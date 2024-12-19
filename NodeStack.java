public class NodeStack {
    String action; 
    String nama_pegawai;
    String posisi;
    NodeStack next;

    public NodeStack(String action, String nama_pegawai, String posisi) {
        this.action = action;
        this.nama_pegawai = nama_pegawai;
        this.posisi = posisi;
        this.next = null;
    }
}
//test