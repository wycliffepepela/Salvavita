package com.example.wycliffe.salvavita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsAidActivity extends AppCompatActivity {
    TextView txtTitle,txtDetails;
    ImageView imgView;
    int[] images = {R.drawable.burn ,
    R.drawable.chock ,
            R.drawable.heart ,

    };


    String[] Title={"burn",
            "Choking ",
            "Myocardial infarction",

    };
    String[] Details={"is a type of injury to skin, or other tissues, caused by heat, cold, electricity, chemicals, friction, or radiation.[3] Most burns are due to heat from hot liquids, solids, or fire.[7] While rates are similar for males and females the underlying causes often differ.[4] Among women in some areas, risk is related to use of open cooking fires or unsafe cook stoves.[4] Among men, risk is related to the work environments.[4] Alcoholism and smoking are other risk factors.[4] Burns can also occur as a result of self harm or violence between people.[4]\n" +
            "\n" +
            "Burns that affect only the superficial skin layers are known as superficial or first-degree burns.[1][8] They appear red without blisters and pain typically lasts around three days.[1][8] When the injury extends into some of the underlying skin layer, it is a partial-thickness or second-degree burn.[1] Blisters are frequently present and they are often very painful.[1] Healing can require up to eight weeks and scarring may occur.[1] In a full-thickness or third-degree burn, the injury extends to all layers of the skin.[1] Often there is no pain and the burnt area is stiff.[1] Healing typically does not occur on its own.[1] A fourth-degree burn additionally involves injury to deeper tissues, such as muscle, tendons, or bone.[1] The burn is often black and frequently leads to loss of the burned part.[1][9]\n" +
            "\n" +
            "Burns are generally preventable.[4] Treatment depends on the severity of the burn.[1] Superficial burns may be managed with little more than simple pain medication, while major burns may require prolonged treatment in specialized burn centers.[1] Cooling with tap water may help pain and decrease damage; however, prolonged cooling may result in low body temperature.[1][8] Partial-thickness burns may require cleaning with soap and water, followed by dressings.[1] It is not clear how to manage blisters, but it is probably reasonable to leave them intact if small and drain them if large.[1] Full-thickness burns usually require surgical treatments, such as skin grafting.[1] Extensive burns often require large amounts of intravenous fluid, due to capillary fluid leakage and tissue swelling.[8] The most common complications of burns involve infection.[2] Tetanus toxoid should be given if not up to date.[1]\n" +
            "\n" +
            "In 2015, fire and heat resulted in 67 million injuries.[5] This resulted in about 2.9 million hospitalizations and 176,000 deaths.[10][6] Most deaths due to burns occur in the developing world, particularly in Southeast Asia.[4] While large burns can be fatal, treatments developed since 1960 have improved outcomes, especially in children and young adults.[11] In the United States, approximately 96% of those admitted to a burn center survive their injuries.[12] The long-term outcome is related to the size of burn and the age of the person affected.[1]",
            "Basic Treatment\n" +
                    "Basic treatment of choking includes a number of non-invasive techniques to help remove foreign bodies from the airways. Most modern protocols, including those of the American Heart Association and the American Red Cross, recommend several stages, designed to apply increasingly more pressure. For the conscious choking victim, most protocols recommend encouraging the victim to cough, followed by hard back slaps and if none of these things work; abdominal thrusts (Heimlich maneuver) or chest thrusts. Once the choking victims loses consciousness, initiating CPR is recommended.[12]\n" +
                    "\n" +
                    "Cough\n" +
                    "If the choking individual is conscious and coughing, the American Red Cross recommends encouraging the individual to continue coughing. The American Red Cross recommends that if the person choking is unable to cough or if coughing is not effective, to move onto other methods, detailed below.[13]\n" +
                    "\n" +
                    "Back Blows (or Slaps)\n" +
                    "The Mayo Clinic recommends the use of back blows to aid in the rescue of choking victims. Back slaps are performed by leaning the choking victim forward, then delivering blows with the heel of the hand onto the victim's back, in between their shoulder blades.[14] If back slaps are performed, they must be performed with the head lower than the chest (i.e., bend the person over when you slap them hard between the shoulder blades with the heel of the palm); otherwise, the blow may drive the object deeper into the person's throat.\n" +
                    "\n" +
                    "Abdominal Thrusts (Heimlich Maneuver)\n" +
                    "Although the American Heart Association cites back slaps as effective for relief of choking, the organization recommends use of abdominal thrusts for simplicity, followed by chest thrusts, if abdominal thrusts are not effective.[12] Abdominal thrusts are performed with the rescuer standing behind the person choking and exerting inward and upward pressure with their hands on the choking person's abdomen. The purpose of abdominal thrusts is to create pressure that will expel any object lodged in the airway upwards to relive the obstruction.\n" +
                    "\n" +
                    "\"Five and Five\" Technique\n" +
                    "The American Red Cross recommends a strategy of alternating five back slaps and five abdominal thrusts for all conscious choking people until the object blocking the airway is dislodged. If the person choking becomes unconscious, basic CPR is recommended.[13]\n" +
                    "\n" +
                    "Finger Sweep\n" +
                    "If the choking victim becomes unconscious, the American Medical Association advocates sweeping the fingers across the back of the throat to attempt to dislodge airway obstructions,[15] However, many modern protocols recommend against the use of the finger sweep since, if the patient is conscious, they will be able to remove the foreign object themselves, or if they are unconscious, the rescuer should simply place them in the recovery position as this allows (to a certain extent) the drainage of fluids out of the mouth instead of down the trachea due to gravity. There is also a risk of causing further damage (for instance inducing vomiting) by using a finger sweep technique. There are no studies that have examined the usefulness of the finger sweep technique when there is no visible object in the airway. Recommendations for the use of the finger sweep have been based on anecdotal evidence.[12]\n" +
                    "\n" +
                    "Self-treatment\n" +
                    "\n" +
                    "Self-Assist Choking Device\n" +
                    "The Heimlich Maneuver (abdominal thrusts) can be performed or can be self-administered. Self-administration of this maneuver requires positioning of one's own abdomen over a chair, railing, or countertop and driving the abdomen upon the object with sharp, upward thrust. This serves as a substitute for thrusts made with the hands by another person. One study showed that these self-administered abdominal thrusts were just as effective as those performed by another person, although obese individuals were not included in the study.[16] Self-assist choking devices are another self-treatment option. This device is used to produce the inward and upward force of traditional abdominal thrusts. Multiple sources of evidence suggest, that one of promising approaches for self treatment during choking could be by applying the head-down (inversed) position.[12]\n" +
                    "\n" +
                    "Special Treatment Populations\n" +
                    "Infants (Less than 1 year)\n" +
                    "\n" +
                    "head-down position for self-treatment of choking if other approaches fail\n" +
                    "For children less than 1 year, the American Heart Association recommends performing cycles of 5 back blows (or slaps) followed by 5 chest compressions.[17] These cycles of 5 back blows then 5 chest compressions are repeated until the object comes out of the infant's airway or until the infant becomes unresponsive.[17] If the infant becomes unresponsive, the American Heart Association recommends starting CPR.[17] The reason that abdominal thrusts are not recommended in children less than 1 year is because they can cause liver damage.[17]\n" +
                    "\n" +
                    "\n" +
                    "Back blows (or slaps) and chest compressions for treating an infant less than 1 year of age.\n" +
                    "Pregnant or Obese Persons\n" +
                    "The American Heart Association recommends chest thrusts rather than abdominal thrusts for pregnant or obese persons who are choking.[12] Chest thrusts are performed in a similar to the abdominal thrusts, but with a change in hand placement of the rescuer. The hands are placed on the lower part of the choking victim's chest, at the base of the breastbone or sternum, rather than over the middle of the abdomen, as in traditional abdominal thrusts. Strong inward thrusts are then applied.[14]\n" +
                    "\n" +
                    "Advanced Treatment\n" +
                    "There are many advanced medical treatments to relieve choking or airway obstruction. These include inspection of the airway with a laryngoscope or bronchoscope and removal of the object under direct vision. Severe cases where there is an inability to remove the object may require cricothyrotomy (emergency tracheostomy). Cricothyrotomy involves making an incision in a patient's neck and inserting a tube into the trachea in order to bypass the upper airways.[18] The procedure is usually only performed when other methods have failed. In many cases, an emergency tracheostomy can save a patient's life, but if performed incorrectly, it may end the patient’s life.\n" +
                    "\n" +
                    "Epidemiology\n" +
                    "Choking is the fourth most common cause of unintentional injury-related death in the US.[3] Many episodes are not reported because they are brief and resolve without seeking medical attention.[5] Among reported events, the majority of episodes (80%) occur among children younger than age 15, with fewer episodes (20%) among age 15 and older.[3] The death rate from choking is low at most ages but increases starting around age 74.[3] Choking due to a foreign object resulted in 162,000 deaths (2.5 per 100,000) in 2013, compared to 140,000 deaths (2.9 per 100,000) in 1990.[19]",
            "Physical activity can reduce the risk of cardiovascular disease, and people at risk are advised to engage in 150 minutes of moderate or 75 minutes of vigorous intensity aerobic exercise a week.[101] Keeping a healthy weight, drinking alcohol within the recommended limits, and quitting smoking reduce the risk of cardiovascular disease.[101]\n" +
                    "\n" +
                    "Substituting polyunsaturated fats such as olive oil and rapeseed oil instead of saturated fats may reduce the risk of myocardial infarction,[39] although there is not universal agreement.[40] Dietary modifications are recommended by some national authorities, with recommendations including increasing the intake of wholegrain starch, reducing sugar intake (particularly of refined sugar), consuming five portions of fruit and vegetables daily, consuming two or more portions of fish per week, and consuming 4–5 portions of unsalted nuts, seeds, or legumes per week.[101] The dietary pattern with the greatest support is the Mediterranean diet.[102] Vitamins and mineral supplements are of no proven benefit,[103] and neither are plant stanols or sterols.[101]\n" +
                    "\n" +
                    "Public health measures may also act at a population level to reduce the risk of myocardial infarction, for example by reduce unhealthy diets (excessive salt, saturated fat and trans fat) including food labeling and marketing requirements as well as requirements for catering and restaurants, and stimulating physical activity. This may be part of regional cardiovascular disease prevention programs, or through the health impact assessment of regional and local plans and policies.[104]\n" +
                    "\n" +
                    "Most guidelines recommend combining different preventive strategies. A 2015 Cochrane Review found some evidence that such an approach might help with blood pressure, body mass index and waist circumference. However, there was insufficient evidence to show an effect on mortality or actual cardio-vascular events.[105]\n" +
                    "\n" +
                    "Medication\n" +
                    "Statins, drugs that act to lower blood cholesterol, decrease the incidence and mortality rates of myocardial infarctions.[106] They are often recommended in those at an elevated risk of cardiovascular diseases.[101]\n" +
                    "\n" +
                    "Aspirin has been studied extensively in people considered at increased risk of myocardial infarction. Based on numerous studies in different groups (e.g. people with or without diabetes), there does not appear to be a benefit strong enough to outweigh the risk of excessive bleeding.[107][108] Nevertheless, many clinical practice guidelines continue to recommend aspirin for primary prevention,[109] and some researchers feel that those with very high cardiovascular risk but low risk of bleeding should continue to receive aspirin.[110]\n" +
                    "\n" +
                    "Secondary prevention",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_aid);

        txtDetails = findViewById(R.id.txtDetails);
        txtTitle = findViewById(R.id.txtTitle);
        imgView = findViewById(R.id.imgView);

        int postion = getIntent().getIntExtra("data", 0);
        imgView.setImageResource(images[postion]);
        txtTitle.setText(Title[postion]);
        txtDetails.setText(Details[postion]);

    }
}
