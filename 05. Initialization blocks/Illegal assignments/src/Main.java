public class Main {
   public static void main(String[] args) {
      // Write your solution here
   }
   class Example {

      static final int FIELD_1;
      static int field2 = 40; // (1)
      int field3;

      static {
         FIELD_1 = 30; // (2)
         field2 = 50;  // (3)
         field3 = 100; // (4)
      }

      static {
         FIELD_1 = 30; // (5)
         field2 = 80;  // (6)
      }
   }
}