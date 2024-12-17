public class Stack {
    NodeStack top;

    public void push(String action, String nama_pegawai, String posisi) {
        NodeStack newNode = new NodeStack(action, nama_pegawai, posisi);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public NodeStack pop() {
        if (top == null) {
            System.out.println("Tidak ada aksi untuk di-undo.");
            return null;
        }
        NodeStack temp = top;
        top = top.next;
        temp.next = null;
        return temp;
    }

    public void display() {
        NodeStack temp = top;
        System.out.println("Stack Undo Actions:");
        while (temp != null) {
            System.out.println("Aksi: " + temp.action + ", Nama Pegawai: " + temp.nama_pegawai + ", Posisi: " + temp.posisi);
            temp = temp.next;
        }
    }
}
