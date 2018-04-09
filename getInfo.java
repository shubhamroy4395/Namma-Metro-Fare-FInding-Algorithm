
public class getInfo {
    String[] purple = {"Mysore Road","Deepanjali Nagar","Athiguppe","Vijaynagar",
            "Hosahalli","Magadi Road","City Railway Station","Kempegowda Station",
            "M Visveswaraya Station","Vidhana Soudha","Cubbon Park","Mahatma Gandhi Road-MG Road",
            "Trinity","Halasuru","Indiranagar","Swami Vivekananda Road"," Baiyappanahalli"};
            
            String[] green ={"Yelachenahalli","Jayaprakash Nagar","Banashankari","Rashtreeya Vidyalaya Road",
            "Jayanagar","South End Circle","Lalbagh","National College","Krishna Rajendra Market","Chickpete",
            "Mantri Square Sampige Road","Srirampura","Kuvempu road","Rajajinagar","Mahalakshmi",
            "Sandal Soap Factory","Yeshwanthpur","Yeshwanthpur Industry","Peenya","Peenya Industry","Jalahalli",
            "Dasarahalli","Nagasandra"};
    String line;
    boolean flag1;
    int i,j;
    String station;
    public getInfo(String station){
        this.station=station;
    }
    
    public int getIndex(){
      for(i=0;i<purple.length-1;i++){
        if(station.equals(purple[i])){
         line="purple";
         flag1=true;
        break;   
        }
      }
        for(j=0;j<green.length;j++){
        if(station.equals(green[j])){
            line="green";
            break;
        }
         }
         if(flag1)
     return i;
     else
     return j;
    }
    
    public String getLine(){
        return line;
    }
}
