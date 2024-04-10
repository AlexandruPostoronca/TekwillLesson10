package org.demo;

public class A {

   private int field1;

   protected int field2;

   public void methodA() { }
}
and

package org.demo.example;

import org.demo.A;

public class B {

   private void methodB() {
      A a = new A(); // (1)

      int f1 = a.field1; // (2)
      int f2 = a.field2; // (3)

      a.methodA(); // (4)
   }
}