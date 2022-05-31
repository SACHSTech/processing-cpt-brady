import processing.core.PApplet;
import processing.core.PFont; // Installing fonts
import processing.core.PImage; // Import Image Library

public class Sketch1 extends PApplet {
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
    strPlayers[0] = "James Maddison";
    // Bournemouth
    strPlayers[1] = "Dominic Solanke";
    // Brighton
    strPlayers[2] = "Marc Cucurella";
    // Brentford
    strPlayers[3] = "Christian Eriksen";
    // Arsenal
    strPlayers[4] = "Bukayo Saka";
    // Aston Villa
    strPlayers[5] = "Matthew Cash";
    // Liverpool
    strPlayers[6] = "Mohamed Salah";
    // Fulham
    strPlayers[7] = "Alexander Mitrovic";
    // Southampton
    strPlayers[8] = "James Ward-Prowse";
    // Crystal Palace
    strPlayers[9] = "Wilfred Zaha";
    // Everton
    strPlayers[10] = "Jordan Pickford";
    // Leeds United
    strPlayers[11] = "Raphinha";
    // Chelsea
    strPlayers[12] = "Mason Mount";
    // West Ham United
    strPlayers[13] = "Declan Rice";
    // Wolverhampton Wanderers
    strPlayers[14] = "Jose Sa";
    // Tottenham Hotspur
    strPlayers[15] = "Heung Min Son";
    // Nottingham Forest
    strPlayers[16] = "Brennan Johnson";
    // Newcastle United
    strPlayers[17] = "Bruno Guimaraes";
    // Manchester United
    strPlayers[18] = "Cristiano Ronaldo";
    // Manchester City
    strPlayers[19] = "Kevin De Bruyne";

    // Stats
    // Maddison
    strPlayerStats[0][0] = "Appearances: 35";
    strPlayerStats[0][1] = "Goals: 12";
    strPlayerStats[0][2] = "Assists: 8";
    strPlayerStats[0][3] = "Big Chances Created: 11";
    strPlayerStats[0][4] = "Goals per Match: 0.34";
    // Solanke
    strPlayerStats[1][0] = "Appearances: 46";
    strPlayerStats[1][1] = "Goals: 29";
    strPlayerStats[1][2] = "Assists: 7";
    strPlayerStats[1][3] = "Shooting Accuracy: 37.2%";
    strPlayerStats[1][4] = "Goals per Match: 0.64";
    // Cucurella
    strPlayerStats[2][0] = "Appearances: 35";
    strPlayerStats[2][1] = "Goals: 1";
    strPlayerStats[2][2] = "Assists: 1";
    strPlayerStats[2][3] = "Clean Sheets: 8";
    strPlayerStats[2][4] = "Tackle Success: 67%";
    // Eriksen
    strPlayerStats[3][0] = "Appearances: 11";
    strPlayerStats[3][1] = "Goals: 1";
    strPlayerStats[3][2] = "Assists: 4";
    strPlayerStats[3][3] = "Big Chances Created: 5";
    strPlayerStats[3][4] = "Goals per Match: 0.09";
    // Saka
    strPlayerStats[4][0] = "Appearances: 38";
    strPlayerStats[4][1] = "Goals: 11";
    strPlayerStats[4][2] = "Assists: 7";
    strPlayerStats[4][3] = "Big Chances Created: 8";
    strPlayerStats[4][4] = "Goals per Match: 0.29";
    // Cash
    strPlayerStats[5][0] = "Appearances: 38";
    strPlayerStats[5][1] = "Goals: 4";
    strPlayerStats[5][2] = "Assists: 3";
    strPlayerStats[5][3] = "Clean Sheets: 10";
    strPlayerStats[5][4] = "Tackle Success: 56%";
    // Salah
    strPlayerStats[6][0] = "Appearances: 35";
    strPlayerStats[6][1] = "Goals: 23";
    strPlayerStats[6][2] = "Assists: 13";
    strPlayerStats[6][3] = "Big Chances Created: 18";
    strPlayerStats[6][4] = "Goals per Match: 0.66";
    // Mitrovic
    strPlayerStats[7][0] = "Appearances: 44";
    strPlayerStats[7][1] = "Goals: 43";
    strPlayerStats[7][2] = "Assists: 7";
    strPlayerStats[7][3] = "Shooting Accuracy: 46.5%";
    strPlayerStats[7][4] = "Goals per Match: 1.01";
    // Ward-Prowse
    strPlayerStats[8][0] = "Appearances: 36";
    strPlayerStats[8][1] = "Goals: 10";
    strPlayerStats[8][2] = "Assists: 5";
    strPlayerStats[8][3] = "Big Chances Created: 8";
    strPlayerStats[8][4] = "Goals per Match: 0.28";
    // Zaha
    strPlayerStats[9][0] = "Appearances: 33";
    strPlayerStats[9][1] = "Goals: 14";
    strPlayerStats[9][2] = "Assists: 1";
    strPlayerStats[9][3] = "Big Chances Created: 4";
    strPlayerStats[9][4] = "Goals per Match: 0.42";
    // Pickford
    strPlayerStats[10][0] = "Appearances: 35";
    strPlayerStats[10][1] = "Clean Sheets: 7";
    strPlayerStats[10][2] = "Saves: 117";
    strPlayerStats[10][3] = "Goals Conceded: 58";
    strPlayerStats[10][4] = "Errors Leading to Goals: 1";
    // Raphinha
    strPlayerStats[11][0] = "Appearances: 35";
    strPlayerStats[11][1] = "Goals: 11";
    strPlayerStats[11][2] = "Assists: 3";
    strPlayerStats[11][3] = "Big Chances Created: 10";
    strPlayerStats[11][4] = "Goals per Match: 0.31";
    // Mount
    strPlayerStats[12][0] = "Appearances: 32";
    strPlayerStats[12][1] = "Goals: 11";
    strPlayerStats[12][2] = "Assists: 10";
    strPlayerStats[12][3] = "Big Chances Created: 10";
    strPlayerStats[12][4] = "Goals per Match: 0.34";
    // Rice
    strPlayerStats[13][0] = "Appearances: 36";
    strPlayerStats[13][1] = "Goals: 1";
    strPlayerStats[13][2] = "Assists: 4";
    strPlayerStats[13][3] = "Big Chances Created: 2";
    strPlayerStats[13][4] = "Tackle Success: 53%";
    // Jose Sa
    strPlayerStats[14][0] = "Appearances: 37";
    strPlayerStats[14][1] = "Clean Sheets: 11";
    strPlayerStats[14][2] = "Saves: 121";
    strPlayerStats[14][3] = "Goals Conceded: 40";
    strPlayerStats[14][4] = "Errors Leading to Goals: 2";
    // Son
    strPlayerStats[15][0] = "Appearances: 35";
    strPlayerStats[15][1] = "Goals: 23";
    strPlayerStats[15][2] = "Assists: 7";
    strPlayerStats[15][3] = "Big Chances Created: 10";
    strPlayerStats[15][4] = "Goals per Match: 0.66";
    // Johnson
    strPlayerStats[16][0] = "Appearances: 49";
    strPlayerStats[16][1] = "Goals: 18";
    strPlayerStats[16][2] = "Assists: 10";
    strPlayerStats[16][3] = "Shooting Accuracy: 41.9%";
    strPlayerStats[16][4] = "Shots off Target: 28";
    // Guimaraes
    strPlayerStats[17][0] = "Appearances: 17";
    strPlayerStats[17][1] = "Goals: 5";
    strPlayerStats[17][2] = "Assists: 1";
    strPlayerStats[17][3] = "Big Chances Created: 3";
    strPlayerStats[17][4] = "Tackle Success: 52%";
    // Ronaldo
    strPlayerStats[18][0] = "Appearances: 30";
    strPlayerStats[18][1] = "Goals: 18";
    strPlayerStats[18][2] = "Assists: 3";
    strPlayerStats[18][3] = "Shooting Accuracy: 39%";
    strPlayerStats[18][4] = "Goals per Match: 0.60";
    // De Bruyne
    strPlayerStats[19][0] = "Appearances: 30";
    strPlayerStats[19][1] = "Goals: 15";
    strPlayerStats[19][2] = "Assists: 8";
    strPlayerStats[19][3] = "Big Chances Created: 16";
    strPlayerStats[19][4] = "Goals per Match: 0.50";
    
    // Player Prediction
    strPlayerPrediction[0] = "James Maddison should continue to be the main focal point of Leicester City's attack and expects to have another solid season. Status: Solid pick";
   strPlayerPrediction[1] = "Solanke's breakthrough season in the lower tier of English football should be taken notice but has not shown his ability in the Premier League in past years. Status: Risky";
    strPlayerPrediction[2] = "As a defender, Marc Cucurella is an excellent option for your backline as he plays for a solid team and is involved in attacking plays as well. Status: Definitely pick.";
      strPlayerPrediction[3] = "Christian Eriksen's return from cardiac arrest is nothing short of spectacular! But as of right now, he is out of contract at Brentford and there are doubts he will stay. Status: Uncertain";
    strPlayerPrediction[4] = "20-year-old academy graduate Bukayo Saka has been solid according to his numbers. It is expected that he continues to improve his scoring and assisting for Arsenal. Status: Solid choice";
    strPlayerPrediction[5] = "Matthew Cash was one of the top right-backs in the league last year. If Aston Villa continues to be a solid team, Cash will be one of the best defenders available for your fantasy squad. Status: Definitely pick";
    strPlayerPrediction[6] = "Mohamed Salah is one of the best players in the world because of his consistency to score goals for Liverpool. He is staying 100% next season and should be your first pick for your squad! Status: Pick for sure!";
    strPlayerPrediction[7] = "Alexander Mitrovic scored a record-breaking 43 goals last season in the lower tier. But, he has been poor in the Premier League in past seasons and Fulham is known for getting demoted when entering the Premier League. Status: Risky";
    strPlayerPrediction[8] = "James Ward-Prowse is one of the best freekick takers in the world! However, his team is very inconsistent which can be very frustrating if he is in your squad. Status: Average pick.";
    strPlayerPrediction[9] = "Wilfred Zaha has been Palace's best winger for several years. He has the teammates and talent to reach similar numbers to last season. Status: Solid pick";
    strPlayerPrediction[10] = "Jordon Pickford was a part of a horrendous Everton team last season finishing with only 7 clean sheets ranked 15th in the league. It is very difficult to predict if Pickford and his team will improve. Status: Stay away";
    strPlayerPrediction[11] = "Raphinha had a solid season even though he almost got relegated. There is uncertainty if he will remain a Leeds player next year as lots of clubs are interested in his services. Status: Uncertain";
    strPlayerPrediction[12] = "Mason Mount had an excellent season for one of the best teams in the world. He will likely be as good if not better next year. Status: Definitely pick";
    strPlayerPrediction[13] = "Declan Rice was a huge part of his team reaching 7th in the league. However, he is more of a defensive midfielder and may not produce good fantasy numbers. Status: Would avoid";
    strPlayerPrediction[14] = "Jose Sa was a vital part of Wolves' season and showed he is one of the best goalkeepers in the league. We expect that Sa keeps up his good form next season. Status: Solid pick";
    strPlayerPrediction[15] = "Heung Min Son showed he is a remarkable player tying with Salah for the most goals last season. Tottenham is likely to improve next season and Son should be a top pick for your squad. Status: Pick for sure";
    strPlayerPrediction[16] = "Brennan Johnson was a break-out striker in the lower tier division last season. However, he is a high-risk pick as it is his first time in the Premier League. Status: Very risky";
    strPlayerPrediction[17] = "Late signing Bruno Guimaraes proved his worth for Newcastle in only 17 games. Guimaraes is likely to have better numbers next season as he'll have more appearances. Status: Solid pick";
    strPlayerPrediction[18] = "Cristiano Ronaldo was one of the very few Man United players who performed last season. Even though he will be 38 soon, one of the GOATs of the game will be a good choice for your squad. Status: Solid pick";
    strPlayerPrediction[19] = "Midfielder Kevin De Bruyne once again had the strongest impact in Man City winning the league. The player of the season will put up solid numbers next season. Status: Pick for sure!";
    
  }
  
}