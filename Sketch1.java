import processing.core.PApplet;
import processing.core.PFont; // Installing fonts
import processing.core.PImage; // Import Image Library

public class Sketch1 extends PApplet {
  // global variables

  // Teams
	String[] strTeams = {"Leicester City", "Bournemouth", "Brighton", "Brentford", "Arsenal", "Aston Villa", "Liverpool", "Fulham", "Southampton", "Crystal Palace", "Everton", "Leeds United", "Chelsea", "West Ham United",  "Wolverhampton Wanderers", "Tottenham Hotspur", "Nottingham Forest", "Newcastle United", "Manchester United", "Manchester City"};

  // Players
  String[] strPlayers = new String[20];

  // Prediction
  String[] strTeamPrediction = new String[20];
  String[] strPlayerPrediction = new String[20];

  // Team Analysis
  String[] strAnalysis = new String[20];

  // Stats
  String[][] strTeamStats = new String[20][4];
  String[][] strPlayerStats = new String[20][5];

  String strTeamSelected;
  String strPlayerSelected;
  int intTeamCount;
  int intPlayerCount;
  int intStatCount;
  boolean blnMainScreen = false;
  boolean blnTeamScreen = false;
  boolean blnPlayer = false;
  boolean blnAnalysis = false;
  boolean blnPrediction = false;

  // Font Variables
  PFont title;
  PFont analysis;

  // Image Variables
  PImage imgLogo;
  PImage imgTeams;
  PImage [] imgPlayers = new PImage[20];
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(605, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 255, 51);

    //imgLogo = loadImage("premier-league-logo.png");
    //imgLogo.resize(imgLogo.width / 3, imgLogo.height / 3);
    imgTeams = loadImage("Teamlogos.png");
    imgTeams.resize(imgTeams.width / 2, imgTeams.height / 2);

    imgPlayers[0] = loadImage("maddison.png");
    imgPlayers[0].resize(imgPlayers[0].width / 2, imgPlayers[0].height / 2);
    imgPlayers[1] = loadImage("solanke.png");
    imgPlayers[1].resize(imgPlayers[1].width / 2, imgPlayers[1].height / 2);
    imgPlayers[2] = loadImage("cucurella.png");
    imgPlayers[2].resize(imgPlayers[2].width / 2, imgPlayers[2].height / 2);
    imgPlayers[3] = loadImage("eriksen.png");
    imgPlayers[3].resize(imgPlayers[3].width / 2, imgPlayers[3].height / 2);
    imgPlayers[4] = loadImage("saka.png");
    imgPlayers[4].resize(imgPlayers[4].width / 2, imgPlayers[4].height / 2);
    imgPlayers[5] = loadImage("cash.png");
    imgPlayers[5].resize(imgPlayers[5].width / 2, imgPlayers[5].height / 2);
    imgPlayers[6] = loadImage("salah.png");
    imgPlayers[6].resize(imgPlayers[6].width / 2, imgPlayers[6].height / 2);
    imgPlayers[7] = loadImage("mitrovic.png");
    imgPlayers[7].resize(imgPlayers[7].width / 2, imgPlayers[7].height / 2);
    imgPlayers[8] = loadImage("ward-prowse.png");
    imgPlayers[8].resize(imgPlayers[8].width / 2, imgPlayers[8].height / 2);
    imgPlayers[9] = loadImage("zaha.png");
    imgPlayers[9].resize(imgPlayers[9].width / 2, imgPlayers[9].height / 2);
    imgPlayers[10] = loadImage("pickford.png");
    imgPlayers[10].resize(imgPlayers[10].width / 2, imgPlayers[10].height / 2);
    imgPlayers[11] = loadImage("raphinha.png");
    imgPlayers[11].resize(imgPlayers[11].width / 2, imgPlayers[11].height / 2);
    imgPlayers[12] = loadImage("mount.png");
    imgPlayers[12].resize(imgPlayers[12].width / 2, imgPlayers[12].height / 2);
    imgPlayers[13] = loadImage("rice.png");
    imgPlayers[13].resize(imgPlayers[13].width / 2, imgPlayers[13].height / 2);
    imgPlayers[14] = loadImage("josesa.png");
    imgPlayers[14].resize(imgPlayers[14].width / 2, imgPlayers[14].height / 2);
    imgPlayers[15] = loadImage("son.png");
    imgPlayers[15].resize(imgPlayers[15].width / 2, imgPlayers[15].height / 2);
    imgPlayers[16] = loadImage("bjohnson.jpeg");
    imgPlayers[16].resize(imgPlayers[16].width / 5, imgPlayers[16].height / 5);
    imgPlayers[17] = loadImage("bruno.png");
    imgPlayers[17].resize(imgPlayers[17].width / 2, imgPlayers[17].height / 2);
    imgPlayers[18] = loadImage("ronaldo.png");
    imgPlayers[18].resize(imgPlayers[18].width / 2, imgPlayers[18].height / 2);
    imgPlayers[19] = loadImage("debruyne.png");
    imgPlayers[19].resize(imgPlayers[19].width / 2, imgPlayers[19].height / 2);
    
    // changing text
    title = createFont("Dialog.Input.bold", 80);
    //header = createFont("LetterGothicStd.otf", 50);
    analysis = createFont("Dialog.Input.italic", 20);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // calls title screen
    mainScreen();
    if(blnMainScreen == true){
      // calls selection screen
      teamScreen();
      if(blnPlayer == true){
        background(0, 255, 51);
        for(int i = 0; i <= 19; i++){
          if(intPlayerCount == i){
            fill(102, 0, 153);
            textFont(analysis, 25);
            text(strPlayers[i], 218, 30, 400, 400);
            textFont(analysis, 15);
            text(strPlayerStats[i][0], 200, 350, 250, 250);
            text(strPlayerStats[i][1], 200, 370, 250, 250);
            text(strPlayerStats[i][2], 200, 390, 250, 250);
            text(strPlayerStats[i][3], 200, 410, 250, 250);
            text(strPlayerStats[i][4], 200, 430, 250, 250);
            text(strPlayerPrediction[i], 100, 480, 400, 400);
            textFont(analysis, 30);
            image(imgPlayers[i], 165, 60);
            stroke(0);
            fill(255);
            rect(465, 440, 100, 40);
            textFont(analysis, 30);
            fill(102, 0, 153);
            text("EXIT", 480, 440, 92, 225);
            fill(255);
            rect(10, 440, 100, 40);
            fill(102, 0, 153);
            text("BACK", 20, 440, 92, 220);
            }  
          }
        }
      if(blnAnalysis == true){
        background(0, 255, 51);
        for(int y = 0; y <= 19; y++){
            if(intTeamCount == y){
              fill(102, 0, 153);
              textFont(analysis, 20);
              text(strAnalysis[y], 70, 50, 400, 400);
              textFont(analysis, 20);
              text(strTeamStats[y][0], 200, 350, 150, 250);
              text(strTeamStats[y][1], 200, 400, 150, 250);
              text(strTeamStats[y][2], 200, 450, 150, 250);
              text(strTeamStats[y][3], 200, 500, 150, 250);
              stroke(0);
              fill(255);
              rect(465, 440, 100, 40);
              textFont(analysis, 30);
              fill(102, 0, 153);
              text("EXIT", 480, 440, 92, 225);
              fill(255);
              rect(10, 440, 100, 40);
              fill(102, 0, 153);
              text("BACK", 20, 440, 92, 220);
              }
            }
          }
      if(blnPrediction == true){
        background(0, 255, 51);
        for(int i = 0; i <= 19; i++){
          if(intTeamCount == i){
            textFont(analysis, 23);
            text(strTeamPrediction[i], 40, 200, 500, 500);
            stroke(0);
            fill(255);
            rect(465, 440, 100, 40);
            textFont(analysis, 30);
            fill(102, 0, 153);
            text("EXIT", 480, 440, 92, 225);
            fill(255);
            rect(10, 440, 100, 40);
            fill(102, 0, 153);
            text("BACK", 20, 440, 92, 220);
            }
          }
        }
      }
  }
  
  // define other methods down here.
  /*
  * creating buttons that transitions the database
  * Author: Brady So
  */
  public void mouseClicked(){
    /*
    // debug window
    fill(255);
    rect(15, 10, 110, 50);
    fill(0);
    text(str(blnAnalysis), 15, 20);
    text(mouseY, 75, 20);
    */
    
    if(blnMainScreen == false){
      int intTeamArray = 0;
      for(int i = 1; i < 600; i += 147){
        for(int y = 163; y < 550; y += 85){
          if(mouseX >= i && mouseX <= (i + 147) && mouseY >= y && mouseY <= (y + 85)){
            strTeamSelected = strTeams[intTeamArray];
            intTeamCount = intTeamArray;
            intPlayerCount = intTeamArray;
            blnMainScreen = true;
            }
          intTeamArray++;
          }
        }
      } else if(blnMainScreen == true){
      if(mouseX >= 465 && mouseX <= 565 && mouseY <= 480 && mouseY >= 440){
        blnMainScreen = false;
        background(0, 255, 51);
        }
  
      if(blnPlayer == false && mouseX >= 200 && mouseX <= 380 && mouseY >= 20 && mouseY <= 70){
        blnPlayer = true;
        } else if(blnPlayer == true && mouseX >= 465 && mouseX <= 565 && mouseY <= 480 && mouseY >= 440){
          blnPlayer = false;
          background(0, 255, 51);
          } else if(blnPlayer == true && mouseX >= 10 && mouseX <= 110 && mouseY >= 440 && mouseY <= 485){
            blnPlayer = false;
            teamScreen();
          } 
      
      if(blnAnalysis == false && mouseX >= 200 && mouseX <= 360 && mouseY >= 170 && mouseY <= 220){
        blnAnalysis = true;
        } else if(blnAnalysis == true && mouseX >= 465 && mouseX <= 565 && mouseY <= 480 && mouseY >= 440){
          blnAnalysis = false;
          background(0, 255, 51);
        } else if(blnAnalysis == true && mouseX >= 10 && mouseX <= 110 && mouseY >= 440 && mouseY <= 485){
            blnAnalysis = false;
            teamScreen();
          } 
      if(blnPrediction == false && mouseX >= 200 && mouseX <= 380 && mouseY >= 370 && mouseY <= 420){
        blnPrediction = true;
        } else if(blnPrediction == true && mouseX >= 465 && mouseX <= 565 && mouseY <= 480 && mouseY >= 440){
          blnPrediction = false;
          background(0, 255, 51);
        } else if(blnPrediction == true && mouseX >= 10 && mouseX <= 110 && mouseY >= 440 && mouseY <= 485){
            blnPrediction = false;
            teamScreen();
          }  
      }
      if(blnMainScreen == true && mouseX >= 175 && mouseX <= 310 && mouseY >= 410 && mouseY <= 450){
        blnMainScreen = false;
        background(0, 255, 51);
      }
      
  }
  /*
  * Creating main screen
  * Author: Brady So
  */
  public void mainScreen() {
    // title
    textFont(title, 25);
    strokeWeight(15);
    fill(102, 0, 153);
    text("The 2022/2023 PREMIER LEAGUE Fantasy", 20, 50);
    text("Helper and Predictor!", 150, 80);
    textFont(title, 25);
    text("Click on a team to get started!", 90, 120);
    textFont(analysis, 25);

    int count = 0;
    for (int i = 0; i < 500; i = i+= 150)
    {
      for (int j = 170; j < 500; j+= 80)
      {
        strokeWeight(2);
        stroke(0);
        fill(255);
        rect(i, j, 150, 90);
        
        if(count <= 19){
          fill(102, 0, 153);
          textFont(analysis, 15);
          text(strTeams[count], i + 10, j + 40, 150, 200);
          }
        count++;
      }
    }
    
  }
  /*
  * Creating sections for player, team analysis and team prediction
  * Author: Brady So
  */
  public void teamScreen() {
    background(0, 255, 51);
    stroke(0);
    fill(255);
    rect (465, 440, 100, 40);
    textFont(analysis, 30);
    fill(102, 0, 153);
    text("EXIT", 480, 440, 92, 225);
    stroke(255);
    
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
    strPlayerPrediction[10] = "Jordon Pickford was a part of a horrendous Everton team last season finishing with only 7 clean sheets and ranked 15th in the league. It is very difficult to predict if Pickford and his team will improve. Status: Stay away";
    strPlayerPrediction[11] = "Raphinha had a solid season even though he almost got relegated. There is uncertainty if he will remain a Leeds player next year as lots of clubs are interested in his services. Status: Uncertain";
    strPlayerPrediction[12] = "Mason Mount had an excellent season for one of the best teams in the world. He will likely be as good if not better next year. Status: Definitely pick";
    strPlayerPrediction[13] = "Declan Rice was a huge part of his team reaching 7th in the league. However, he is more of a defensive midfielder and may not produce good fantasy numbers. Status: Would avoid";
    strPlayerPrediction[14] = "Jose Sa was a vital part of Wolves' season and showed he is one of the best goalkeepers in the league. We expect that Sa keeps up his good form next season. Status: Solid pick";
    strPlayerPrediction[15] = "Heung Min Son showed he is a remarkable player tying with Salah for the most goals last season. Tottenham is likely to improve next season and Son should be a top pick for your squad. Status: Pick for sure";
    strPlayerPrediction[16] = "Brennan Johnson was a break-out striker in the lower tier division last season. However, he is a high-risk pick as it is his first time in the Premier League. Status: Very risky";
    strPlayerPrediction[17] = "Late signing Bruno Guimaraes proved his worth for Newcastle in only 17 games. Guimaraes is likely to have better numbers next season as he'll have more appearances. Status: Solid pick";

    strPlayerPrediction[18] = "Cristiano Ronaldo was one of the very few Man United players who performed last season. Even though he will be 38 soon, one of the GOATs of the game will be a good choice for your squad. Status: Solid pick";
    
    strPlayerPrediction[19] = "Midfielder Kevin De Bruyne once again had the strongest impact in Man City winning the league. The player of the season will put up solid numbers next season. Status: Pick for sure!";

    // Leicester City
    strTeamStats[0][0] = "Points: 52";
    strTeamStats[0][1] = "Wins: 14";
    strTeamStats[0][2] = "Draws: 10";
    strTeamStats[0][3] = "Losses: 14";
    // Bournemouth
    strTeamStats[1][0] = "Points: 88";
    strTeamStats[1][1] = "Wins: 25";
    strTeamStats[1][2] = "Draws: 13";
    strTeamStats[1][3] = "Losses: 8";
     // Brighton and Hove Albion
    strTeamStats[2][0] = "Points: 51";
    strTeamStats[2][1] = "Wins: 12";
    strTeamStats[2][2] = "Draws: 15";
    strTeamStats[2][3] = "Losses: 11";
    // Brentford
    strTeamStats[3][0] = "Points: 46";
    strTeamStats[3][1] = "Wins: 13";
    strTeamStats[3][2] = "Draws: 7";
    strTeamStats[3][3] = "Losses: 18";
    // Arsenal
    strTeamStats[4][0] = "Points: 69";
    strTeamStats[4][1] = "Wins: 22";
    strTeamStats[4][2] = "Draws: 3";
    strTeamStats[4][3] = "Losses: 13";
    // Aston Villa
    strTeamStats[5][0] = "Points: 45";
    strTeamStats[5][1] = "Wins: 13";
    strTeamStats[5][2] = "Draws: 6";
    strTeamStats[5][3] = "Losses: 19";
    // Liverpool
    strTeamStats[6][0] = "Points: 92";
    strTeamStats[6][1] = "Wins: 28";
    strTeamStats[6][2] = "Draws: 8";
    strTeamStats[6][3] = "Losses: 2";
    // Fulham
    strTeamStats[7][0] = "Points: 90";
    strTeamStats[7][1] = "Wins: 27";
    strTeamStats[7][2] = "Draws: 9";
    strTeamStats[7][3] = "Losses: 10";
    // Southampton
    strTeamStats[8][0] = "Points: 40";
    strTeamStats[8][1] = "Wins: 9";
    strTeamStats[8][2] = "Draws: 13";
    strTeamStats[8][3] = "Losses: 16";
    // Crystal Palace
    strTeamStats[9][0] = "Points: 48";
    strTeamStats[9][1] = "Wins: 11";
    strTeamStats[9][2] = "Draws: 15";
    strTeamStats[9][3] = "Losses: 12";
    // Everton
    strTeamStats[10][0] = "Points: 39";
    strTeamStats[10][1] = "Wins: 11";
    strTeamStats[10][2] = "Draws: 6";
    strTeamStats[10][3] = "Losses: 21";
    // Leeds United
    strTeamStats[11][0] = "Points: 38";
    strTeamStats[11][1] = "Wins: 9";
    strTeamStats[11][2] = "Draws: 11";
    strTeamStats[11][3] = "Losses: 18";
    // Chelsea
    strTeamStats[12][0] = "Points: 74";
    strTeamStats[12][1] = "Wins: 21";
    strTeamStats[12][2] = "Draws: 11";
    strTeamStats[12][3] = "Losses: 6";
    // West Ham United
    strTeamStats[13][0] = "Points: 56";
    strTeamStats[13][1] = "Wins: 16";
    strTeamStats[13][2] = "Draws: 8";
    strTeamStats[13][3] = "Losses: 14";
    // Wolverhampton Wanderers
    strTeamStats[14][0] = "Points: 51";
    strTeamStats[14][1] = "Wins: 15";
    strTeamStats[14][2] = "Draws: 6";
    strTeamStats[14][3] = "Losses: 17";
    // Tottenham Hotspur
    strTeamStats[15][0] = "Points: 71";
    strTeamStats[15][1] = "Wins: 22";
    strTeamStats[15][2] = "Draws: 5";
    strTeamStats[15][3] = "Losses: 11";
    // Notmm Forest
    strTeamStats[16][0] = "Points: 80";
    strTeamStats[16][1] = "Wins: 23";
    strTeamStats[16][2] = "Draws: 11";
    strTeamStats[16][3] = "Losses: 12";
    // Newcastle United
    strTeamStats[17][0] = "Points: 49";
    strTeamStats[17][1] = "Wins: 13";
    strTeamStats[17][2] = "Draws: 10";
    strTeamStats[17][3] = "Losses: 15";
    // Manchester United
    strTeamStats[18][0] = "Points: 58";
    strTeamStats[18][1] = "Wins: 16";
    strTeamStats[18][2] = "Draws: 10";
    strTeamStats[18][3] = "Losses: 12";
    // Man City
    strTeamStats[19][0] = "Points: 93";
    strTeamStats[19][1] = "Wins: 29";
    strTeamStats[19][2] = "Draws: 6";
    strTeamStats[19][3] = "Losses: 3";

    // Leicester
    strAnalysis[0] = "Leicester City haven't had the greatest success this season. Last-minute efforts put the team back into form and managed to clutch up an 8th place finish. Unfortunate injuries and too many changes to their defensive line have caused many damaging effects to their team performance.";
    // Bournemouth
    strAnalysis[1] = "Bournemouth had the best defence in the Championship only conceding 39 goals and won automatic promotion. However, they'll need more firepower to prove they are a Premier League team.";
    // Brighton and Hove Albion
    strAnalysis[2] = "Brighton and Hove Albion played out of their minds this season. A 9th at first glance may seem mediocre for many viewers, but that is the highest they've ever placed in the league. Their playstyle and chemistry work wonders for them and they are looking to keep this streak going.";
    // Brentford
    strAnalysis[3] = "Brentford had an amazing debut season in the top level beating good teams like Chelsea and Arsenal! However, it was the arrival of Christian Eriksen and the goals from Ivan Toney that made it a memorable season for their fans.";
    // Arsenal
    strAnalysis[4] = "Given their reputation and roster, it is fair to say that Arsenal underperformed. The new manager Mikel Arteta has made many unwelcome changes to their team and their internal conflict is showing on the field.";
    // Aston Villa
    strAnalysis[5] = "Villa has had a decent season with former legend Steven Gerrard at their management. With many key star players at their disposal, they placed as well as they could with their resources and investments they currently have.";
    // Liverpool
    strAnalysis[6] = "Liverpool have had a great season with numerous wins and the fewest losses of the entire league. Second, only next to Man City, they are the most reliable team in the league due to their unmatched consistency in the past few years. Their star players will lead them to win as many games as they possibly can.";
    // Fulham
    strAnalysis[7] = "Following their relegation, they were looking to reclaim their place back in the Premier League. And they showed that when it's time to show up, they showed up! They played phenomenally following 3-0 and 7-0 wins against other teams, securing their spot in the Premier League once more.";
    // Southhampton
    strAnalysis[8] = "The best way to describe their season is purely average. Just average. From an outside perspective, it is hard to pinpoint whether they are making any progress. They don't have the same resources as some of the upper teams, but that is no excuse for placing mid-table every season for years on end.";
    // Crystal Palace
    strAnalysis[9] = "At the start of the season. Crystal Palace was looking like one of the teams who could potentially be relegated. A squad full of novice players and managers proved to have one of their best seasons with unlimited potential.";
    // Everton
    strAnalysis[10] = "Everton have had one of their worst seasons since decades ago. They placed 16th, their worst finish since 03-04. Poor management along with uninspiring players led to a truly miserable season for Everton fans.";
    // Leeds United
    strAnalysis[11] = "Last season, Leeds became one of the most prominent emerging teams under Marcelo Bielsa. In just a year, the Argentine legend is unemployed and Leeds is the worst placing team in the Premier League. With a manager who hardly inspired any strategies and injuries affecting many key players, they are looking to make vital changes during the summer for the next season.";
    // Chelsea
    strAnalysis[12] = "With a squad full of world-class players that can easily snatch the trophy, their season was nothing short of exceptional. However, the internal conflict between their star striker Lukaku and manager Thomas Tuchel over their change of playstyle led to damaging outcomes for the whole squad.";
    // West Ham United
    strAnalysis[13] = "West Ham United are one of the strongest contenders in a battle for 6th. With Declan Rice, arguably the best midfielder in the league continuing to impress, and other star players playing to the top of their form, West Ham United has had one of the best seasons they've ever had in history.";
    // Wolverhampton Wanderers
    strAnalysis[14] = "As a transitional season for the Wolves, it wasn't expected for them to perform well. Their inability to score goals has prevented them from placing higher in the league. Their goalkeeper, however, Jose Sa, outperformed what is expected from him and managed to save his team countless times. ";
    // Tottenham
    strAnalysis[15] = "Tottenham performed phenomenally given their roster, but with Heung-min Son and Harry Kane with their unimaginable goal-scoring prowess, Tottenham managed to deny Arsenal their fourth place and make it to the Champions League.";
    // Nottingham Forest 
    strAnalysis[16] = "Nottingham Forest played well the entire season and following a tense matchup against Huddersfield, they won 1-0, effectively ending their 23-year absence from the Premier League. ";
    // Newcastle United
    strAnalysis[17] = "After many unlucky changes made to management, they turned to Eddie Howe, the former Bournemouth's manager. After some smart transfers and many tactical changes, the future is looking bright for once for the boys in black and white. ";
    // Manchester United
    strAnalysis[18] = "Manchester United has been on a steady decline over the years. Even with signing arguably the best player in the world (CR7), there have been reports of disharmony and toxicity in the team's behind the scenes, which has affected their playing on the field.";
    // Manchester City
    strAnalysis[19] = "Manchester City has had a fantastic season with many wins under their belt and only a few draws and losses. Their roster consists of many well-known and strong players and with Pep Guardiola at the helm commanding the players, they are looking like one of the most dominant Premier League teams we've seen in years.";

    strTeamPrediction[0] = "Leicester are capable to finish above West Ham if they remain healthy. They have the best squad to gatecrash into the top 6. Predicted finish: 7th";
    strTeamPrediction[1] = "Bournemouth are similar to Fulham as they both struggle when in the Premier League. The lack of top players makes them a relegation favourite. Predicted finish: 20th";
    strTeamPrediction[2] = "Brighton will need a better striker if they desire similar or better results next season. With most teams getting stronger, Brighton likely declines a bit. Predicted finish: 11th";
    strTeamPrediction[3] = "Brentford could be at real risk of second season syndrome and it can worsen if players like Ivan Toney and Christian Eriksen decide to leave. Predicted finish: 14th";
    strTeamPrediction[4] = "Arsenal are the youngest team in the league but they lack the experience against the top teams. With the players having to play Europa League on Thursdays and Premier League Sunday games. It is uncertain if they can achieve a higher standing. Predicted Finish: 5th or 6th";
    strTeamPrediction[5] = "Aston Villa are enjoying a big summer of recruitment and aim to be in the top half as a minimum requirement. Predicted finish: 9th";
    strTeamPrediction[6] = "Liverpool is out for revenge after finishing 2nd for the second time in 4 years. The core of world-class players is likely to stay and once again fight for the league title. Predicted Finish: 2nd or 1st";
    strTeamPrediction[7] = "Fulham are known as a yoyo team and will be one of the favourites to be relegated next season. Predicted finish: 19th";
    strTeamPrediction[8] = "Southampton seem to be comfortable with midtable mediocrity and their inconsistencies can cause a very stressful season for their fans. Predicted finish: 15th";
    strTeamPrediction[9] = "The young Crystal Palace will look to remain steady and exciting for all fans to watch. However, it may be difficult for them to reach the top 10. Predicted finish: 12th";
    strTeamPrediction[10] = "After a miserable season for Everton, their financial struggles to sign new players can be the downfall for Frank Lampard's men. Predicted finish: 17th";
    strTeamPrediction[11] = "With their two best players likely to leave next season. It leaves Leeds United in a very rough place if they want to avoid relegation next season. Predicted finish: 18th";
    strTeamPrediction[12] = "Chelsea is an excellent team but aren't consistent enough like Liverpool and Man City. If their players start to perform consistently, they have a chance to compete with the top 2 teams. Predicted Finish: 3rd";
    strTeamPrediction[13] = "West Ham United likely continue to contend for the top 6 spots as their stars continue to develop, but there are teams who could catch up soon. Predicted finish: 8th";
    strTeamPrediction[14] = "Wolves could experience a decline in their standing if signings are not made to improve their goalscoring ability. Predicted finish: 13th";
    strTeamPrediction[15] = "Tottenham had a miracle season reaching 4th place after a horrid start to last season. With manager Antonio Conte and new players incoming, Tottenham will look to improve next season. Predicted Finish: 4th or 3rd if lucky";
    strTeamPrediction[16] = "Similar to Brentford last season, Nottingham Forest is an unproven team who is looking to make a statement next season. Predicted finish: 16th";
    strTeamPrediction[17] = "Newcastle United is the richest club in the world and will likely make a splash on new players this summer. With a solid manager like Howe and better players incoming, they have huge potential to improve next season. Predicted finish: 8th";
    strTeamPrediction[18] = "Manchester United are under a new manager in Erik Ten Hag and look to improve from their worst point total ever of 58. With a huge number of players leaving and coming this summer, it is highly unpredictable what their season could be. Predicted finish: 5th or 6th";
    strTeamPrediction[19] = "Man City will continue to be a title contender next season with their world-class players, amazing manager and recently signed superstar striker Erling Haaland. Predicted Finish: 1st or 2nd";

    
    for(int i = 0; i <= 19; i++){
      if(intTeamCount == i){
        background(0, 255, 51);
        stroke(102, 0, 153);
        fill(255);
        rect(210, 20, 150, 50);
        fill(102, 0, 153);
        textFont(analysis, 20);
        text("Player", 250, 50);

        stroke(102, 0, 153);
        fill(255);
        rect(200, 170, 160, 50);
        fill(102, 0, 153);
        text("Team Analysis", 205, 200);

        stroke(102, 0, 153);
        fill(255);
        rect(200, 370, 180, 50);
        fill(102, 0, 153);
        text("Team Prediction", 205, 400);
        
        noFill();
        rect(465, 440, 100, 40);
        textFont(analysis, 30);
        fill(102, 0, 153);
        text("EXIT", 480, 440, 92, 225);
      }
    }
  }
  
}