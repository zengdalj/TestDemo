package demotest;

public enum EnumDemo {

FRONT("front"), BEHIND("behind"), LEFT("left"), RIGHT("right");
    
    private String name;
    
    EnumDemo(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
    	EnumDemo d = EnumDemo.FRONT;
    	  switch(d) {
    	    case FRONT: System.out.println("前面");break;
    	    case BEHIND:System.out.println("后面");break;
    	    case LEFT:  System.out.println("左面");break;
    	    case RIGHT: System.out.println("右面");break;
    	    default:System.out.println("错误的方向");
    	}
    	EnumDemo d1 = d;
    	System.out.println(d1);
    	
	}
}
   
  
