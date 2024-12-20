public class LinkedList {
    NodeLinked head;
    NodeLinked tail;

    public void add_last(String nama_pegawai,String posisi){
        NodeLinked newnode = new NodeLinked(nama_pegawai, posisi);
        if(head==null){
            head = newnode;
            tail = newnode;
        }else{
            newnode.prev = newnode;
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void delete_mid(String nama_pegawai){
        if(head==null){
            System.out.println("tidak ada pegawai");
        }else{
            NodeLinked temp = head;
            while(!temp.nama_pegawai.equals(nama_pegawai)&&temp!=null){
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.prev = null;
            temp.next= null;
        }
    }

    public void display(){
        NodeLinked temp = head;
        System.out.println("");
        while(temp!=null){
            
            System.out.println("Nama : " + temp.nama_pegawai + " Posisi: " + temp.posisi);
            temp = temp.next;
        }
    }
    
    public NodeLinked searchPegawai(String nama){
        NodeLinked curr = head;
        while(curr!=null){
            if(curr.nama_pegawai.equals(nama)){
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    public void editData(NodeLinked node, String atr, String dataBaru){
        if(atr.equals("nama")){
            node.nama_pegawai = dataBaru;
        }
        if(atr.equals("posisi")){
            node.posisi = dataBaru;
        }
    }

}
