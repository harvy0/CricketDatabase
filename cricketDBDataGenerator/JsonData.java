import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonData {

	public static void main(String[] args) {
		 int id =1;
	        int count = 1;
	        String teamA, teamB;
	        
	        String[] teams = {"india","australia","england","south africa",
	        "pakistan","bangladesh","sri lanka", "new zealand"};
	        
	        String[] teamIndia = {"sachin","sehwag","virat","rohit",
	        "yuvraj","dhoni","raina","pandeya","harbhajan","zaheer","nehra"};
	        
	        String[] teamAus = {"gilchrist","david","watson","maxwell","clark",
	        "ponting", "james","lee","johnson","shane","macgrath"};
	        
	        String[] teamNewZealand = {"brendon","kane", "martin","taylor",
	        "tim", "grant", "guptill", "adam", "tom", "bracewell","neil"};
	        
	        String[] teamPakistan = {"afridi","akmal","yonis","malik", "shehjad",
	        "shoaib","misbah","umar gul","tanvir","sohail","sami" };
	        
	        String[] teamEngland = {"morgan","ben","alex","ravi","nick","gary",
	        "monty", "peterson","grahem","stuart","mark"};
	        
	        String[] teamSouthAfrica = {"ab","amla","duminy","natini","morris","smith",
	        "imran","morkel","steyn","wayne","albie"};
	        
	        String[] teamBangladesh = {"shakib","mortaza","tamim","nasir","rubel",
	        "taskin","arafatnaeem","abul","junaid","farhad","mehrab"};
	        
	        String[] teamSriLanka = {"jayasuria","dilshan","sangakara","jayawardne",
	        "mathews","upal","mendis","dilhara","silva","angelo","vaas"};
	        
	        String[] stadium = {"SCG","WACA", "MCG","Centurion Park","Mohali","SSC","Riverside","JSCA"};
	        
	        String[] pitch = {"grassy","moisture","dry"};
	          
	      int playerID = 1; 
	      
	      int arrayCount = 0; 
	      
	      
	      JSONObject  ob = new JSONObject();
	  //    JSONObject playerObject = new JSONObject();
	      
	      JSONArray resultArray = new JSONArray();
	      JSONArray teamArray = new JSONArray();
	      JSONArray playerArray = new JSONArray();  
	      JSONArray winnerArray = new JSONArray();
	      
	        
	        String[] teamPlayer = new String[11];
	        
	        String[] oppositeTeamPlayer = new String[11];
	          
	       while(id <= 50)
	       {
	         Random random =  new Random();
	        int index =  random.nextInt(teams.length);
	        
	        Random random2 = new Random();
	        int index2 =  random2.nextInt(teams.length);
	        
	        while(index == index2)
	        {

	         index =  random.nextInt(teams.length);
	        
	          index2 =  random2.nextInt(teams.length);
	        }
	        
	        teamArray.clear();
	        playerArray.clear();
	        
	        ob.clear();
	        
	
	         teamA = teams[index];
	        teamB = teams[index2];
	        
	        teamArray.add(teamA);
	        teamArray.add(teamB);
	        
	        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			  
			   Date date = new Date();
			   
			   
			//   System.out.println(dateFormat.format(date));   
			   
			   Random rand = new Random();
			   int dt = rand.nextInt(365);
			   
			   
			   
			   Calendar c = Calendar.getInstance(); 
			//   c.setTime(date); 
			   c.add(Calendar.DATE, -(dt));
			   date = c.getTime();
	        
		   Random toss = new Random();
		   int ts = toss.nextInt(2);
		   
		   
		  String tossTeam;
		  String country = "";
		  
		  if(ts == 0)
		  {
			  tossTeam = teamA;
		  }
		  else
		  {
			  tossTeam =  teamB;
		  }
		   
		   Random stad = new Random();
		   int st = stad.nextInt(stadium.length);
		   
		   
		   if(stadium[st] == "SCG")
		   {
			   country = "australia";
		   }
		   else if(stadium[st] == "WACA")
		   {
			   country = "australia";
		   }
		   else if(stadium[st] == "Mohali")
		   {
			   country = "india";
		   }
		   else if(stadium[st] == "MCG")
		   {
			   country = "australia";
		   }
		   else if(stadium[st] == "Centurion Park")
		   {
			   country = "south africa";
		   }
		   else if(stadium[st] == "SSC")
		   {
			   country = "sri lanka";
		   }
		   else if(stadium[st] == "Riverside")
		   {
			   country = "england";
		   }
		   else if(stadium[st] == "JSCA")
		   {
			   country = "england";
		   }
		   
		   
		   
		   Random pitch1 = new Random();
		   int pt = pitch1.nextInt(pitch.length);
		   
		   Random temp = new Random();
		   int tp = temp.nextInt(43);
		   
		   
		   int batCount = 0;
		   int bowlCount = 0;
	        
	        ob.put("teams", teamArray);
	        ob.put("_id", id);
	        ob.put("battingFirst", teamA);
	        ob.put("battingLast", teamB);
	        ob.put("matchDate",dateFormat.format(date));
	        ob.put("toss", tossTeam);
	        ob.put("stadium", stadium[st]);
	        ob.put("pitchType", pitch[pt]);
	        ob.put("temp", tp);
	        ob.put("location", country);
	        
	        
	        
	       String[] currentTeam = new String[11];
	       
	       int teamATotal = 0;
	       int teamBTotal = 0;
	       int totalCounter = 0;
	       
	       int teamAWic = 0;
	       int teamBWic = 0;
	       
	        String teamVar;
	        
	        int teamWic = 0;
	        
	        count = 1;
	        
	        while(count  <= 22)
	        {
	        
	        if(teamA == "india")
	        {
	          teamPlayer = teamIndia;
	        }
	        else if(teamA == "australia")
	        {
	          teamPlayer = teamAus;
	        }
	        else if(teamA == "south africa")
	        {
	          teamPlayer = teamSouthAfrica;
	        }
	        else if(teamA == "sri lanka")
	        {
	          teamPlayer = teamSriLanka;
	        }
	        else if(teamA == "england")
	        {
	          teamPlayer = teamEngland;
	        }
	        else if(teamA == "bangladesh")
	        {
	          teamPlayer = teamBangladesh;
	        }
	        else if(teamA == "new zealand")
	        {
	           teamPlayer = teamNewZealand;
	        }
	        else if(teamA ==  "pakistan")
	        {
	           teamPlayer = teamPakistan;
	        }
	 
	        /////////////////////// Opposite Team Player
	        
	        if(teamB == "india")
	        {
	        	oppositeTeamPlayer = teamIndia;
	        }
	        else if(teamB == "australia")
	        {
	        	oppositeTeamPlayer = teamAus;
	        }
	        else if(teamB == "south africa")
	        {
	        	oppositeTeamPlayer = teamSouthAfrica;
	        }
	        else if(teamB == "sri lanka")
	        {
	        	oppositeTeamPlayer = teamSriLanka;
	        }
	        else if(teamB == "england")
	        {
	        	oppositeTeamPlayer = teamEngland;
	        }
	        else if(teamB == "bangladesh")
	        {
	        	oppositeTeamPlayer = teamBangladesh;
	        }
	        else if(teamB == "new zealand")
	        {
	        	oppositeTeamPlayer = teamNewZealand;
	        }
	        else if(teamB ==  "pakistan")
	        {
	        	oppositeTeamPlayer = teamPakistan;
	        }
	       
	        
	        Random battingScore = new Random();
	        int batScore = battingScore.nextInt(100);
	        
	        int bowlScore = battingScore.nextInt(100);
	        
	        totalCounter = totalCounter + bowlScore;
	        
	        
	        Random bowl = new Random();
	        
	       int  ballfaced = bowl.nextInt(50);
	       
	       int ballbowled = bowl.nextInt(50);
	       
	         batCount = batCount+ballfaced;
	        
	         bowlCount = bowlCount+ballbowled;
	         
	        Random wicketTaker = new Random();
	        
	        int wicketCount = wicketTaker.nextInt(17);
	         
	         
	         
	        
	        JSONObject playerObject = new JSONObject();
	        
	        playerObject.put("player_ID",playerID);
	        playerObject.put("team",teamA);
	        playerObject.put("name",teamPlayer[arrayCount]);
	        playerObject.put("battingScore",batScore);
	        playerObject.put("bowlScore",bowlScore);
	        playerObject.put("ballsFaced", ballfaced);
	        playerObject.put("ballsBowled", ballbowled);
	        
	        if(wicketCount < 11)
	        {   
	        	teamWic = teamWic+1;
	            playerObject.put("wicketTaker", oppositeTeamPlayer[wicketCount]);
	        }
	        else
	        {
	        	playerObject.put("wicketTaker", "no");
	        }
	        
	        
	        
	        
	       playerArray.add(playerObject);
	        
	        if(count == 11)
	        {
	          teamVar = teamA;
	          teamA =  teamB;	          
	          teamB = teamVar;
	          
	          teamBTotal = totalCounter;
	          totalCounter = 0;
	          
	          resultArray.clear();
	          
	          
	          teamAWic = teamWic;
	          teamWic = 0;
	    //      System.out.println("bat:"+ batCount + "  bowl:" +bowlCount);
	    //      batCount  = 0;
	    //      bowlCount = 0;
	        }
	        
	        
	        if(count == 22)
	        {
	        	teamATotal = totalCounter;
	        	teamBWic = teamWic;
	        }
	        
	        
	      /*  if(count == 22)
	        {
	        	System.out.println("bat:"+ batCount + "  bowl:" +bowlCount);
	        	batCount  = 0;
		          bowlCount = 0;
	        }
	       */
	        if(arrayCount == 10)
	        {
	          arrayCount = -1;
	        }
	        count++;
	        playerID++;
	        arrayCount++;
	        }
	        
	        ////////////////////// Resluts //////////////////////////////
	        
	        
	        JSONObject resultObject = new JSONObject();
	        JSONObject winner = new JSONObject();
	        
	        JSONObject winnerOuter = new JSONObject();
	        
	        resultObject.put("battingFirst", teamBTotal);
	        resultObject.put("battingLast", teamATotal);
	        
	        if(teamBTotal > teamATotal)
	        {
	        	winner.put("name", teamB);
	        	winner.put("ByRuns", teamBTotal-teamATotal);
	        	winner.put("battingOrder", "first");
	        	resultObject.put("winner",winner);
	        	
	        }
	        else if(teamBTotal == teamATotal)
	        {
	        	resultObject.put("winner", "draw");
	        }
	        else
	        {
	        	winner.put("name", teamA);
	            winner.put("ByWickets", 10-teamBWic);
	            winner.put("battingOrder","last");
	            resultObject.put("winner",winner);
	        }
	           
	  
	        resultArray.add(resultObject);
	        
	        
	        
	        
	        
	        ob.put("player", playerArray);
	        
	        
	        ob.put("result", resultArray);
	        
	        
	        System.out.println(ob);
	        
	        System.out.print(",");
	        
	        /////uncomment following line to see the wickets lost by each team//////
	        
	    //    System.out.println(teamWic);
	        
	        
	        
	        id++;
	       }
	   
	      
		  
		   
		   
	       

	}

}
