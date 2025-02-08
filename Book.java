 import java.util.Scanner;

 class Book {
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        String brands[] = new String[6];
        int pages[] = new int[6];
        double price[] = new double[6];

        System.out.println("Enter Book Details");

        for(int i=0; i<6; i++) {
            System.out.print("Book" + (i+1) + ":-" + "\n");
            System.out.print("Enter brand name: ");
            brands[i] = obj.nextLine();

            System.out.print("Enter pages: ");
            pages[i] = obj.nextInt();

            System.out.print("Enter price: ");
            price[i] = obj.nextDouble();
            
            System.out.println("");
            obj.nextLine();
        }

       System.out.println("<<< BOOK DETAILS >>>");

       for (int i=0; i<6; i++) {
        System.out.println("Book" + (i+1) + ":");
        System.out.println("Brand Name:" + brands[i]);
        System.out.println("Pages: " + pages[i]);
        System.out.println("Price: Rs. "+ price[i]);
        System.out.println();
       }
    }
}