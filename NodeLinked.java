public class NodeLinked{
    String nama_pegawai;
    String posisi;
    NodeLinked next;
    NodeLinked prev;

    public NodeLinked(String nama_pegawai,String posisi){
        this.nama_pegawai=nama_pegawai;
        this.posisi=posisi;
        this.next = null;
        this.prev = null;
    }
}