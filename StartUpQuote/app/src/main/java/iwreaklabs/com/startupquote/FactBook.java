package iwreaklabs.com.startupquote;


import java.util.Random;

public class FactBook {

    //Member Variables  (properties about the object)

    public String[] mFacts = {

            "I’ve failed over and over and over again in my life and that is why I succeed.",
            "Chase the vision, not the money; the money will end up following you.",
            "The true entrepreneur is a doer, not a dreamer.",
            "A lot of people have ideas, but there are few who decide to do something right now. ",
            "The critical ingredient is getting off your butt and doing something.",
            "Don’t worry about failure; you only have to be right once.",
            "Ideas are easy. Implementation is hard.",
            "Not tomorrow. Not next week. But today. ",
            "The way to get started is to quit talking and start doing.",
            "Projections are just bullshit. They’re just guesses.",
            "User experience is everything.",
            "Obsess over it. Live and breathe it. ",
            "Remember to celebrate milestones as you prepare for the road ahead.",
            "Don’t be cocky. Don’t be flashy. There’s always someone better than you.",
            "Whether you think you can, or think you can’t — you’re right.",
            "Act enthusiastic and you will be enthusiastic.",
            "Always deliver more than expected.",
            "Don’t limit yourself. ",
            "You can go as far as your mind lets you. ",
            "What you believe, remember, you can achieve.",
            "You don’t learn to walk by following rules. ",
            "High expectations are the key to everything.",
            "It’s hard to beat a person who never gives up.",
            "Trust your instincts.",
            "Make your team feel respected, empowered and genuinely excited about the company’s mission.",
            "If you’re not a risk taker, you should get the hell out of business.",
            "The secret of getting ahead is getting started.",
            "Your most unhappy customers are your greatest source of learning.",
            "Always treat your employees exactly as you want them to treat your best customers.",
            "In between goals is a thing called life, that has to be lived and enjoyed.",
            "Wonder what your customer really wants? Ask. Don’t tell.",
            "If you’re passionate about something and you work hard, then I think you will be successful.",
            "Waiting for perfect is never as smart as making progress.",
            "One can get anything if he is willing to help enough others get what they want.",
            "If everything seems under control, you’re just not going fast enough.",
            "Never, never, never give up.",
            "Even if you don’t have the perfect idea to begin with, you can likely adapt.",
            "You learn by doing and falling over.",
            "Life is not always a matter of holding good cards, but sometimes playing a poor hand well.",
            "If you don’t know user-centered design, study it. Hire people who know it.",
            "Any time is a good time to start a company.",
            "The secret to successful hiring is this: look for the people who want to change the world.",
            "If you’re going through hell, keep going.",
            "Ideas are commodity. Execution of them is not.",
            "I knew the one thing I might regret is not trying.",
            "I skate to where the puck is going to be, not where it has been.",
             "Though no one can go back and make a brand new start, anyone can start from now and make a brand new ending.",
            "Do. Or do not. There is no try.",
             "To any entrepreneur: if you want to do it, do it now. If you don’t, you’re going to regret it.",
             "It’s not about ideas. It’s about making ideas happen.",
            "There’s nothing wrong with staying small. You can do big things with a small team.",
            "Ideas are easy. Implementation is hard.",
            "The best time to plant a tree was 20 years ago. The second best time is now.",
            "Always deliver more than expected."




};

    //Methods (abilities : things the object can do)
    public String getFact() {

        String fact =  "";
        // Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new Random Number Generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact ;
    }
}