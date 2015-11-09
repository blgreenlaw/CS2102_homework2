import tester.*;
class Examples {
  Examples () {};
/////////////////////////////////TESTS FOR Queue////////////////////////////
  IQueue Q1 = new Queue();
  IQueue Q2 = Q1.enqueue(31);
  
  // Can add an element to an empty queue, make sure its not empty and front is added element (1 elt long queue)
    boolean testQueueEnqueueEmptyNE(Tester t) {
    return t.checkExpect(Q2.isEmpty(), false);
  }
    boolean testQueueEnqueueFront(Tester t) {
    return t.checkExpect(Q2.front(), 31);
  }
    
  // Can add an element to a non-empty queue, test front is 31 not 32, 31 older than 32 (oldest elt returned)
    boolean testQueueEnqueueNonEmptyFront(Tester t) {
    return t.checkExpect(Q2.enqueue(32).front(), 31);
  }
    
  // Removes least recently added element (oldest), check queue is now empty (1 long queue)
    boolean testQueueRemOldest(Tester t) {
    return t.checkExpect(Q2.dequeue().isEmpty(), true);
  }
    
  // Produces least recently added element, doesn't remove it
    boolean testQueueProduceOldest(Tester t) {
    return t.checkExpect(Q2.enqueue(32).front(), 31);
  }
    
  // Produces that an empty queue is empty (true)
    boolean testQueueEmpty(Tester t) {
    return t.checkExpect(Q1.isEmpty(), true);
  }
 
  // Produces that a non-empty queue is not-empty (false)
    boolean testQueueNotEmpty(Tester t) {
    return t.checkExpect(Q2.isEmpty(), false);
  }
/////////////////////////////////TESTS FOR Stack////////////////////////////
    IStack S1 = new Stack();
    IStack S2 = S1.push(1);
    
  // Can add an element to an empty stack, make sure it's not empty and front is added element (1 elt long stack)
    boolean testStackPushNotEmptyNow(Tester t) {
    return t.checkExpect(S2.isEmpty(), false);
  }
    boolean testStackPushPopAdded(Tester t) {
    return t.checkExpect(S2.top(), 1);
  }
    
  // Can add an element to a non-empty stack, make sure front is most recently added elt.
     boolean testStackPushPopNonEmpty(Tester t) {
    return t.checkExpect(S2.push(3).top(), 3);
  }
    
  // Removes most recently added element (newest), check stack is now empty (1 long stack)
    boolean testStackPop(Tester t) {
    return t.checkExpect(S2.pop().isEmpty(), true);
  }
    
  // Produces most recently added element(newest), doesn't remove it
    boolean testStackTop(Tester t) {
    return t.checkExpect(S2.push(3).top(), 3);
  }
    
  // Produces that an empty stack is empty (true)
    boolean testStackIsEmpty(Tester t) {
    return t.checkExpect(S1.isEmpty(), true);
  }
 
  // Produces that a non-empty stack is not-empty (false)
    boolean testStackIsNotEmpty(Tester t) {
    return t.checkExpect(S2.isEmpty(), false);
  }  
  
////////////////////////////TESTS FOR PriorityQueue/////////////////////////
    IPriorityQueue PQ1 = new PriorityQueue();
    IPriorityQueue PQ2 = PQ1.addElt(4);
    
  // Can add an element to an empty priority queue, check that it's not empty and that get returns elt added(1 elt long)
    boolean testPQAddEltEmpty(Tester t) {
    return t.checkExpect(PQ2.isEmpty(), false);
  }
     boolean testPQAddEltProdElt(Tester t) {
    return t.checkExpect(PQ2.getMinElt(), 4);
  }
  // Can add an element to a non-empty priority queue, add elt, if smallest see that it is returned back to you
     boolean testPQAddEltSmallAddEltReturn(Tester t) {
    return t.checkExpect(PQ2.addElt(1).getMinElt(), 1);
  }
    
  // Removes smallest element in priority queue (1 long becomes empty)
    boolean testPQRemSmallestElt(Tester t) {
    return t.checkExpect(PQ2.remMinElt().isEmpty(), true);
  }
    
  // Produces smallest element in priority queue, doesn't remove it
    boolean testPQProduceSmallestElt(Tester t) {
    return t.checkExpect(PQ2.addElt(-1).addElt(-10).addElt(4).getMinElt(), -10);
  }
    
  // Produces that an empty priority queue is empty (true)
    boolean testPQEmpty(Tester t) {
    return t.checkExpect(PQ1.isEmpty(), true);
  }
 
  // Produces that a non-empty priority queue is not-empty (false)
    boolean testPQNotEmpty(Tester t) {
    return t.checkExpect(PQ2.isEmpty(), false);
  }  
}