## This is a Stormlight Archive-based quiz prepared by Oleg. 

<img width="625" alt="image" src="https://github.com/user-attachments/assets/ded79211-69dd-40c8-a119-a01caa212f83" />

---   
    import java.util.Scanner
    
    // Prepare input reader
    def reader = new Scanner(System.in)
    println 'Welcome to the Stormlight Archive Scene Quiz!'
    print "Tell me your name: "
    
    def playerName = reader.nextLine()
    
    println "\nHi, $playerName! Choose A, B, or C for each question."
    
    // Questions about favorite moments in Stormlight Archive
    def quizQuestions = [
        [
            question: "1) Which epic Stormlight battle did you enjoy most?",
            options: [
                A: "Battle of the Tower",
                B: "Skirmish at the Shattered Plains",
                C: "Siege of Urithiru"
            ]
        ],
        [
            question: "2) Which character’s POV chapter left the biggest impact?",
            options: [
                A: "Kaladin’s struggle with leadership",
                B: "Shallan’s discovery of her powers",
                C: "Dalinar’s visions and redemption"
            ]
        ],
        [
            question: "3) Which mystical event fascinated you most?",
            options: [
                A: "Bonding with a spren",
                B: "The awakening of Radiants",
                C: "The Everstorm’s arrival"
            ]
        ],
        [
            question: "4) Favorite quote or moment of wisdom?",
            options: [
                A: "“Life before Death, Strength before Weakness”",
                B: "“The most important step a man can take”",
                C: "“Honor is dead, but I'll see if I can find it again.”"
            ]
        ],
        [
            question: "5) What aspect of Roshar’s world do you enjoy the most?",
            options: [
                A: "The intricate magic system",
                B: "The complex politics and factions",
                C: "The diverse cultures and creatures"
            ]
        ]
    ]
    
    // Tracker for user’s answers tally
    def responsesCount = [A: 0, B: 0, C: 0]
    
    // Iterate and gather answers
    quizQuestions.each { q ->
        println "\n${q.question}"
        q.options.each { key, val ->
            println "$key) $val"
        }
    
        def userAnswer
        while(true) {
            userAnswer = reader.nextLine().trim().toUpperCase()
            if(responsesCount.containsKey(userAnswer)) {
                responsesCount[userAnswer] += 1
                break
            } else {
                println "Please answer with A, B, or C."
            }
        }
    }
    
    // Determine dominant choice
    def dominant = responsesCount.max { it.value }.key
    
    if (responsesCount.A == responsesCount.B && responsesCount.B == responsesCount.C) {
        dominant = "TIE"
    }
    
    def personalityDesc
    switch(dominant) {
        case "A":
            personalityDesc = "You’re drawn to the valor and heroism in Roshar’s great battles."
            break
        case "B":
            personalityDesc = "You appreciate the personal growth and inner journeys of the characters."
            break
        case "C":
            personalityDesc = "You love the mystical and philosophical mysteries of the world."
            break
        default:
            personalityDesc = "You have a balanced love for all the facets of Stormlight Archive."
    }
    
    println "\nThanks for playing, $playerName! Your Stormlight Archive vibe is:\n$personalityDesc"
    
