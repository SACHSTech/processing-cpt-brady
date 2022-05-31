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
  }
  
  // define other methods down here.
  public void mouseClicked(){
    
  }
  /*
  * Creating main screen
  * Author: Brady So
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
    strAnalysis[0] = "Manchester City has had a fantastic season with many wins under their belt and only a few draws and losses. Their roster consists of many well-known and strong players and with Pep Guardiola at the helm commanding the players, they are looking as one of the most dominant Premier League team we've seen in years.";
    strAnalysis[1] = "Liverpool has had a great season with numerous wins and the fewest losses of the entire league. Second only next to Man City, they are the most reliable team in the league due to their unmatched consistency in the past few years. Their star players will lead them to win as many games as they possibly can.";
    strAnalysis[2] = "With a squad full of world class players that can easily snatch the trophy, their season was nothing short of exceptional. However, the internal conflict between their star striker Lukaku and manager Thomas Tuchel over their change of playstyle led to damaging outcomes for the whole squad.";
    strAnalysis[3] = "Tottenham performed phenomally given their roster, but with Heung-min Son and Harry Kane with their unimagible goal-scoring prowess, Tottenham managed to deny Arsenal their fourth place and make it to the Champions League.";
    strAnalysis[4] = "Given their reputation and roster, it is fair to say that Arsenal underperformed. The new manager Mikel Arteta has made many unwelcome changes to their team and their internal conflict is showing on the field.";
    strAnalysis[5] = "Manchester United has been on a steady decline over the years. Even with signing arguably the best player in the world (CR7), there has been reports of disharmony and toxicity in the team's behind the scenes, which has obviously affected their playing on the field.";
    strAnalysis[6] = "West Ham United are one of the strongest contennders in a battle for 6th. With Declan Rice, arguably the best midfielder in the league continuing to impress, and other star players playing to the top of their form, West Ham United has had one of the best seasons they've ever had in history.";
    strAnalysis[7] = "Leicester City hasn't had the greatest success this season. Last-minute efforts put the team back into form and managed to clutch up an 8th. Unfortunate injuries and too many changes to their defensive line has caused many damaging effects to their team performance.";
    strAnalysis[8] = "Brighton and Hove Albion played out of their minds this season. A 9th at first glance may seem mediocre for many viewers, but that is the highest they've ever placed in the league. Their playstyle and chemistry works wonders for them and they are looking to keep this streak going.";
    strAnalysis[9] = "As a transitional season for the Wolves, it wasn't expected for them to perform well. Their inability to score goals has prevented them from placing higher in the league. Their goalkeeper however, Jose Sa, outperformed what is expected from him and managed to save his team countless times. ";
    strAnalysis[10] = "";

    

    


  }
  /*
  * Creating team prediction section 
  * Author: Brady So
  */
  public void teamPrediction() {
    strTeamPrediction[19] = "Man City will continue to be a title contender next season with their world-class players, amazing manager and recently signed superstar striker Erling Haaland. Predicted Finish: 1st or 2nd";
    strTeamPrediction[6] = "Liverpool is out for revenge after finishing 2nd for the second time in 4 years. The core of world-class players is likely to stay and once again fight for the league title. Predicted Finish: 2nd or 1st";
    strTeamPrediction[12] = "Chelsea is an excellent team but aren't consistent enough like Liverpool and Man City. If their players start to perform consistently, they have a chance to compete with the top 2 teams. Predicted Finish: 3rd";
    strTeamPrediction[15] = "Tottenham had a miracle season reaching 4th place after a horrid start to last season. With manager Antonio Conte and new players incoming, Tottenham will look to improve next season. Predicted Finish: 4th or 3rd if lucky";
    strTeamPrediction[4] = "Arsenal are the youngest team in the league but they lack the experience against the top teams. With the players having to play Europa League on Thursdays and Premier League Sunday games. It is uncertain if they can achieve a higher standing. Predicted Finish: 5th or 6th";
    strTeamPrediction[18] = "Manchester United are under a new manager in Erik Ten Hag and look to improve from their worst point total ever of 58. With a huge number of players leaving and coming this summer, it is highly unpredictable what their season could be. Predicted finish: 5th or 6th";
    strTeamPrediction[13] = "It is likely that West Ham United continue to contend for the top 6 spots as their stars continue to develop, but there are teams who could catch up soon. Predicted finish: 8th";
    strTeamPrediction[0] = "Leicester are capable to finish above West Ham if they remain healthy. They have a best squad to gatecrash into the top 6. Predicted finish: 7th";
    strTeamPrediction[2] = "Brighton will need a better striker if they desire similar or better results next season. With most teams getting stronger, it is likely that Brighton decline a bit. Predicted finish: 11th";
    strTeamPrediction[14] = "Wolves could experience a decline in their standing if signings are not made to improve their goalscoring ability. Predicted finish: 13th";
    strTeamPrediction[17] = "Newcastle United are the richest club in the world and will likely make a splash on new players this summer. With a solid manager like Howe and better players incoming, they have huge potential to improve next season. Predicted finish: 8th";
    strTeamPrediction[9] = "The young Crystal Palace will look to remain steady and exciting for all fans to watch. However, it may be difficult for them to reach the top 10. Predicted finish: 12th";
    strTeamPrediction[3] = "Brentford could be in real risk of second season syndrome and it can worsen if players like Ivan Toney and Christian Eriksen decide to leave. Predicted finish: 14th";
    strTeamPrediction[5] = "Aston Villa are enjoying a big summer of recruitment and aim to be in the top half as a minimum requirement. Predicted finish: 9th";
    strTeamPrediction[8] = "Southampton seem to be comfortable with midtable mediocrity and their inconsistencies can cause a very stressful season for their fans. Predicted finish: 15th";
    strTeamPrediction[10] = "After a miserable season for Everton, their financial struggles to sign new players can be the downfall for Frank Lampard's men. Predicted finish: 17th";
    strTeamPrediction[11] = "With their two best players likely to leave next season. It leaves Leeds United in a very rough place if they want to avoid relegation next season. Predicted finish: 18th";
    strTeamPrediction[7] = "Fulham are known as a yoyo team and will be one of the favorites to be relgated next season. Predicted finish: 19th";
    strTeamPrediction[1] = "Bournemouth are similar to Fulham as they both struggle when in the Premier League. The lack of top players make them a relegation favourite. Predicted finish: 20th";
    strTeamPrediction[16] = "Similar to Brentford last season, Nottingham Forest are a unproven team who are looking to make a statement next season. Predicted finish: 16th";

    
    }   
    
  }