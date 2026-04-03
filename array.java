public class array {
    public static void main(String[] args){
        //String[][] cars = new String[3][3]; //2D array

       String[][] cars = {
                            {"mazda","corrolla", "mistubishi"},
                            {"mercedes","mustang", "bmw"},
                            {"ford", "toyota","ferrari" }
                         } ;

                          

        //cars[0][0] = "mazda";
       // cars[0][1] = "corrolla";
      //  cars[0][2] = "mistubishi";
       // cars[1][0] = "mercedes";
       // cars[1][1] = "mustang";
       // cars[1][2] = "bmw";
       // cars[2][0] = "ford";
       // cars[2][1] = "toyota";
       // cars[2][2] = "ferrari";
        
       for(int i=0; i<cars.length; i++){
        System.out.println();
        for(int j=0; j<cars[i].length; j++){
            System.out.print(cars[i][j]+" ");
        }
       }
    }
    
}
