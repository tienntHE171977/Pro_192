package items;

import java.util.Vector;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class NewItems extends Vector<Item> {

    Scanner sc = new Scanner(System.in);
    Vector<String> storedCodes = new Vector<String>();

    public NewItems() {
        super();
    }

    public void loadStoredCodes(String fName) {
        if (storedCodes.size() > 0) {
            storedCodes.clear();
        }
        try {
            File f = new File(fName);
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String code, name, priceStr;
            while ((code = bf.readLine()) != null) {
                String name = bf.readLine();
                String priceStr = bf.readLine();
                storedCodes.add(code);
                Item newItem = new Item(code, name, Double.parseDouble(priceStr));
                 this.add(newItem);
                }

            bf.close();
            fr.close();

        }
    }
    catch (Exception e

    
        ) {
                System.out.println(e);
    }
    private boolean valid (String aCode){
        int i;
        for(i=0; i<storedCodes.size();i++)
            if(aCode.equals(storedCodes.get(i))) return false;
        for(i=0;i<this.size();i++)
            if(aCode.equals(this.get(i).getCode())) return false;
        return true;
    }
    private int find(String aCode) {
    for (int i = 0; i < this.size(); i++) {
        if (this.get(i).getCode().equals(aCode)) {
            return i; // Trả về vị trí của mặt hàng nếu tìm thấy
        }
    }
    return -1; // Trả về -1 nếu không tìm thấy mặt hàng với mã code tương ứng
}

    public void appendToFile(String fName){
        if(this.size()==0){
            System.out.println("Empty list");
            return;
        }
        try {
            boolean append = true;
            File f = new File(fName);
            FileWriter fw = new FileWriter(f,append);
            PrintWriter pw = new PrintWriter(fw);
            for(Item x:this){
                pw.println(x.getCode());
                pw.println(x.getName());
                pw.println(x.getPrice());
                pw.flush();
            }
            pw.close();fw.close();
            this.loadStoredCodes(fName);
            this.clear();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void addNewItem(){
        String newCode, newName; int price;
        boolean duplicated = false, matched = true ;
        System.out.println("Enter New Item Details: ");
        do {            
            System.out.print("  code(format I000: ");
            newCode = sc.nextLine().toUpperCase();
            duplicated = !valid(newCode);
            matched = newCode.matches("^I\\d{3}$");
            if(duplicated) System.out.println(" The code is duplicated.");
            if(!matched) System.out.println("   The code: I and 3 digits.");
        } while (duplicated || (!matched));
        System.out.print("  name");
        newName = sc.nextLine().toUpperCase();
        System.out.print("  price: ");
        price = Integer.parseInt(sc.nextLine());
        this.add(new Item(newCode, newName, price));
        System.out.println("New Item has been added.");
    }
    public void removeItem(String code) {
    int index = -1;

    // Tìm kiếm vị trí của mặt hàng cần xóa dựa trên code
    for (int i = 0; i < this.size(); i++) {
        if (this.get(i).getCode().equals(code)) {
            index = i;
            break;
        }
    }

    if (index == -1) {
        System.out.println("Item with code " + code + " not found.");
    } else {
        this.remove(index); // Xóa mặt hàng tại vị trí đã tìm thấy
        System.out.println("Item with code " + code + " has been deleted.");
    }
}

    public void updatePrice(){
        int index = -1;

    
    for (int i = 0; i < this.size(); i++) {
        if (this.get(i).getCode().equals(code)) {
            index = i;
            break;
        }
    }

    if (index == -1) {
        System.out.println("Item with code " + code + " not found.");
    } else {
        this.get(index).setPrice(newPrice); // Cập nhật giá của mặt hàng
        System.out.println("Price of item with code " + code + " has been updated.");
    }
    }
    public void print(){
        if (this.isEmpty()) {
        System.out.println("The item list is empty.");
    } else {
        System.out.println("List of Items:");
        for (Item item : this) {
            System.out.println("Code: " + item.getCode());
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
            System.out.println("----------------------------");
        }
    }
    }
}
