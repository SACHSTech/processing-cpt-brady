import processing.core.PApplet;
import processing.core.PFont; // Installing fonts
import processing.core.PImage; // Import Image Library

public class Sketch1 extends PApplet {
  // global variables

  // Teams
	String[] strTeams = {"Arsenal", "Aston Villa", "Bournemouth", "Brentford", "Brighton", "Chelsea", "Crystal Palace", "Everton", "Fulham", "Leeds United", "Leicester City", "Liverpool", "Manchester City", "Manchester United", "Newcastle United", "TBD", "Southampton", "Tottenham Hotspur", "West Ham United", "Wolverhampton Wanderers"};

  // Players
  String[][] strPlayers = new String[20][0];

  // Prediction
  String[][] strPrediction = new String[20][0];

  // Team Analysis
  String[][] strAnalysis = new String[20][0];

  // Stats
  String[][] strTeamStats = new String[20][6];
  String[][] strPlayerStats = new String[20][6];

  String strPlayerSelected;
  int intPlayerCount = 0;
  boolean blnScreen;
  boolean blnPlayer;
  boolean blnAnalysis;
  boolean blnPrediction;

  // Font Variables
  PFont title;
  PFont section;
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
    section = createFont("Dialog.Input.italic", 20);
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
    textFont(section, 25);
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
    // Leicester City
    strPlayers[0][0] = "James Maddison";
    // Bournemouth
    strPlayers[1][0] = "Dominic Solanke";
    // Brighton
    strPlayers[2][0] = "Marc Cucurella";
    // Brentford
    strPlayers[3][0] = "Christian Eriksen";
    // Arsenal
    strPlayers[4][0] = "Bukayo Saka";
    // Aston Villa
    strPlayers[5][0] = "Phillipe Coutinho";
    // Liverpool
    strPlayers[6][0] = "Mohamed Salah";
    // Fulham
    strPlayers[7][0] = "Alexander Mitrovic";
    // Southampton
    strPlayers[8][0] = "James Ward-Prowse";
    // Crystal Palace
    strPlayers[9][0] = "Wilfred Zaha";
    // Everton
    strPlayers[10][0] = "Jordan Pickford";
    // Leeds United
    strPlayers[11][0] = "Raphinha";
    // Chelsea
    strPlayers[12][0] = "Mason Mount";
    // West Ham United
    strPlayers[13][0] = "Declan Rice";
    // Wolverhampton Wanderers
    strPlayers[14][0] = "Ruben Neves";
    // Tottenham Hotspur
    strPlayers[15][0] = "Heung Min Son";
    // team tbd
    strPlayers[16][0] = "TBD";
    // Newcastle United
    strPlayers[17][0] = "Kieran Trippier";
    // Manchester United
    strPlayers[18][0] = "Cristiano Ronaldo";
    // Manchester City
    strPlayers[19][0] = "Kevin De Bruyne";
  }
  
}