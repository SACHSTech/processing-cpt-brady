// Author: Brian Gao
import processing.core.PApplet;
import processing.core.PFont; // Installing fonts
import processing.core.PImage; // Import Image Library

public class Sketch2 extends PApplet {
  // global variables

  // Teams
	String[] strTeams = {"Arsenal", "Aston Villa", "Bournemouth", "Brentford", "Brighton", "Chelsea", "Crystal Palace", "Everton", "Fulham", "Leeds United", "Leicester City", "Liverpool", "Manchester City", "Manchester United", "Newcastle United", "Nottingham Forest", "Southampton", "Tottenham Hotspur", "West Ham United", "Wolverhampton Wanderers"};

  // Players
  String[]strPlayers = new String[19];

  // Prediction
  String[] strTeamPrediction = new String[19];
  String[] strPlayerPrediction = new String[19];

  // Team Analysis
  String[] strAnalysis = new String[19];

  // Stats
  String[][] strTeamStats = new String[19][3];
  String[][] strPlayerStats = new String[19][4];

  // Player Position
  String[] strPosition = new String[20];


  String strPlayerSelected;
  int intPlayerCount = 0;
  boolean blnScreen;
  boolean blnPlayer;
  boolean blnAnalysis;
  boolean blnPrediction;

  // Font Variables
  PFont title;
  PFont analysis;
  PFont teamSelection;
  PFont header;

  // Image Variables
  PImage imgLogo;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 255, 51);

    imgLogo = loadImage("premier-league-logo.png");
    imgLogo.resize(imgLogo.width / 3, imgLogo.height / 3);
    
    // changing text
    title = createFont("Dialog.Input.bold", 80);
    //header = createFont("");
    analysis = createFont("Dialog.Input.italic", 20);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    mainScreen();
     
    textFont(analysis, 18);
            text(strPosition[0], 200, 50, 400, 400);
  }
  
  // define other methods down here.
  public void mouseClicked(){
    
  }
  /*
  * Creating main screen
  * Author: Brady So & Brian Gao
  */
  public void mainScreen() {
    textFont(title, 25);
    fill(102, 0, 153);
    strokeWeight(15);
    text("The 2022/2023 PREMIER LEAGUE Fantasy", 20, 50);
    text("Helper and Predictor!", 150, 80);
    image(imgLogo, 120, 90);
    textFont(analysis, 25);
    text("ENTER", 250, 500);
    
  }
  /*
  * Creating teams menu
  * Author: Brady So 
  */
  public void teamScreen() {
    
  }
  /*
  * Creating team overview of analysis, player and prediction 
  * Author: Brady So
  */
  public void teamOverview() {
    
  }
  /*
  * Creating team analysis section 
  * Author: Brian Gao
  */
  public void teamAnalysis() {
    // Man City
    strTeamStats[0][0] = "Points: 93";
    strTeamStats[0][1] = "Wins: 29";
    strTeamStats[0][2] = "Draws: 6";
    strTeamStats[0][3] = "Losses: 3";
    // Liverpool
    strTeamStats[1][0] = "Points: 92";
    strTeamStats[1][1] = "Wins: 28";
    strTeamStats[1][2] = "Draws: 8";
    strTeamStats[1][3] = "Losses: 2";
    // Chelsea
    strTeamStats[2][0] = "Points: 74";
    strTeamStats[2][1] = "Wins: 21";
    strTeamStats[2][2] = "Draws: 11";
    strTeamStats[2][3] = "Losses: 6";
    // Tottenham Hotspur
    strTeamStats[3][0] = "Points: 71";
    strTeamStats[3][1] = "Wins: 22";
    strTeamStats[3][2] = "Draws: 5";
    strTeamStats[3][3] = "Losses: 11";
    // Arsenal
    strTeamStats[4][0] = "Points: 69";
    strTeamStats[4][1] = "Wins: 22";
    strTeamStats[4][2] = "Draws: 3";
    strTeamStats[4][3] = "Losses: 13";
    // Manchester United
    strTeamStats[5][0] = "Points: 58";
    strTeamStats[5][1] = "Wins: 16";
    strTeamStats[5][2] = "Draws: 10";
    strTeamStats[5][3] = "Losses: 12";
    // West Ham United
    strTeamStats[6][0] = "Points: 56";
    strTeamStats[6][1] = "Wins: 16";
    strTeamStats[6][2] = "Draws: 8";
    strTeamStats[6][3] = "Losses: 14";
    // Leicester City
    strTeamStats[7][0] = "Points: 52";
    strTeamStats[7][1] = "Wins: 14";
    strTeamStats[7][2] = "Draws: 10";
    strTeamStats[7][3] = "Losses: 14";
    // Brighton and Hove Albion
    strTeamStats[8][0] = "Points: 51";
    strTeamStats[8][1] = "Wins: 12";
    strTeamStats[8][2] = "Draws: 15";
    strTeamStats[8][3] = "Losses: 11";
    // Wolverhampton Wanderers
    strTeamStats[9][0] = "Points: 51";
    strTeamStats[9][1] = "Wins: 15";
    strTeamStats[9][2] = "Draws: 6";
    strTeamStats[9][3] = "Losses: 17";
    // Newcastle United
    strTeamStats[10][0] = "Points: 49";
    strTeamStats[10][1] = "Wins: 13";
    strTeamStats[10][2] = "Draws: 10";
    strTeamStats[11][3] = "Losses: 15";
    // Crystal Palace
    strTeamStats[11][0] = "Points: 48";
    strTeamStats[11][1] = "Wins: 11";
    strTeamStats[11][2] = "Draws: 15";
    strTeamStats[11][3] = "Losses: 12";
    // Brentford
    strTeamStats[12][0] = "Points: 46";
    strTeamStats[12][1] = "Wins: 13";
    strTeamStats[12][2] = "Draws: 7";
    strTeamStats[12][3] = "Losses: 18";
    // Aston Villa
    strTeamStats[13][0] = "Points: 45";
    strTeamStats[13][1] = "Wins: 13";
    strTeamStats[13][2] = "Draws: 6";
    strTeamStats[13][3] = "Losses: 19";
    // Southampton
    strTeamStats[14][0] = "Points: 40";
    strTeamStats[14][1] = "Wins: 9";
    strTeamStats[14][2] = "Draws: 13";
    strTeamStats[14][3] = "Losses: 16";
    // Everton
    strTeamStats[15][0] = "Points: 39";
    strTeamStats[15][1] = "Wins: 11";
    strTeamStats[15][2] = "Draws: 6";
    strTeamStats[15][3] = "Losses: 21";
    // Leeds United
    strTeamStats[16][0] = "Points: 38";
    strTeamStats[16][1] = "Wins: 9";
    strTeamStats[16][2] = "Draws: 11";
    strTeamStats[16][3] = "Losses: 18";
    // Fulham
    strTeamStats[17][0] = "Points: 90";
    strTeamStats[17][1] = "Wins: 27";
    strTeamStats[17][2] = "Draws: 9";
    strTeamStats[17][3] = "Losses: 10";
    // Bournemouth
    strTeamStats[18][0] = "Points: 88";
    strTeamStats[18][1] = "Wins: 25";
    strTeamStats[18][2] = "Draws: 13";
    strTeamStats[18][3] = "Losses: 8";
    // Notmm Forest
    strTeamStats[19][0] = "Points: 83";
    strTeamStats[19][1] = "Wins: 23";
    strTeamStats[19][2] = "Draws: 11";
    strTeamStats[19][3] = "Losses: 12";

    // Team Analysis
    // Leicester City
    strAnalysis[0] = "Leicester City hasn't had the greatest success this season. Last-minute efforts put the team back into form and managed to clutch up an 8th place finish. Unfortunate injuries and too many changes to their defensive line has caused many damaging effects to their team performance.";
    // Bournemouth
    strAnalysis[1] = "Bournemouth had the best defence in the Championship only conceding 39 goals and won automatic promotion. However, they'll need more firepower to prove they are a Premier League team.";
    // Brighton and Hove Albion
    strAnalysis[2] = "Brighton and Hove Albion played out of their minds this season. A 9th at first glance may seem mediocre for many viewers, but that is the highest they've ever placed in the league. Their playstyle and chemistry works wonders for them and they are looking to keep this streak going.";
    // Brentford
    strAnalysis[3] = "Brentford had a amazing debut season in the top level beating good teams like Chelsea and Arsenal! However, it was the arrival of Christian Eriksen and the goals from Ivan Toney that made it a memorable season for their fans.";
    // Arsenal
    strAnalysis[4] = "Given their reputation and roster, it is fair to say that Arsenal underperformed. The new manager Mikel Arteta has made many unwelcome changes to their team and their internal conflict is showing on the field.";
    // Aston Villa
    strAnalysis[5] = "Villa has had a decent season with former legend Steven Gerrard at their management. With many key star players at their disposal, they placed as well as they could with their resources and investments they currently have.";
    // Liverpool
    strAnalysis[6] = "Liverpool has had a great season with numerous wins and the fewest losses of the entire league. Second only next to Man City, they are the most reliable team in the league due to their unmatched consistency in the past few years. Their star players will lead them to win as many games as they possibly can.";
    // Fulham
    strAnalysis[7] = "Following their relegation, they were looking to reclaim their place back in the Premier League. And they showed that when it's time to show up, they showed up! They played phenomally following 3-0 and 7-0 wins against other teams, securing their spot in the Premier League once more.";
    // Southhampton
    strAnalysis[8] = "The best way to describe their season is purely average. Just average. From an outside perspective, it is hard to pinpoint whether they are making any progress. They don't have the same resources as some of the upper teams, but that is no excuse for placing mid-table every season for years on end.";

    // Crystal Palace
    strAnalysis[9] = "At the start of the season. Crystal Palace were looking as one of the teams who could potentially be relegated. A squad full of novice players and managers proved to have one of their best seasons with unlimited potential.";
    // Everton
    strAnalysis[10] = "Everton has had one of their worst seasons since decades ago. They placed 16th, their worst finish since 03-04. Poor management along with uninspiring players led to a truly miserable season for Everton fans.";
    // Leeds United
    strAnalysis[11] = "Last season, Leeds became one of the most prominent emerging teams under Marcelo Bielsa. In just a year, the Argentine legend is unemployed and Leeds are the worst placing team in the Premier League. With a manager who hardly inspired any strategies and injuries affecting many key players, they are looking to make vital changes during the summer for the next season.";
    // Chelsea
    strAnalysis[12] = "With a squad full of world class players that can easily snatch the trophy, their season was nothing short of exceptional. However, the internal conflict between their star striker Lukaku and manager Thomas Tuchel over their change of playstyle led to damaging outcomes for the whole squad.";
    // West Ham United
    strAnalysis[13] = "West Ham United are one of the strongest contennders in a battle for 6th. With Declan Rice, arguably the best midfielder in the league continuing to impress, and other star players playing to the top of their form, West Ham United has had one of the best seasons they've ever had in history.";
    // Wolverhampton Wanderers
    strAnalysis[14] = "As a transitional season for the Wolves, it wasn't expected for them to perform well. Their inability to score goals has prevented them from placing higher in the league. Their goalkeeper however, Jose Sa, outperformed what is expected from him and managed to save his team countless times. ";
    // Tottenham
    strAnalysis[15] = "Tottenham performed phenomally given their roster, but with Heung-min Son and Harry Kane with their unimagible goal-scoring prowess, Tottenham managed to deny Arsenal their fourth place and make it to the Champions League.";
    // Nottingham Forest 
    strAnalysis[16] = "Nottingham Forest played well the entire season and following a tense matchup against Huddersfield, they won 1-0, effectively ending their 23 year absence from the Premier League. ";
    // Newcastle United
    strAnalysis[17] = "After many unlucky changes made to management, they turned to Eddie Howe, former Bournemouth's manager. After some smart transfers and many tactical changes, the future is looking bright for once for the boys in black and white. ";
    // Manchester United
    strAnalysis[18] = "Manchester United has been on a steady decline over the years. Even with signing arguably the best player in the world (CR7), there has been reports of disharmony and toxicity in the team's behind the scenes, which has obviously affected their playing on the field.";
    // Manchester City
    strAnalysis[19] = "Manchester City has had a fantastic season with many wins under their belt and only a few draws and losses. Their roster consists of many well-known and strong players and with Pep Guardiola at the helm commanding the players, they are looking as one of the most dominant Premier League team we've seen in years.";

    

    


  }   
    
  }