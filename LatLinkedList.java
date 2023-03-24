import java.util.LinkedList;

public class LatLinkedList {
    public static void main(String[] args) {
        LinkedList<String>hewan = new LinkedList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan. add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        LinkedList<String> DeleteHewan = new LinkedList<>();

        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        //menampilkan data awal hewan
        System.out.println("Data awal hewan :");
        System.out.println(hewan);

        for(int i = 0; i < DeleteHewan.size(); i++){
            hewan.remove(DeleteHewan.get(i));
        }
        System.out.println("\nData yang dihapus :");
        System.out.println(DeleteHewan);
        System.out.println("\nOutput hewan :");
        System.out.println(hewan);
    }
}
