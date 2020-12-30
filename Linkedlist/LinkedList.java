public class LinkedList{
    Node first;

    public LinkedList(){
        first = null;
    }

    public LinkedList insertLast(LinkedList list, int data){
        Node P = new Node(data);
        P.next = null;

        if(list.first==null){
            list.first = P;
        }
        else{
            Node temp;
            temp = list.first;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = P;
        }
        return list;
    }

    public void printInfo(LinkedList list){
        Node P;
        P = list.first;
        while(P!=null){
            System.out.print(P.info + " ");
            P = P.next;
        }
    }

    public LinkedList insertFirst(LinkedList list, int data){
        Node P = new Node(data);
        P.next = null;

        if(list.first==null){
            //list.first = P;
            insertLast(list,data);
        }
        else{
            P.next = list.first;
            list.first = P;
        }
        return list;
    }

    public LinkedList insertAfter(LinkedList list, int data, int index){
        Node P = new Node(data);
        P.next = null;

        if(list.first==null){
            System.out.println("List Kosong");
        }
        else{
            Node temp;
            temp = list.first;
            int i = 0;
            while(i<index-1 && temp!=null){
                temp = temp.next;
                i++;
            }
            if(temp!=null){
                P.next = temp.next;
                temp.next = P;
            }
            else{
                System.out.println("Data Kosong");
            }
        }
        return list;
    }

    public LinkedList deleteFirst(LinkedList list){
        if(list.first==null){
            System.out.println("list kosong");
        }
        else{
            Node temp = list.first;
            list.first = temp.next;
            temp.next = null;
            System.out.println("Nilai yang dihapus : " +temp.info);
        }
        return list;
    }

    public LinkedList deleteLast(LinkedList list){
        if(list.first==null){
            System.out.println("list kosong");
        }
        else{
            Node temp = null;
            Node last = list.first;
            while(last.next != null){
                temp = last;
                last = last.next;
            }
            temp.next = null;
            System.out.println("Nilai yang dihapus : " +last.info);
        }
        return list;
    }

    public LinkedList deleteAfter(LinkedList list, int index){
        if(list.first==null){
            System.out.println("List Kosong");
        }
        else{
            Node temp = list.first;
            int i = 0;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            Node P = temp.next;
            temp.next = P.next;
            P.next = null;
            System.out.println("Nilai yang dihapus : " +P.info);
        }
        return list;
    }
}