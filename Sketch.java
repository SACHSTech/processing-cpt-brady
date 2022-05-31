import processing.core.PApplet;
import processing.core.PFont; // Installing fonts
import processing.core.PImage; // Import Image Library

public class Sketch extends PApplet {
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
  PImage imgTeams;
  
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
    imgTeams = loadImage("Teamlogos.png");
    
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
 public void teamScreen(){
  
 }
 /*
 * Creating team overview of analysis, player and prediction 
 * Author: Brady So
 */
 public void teamOverview(){
  
 }
 /*
 * Creating team analysis section 
 * Author: Brady So
 */
 public void teamAnalysis(){
  
 }
 /*
 * Creating team prediction section 
 * Author: Brady So
 */
 public void teamPrediction(){
  
 }
 /*
 * Creating player analysis section 
 * Author: Brady So
 */
 public void player(){
  
 }
}