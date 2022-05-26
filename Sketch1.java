import processing.core.PApplet;

public class Sketch1 extends PApplet {
  // global variables

  // Teams
	String[] strTeams = {"Arsenal", "Aston Villa", "Bournemouth", "Brentford", "Brighton", "Chelsea", "Crystal Palace", "Everton", "Fulham", "Leeds United", "Leicester City", "Liverpool", "Manchester City", "Manchester United", "Newcastle United", "Nottingham Forest", "Southampton", "Tottenham Hotspur", "West Ham United", "Wolverhampton Wanderers"};

  // Players
  String[][] strPlayers = new String[20][1];

  // Prediction
  String[][] strPrediction = new String[20][1];

  // Team Analysis
  String[][] strAnalysis = new String[20][1];

  // Stats
  String[][] strTeamStats = new String[20][6];
  String[][] strPlayerStats = new String[20][6];
	
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
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
  }
  /*
  // define other methods down here.
 
 * Creating main screen
 * Author: Brady So
 */
 public void mainScreen() {
  
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
 * Author: Brady So
 */
 public void teamAnalysis() {
  
 }
 /*
 * Creating team prediction section 
 * Author: Brady So
 */
 public void teamPrediction() {
  
 }
 /*
 * Creating player analysis section 
 * Author: Brady So
 */
 public void player() {
  
 }
  
}