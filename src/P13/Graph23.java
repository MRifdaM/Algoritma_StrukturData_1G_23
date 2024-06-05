package P13;

public class Graph23 {
    int vertex;
    DoubleLinkedList list[];

    public Graph23(int v){
        vertex = v;
        list = new DoubleLinkedList[v];
        for(int i = 0; i < v; i++){
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++){
            for (int j = 0; j < list[i].size; j++){
                if(list[i].get(j) == asal){
                    ++totalIn;
                }
            }

            for (k = 0; k < list[asal].size; k++){
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari gedung " + (char) ('A' +asal) + ": " + totalIn);
        System.out.println("OutDegree dari gedung " + (char) ('A' +asal) + ": " + totalOut);
        System.out.println("Degree dari gedung " + (char) ('A' +asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdge(){
        for (int i =0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++){
            if(list[i].size() > 0){
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size();j++){
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
