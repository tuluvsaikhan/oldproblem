package data.structures.dono;

public class DoublyLinkedList {
	  private Link first; 

	  private Link last; 

	  public DoublyLinkedList() {
	    first = null; 
	    last = null;
	  }

	  public boolean isEmpty(){
	    return first == null;
	  }
	  public void add(String dd){
		  Link newLink = new Link(dd); 
		  if (isEmpty()) first = newLink; 
		  else {
			  last.next = newLink; 
			  newLink.previous = last; 
		  }
		  last = newLink; 
	  }
	  public String find(String key){
		    Link current = first; 
		    while (current.dData != key)
		    {
		      current = current.next;
		      if (current == null)
		        return "Cannot find "+key+" in the list"; // cannot find it
		    }
		    return "There is '"+key+"' in the list";
		  }

	  public void displayForward() {
	    Link current = first; // start at beginning
	    System.out.print("[");
	    while (current != null) // until end of list,
	    { current.displayLink();
	     if(current.next != null) System.out.print(", ");  
	    current = current.next; // move to next link
	    }
	    System.out.println("]");
	  }

	  public static void main(String[] args) {
	    DoublyLinkedList theList = new DoublyLinkedList();
	    theList.displayForward();
	    theList.add("Straight");
	    theList.add("Bent");
	    theList.add("Equals");
	    theList.displayForward();
	    theList.add("Well");
	    theList.add("Storm");
	    theList.add("iluuts");

	    theList.displayForward();
	    
	    System.out.println(theList.find("Well"));
	    System.out.println(theList.find("Strength"));

//	    theList.deleteFirst();
//	    theList.deleteLast();
//	    theList.deleteKey("iluuts");

//	    theList.displayForward();
	  }

}
class Link {
	  public String dData; // data item
	  public Link next; // next link in list
	  public Link previous; // previous link in list
	  public Link(String d){dData = d;}
	  public void displayLink(){ System.out.print(dData);}
}


//	  public void insertFirst(String dd){
//	    Link newLink = new Link(dd); 
//
//	    if (isEmpty()) 
//	      last = newLink; 
//	    else
//	      first.previous = newLink; 
//	    newLink.next = first; 
//	    first = newLink; 
//	  }

	  

//	  public Link deleteFirst(){ 
//	    Link temp = first;
//	    if (first.next == null) 
//	      last = null; 
//	    else
//	      first.next.previous = null;
//	    first = first.next; 
//	    return temp;
//	  }
//
//	  public Link deleteLast(){ 
//	    Link temp = last;
//	    if (first.next == null)
//	      first = null; 
//	    else
//	      last.previous.next = null;
//	    last = last.previous; 
//	    return temp;
//	  }

//	  public boolean insertAfter(String key, String dd) { 
//	    Link current = first; 
//	    while (current.dData != key){
//	      current = current.next;
//	      if (current == null)
//	        return false; // cannot find it
//	    }
//	    Link newLink = new Link(dd); // make new link
//
//	    if (current == last) // if last link,
//	    {
//	      newLink.next = null; 
//	      last = newLink; 
//	    } else // not last link,
//	    {
//	      newLink.next = current.next; 
//	      
//	      current.next.previous = newLink;
//	    }
//	    newLink.previous = current; 
//	    current.next = newLink; 
//	    return true; // found it, insert
//	  }

//	  public Link deleteKey(String key){
//	    Link current = first; 
//	    while (current.dData != key)
//	    {
//	      current = current.next;
//	      if (current == null)
//	        return null; // cannot find it
//	    }
//	    if (current == first) // found it; first item?
//	      first = current.next; 
//	    else
//	      current.previous.next = current.next;
//
//	    if (current == last) // last item?
//	      last = current.previous; 
//	    else
//	      // not last
//	      current.next.previous = current.previous;
//	    return current; // return value
//	  }
	  
