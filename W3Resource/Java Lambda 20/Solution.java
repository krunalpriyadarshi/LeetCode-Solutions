import java.util.ArrayList;

@FunctionalInterface
interface find{
  ArrayList<cube> sort(ArrayList<cube> arr, String attr);
}

class cube{
  int height;
  int width;
  String color;

  cube(int height, int width, String color){
    this.height = height;
    this.width = width;
    this.color = color;
  }
}

class Solution { 
  public static void main(String[] args) {
   
    find ob= (ArrayList<cube> arr, String att) -> {
      if(att.equals("height")){
        arr.sort((cube c1, cube c2) -> c1.height - c2.height);
      }
      else if(att.equals("width")){
        arr.sort((cube c1, cube c2) -> c1.width - c2.width);
      }
      else if(att.equals("color")){
        arr.sort((cube c1, cube c2) -> c1.color.compareTo(c2.color));
      }
      return arr;
    };


      cube c1= new cube(10, 60, "red");
      cube c2= new cube(20, 10, "green");
      cube c3= new cube(30, 40, "blue");

    ArrayList<cube> arr= new ArrayList<>();
    arr.add(c1);  
    arr.add(c2);
    arr.add(c3);

    arr= ob.sort(arr, "height");
    for(cube i: arr){
      System.out.println(i.height + " " + i.width + " " + i.color);
    }

    arr= ob.sort(arr, "width");
    for(cube i: arr){
      System.out.println(i.height + " " + i.width + " " + i.color);
    }

    arr= ob.sort(arr, "color");
    for(cube i: arr){
      System.out.println(i.height + " " + i.width + " " + i.color);
    }  
  }
}
