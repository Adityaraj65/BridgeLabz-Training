package m1practice;
import java.util.Scanner;

class Festival{
    String name;
    String location;
    String date;
    Festival(String name,String location,String date){
        this.name=name;
        this.location=location;
        this.date=date;
    }
}
class Music extends Festival{
    String headliner;
    String musicGenre;
    int ticketPrice;
    Music(String name,String location,String date,String headliner,String musicGenre,int ticketPrice ){
        super(name,location,date);
        this.headliner=headliner;
        this.musicGenre=musicGenre;
        this.ticketPrice=ticketPrice;
    }

}
class Food extends Festival{
    String cuisine;
    String numStalls;
    int fee;
    Food(String name,String location,String date ,String cuisine,String numStall,int fee ){
        super(name,location,date);
        this.cuisine=cuisine;
        this.numStalls=numStall;
        this.fee=fee;
    }
}
class Art extends Festival{
     String artType;
     String numArtists;
     String exhibitionFee;
     Art(String name,String location,String date,String artType,String numArtists,String exhibitionFee){
         super(name,location,date);
         this.artType=artType;
         this.numArtists=numArtists;
         this.exhibitionFee=exhibitionFee;
     }
}
public class EventPlannerFestivalManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            String str=sc.nextLine().trim();
            String[] stringArray=str.split(" ");
            String operation=stringArray[0].trim();
            if(operation.equalsIgnoreCase("ADD_FESTIVAL")){
                String name=stringArray[1].trim();

                if(name.equalsIgnoreCase("Music")){
                    String location=stringArray[3].trim();
                    String date=stringArray[4].trim();
                    String headliner=stringArray[2].trim();
                    String musicGenre=stringArray[6].trim();
                    int ticketPrice=Integer.parseInt(stringArray[7].trim());
                }


            }

            if(str.equalsIgnoreCase("EXIT")){
                flag=false;
            }

        }
    }
}
