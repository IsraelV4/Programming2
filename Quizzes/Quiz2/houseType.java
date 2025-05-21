package Quizzes.Quiz2;

public class houseType {
    public static void main(String[] args) {
        House one = new House();
        House two = new House("1", "2", "3", 4, 5.2);
        House[] arr = new House[] {one, two};
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(arr[i].getname());
            arr[i].setname(arr[i].getname()+" hi");
            System.out.println(arr[i].getname());
            System.out.println(arr[i].getcolor());
            arr[i].setcolor(arr[i].getcolor()+" hi");
            System.out.println(arr[i].getcolor());
            System.out.println(arr[i].getaddress());
            arr[i].setaddress(arr[i].getaddress()+" hi");
            System.out.println(arr[i].getaddress());
            System.out.println(arr[i].getrooms());
            arr[i].setrooms(arr[i].getrooms() - 2);
            System.out.println(arr[i].getrooms());
            System.out.println(arr[i].getheight());
            arr[i].setheight(arr[i].getheight()*20);
            System.out.println(arr[i].getheight());
            System.out.println(arr[i]);
        }
    }
}