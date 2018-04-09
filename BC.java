
public class BC {

	public static void main(String[] args) {
		  String[] purple = {"Mysore Road","Deepanjali Nagar","Athiguppe","Vijaynagar",
		            "Hosahalli","Magadi Road","City Railway Station","Kempegowda Station",
		            "M Visveswaraya Station","Vidhana Soudha","Cubbon Park","Mahatma Gandhi Road-MG Road",
		            "Trinity","Halasuru","Indiranagar","Swami Vivekananda Road"," Baiyappanahalli"};
		// TODO Auto-generated method stub
		  for(int k=0;k<=purple.length;k++)
		  {
			  System.out.println(k+"\t"+purple[k]);
		  }
		double fare=0;
		int numOfStations=0;
		double cardfare=0,groupFare=0;
		String travelLine="";
		String Board="Mysore Road";
		String Deboard="Swami Vivekananda Road";
		  getInfo boardobj=new getInfo(Board);
		  int boardIndex=boardobj.getIndex();
		  String boardLine=boardobj.getLine();

		  getInfo deboardobj=new getInfo(Deboard);
		  int deboardIndex=deboardobj.getIndex();
		  String deboardLine=deboardobj.getLine();

		  if(boardLine.equalsIgnoreCase(deboardLine)) {
			  numOfStations=deboardIndex-boardIndex;
		  travelLine=boardLine;
		  }
		  if (boardLine.equalsIgnoreCase(deboardLine)) {

                                                    numOfStations = Math.abs(deboardIndex - boardIndex);
                                                    travelLine = boardLine;
                                                    time=1.8*numOfStations;
                                                } else if (boardLine.equalsIgnoreCase("purple") &&
                                                        deboardLine.equalsIgnoreCase("green")) {
                                                    lineSwitch=true;
                                                    int totalPurple = Math.abs(7 - boardIndex);
                                                    int totalgreen = Math.abs(10 - deboardIndex);
                                                    double timepurple=1.8*totalPurple;
                                                    double timegreen=1.8*totalgreen;
                                                    //time=timepurple+timegreen+8;
                                                    numOfStations = totalgreen + totalPurple;
                                                    travelLine = "Purple and Green Lines";

                                                } else if (boardLine.equalsIgnoreCase("green") &&
                                                        deboardLine.equalsIgnoreCase("purple")) {
                                                    lineSwitch=true;
                                                    int totalpurple = Math.abs(7 - deboardIndex);
                                                    int totalgreen = Math.abs((10 - boardIndex));
                                                    double timepurple=1.8*totalpurple;
                                                    double timegreen=1.8*totalgreen;
                                                    //time=timepurple+timegreen+8;
                                                    numOfStations = totalgreen + totalpurple;
                                                    travelLine = "Purple and Green Lines";

                                                }

		  fare=getFare(numOfStations);
		  cardfare=0.85*fare;
		  groupFare=0.9*fare;
		  System.out.println(purple.length);

	     System.out.println("The travel line is"+travelLine);
	       System.out.println("Number of stations are"+numOfStations);
	       System.out.println("The fare is"+fare);
	       System.out.println("The card fare is"+cardfare);
	       System.out.println("The groupfare is"+groupFare);

	}

	public static double getFare(int numOfStations) {
		double fare =0;

		switch(numOfStations) {
		case 1:
			fare=10;
			break;

		case 2:
			fare=15;
			break;

		case 3:
			fare=15;
			break;

		case 4:
			fare=18;
			break;

		case 5:
			fare=20;
			break;

		case 6:
			fare=22;
			break;

		case 7:
			fare=25;
			break;

		case 8:
			fare=28;
			break;

		case 9:
			fare=30;
			break;

		case 10:
			fare=30;
			break;

		case 11:
			fare=35;
			break;

		case 12:
			fare=35;
			break;

		case 13:
			fare=38;
			break;

		case 14:
			fare=40;
			break;

		case 15:
			fare=42;
			break;

		case 16:
			fare=45;
			break;

		case 17:
			fare=45;
			break;

		case 18:
			fare=50;
			break;

		case 19:
			fare=50;
			break;

		case 20:
			fare=52;
			break;

		case 21:
			fare=55;
			break;

		case 22:
			fare=58;
			break;

		case 23:
			fare=60;
			break;

		}
		return fare;
	}

}
