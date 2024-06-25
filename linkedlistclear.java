// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.LinkedList;

public class linkedlistclear {
   public linkedlistclear() {
   }

   public static void main(String[] args) {
      LinkedList colors = new LinkedList();
      colors.add("yellow");
      colors.add("purple");
      colors.add("blue");
      System.out.println(colors);
      colors.clear();
      System.out.println("after the clearing the element");
      colors.add("yellow");
      colors.add("purple");
      colors.add("blue");
      System.out.println("after adding the element");
   }
}
