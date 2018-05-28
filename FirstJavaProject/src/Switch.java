public class Switch {

   public static void main(String args[]){
     int num=2;
     switch(num+2)
     {
        case 1:
	  System.out.println("Name: Value is: "+num);
	case 2:
	  System.out.println("Age: Value is: "+num);
	case 3:
	  System.out.println("Weight: Value is: "+num);
        default:
	  System.out.println("Default: Value is: "+num);
      }
   }
}
