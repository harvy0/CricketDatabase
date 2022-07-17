import java.util.*;
import org.json.simple.JSONObject;

class Data
{

    public static void main(String[] args)
    {   
        int id =1;
        int count = 1;
        String teamA, teamB;
        
        String[] teams = {"india","australia","england","south africa",
        "pakistan","bangladesh","sri lanka", "new zealand"};
        
        String[] teamIndia = {"sachin","sehwag","virat","rohit",
        "yuvraj","dhoni","raina","pandeya","harbhajan","zaheer","nehra"};
        
        String[] teamAus = {"smith","david","watson","maxwell","clark",
        "ponting", "james","lee","johnson","shane","macgrath"};
        
        String[] teamNewZealand = {"brendon","kane", "martin","taylor",
        "tim", "grant", "guptill", "adam", "tom", "bracewell","neil"};
        
        String[] teamPakistan = {"afridi","akmal","yonis","malik", "shehjad",
        "shoaib","misbah","umar gul","tanvir","sohail","sami" };
        
        String[] teamEngland = {"morgan","ben","alex","ravi","nick","gary",
        "monty", "james","grahem","stuart","mark"};
        
        String[] teamSouthAfrica = {"ab","amla","duminy","amla","morris","smith",
        "imran","morkel","steyn","wayne","albie"};
        
        String[] teamBangladesh = {"shakib","mortaza","tamim","nasir","rubel",
        "taskin","arafatnaeem","abul","junaid","farhad","mehrab"};
        
        String[] teamSriLanka = {"jayasuria","dilshan","sangakara","jayawardne",
        "mathews","upal","mendis","dilhara","silva","angelo","vaas"};
        
          
          
      int playerID = 1; 
      
      int arrayCount = 0; 
      
      
        
        String[] teamPlayer = new String[11];
        
          
   System.out.println("[");    
       while(id <= 1)
       {
         Random random =  new Random();
        int index =  random.nextInt(teams.length);
        
        Random random2 = new Random();
        int index2 =  random2.nextInt(teams.length);
        
        while(index == index2)
        {
       //   Random random =  new Random();
         index =  random.nextInt(teams.length);
        
      //  Random random2 = new Random();
          index2 =  random2.nextInt(teams.length);
        }
   /*      
        System.out.println(teams[index]);
        System.out.println(teams[index2]);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
   */    
         teamA = teams[index];
        teamB = teams[index2];
        
        
        System.out.println("{" +'\n'
        +"\"_id\" : " + id+","+'\n'
        +"\"battingFirst\" : " + "\""+teamA+"\","+'\n'
        +"\"teams\" : " + "\""+teamA+"\"," + "\""+teamB+"\","+'\n'
        +"\"player\" : ");
        
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
       
        
        Random battingScore = new Random();
        int batScore = battingScore.nextInt(100);
        
        System.out.println( 
         "{"+'\n'+"\"player_ID\":" +playerID+'\n'
        + "\"team\":" + "\""+teamA+"\""+'\n'
        + "\"Name\":" + "\""+teamPlayer[arrayCount]+"\""+'\n'
        + "\"score\":" + batScore+'\n'
        +"}");
        
        if(count == 11)
        {
          teamA =  teamB;
        }
        if(arrayCount == 10)
        {
          arrayCount = -1;
        }
        count++;
        playerID++;
        arrayCount++;
        }
        
        System.out.println("},");
        
        
        
        
        id++;
       }
       
       System.out.println("]");
       
       
    }
}