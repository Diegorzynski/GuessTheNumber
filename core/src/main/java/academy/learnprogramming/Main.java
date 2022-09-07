package academy.learnprogramming;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION ="beans.xml";

    public static void main(String[] args) {
        log.info("Guess the Number Game");

        //create context (container)

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // get number generator bean from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        log.info("number = {}", number);

        // get game bean from context (container) showing diff way to get the bean
        Game game = context.getBean(Game.class);

        // call reset method
        // not using anymore to be called from beans.xml
       // game.reset();

        //close context (container)
        context.close();
    }
}