class Examples {
  IQueue q1 = new Queue().enqueue(7).enqueue(4).enqueue(5);
  IStack s1 = new Stack().push(7).push(4).push(5);
  IPriorityQueue pq1 = new PriorityQueue().addElt(7).addElt(4).addElt(5);
  
  //test cases for Queue
  boolean test1(Tester t) {
    return t.checkExpect(newQ(s1),...)
  }
  boolean test2(Tester t) {
    return t.checkExpect(enqueue(q1,9),...)
  }
  boolean test3(Tester t) {
    return t.checkExpect(dequeue(q1),...)
  }
  boolean test4(Tester t) {
    return t.checkExpect(front(q1),7)
  }
  boolean test5(Tester t) {
    return t.checkExpect(isEmpty(q1),false)
  }
  boolean test6(Tester t) {
    return t.checkExpect()
  }
  boolean test7(Tester t) {
    return t.checkExpect()
  }
  
  //test cases for Stack
  boolean test8(Tester t) {
    return t.checkExpect(newStk(s1),...)
  }
  boolean test9(Tester t) {
    return t.checkExpect(push(s1,3),...)
  }
  boolean test10(Tester t) {
    return t.checkExpect(pop(s1),...)
  }
  boolean test11(Tester t) {
    return t.checkExpect(top(s1),5)
  }
  boolean test12(Tester t) {
    return t.checkExpect(isEmpty(s1),false)
  }
  boolean test13(Tester t) {
    return t.checkExpect()
  }
  boolean test14(Tester t) {
    return t.checkExpect()
  }
  
  //test cases for PriorityQueue
  boolean test15(Tester t) {
    return t.checkExpect(newPQ...)
  }
  boolean test16(Tester t) {
    return t.checkExpect(addElt(pq1, 2),...)
  }
  boolean test17(Tester t) {
    return t.checkExpect(remMinElt(pq1),...)
  }
  boolean test18(Tester t) {
    return t.checkExpect(getMinElt(pq1),4)
  }
  boolean test19(Tester t) {
    return t.checkExpect(isEmpty(pq1),false)
  }
  boolean test20(Tester t) {
    return t.checkExpect()
  }
  boolean test21(Tester t) {
    return t.checkExpect()
  }
}