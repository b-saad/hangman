package hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.Timer;


public class HangmanView extends javax.swing.JFrame {

    // Class variable/objects delcartion and initilzation to be accessed from many methods
    String word;
    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> guesses = new ArrayList<>();
    ArrayList<String> correctGuesses = new ArrayList<>();
    int numGuesses = 8;
    Boolean victory;
    long start;
    long finish;
    Timer timer;
    
    public HangmanView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wordEnterFrame = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        wordTextField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        gameFrame = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        wordLabel = new javax.swing.JLabel();
        guessesLabel = new javax.swing.JLabel();
        guessTextField = new javax.swing.JTextField();
        enterGuessButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        alreadyGuessedLabel = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        rightArm = new javax.swing.JLabel();
        leftArm = new javax.swing.JLabel();
        rightLeg = new javax.swing.JLabel();
        leftLeg = new javax.swing.JLabel();
        body = new javax.swing.JLabel();
        mouth = new javax.swing.JLabel();
        eyes = new javax.swing.JLabel();
        noose = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        categoryFrame = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        fruitAndVeggiesButton = new javax.swing.JButton();
        jobsButton = new javax.swing.JButton();
        moviesButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        instrumentsButton = new javax.swing.JButton();
        sportsButton = new javax.swing.JButton();
        superheroesButton = new javax.swing.JButton();
        transportationButton = new javax.swing.JButton();
        adjectivesButton = new javax.swing.JButton();
        verbsButton = new javax.swing.JButton();
        animalsButton = new javax.swing.JButton();
        weatherButton = new javax.swing.JButton();
        carBrandsButton = new javax.swing.JButton();
        flowersButton = new javax.swing.JButton();
        gameOverFrame = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        guessesLabel2 = new javax.swing.JLabel();
        nameTextfield = new javax.swing.JTextField();
        enterNameLabel = new javax.swing.JLabel();
        enterNameButton = new javax.swing.JButton();
        playAgainButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        confirmationLabel = new javax.swing.JLabel();
        congratsLabel = new javax.swing.JLabel();
        viewScoresButton = new javax.swing.JButton();
        scoreFrame = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        scoresTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreTextArea = new javax.swing.JTextArea();
        playAgainButton1 = new javax.swing.JButton();
        exitButton1 = new javax.swing.JButton();
        helpFrame = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        scoresTitleLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        helpTextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        hangmanTitle = new javax.swing.JLabel();
        randomWordButton = new javax.swing.JButton();
        chooseWordButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Enter Word");

        wordTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        wordTextField.setForeground(new java.awt.Color(0, 204, 204));
        wordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordTextFieldActionPerformed(evt);
            }
        });

        enterButton.setBackground(new java.awt.Color(255, 255, 255));
        enterButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterButton.setForeground(new java.awt.Color(0, 204, 204));
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(wordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(enterButton)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(wordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(enterButton)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout wordEnterFrameLayout = new javax.swing.GroupLayout(wordEnterFrame.getContentPane());
        wordEnterFrame.getContentPane().setLayout(wordEnterFrameLayout);
        wordEnterFrameLayout.setHorizontalGroup(
            wordEnterFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wordEnterFrameLayout.setVerticalGroup(
            wordEnterFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        wordLabel.setForeground(new java.awt.Color(255, 255, 255));
        wordLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(wordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 80, 450, 51));

        guessesLabel.setBackground(new java.awt.Color(255, 255, 255));
        guessesLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        guessesLabel.setForeground(new java.awt.Color(255, 255, 255));
        guessesLabel.setText("Previous Guesses: ");
        jPanel4.add(guessesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 620, 45));

        guessTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        guessTextField.setForeground(new java.awt.Color(0, 204, 204));
        guessTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(guessTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 370, -1));

        enterGuessButton.setBackground(new java.awt.Color(255, 255, 255));
        enterGuessButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterGuessButton.setForeground(new java.awt.Color(0, 204, 204));
        enterGuessButton.setText("Enter");
        enterGuessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterGuessButtonActionPerformed(evt);
            }
        });
        jPanel4.add(enterGuessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        nextButton.setBackground(new java.awt.Color(255, 255, 255));
        nextButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(0, 204, 204));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel4.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        alreadyGuessedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alreadyGuessedLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(alreadyGuessedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 245, 18));

        head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Head.png"))); // NOI18N
        head.setIconTextGap(1);
        jPanel4.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        rightArm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Right Arms.png"))); // NOI18N
        jPanel4.add(rightArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        leftArm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Left Arm.png"))); // NOI18N
        jPanel4.add(leftArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        rightLeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Right Leg.png"))); // NOI18N
        jPanel4.add(rightLeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        leftLeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Left Leg.png"))); // NOI18N
        jPanel4.add(leftLeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 30, -1));

        body.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Body.png"))); // NOI18N
        jPanel4.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, 73));

        mouth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Mouth.png"))); // NOI18N
        jPanel4.add(mouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        eyes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Eyes.png"))); // NOI18N
        jPanel4.add(eyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        noose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/hangman noose thing.png"))); // NOI18N
        noose.setText("jLabel1");
        jPanel4.add(noose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 250));

        timerLabel.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(timerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 100, 50));

        javax.swing.GroupLayout gameFrameLayout = new javax.swing.GroupLayout(gameFrame.getContentPane());
        gameFrame.getContentPane().setLayout(gameFrameLayout);
        gameFrameLayout.setHorizontalGroup(
            gameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameFrameLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gameFrameLayout.setVerticalGroup(
            gameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        categoryFrame.setBackground(new java.awt.Color(102, 255, 102));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        fruitAndVeggiesButton.setBackground(new java.awt.Color(255, 255, 255));
        fruitAndVeggiesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fruitAndVeggiesButton.setForeground(new java.awt.Color(0, 204, 204));
        fruitAndVeggiesButton.setText("Fruits and Vegetables");
        fruitAndVeggiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitAndVeggiesButtonActionPerformed(evt);
            }
        });

        jobsButton.setBackground(new java.awt.Color(255, 255, 255));
        jobsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jobsButton.setForeground(new java.awt.Color(0, 204, 204));
        jobsButton.setText("Jobs");
        jobsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsButtonActionPerformed(evt);
            }
        });

        moviesButton.setBackground(new java.awt.Color(255, 255, 255));
        moviesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        moviesButton.setForeground(new java.awt.Color(0, 204, 204));
        moviesButton.setText("Movies");
        moviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesButtonActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Choose Your Category!");

        instrumentsButton.setBackground(new java.awt.Color(255, 255, 255));
        instrumentsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instrumentsButton.setForeground(new java.awt.Color(0, 204, 204));
        instrumentsButton.setText("Musical Instruments");
        instrumentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentsButtonActionPerformed(evt);
            }
        });

        sportsButton.setBackground(new java.awt.Color(255, 255, 255));
        sportsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sportsButton.setForeground(new java.awt.Color(0, 204, 204));
        sportsButton.setText("Sports");
        sportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsButtonActionPerformed(evt);
            }
        });

        superheroesButton.setBackground(new java.awt.Color(255, 255, 255));
        superheroesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        superheroesButton.setForeground(new java.awt.Color(0, 204, 204));
        superheroesButton.setText("Superheroes");
        superheroesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superheroesButtonActionPerformed(evt);
            }
        });

        transportationButton.setBackground(new java.awt.Color(255, 255, 255));
        transportationButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transportationButton.setForeground(new java.awt.Color(0, 204, 204));
        transportationButton.setText("Transportation");
        transportationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportationButtonActionPerformed(evt);
            }
        });

        adjectivesButton.setBackground(new java.awt.Color(255, 255, 255));
        adjectivesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adjectivesButton.setForeground(new java.awt.Color(0, 204, 204));
        adjectivesButton.setText("Adjectives");
        adjectivesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjectivesButtonActionPerformed(evt);
            }
        });

        verbsButton.setBackground(new java.awt.Color(255, 255, 255));
        verbsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        verbsButton.setForeground(new java.awt.Color(0, 204, 204));
        verbsButton.setText("Verbs");
        verbsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verbsButtonActionPerformed(evt);
            }
        });

        animalsButton.setBackground(new java.awt.Color(255, 255, 255));
        animalsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        animalsButton.setForeground(new java.awt.Color(0, 204, 204));
        animalsButton.setText("Animals");
        animalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalsButtonActionPerformed(evt);
            }
        });

        weatherButton.setBackground(new java.awt.Color(255, 255, 255));
        weatherButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        weatherButton.setForeground(new java.awt.Color(0, 204, 204));
        weatherButton.setText("Weather");
        weatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weatherButtonActionPerformed(evt);
            }
        });

        carBrandsButton.setBackground(new java.awt.Color(255, 255, 255));
        carBrandsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carBrandsButton.setForeground(new java.awt.Color(0, 204, 204));
        carBrandsButton.setText("Car Brands");
        carBrandsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carBrandsButtonActionPerformed(evt);
            }
        });

        flowersButton.setBackground(new java.awt.Color(255, 255, 255));
        flowersButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flowersButton.setForeground(new java.awt.Color(0, 204, 204));
        flowersButton.setText("Flowers");
        flowersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(carBrandsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(flowersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(animalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adjectivesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(instrumentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weatherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jobsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transportationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fruitAndVeggiesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(superheroesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(moviesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verbsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instrumentsButton)
                            .addComponent(weatherButton)
                            .addComponent(flowersButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sportsButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adjectivesButton)
                            .addComponent(fruitAndVeggiesButton)
                            .addComponent(superheroesButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(animalsButton)
                            .addComponent(jobsButton)
                            .addComponent(transportationButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carBrandsButton)
                            .addComponent(moviesButton)
                            .addComponent(verbsButton))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout categoryFrameLayout = new javax.swing.GroupLayout(categoryFrame.getContentPane());
        categoryFrame.getContentPane().setLayout(categoryFrameLayout);
        categoryFrameLayout.setHorizontalGroup(
            categoryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        categoryFrameLayout.setVerticalGroup(
            categoryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        guessesLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guessesLabel2.setForeground(new java.awt.Color(255, 255, 255));
        guessesLabel2.setText("Guesses");

        nameTextfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextfieldActionPerformed(evt);
            }
        });

        enterNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterNameLabel.setText("Please enter your name:");

        enterNameButton.setBackground(new java.awt.Color(255, 255, 255));
        enterNameButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterNameButton.setForeground(new java.awt.Color(0, 204, 204));
        enterNameButton.setText("Enter");
        enterNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameButtonActionPerformed(evt);
            }
        });

        playAgainButton.setBackground(new java.awt.Color(255, 255, 255));
        playAgainButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playAgainButton.setForeground(new java.awt.Color(0, 204, 204));
        playAgainButton.setText("Play Again");
        playAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 204, 204));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        confirmationLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmationLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmationLabel.setText(" ");

        congratsLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        congratsLabel.setForeground(new java.awt.Color(153, 255, 204));
        congratsLabel.setText("CONGRATS!");

        viewScoresButton.setBackground(new java.awt.Color(255, 255, 255));
        viewScoresButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewScoresButton.setForeground(new java.awt.Color(0, 204, 204));
        viewScoresButton.setText("Scores");
        viewScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewScoresButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameTextfield))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(guessesLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(enterNameButton)
                .addGap(19, 19, 19))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(confirmationLabel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(congratsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(playAgainButton)
                .addGap(69, 69, 69)
                .addComponent(viewScoresButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(congratsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guessesLabel2)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterNameLabel)
                    .addComponent(nameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterNameButton))
                .addGap(37, 37, 37)
                .addComponent(confirmationLabel)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playAgainButton)
                    .addComponent(exitButton)
                    .addComponent(viewScoresButton))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gameOverFrameLayout = new javax.swing.GroupLayout(gameOverFrame.getContentPane());
        gameOverFrame.getContentPane().setLayout(gameOverFrameLayout);
        gameOverFrameLayout.setHorizontalGroup(
            gameOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gameOverFrameLayout.setVerticalGroup(
            gameOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        scoresTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        scoresTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoresTitleLabel.setText("Scores!");

        scoreTextArea.setColumns(20);
        scoreTextArea.setRows(5);
        jScrollPane1.setViewportView(scoreTextArea);

        playAgainButton1.setBackground(new java.awt.Color(255, 255, 255));
        playAgainButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playAgainButton1.setForeground(new java.awt.Color(0, 204, 204));
        playAgainButton1.setText("Play Again");
        playAgainButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainButton1ActionPerformed(evt);
            }
        });

        exitButton1.setBackground(new java.awt.Color(255, 255, 255));
        exitButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(0, 204, 204));
        exitButton1.setText("Exit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(scoresTitleLabel))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(playAgainButton1)
                                .addGap(68, 68, 68)
                                .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 157, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(scoresTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playAgainButton1)
                    .addComponent(exitButton1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout scoreFrameLayout = new javax.swing.GroupLayout(scoreFrame.getContentPane());
        scoreFrame.getContentPane().setLayout(scoreFrameLayout);
        scoreFrameLayout.setHorizontalGroup(
            scoreFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        scoreFrameLayout.setVerticalGroup(
            scoreFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        scoresTitleLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        scoresTitleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        scoresTitleLabel1.setText("How to Play");

        helpTextArea.setColumns(20);
        helpTextArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        helpTextArea.setRows(5);
        helpTextArea.setText("The Rules of the Game\n\n1. Play individually or in groups. \n\n2. Choose to either have a random word selected or select your own word for friends to guess. \n    Click on the corresponding button.\n\n3. After clicking on:\n\n\ti. If you chose the “Random Word” button, then proceed to choose from a list of \n                       categories.\n\n\tii. If you chose the “Choose Word” button, then proceed to enter your own word \n                      into the space provided.\n\n4. After you are brought to the main game screen, have the student type a letter of the alphabet \n    into the space provided, then click the “Enter” button.\n\n5. Once a letter is chosen:\n\n\ti. If the letter is contained within the word, then it will appear in the white outlined \n                      box on the right hand side of the screen. All underscores containing the chosen \n                      letter will change into said letter. \n\n\tii. If the letter is not contained within the word, then it will appear beside the \n                      “Previous Guesses” label and a body part will be added to the hangman.\n\n6. If the user chooses to guess the full word (all letters included), then they may do so by typing \n    it into the space provided and clicking enter.\n \n\ti. If the word is correct, then the user wins the game.\n\n\tii. If the word is incorrect, then a body part is added to the hangman and the \n                       incorrect word is displayed by the “Previous Guesses” label.\n\n7. The game continues until:\n\n\ti. The word/phrase is guessed (all letters are revealed) – WINNER or,\n\n\tii. All the parts of the hangman are displayed – LOSER\n");
        jScrollPane2.setViewportView(helpTextArea);

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 204, 204));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 189, Short.MAX_VALUE)
                .addComponent(scoresTitleLabel1)
                .addGap(185, 185, 185))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(scoresTitleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout helpFrameLayout = new javax.swing.GroupLayout(helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(helpFrameLayout);
        helpFrameLayout.setHorizontalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        helpFrameLayout.setVerticalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setForeground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        hangmanTitle.setFont(new java.awt.Font("Goudy Stout", 0, 62)); // NOI18N
        hangmanTitle.setForeground(new java.awt.Color(255, 255, 255));
        hangmanTitle.setText("Hangman");

        randomWordButton.setBackground(new java.awt.Color(255, 255, 255));
        randomWordButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        randomWordButton.setForeground(new java.awt.Color(0, 204, 204));
        randomWordButton.setText("Random Word");
        randomWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomWordButtonActionPerformed(evt);
            }
        });

        chooseWordButton.setBackground(new java.awt.Color(255, 255, 255));
        chooseWordButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chooseWordButton.setForeground(new java.awt.Color(0, 204, 204));
        chooseWordButton.setText("Choose Word");
        chooseWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseWordButtonActionPerformed(evt);
            }
        });

        helpButton.setBackground(new java.awt.Color(255, 255, 255));
        helpButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helpButton.setForeground(new java.awt.Color(0, 204, 204));
        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(randomWordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chooseWordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hangmanTitle)
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(hangmanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseWordButton)
                    .addComponent(randomWordButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(helpButton)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chooseWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseWordButtonActionPerformed

        
        // Closes open frame
        dispose();
            
        // Sets the wordEnter Frame's location to the center of the screen 
        wordEnterFrame.pack();
        wordEnterFrame.setLocationRelativeTo(null);
            
        // Sets the frame to be visible on screen
        wordEnterFrame.setVisible(true);
    }//GEN-LAST:event_chooseWordButtonActionPerformed

    private void randomWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomWordButtonActionPerformed

        
        // Closes open frame
        dispose();
            
        // Sets the category Frame's location to the center of the screen 
        categoryFrame.pack();
        categoryFrame.setLocationRelativeTo(null);
            
        // Sets the frame to be visible on screen
        categoryFrame.setVisible(true);
        
    }//GEN-LAST:event_randomWordButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        
        
        // If statement checks if they user entered anyhting
        if (wordTextField.getText().trim().toUpperCase().isEmpty()) {
            
            // Sets label text to inform user that they need to guess a word
            titleLabel.setText("Please enter a word");
        } else {
            // Retrieves the users input and strips away trailing spaces and converts it to all caps, assigns it to "word"
            word = wordTextField.getText().trim().toUpperCase();

            // Sets the frame to be visible on screen
            wordEnterFrame.setVisible(false);

            // Calls the openGameFrame method
            openGameFrame();
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void enterGuessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterGuessButtonActionPerformed
        
        
        try {        
            // Retrieved the users guess and trims it of trailing spaces and converts it to all caps, assigns it to "guess"
            String guess = guessTextField.getText().trim().toUpperCase();

            // Resets the guessTextField and previous guesses label
            guessTextField.setText("");
            alreadyGuessedLabel.setText("");

            // If statement that checks if either the guesses or correctGuesses arraylist contains guess
            if (guesses.contains(guess) || correctGuesses.contains(guess)){

                // Sets the text of the alreadyGuessedLabel
                alreadyGuessedLabel.setText("You've already guessed that");

            } else {

                // If statement that checks if the length of the users guess is greater than 1
                if(guess.length() > 1){

                    // If statement that checks of the guess is the same or equal to word
                    if (guess.contentEquals(word)){

                        // If true, victory is set to true and the winOrLose method is called and victory is passed in 
                        victory = true;
                        winOrLose(victory);

                    } else {

                        // Adds the users guess to the guesses ArrayList
                        guesses.add(guess);

                        // Calls setGuessesLabel
                        setGuessesLabel();

                        // Calls the load Hangman part method
                        loadHangmanPart(); 
                    } 
                } else {

                    // Retrieves the text in the word label and splits it on the spaces and adds it a String Array
                    String[] labelTemp = wordLabel.getText().split(" ");

                    // If statement that checks if the word contains the users guess
                    if (word.contains(guess)){

                        // Adds guess to the correct Guesses ArrayList 
                        correctGuesses.add(guess);

                        // For loop, begins at the index of the guess in the word, runs while index is larger or = to 0, and then continues to search from each iteration of the char in the word
                        for (int index = word.indexOf(guess);
                            index >= 0;
                            index = word.indexOf(guess, index + 1))
                        {
                            // Sets the value at index value "index" to guess
                            // Done so the underscores match up with the blank spaces and guessed characters appear on screen
                            labelTemp[index] = guess;
                        }

                        // Resets the text of the wordLabel
                        wordLabel.setText("");

                        // (enhanced) for loop, loops to labelTemp Array and assigns each value to the string variable, current
                        for (String current: labelTemp){

                            // Sets the text of the label to the previous text plus the current value in the array
                            wordLabel.setText(wordLabel.getText() + current + " ");
                        } 

                        // If statement that checks if the wordLabel contains any underscore
                        if (wordLabel.getText().contains("_") == false){

                            // If true, that means all the characters were guessed

                            // Sets victory to true and calls winOrLose method and passes in victory
                            victory = true;
                            winOrLose(victory);;
                        }
                    } else {

                        // Adds the users guess to the guesses ArrayList
                        guesses.add(guess);

                        // Calls setGuessesLabel
                        setGuessesLabel();

                        // Calls the load Hangman part method
                        loadHangmanPart(); 
                    }
                }

                // If statement, that checks if the numGuesses is less than -
                if (numGuesses < 0){

                    // Sets victory to false and calls winOrLose method and passes in victory
                    victory = false;
                    winOrLose(victory);
                }
            }
        }   catch(ArrayIndexOutOfBoundsException e){
             
            // Sets the text of the already guessed label to inform user to enter a value
            alreadyGuessedLabel.setText("Please enter a guess");
                
             }
        
        

    }//GEN-LAST:event_enterGuessButtonActionPerformed

    private void carBrandsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carBrandsButtonActionPerformed
       
        
        // Calls readFile method and passes in text retrieved from Label
        readFile(carBrandsButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
        
    }//GEN-LAST:event_carBrandsButtonActionPerformed

    private void animalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalsButtonActionPerformed

     
        // Calls readFile method and passes in text retrieved from Label
        readFile(animalsButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_animalsButtonActionPerformed

    private void flowersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowersButtonActionPerformed

        
        // Calls readFile method and passes in text retrieved from Label
        readFile(flowersButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_flowersButtonActionPerformed

    private void moviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesButtonActionPerformed

        
        // Calls readFile method and passes in text retrieved from Label
        readFile(moviesButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_moviesButtonActionPerformed

    private void fruitAndVeggiesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitAndVeggiesButtonActionPerformed

        
        // Calls readFile method and passes in text retrieved from Label
        readFile(fruitAndVeggiesButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_fruitAndVeggiesButtonActionPerformed

    private void jobsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsButtonActionPerformed

        
        readFile(jobsButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_jobsButtonActionPerformed

    private void instrumentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentsButtonActionPerformed

        
        // Calls readFile method and passes in text retrieved from Label
        readFile(instrumentsButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_instrumentsButtonActionPerformed

    private void adjectivesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjectivesButtonActionPerformed


        // Calls readFile method and passes in text retrieved from Label
        readFile(adjectivesButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_adjectivesButtonActionPerformed

    private void superheroesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superheroesButtonActionPerformed

        
        // Calls readFile method and passes in text retrieved from Label
        readFile(superheroesButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_superheroesButtonActionPerformed

    private void sportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsButtonActionPerformed

        
        // Calls readFile method and passes in text retrieved from Label
        readFile(sportsButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_sportsButtonActionPerformed

    private void verbsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verbsButtonActionPerformed
        
        
        // Calls readFile method and passes in text retrieved from Label
        readFile(verbsButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_verbsButtonActionPerformed

    private void transportationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportationButtonActionPerformed


        // Calls readFile method and passes in text retrieved from Label
        readFile(transportationButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_transportationButtonActionPerformed

    private void weatherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weatherButtonActionPerformed

        
        // Calls readFile method and passes in text retrieved from Label
        readFile(weatherButton.getText());
        
        // Sets the categoryFrame's visibilty to false
        categoryFrame.setVisible(false);
        
        // Calls the openGameFrame method
        openGameFrame();
    }//GEN-LAST:event_weatherButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        
        // Sets the gameFrame's visibilty to false
        gameFrame.setVisible(false);
        
        // Sets the second Frame's location to the center of the screen 
        gameOverFrame.pack();
        gameOverFrame.setLocationRelativeTo(null);
            
        // Sets the frame to be visible on screen
        gameOverFrame.setVisible(true);
        
        // Makes the buttons invisible
        playAgainButton.setVisible(false);
        viewScoresButton.setVisible(false);
        exitButton.setVisible(false);
        
        // Sets the guesses label to the previous guesses labels text
        guessesLabel2.setText(guessesLabel.getText());
        
        // If statement that checks if victory is true 
        if (victory){
            
            // Sets the text of the congrats label to celebratory message
            congratsLabel.setText("Congrats! You won!");
        } else {
            
            // Sets the text of the congrats label to encouraging message
            congratsLabel.setText("Better luck next time!");
        }
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void wordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordTextFieldActionPerformed

    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        
        // Play again method called
        playAgain();      
    }//GEN-LAST:event_playAgainButtonActionPerformed

    private void enterNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameButtonActionPerformed


        // if statement that checks if the user entered a name
        if (nameTextfield.getText().isEmpty()) {
            
            // Sets the confirmation label to inform user to enter a name
            confirmationLabel.setText("Please Enter a name");
        } else {
            // Sets the confirmation label's thanking people for entering their name
            confirmationLabel.setText("Thank you for entering your name");

            // Makes the buttons invisible
            playAgainButton.setVisible(true);
            viewScoresButton.setVisible(true);
            exitButton.setVisible(true);

            // Creates new file type object and passes in the name of the scores file, assigns it to variable named file
            File file = new File("Scores.txt");

            // Try block
            // Creates new printwriter object that passes in a newly created filewriter object
            // FileWriter object is created by passing in the file, and true so that the data in the document is not erased and simply added on to
            try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {

                // If statement that checks if victory is true
                if (victory){

                    //If true, appends the users name, the word they guess and how many guesses it took them along with the time it took them to guess it, to the txt file
                    pw.write(nameTextfield.getText() + " guessed the word " + word + " with only  " + (8-numGuesses) + " incorrect guesses, in " + timerLabel.getText() + " seconds\r\n");
                } else {
                    // Appends the users name and the word they were unable to guess to the text document
                    pw.write(nameTextfield.getText() + " was not able to guess the word " + word + "\r\n");
                }

              // Catch Block, catchs IOException
            } catch (IOException e) {

                // Sets the confirmation label's visibility to true
                confirmationLabel.setText("Sorry the scores file was not found! Your score was not saved");

                // Prints stackTrace
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_enterNameButtonActionPerformed

    private void nameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextfieldActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       
        // Exit statement, that exits the program when the button is clicked 
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void playAgainButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButton1ActionPerformed

        
        // Disposes current JFrame
        dispose();
        
        // Sets the gameOverFrame's visibility to false
        scoreFrame.setVisible(false);
        
        // Creating a new JFrame object 
        JFrame frame = new HangmanView();
        
        // Seting the frame to visible to run the view
        frame.setVisible(true);
    }//GEN-LAST:event_playAgainButton1ActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        
        // Exits the program
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void viewScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewScoresButtonActionPerformed

        
        // Sets the gameover frame to be invisible
        gameOverFrame.setVisible(false);
        
        // Sets the second Frame's location to the center of the screen 
        scoreFrame.pack();
        scoreFrame.setLocationRelativeTo(null);
            
        // Sets the frame to be visible on screen
        scoreFrame.setVisible(true);
        
        try {
            // Creates new file type object and passes in the name of the scores file, assigns it to variable named file
            File file = new File("Scores.txt");

            // Creates new scanner type object and variable named read, passes in the file
            Scanner read = new Scanner(file);
            
            while (read.hasNextLine()){
                scoreTextArea.setText(scoreTextArea.getText() + read.nextLine() + "\n" );
            }
            
            read.close();
        } catch (FileNotFoundException e){
            // Prints an error message
            scoreTextArea.setText("Sorry, the scores file could not be located");
            
            // Prints stackTrace
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_viewScoresButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        // Help frame is made invisible
        helpFrame.setVisible(false);
        
        // Calls play again method
        playAgain();
    }//GEN-LAST:event_backButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        
        // Disposes of the current frame
        dispose();
        
        // Sets the second Frame's location to the center of the screen 
        helpFrame.pack();
        helpFrame.setLocationRelativeTo(null);
            
        // Sets the frame to be visible on screen
        helpFrame.setVisible(true);
        
    }//GEN-LAST:event_helpButtonActionPerformed

    public void openGameFrame(){
        
        // Sets the second Frame's location to the center of the screen 
        gameFrame.pack();
        gameFrame.setLocationRelativeTo(null);
            
        // Sets the frame to be visible on screen
        gameFrame.setVisible(true);
        
        // Sets the visibilty of all the hangman parts to false along with the nextButton visibilty 
        head.setVisible(false);
        eyes.setVisible(false);
        mouth.setVisible(false);
        body.setVisible(false);
        leftArm.setVisible(false);
        rightArm.setVisible(false);
        leftLeg.setVisible(false);
        rightLeg.setVisible(false);
        nextButton.setVisible(false);
     
        // For loop that starts at 0 and runs till x is equal to the length of the word
        for(int x = 0; x < word.length(); x++){
            
            // Sets the text of the wordLabel to the previous text, plus and underscore followed with a space
            wordLabel.setText(wordLabel.getText() + "_ ");
        }
        
        // Assigns start the systems current time in milliseconds
        start = System.currentTimeMillis();
       
        // Calls the startTimer method and passes in true because we want to start the timer
        startTimer(true);
        
    }
    
    // User Created method that calculates a random number and returns an integer 
    public int GenerateRandomNumber(int min, int max) {
        
        // Creates new double variable called randomNumber
        double randomNumber;
        
        // Creates new random type object
        Random r = new Random();
        
        // Sets the random number a decimal between 0.1 and 1 times the (max + 1 - min) value, + the min value 
        // Add 1 to max to make sure max is inclusive to the randomNumbers and min is 1 less to make it inclusive 
        randomNumber = (min) + ((max + 1) - (min)) * r.nextDouble();
        
        // Returns the value casted to an integer
        return (int)randomNumber;
        
    }
    
    // User created method to readFile, returns void, and requires a string which is assigned to filename
    public void readFile(String filename) {
        
        // Try Block
        try {

            // Creation of a new file object passing in the name of the text file in its consturctor, assigning to variable "booklist"
            File wordlist = new File(filename + ".txt");

            // Creating a new scanner type object, passing in the file variable, assigning to variable "read"
            Scanner read = new Scanner(wordlist);

            // while loop that runs till the file does not have a next line
            while (read.hasNextLine()){
                
                // Adds the line to the words ArrayList
                words.add(read.nextLine());

            }

            // Closes the scanner object
            read.close();

            // Retrieves the word at the randomly generated index and assigns it to the word variable
            // Random number method is called and bounds of the arraylist are passed in as minimum and maximum
            word = words.get(GenerateRandomNumber(0, (words.size()-1))).toUpperCase();
          
          // Catch block, catchs FileNotFoundException
        } catch (FileNotFoundException ex) {
            
            // Previous label set to the error message 
            guessesLabel.setText("Sorry the word could not be retrieved from the file! please locate file");
            
            // Prints Stack Trace
            ex.printStackTrace();
        }
    }
    
    // User created method, returns void
    public void loadHangmanPart(){
        
        // Decrements numGuesses by 1
        numGuesses--;
        
        // Switch statement that switches on the variable numGuesses
        switch (numGuesses) {

            // Depending on the value of the variable the appropriate case is run and then the apporpriate stickman label is made visible
            case 0: mouth.setVisible(true);
                    break;
            case 1: eyes.setVisible(true);
                    break;
            case 2: rightArm.setVisible(true);
                    break;
            case 3: leftArm.setVisible(true);
                    break;    
            case 4: rightLeg.setVisible(true);
                    break;
            case 5: leftLeg.setVisible(true);
                    break;
            case 6: body.setVisible(true);
                    break;
            case 7: head.setVisible(true);
                    break;
        }
    }
    
    // User created method, returns void
    public void setGuessesLabel() {
        
        // Sets the text of the guessesLabel
        guessesLabel.setText("Previous Guesses:");
        
        // (emhanced) For loop that runs through each value in the guesses arraylist and assigns it to the prevGuess label
        for (String prevGuess: guesses){
            
            // Sets the text of the guessesLabel to the previous text, plus the prevGuess variable
            guessesLabel.setText(guessesLabel.getText() + " " + prevGuess);
        }
        
    }
    
    // User created method, returns void, takes a boolean value and assigns it to varaible cond
    public void startTimer(Boolean cond){
        
        // If statement that runs if cond is true
        if (cond){
            
            // Creatednew action listener object and assigns it to the variable task
            ActionListener task = new ActionListener() {
                
                // Override method
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    // Sets the timer labels text tot the current system time - start time and converts it to seconds
                    timerLabel.setText(""+TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start));
                }
        };
        
            // creates new timer object, passes in a delay of 100 milliseconds or 1 second, and passes in the task
            timer = new Timer(100, task);
            
            // Starts the timer
            timer.start();
        } else{
            
            // Stops the timer
            timer.stop();
        }
            
    }
    
    // User created method, returns void, takes a boolean value and assigns it to the variable "w"
    public void winOrLose(Boolean w){
        
        // If statement that checks w is true
        if (w){
            
            //Sets the text of the wordLabel to the word plus a congratulatory phrase
            wordLabel.setText(word + ", You Guessed the word!");
            
        } else {
            
            //Sets the text of the wordLabel to the word plus a sad phrase
            wordLabel.setText(word + ", You Lose");
        }
            // Calls the startTimer method and passes in false, to stop timer
            startTimer(false);
            
            // Sets the visibilty of the enter button to false and the nextButton's to true
            enterGuessButton.setVisible(false);
            nextButton.setVisible(true);
    }
    
    public void playAgain(){
        
        // Sets the gameOverFrame's visibility to false
        gameOverFrame.setVisible(false);
        
        // Creating a new JFrame object 
        JFrame frame = new HangmanView();
        
        // Seting the frame to visible to run the view
        frame.setVisible(true);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangmanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adjectivesButton;
    private javax.swing.JLabel alreadyGuessedLabel;
    private javax.swing.JButton animalsButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel body;
    private javax.swing.JButton carBrandsButton;
    private javax.swing.JFrame categoryFrame;
    private javax.swing.JButton chooseWordButton;
    private javax.swing.JLabel confirmationLabel;
    private javax.swing.JLabel congratsLabel;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton enterGuessButton;
    private javax.swing.JButton enterNameButton;
    private javax.swing.JLabel enterNameLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JLabel eyes;
    private javax.swing.JButton flowersButton;
    private javax.swing.JButton fruitAndVeggiesButton;
    private javax.swing.JFrame gameFrame;
    private javax.swing.JFrame gameOverFrame;
    private javax.swing.JTextField guessTextField;
    private javax.swing.JLabel guessesLabel;
    private javax.swing.JLabel guessesLabel2;
    private javax.swing.JLabel hangmanTitle;
    private javax.swing.JLabel head;
    private javax.swing.JButton helpButton;
    private javax.swing.JFrame helpFrame;
    private javax.swing.JTextArea helpTextArea;
    private javax.swing.JButton instrumentsButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jobsButton;
    private javax.swing.JLabel leftArm;
    private javax.swing.JLabel leftLeg;
    private javax.swing.JLabel mouth;
    private javax.swing.JButton moviesButton;
    private javax.swing.JTextField nameTextfield;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel noose;
    private javax.swing.JButton playAgainButton;
    private javax.swing.JButton playAgainButton1;
    private javax.swing.JButton randomWordButton;
    private javax.swing.JLabel rightArm;
    private javax.swing.JLabel rightLeg;
    private javax.swing.JFrame scoreFrame;
    private javax.swing.JTextArea scoreTextArea;
    private javax.swing.JLabel scoresTitleLabel;
    private javax.swing.JLabel scoresTitleLabel1;
    private javax.swing.JButton sportsButton;
    private javax.swing.JButton superheroesButton;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton transportationButton;
    private javax.swing.JButton verbsButton;
    private javax.swing.JButton viewScoresButton;
    private javax.swing.JButton weatherButton;
    private javax.swing.JFrame wordEnterFrame;
    private javax.swing.JLabel wordLabel;
    private javax.swing.JTextField wordTextField;
    // End of variables declaration//GEN-END:variables
}
