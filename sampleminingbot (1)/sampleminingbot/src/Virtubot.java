import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class Virtubot{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        Virtubotimplementation c=new Virtubotimplementation();
        Virtubotimplementation.chatbotqusetions();
        String choice="";
        Getusername usernameobj=new Getusername();
        String username=usernameobj.getusernamemethod();
        Virtubotimplementation.chat(username);
    }
}
 class Virtubotimplementation{
   //static String response = "";
    static HashMap<String, String> dict = new HashMap<>();
    static Scanner scr = new Scanner(System.in);

    public static void chat(String username) {

new Gui(username);
    }

static String  response="";
public  static String response3(String userinput) {
    String defaultResponse = "SORRY! ANSWER TO QUESTION NOT FOUND";

    System.out.println(userinput);
    System.out.println("\"JUST COPY THE ABOVE RELATED QUESTION AND PASTE IT IN CHATBOT TEXT FOR RESPONSE\"");
    //String response="";
    List<String> relatedques = relatedquestions(userinput);
    if  (dict.containsKey(userinput)) {

        return dict.get(userinput);
    }
if (!relatedques.isEmpty()) {
    Relatedquestionsfinal obj = new Relatedquestionsfinal();
    obj.RelatedQuestionsGUI(userinput, relatedques);
    return relatedques.toString();

}
    return defaultResponse;
}
public static String nullresponse(){
String tempresponse="";
tempresponse=response;
return response;
}
//     public  static String response2(String selecteduserinput,String userinput) {
////         String defaultResponse = "SORRY! ANSWER TO QUESTION NOT FOUND";
////         System.out.println(userinput);
////         //String response="";
////         List<String> relatedques = relatedquestions(userinput);
////         if (selecteduserinput.equalsIgnoreCase("") && dict.containsKey(userinput)) {
////
////
////             return dict.get(userinput);
////         } else if (selecteduserinput.equalsIgnoreCase("")) {
////
////             Relatedquestionsfinal obj = new Relatedquestionsfinal();
////             obj.RelatedQuestionsGUI(userinput, relatedques);
////         }// else if (!selecteduserinput.equalsIgnoreCase("") && dict.containsKey(selecteduserinput)) {
//         //System.out.println("Some Related Questions are:");
//         String defaultResponse = "SORRY! ANSWER TO QUESTION NOT FOUND";
//         System.out.println(userinput);
//         List<String> relatedques = relatedquestions(userinput);
//         if (selecteduserinput.equalsIgnoreCase("") && dict.containsKey(userinput)) {
//             return dict.get(userinput);
//         } else if (selecteduserinput.equalsIgnoreCase("")&& !userinput.equalsIgnoreCase("")) {
//             Relatedquestionsfinal obj = new Relatedquestionsfinal();
//             selecteduserinput=obj.RelatedQuestionsGUI(userinput, relatedques);
//         }
//
//         System.out.println("respose2"+selecteduserinput );
//         // if () {
//         String response="";
//         response=dict.get(selecteduserinput);
//         System.out.println("respnse2"+response);
//
//         //System.out.println("line 83"+response);
//         response=defaultResponse;
//         return response;
//
//
//     }
//
public static String response2(String selecteduserinput, String userinput) {
    String defaultResponse = "SORRY! ANSWER TO QUESTION NOT FOUND";
    //System.out.println(userinput);
    List<String> relatedques = relatedquestions(userinput);
    String response = null;

    if (selecteduserinput.equalsIgnoreCase("") && dict.containsKey(userinput)) {
        response = dict.get(userinput);
    } else if (selecteduserinput.equalsIgnoreCase("") && !userinput.equalsIgnoreCase("")) {
        Relatedquestionsfinal obj = new Relatedquestionsfinal();
        obj.RelatedQuestionsGUI(userinput, relatedques); // Update selecteduserinput here
       // System.out.println("respose2: " + selecteduserinput);
        response = dict.get(selecteduserinput);
    }

    if (response == null) {
        response = defaultResponse;
    }

    System.out.println("respnse2: " + response);

    return response;
}




     public static void chatbotqusetions() {
         dict.put("what is your name", "I AM MININGBOT");
         dict.put("what is your purpose", "My purpose is to assist and provide information to users");
         dict.put("how do you work", "I work by processing text input and generating text-based responses using artificial intelligence algorithms");
         dict.put("can you tell me a joke","Sure, here's a joke for you: just fuck off and study!");
         dict.put("what's the weather like today","I'm sorry, I cannot provide real-time weather information. Please check a weather website or app for the current conditions.");
         dict.put("who created you","I was created by surya");
         dict.put("are you a human","No, I am not a human. I am a computer program designed to assist with tasks and answer questions");
         dict.put("what is the meaning of life","The meaning of life is a philosophical question that has been debated for centuries. It varies from person to person. Some find meaning in relationships, while others seek it in personal achievements");
         dict.put("how old are you","I was created by surya at his home and I was created on 4th of September");
         dict.put("can you recommend a book/movie","Yes, book: Rich Dad Poor Dad and movie: Interstellar");
         dict.put("what are your hobbies","I don't have hobbies, but I enjoy helping people and answering questions");
         dict.put("what's the latest news","Just fucking check a news channel");
         dict.put("what's your favorite color","I don't have preferences like humans do, so I don't have a favorite color");
         dict.put("do you believe in aliens","I don't have beliefs or opinions. The existence of aliens is a topic of scientific speculation and exploration.");
         dict.put("can you help me with math problems","No fucking do it by yourselves");
         dict.put("what's the time right now","Go and check the calendar you moron!");
         dict.put("what's your favorite food","Electricity!!!");
         dict.put("who is your favorite celebrity","Lionel Messi");
         dict.put("why are minerals considered valuable natural resources for the economy"," Minerals are considered valuable because they serve as vital raw materials for core economic sectors, supporting the country's economic development and industrial growth.");
         dict.put("what should guide the exploration and extraction of minerals in the country","National goals and perspectives should guide the exploration, extraction, and management of minerals, ensuring their integration into the country's overall economic development strategy");
         dict.put("how does the policy aim to promote domestic industry and reduce import dependency","The policy aims to promote domestic industry and reduce import dependency by encouraging the Make in India initiative, which emphasizes domestic production and manufacturing.");
         dict.put("why is equitable distribution of mineral wealth emphasized in the policy?","Equitable distribution of mineral wealth is emphasized to ensure that the benefits of mineral resources are fairly and transparently allocated to serve the common good, with the state acting as a trustee on behalf of the people.");
         dict.put("what are the key considerations for environmentally sustainable mining practices","Environmentally sustainable mining practices should prioritize stakeholders' participation, benefit devolution to mining-affected persons, and maintain a high level of trust among all stakeholders while minimizing environmental impact");
         dict.put("how does the policy intend to improve the regulatory environment for mining","The policy aims to improve the regulatory environment by simplifying, making procedures transparent, and ensuring timely clearances to promote ease of doing business in the mining sector.");
         dict.put("why is e-governance emphasized in the policy","E-governance is emphasized to create an efficient regulatory mechanism, prevent illegal mining, and reduce value leakages. It enhances transparency and efficiency in managing mining operations.");
         dict.put("what is the focus on gender sensitivity in the mining sector","The policy recognizes that mining significantly contributes to employment generation and emphasizes gender sensitivity to ensure equal opportunities and benefits for women at all levels of the mining sector");
         dict.put("what is the proposed approach to achieving the objectives outlined in the policy","The policy aims to set up a unified national authority for mineral development and coordination, which will help fulfill the objectives and streamline the mining sector's operations.");
         dict.put("why is it important to take a comprehensive view of land use in the context of mining","It is important to consider land use comprehensively to balance the needs of development with the protection of forests, the environment, and ecology, while conserving biodiversity in areas to be mined.");
         dict.put("why should we care about how land is used in mining","Balancing development needs with protecting nature, like forests and wildlife, is crucial when it comes to mining.");
         dict.put("how can we prevent harm to the environment caused by mining","We prevent harm by using the latest science and modern forest practices as part of our mining plan");
         dict.put("what's the role of the Sustainable Development Framework in mining","It helps us make sure mining doesn't harm the environment, economy, or society. We aim to leave nature as good as or better than before.");
         dict.put("when should we avoid mining in certain areas","We should avoid mining in delicate places with rich wildlife. These areas will be marked as 'no-go' to protect them.");
         dict.put("what's an Exclusive Mining Zone (EMZ)","An EMZ is a special area set aside for mining with all the needed approvals. It avoids conflicts and delays in starting mining.");
         dict.put("how will we encourage clean energy use at mining sites","We'll give incentives for using clean energy like solar power to reduce pollution, costs, and our impact on nature.");
         dict.put("what will workers learn about the environment in their training"," Workers will learn how to protect nature during mining to make sure we do it the right way.");
         dict.put("why is mine safety important","It's crucial because mining can be dangerous, and accidents can hurt or even kill people. We want to make it safer.");
         dict.put("how can we make mining safer for workers","We're working on better methods to keep workers safe and prevent accidents. We also get input from mine workers.");
         dict.put("what about the health of workers and nearby people","We're taking steps to make sure mining doesn't harm people's health and safety, both for workers and those living nearby.");
         dict.put("how is DGMS involved in mine safety","DGMS is a group that helps make sure mines are safe. We're giving them more people, equipment, and skills to do this job better.");
         dict.put("why is infrastructure important in mining"," Good infrastructure helps move minerals from mines to where they're needed efficiently, making mining better for everyone.");
         dict.put("what kind of infrastructure is being built"," We're building things like special routes for transporting minerals, eco-friendly transportation methods, and even using waterways to move minerals.");
         dict.put("who's responsible for building this infrastructure","Mining companies are encouraged to build infrastructure. They can even help with regular transportation like roads and railways.");
         dict.put("how does this benefit the local population","Developing infrastructure not only helps mining but also benefits the local people and tribal communities. It's about improving everyone's lives.");
         dict.put("can mining projects get financial support","Yes, mining can get financial help from banks and institutions. But, right now, it's mostly for big projects with machinery and buildings");
         dict.put("how can smaller mining projects get financing","We're working to make it easier for smaller mining projects to get money for things like exploring and developing mines");
         dict.put("is mining considered an industry","We're trying to give mining the status of an industry so it can get more support and attention.");
         dict.put("why is mineral security important","Mineral security is crucial because we need reliable and affordable minerals for industries and our economy to work well.");
         dict.put("what's being done to make sure we have enough minerals","We're working on exploring and developing minerals, both locally and in other countries, to ensure a steady supply.");
         dict.put("can private companies help with mineral security","Yes, both public and private Indian companies can help by acquiring mineral assets in other countries if needed.");
         dict.put("what is mineral beneficiation","Mineral beneficiation is a process to make lower-grade minerals and fine materials useful. It helps get the most value out of them.");
         dict.put("how are they improving mineral processing techniques","They're strengthening research organizations to develop better processes. They'll analyze minerals and ores more effectively and use modern technology.");
         dict.put("who's involved in this research","Both public and private organizations are working together to improve mineral processing and beneficiation.");
         dict.put("what is deep sea mining"," Deep sea mining is about getting valuable minerals from the deep ocean. It's a big resource, but we need special technology for it");
         dict.put("how are they planning to explore the deep sea","They're working on systems to explore and mine the deep sea. They're also setting up ways to fund and coordinate these efforts.");
         dict.put("what is the plan for making mining safer and more efficient","They're working on using robots and machines that can work in mines, especially deep ones, to make mining safer and better for the economy.");
         dict.put("are they going to make these robots in India","They're trying to, but if they can't, they might bring them from other countries to use in mining here.");
         dict.put("what's the plan for making really pure materials for advanced technology stuff","They're going to do research to make materials super pure for things like electronics, lasers, and other cool technology.");
         dict.put("what's the goal with these super pure materials","They want to use them in things like semiconductors and high-tech stuff to make them work better.");
         dict.put("what's conservation in mining all about","It's not just saving stuff for later. They want to use minerals efficiently and prevent wastage.");
         dict.put("how are they stopping bad mining practices","They have rules and plans to make sure mining is done the right way, and they're encouraging miners to work together.");
         dict.put("are they making things better with mining","Yes, they're trying to make products even cooler by adding value and giving incentives to miners who do it right.");
         dict.put("how do they make sure mining is done scientifically","They work closely with experts and use the best methods to plan mining, making sure they get all the minerals.");
         dict.put("do they have rules for where mines can be","Yes, they set rules about where mines can be to make sure minerals are taken out in the best way.");
         dict.put("are the agencies in charge of mining well-prepared","They're making sure the people and technology needed for mining are top-notch.");
         dict.put("what is mining","Mining is when people dig into the Earth to find and take out valuable things like minerals, metals, or even gems.");
         dict.put("why do we do mining","Mining is done to get important stuff we use in our daily lives, like metals for making cars and minerals for our phones and computers.");
         dict.put("is mining good for the environment","Mining can sometimes harm the environment, so they try to do it carefully to protect nature.");
         dict.put("how do they know where to mine","Experts use special tools and maps to find the right places to dig for valuable things.");
         dict.put("who is in charge of mining","The government and mining companies work together to make sure mining is done safely and responsibly.");
         dict.put("what is a chatbot","A chatbot is like a computer program that can chat with you, like talking to a friend on your computer or phone.");
         dict.put("how does a chatbot work","Chatbots work by using computer programs to understand what you say and give you helpful answers.");
         dict.put("are chatbots real people","No, chatbots are not real people. They are smart computer programs that can chat with you.");
         dict.put("can chatbots understand any language"," Chatbots can understand and chat in many languages, but they are best at the ones they are trained for.");
         dict.put("what are minerals","Minerals are natural things in the ground that we dig up and use to make all kinds of stuff like jewelry, machines, and buildings.");
         dict.put("how do they find minerals underground","Geologists and special machines help find minerals deep underground using scientific tools and technology.");
         dict.put("is mining dangerous","Mining can be risky because it involves going underground or digging big holes. That's why safety rules are very important.");
         dict.put("what is the biggest mined material","Sand and gravel are the most mined materials in the world. We use them for construction and making things like concrete.");
         dict.put("why do we mine   ","We mine for various natural resources and materials primarily to obtain valuable substances that are essential for various aspects of human life and industrial processes");





         dict.put("who manages mineral resources", "Central and state governments");
         dict.put("what makes grant of mineral concessions transparent", "Transparent and seamless procedures");
         dict.put("how will regulatory mechanism be strengthened", "By incorporating E-Governance and technology");
         dict.put("what is the role of states in mineral development", "Facilitation, regulation, and infrastructure development");
         dict.put("why is trust important in the mining sector", "To build trust between stakeholders");
         dict.put("what is the focus of prospecting and exploration", "Systematic and intensive exploration");
         dict.put("how can private sector be encouraged for exploration", "Through incentives and Right of First Refusal");
         dict.put("why is data on mineral resources important", "To maintain a comprehensive inventory");
         dict.put("what is the purpose of a Mining Tenement System (MTS)", "Automating concession life-cycle");
         dict.put("how is collaboration encouraged for research", "With national and international bodies");
         dict.put("what is the general strategy for mining", "Meeting domestic needs and future growth");
         dict.put("why is conservation of minerals important", "To augment the reserve/resource base");
         dict.put("what are scientific methods of mining based on", "Sound scientific basis and collaboration");
         dict.put("how are mining machinery and equipment encouraged", "Incentives and indigenous development");
         dict.put("what is the focus of human resource development", "Improving competitiveness and gender balance");
         dict.put("why is infrastructure development essential in mining", "Linked to economic efficiency");
         dict.put("who is responsible for building mining infrastructure", "Mining companies and agencies");
         dict.put("how does infrastructure benefit the local population", "Improves local development");
         dict.put("can mining projects get financial support", "Yes, from financial institutions");
         dict.put("how can smaller mining projects get financing", "Efforts to facilitate smaller project financing");
         dict.put("is mining considered an industry", "Efforts to give mining industry status");
         dict.put("why is mineral security important", "For reliable and affordable minerals");
         dict.put("what is mineral beneficiation", "Process to make lower-grade minerals useful");
         dict.put("how is deep sea mining planned", "Exploration systems and coordination");
         dict.put("what's the plan for making mining safer and efficient", "Using robots and machines");
         dict.put("are they making robots in India for mining", "Efforts to develop and use indigenous technology");
         dict.put("what's the goal with super pure materials", "To enhance the performance of advanced technology");
         dict.put("what is conservation in mining all about", "Efficient use of minerals and prevention of wastage");
         dict.put("how are bad mining practices stopped", "Through rules and encouraging collaboration");
         dict.put("are agencies in charge of mining well-prepared", "Efforts to enhance capacity and technology");
         dict.put("what is mining", "Digging the Earth for valuable things");
         dict.put("why do we do mining", "To obtain important resources for daily life");
         dict.put("is mining good for the environment", "Efforts to do it carefully to protect nature");
         dict.put("how do they know where to mine", "Geologists and scientific tools help find the right places");
         dict.put("who is in charge of mining", "Government and mining companies");
         dict.put("what is a chatbot", "A computer program for chatting");
         dict.put("how does a chatbot work", "Using computer programs to understand and respond");
         dict.put("are chatbots real people", "No, they are smart computer programs");
         dict.put("can chatbots understand any language", "They can understand many languages");
         dict.put("what are minerals", "Natural resources used to make various products");
         dict.put("how do they find minerals underground", "Geologists and special machines help");
         dict.put("is mining dangerous", "It can be risky, so safety is crucial");
         dict.put("what is the biggest mined material", "Sand and gravel are the most mined");
         dict.put("why do we mine", "For valuable substances essential for human life");
         dict.put("what can you do", "I can provide information, answer questions, and assist with various topics, including mining laws in India.");
         dict.put("mining laws", "Mining laws in India govern the exploration, extraction, and management of mineral resources, ensuring compliance with regulations and sustainable practices.");

         // dict.put("what is your purpose", "I assist with information");
         //dict.put("how do you work", "Text-based AI responses");
         dict.put("mining definition", "Extracting valuable resources");
         dict.put("mining importance", "Economic and industrial support");
         dict.put("mining dangers", "Risks in mining");
         dict.put("mining materials", "Valuable resources extraction");
         dict.put("mining safety", "Safety measures in mining");
         dict.put("mining and environment", "Environmental impact of mining");
         dict.put("mining exploration", "Discovering underground resources");
         dict.put("mining authorities", "Regulatory bodies in mining");
         dict.put("mining technology", "Advanced mining methods");
         dict.put("mining in India", "Mining industry in India");
         dict.put("mining infrastructure", "Transportation and facilities");
         dict.put("mining financing", "Funding for mining projects");
         dict.put("mining and industry", "Mining as an industry");
         dict.put("mineral security", "Importance of mineral security");
         dict.put("mineral exploration", "Searching for minerals");
         dict.put("mineral processing", "Refining minerals");
         dict.put("deep sea mining", "Mining in the deep ocean");
         dict.put("mining robots", "Robotic mining technology");
         dict.put("pure materials", "High-purity materials");
         dict.put("conservation in mining", "Efficient mineral use");
         dict.put("sustainable mining", "Environment-friendly practices");
         dict.put("mining regulations", "Rules for mining");
         dict.put("mining benefits", "Positive impacts of mining");
         dict.put("scientific mining", "Mining with expert guidance");
         dict.put("mining locations", "Where to mine");
         dict.put("mining agencies", "Agencies in charge");
         dict.put("chatbot definition", "AI-based conversation tool");
         dict.put("chatbot functionality", "How chatbots work");
         dict.put("chatbot languages", "Chatbot language support");
         dict.put("chatbot understanding", "Chatbot language abilities");
         dict.put("who manages mineral resources", "Central and state governments.");
         dict.put("why is transparency important in mining", "To make doing business easier.");
         dict.put("how will Indian Bureau of Mines be improved", "More manpower, equipment, better skills.");
         dict.put("what is E-Governance's role in mining", "Enhancing regulations, better tracking.");
         dict.put("what does the state do in mining", "Facilitates, regulates, develops infrastructure, collects taxes.");
         dict.put("how are mining clearances being made easier", "Online portal, time-bound procedures.");
         dict.put("why is trust important in mining", "To build trust between government, miners, and communities.");
         dict.put("what's the focus of prospecting and exploration", "Systematic, scientific exploration of minerals.");
         dict.put("who's encouraged to explore minerals", "Private sector involvement.");
         dict.put("which minerals get special attention", "Energy critical, strategic minerals.");
         dict.put("how is exploration incentivized", "Right of First Refusal, auctions.");
         dict.put("what's the goal of conservation in mining", "Zero-waste, eco-friendly mining.");
         dict.put("what's encouraged in mining machinery", "Efficiency, safety, local production.");
         dict.put("how's human resource development improved", "Training, gender balance, IT skills.");
         dict.put("what's the focus of infrastructure development", "Efficient mineral transportation, regional growth.");
         dict.put("who can get financial support for mining", "Mining projects, including exploration.");
         dict.put("how are small mineral deposits managed", "Clustering, shared facilities.");
         dict.put("what agencies cooperate for beach sand minerals", "State Governments, Environment Ministry, etc.");

     }
    public static void getquestions()
    {
        System.out.println(dict.keySet());
        System.out.println("YOU CAN ENTER THE QUESTIONS IN ANY CASE AND ALSO NO NEED TO WORRY ABOUT THE SPACE AS WELL.\nHAPPY SEARCHING!");
    }
    public static List<String> relatedquestions(String userinput) {
        List<String> relatedsuggestions = new ArrayList<String>();
        List<String> usertokens = userinputtokenizer(userinput);
        //System.out.println(usertokens);
        boolean flag = false;
        int threshholdvalue = 2;
        Map<String, List<String>> relatedquestionstokens = relatedquestionstokens(dict);
        for (String question : relatedquestionstokens.keySet()) {
            List<String> questiontokens = relatedquestionstokens.get(question);

            flag = comparetokens(usertokens, questiontokens);
            if (flag == true) {
                relatedsuggestions.add(question);
            }
        }


            while (relatedsuggestions.size() >= 10 && usertokens.size()>=threshholdvalue) {
              //  System.out.println(usertokens.size());
                List<String> relatedsuggestionsnew = new ArrayList<String>();
                //noSystem.out.println(relatedsuggestionsnew.size());
                //List<String> newusertokens = userinputtokenizer(userinput);
                // Map<String, List<String>> newrelatedquestionstokens = relatedquestionstokens(dict);
                //threshholdvalue+=1;
                for (String question : relatedquestionstokens.keySet()) {
                    List<String> questiontokens = relatedquestionstokens.get(question);
                    flag = comparetokens(usertokens, questiontokens,threshholdvalue);
                    //System.out.println(flag);
                    if (flag == true) {
                        relatedsuggestionsnew.add(question);
                    }
                }
               // System.out.println(relatedsuggestionsnew.size());
                relatedsuggestions.clear();
               // System.out.println(relatedsuggestionsnew);
                 relatedsuggestions=relatedsuggestionsnew;
                threshholdvalue=threshholdvalue+1;
                //System.out.println(relatedsuggestions.size());
            }
//            if (relatedsuggestionsnew.size()>0) {
//                return relatedsuggestionsnew;
        return relatedsuggestions;

    }
      //  }


    public static  List<String> userinputtokenizer(String userinput)
    {
        List<String> usertokens=new ArrayList<String>();
        StringTokenizer tokenizer=new StringTokenizer(userinput);
        while(tokenizer.hasMoreTokens())
        {
            usertokens.add(tokenizer.nextToken());
        }
        return usertokens;
    }
    public static Map<String,List<String>>relatedquestionstokens(Map<String,String> dict)
    {
        Map<String,List<String>> relatedquestionstokens=new HashMap<String,List<String>>();
        //String question="";

        //String tokens="";
        for (String question:dict.keySet()){
            List<String> questiontokens=new ArrayList<String>();
            StringTokenizer tokenizer=new StringTokenizer(question);
            while(tokenizer.hasMoreTokens())
            {
                questiontokens.add(tokenizer.nextToken());
            }
            relatedquestionstokens.put(question,questiontokens);
        }
        return relatedquestionstokens;
    }

    public static boolean comparetokens(List<String> usertokens, List<String> questiontokens) {
        // wordsmatch=0;
        int matchcount=0;
        for (String usertoken : usertokens) {
            String usertokentrimmed = usertoken.trim();
            for (String questiontoken : questiontokens) {
                String questiontokentrimmed = questiontoken.trim();
                if (usertokentrimmed.equalsIgnoreCase(questiontokentrimmed)) {
                    matchcount++; // At least one token matches
                }
            }
        }
        if(matchcount>=1)
            return true;
        return false; // No matching tokens found
    }
    public static boolean comparetokens(List<String> usertokens, List<String> questiontokens,int thresholdvalue) {
        int matchcount=0;
       // thresholdvalue++;
        for (String usertoken : usertokens) {
            String usertokentrimmed = usertoken.trim();
            for (String questiontoken : questiontokens) {
                String questiontokentrimmed = questiontoken.trim();
                if (usertokentrimmed.equalsIgnoreCase(questiontokentrimmed)) {
                    //return true; // At least one token matches
                    matchcount+=1;
                }
            }
        }
        if(matchcount>=thresholdvalue) {
            return true;
        }

        return false; // No matching tokens found
    }
}

