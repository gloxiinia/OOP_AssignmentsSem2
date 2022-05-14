
public class Driver {

    //variables for resetting and changing text color
    public static final String ansiReset = "\u001B[0m";

    public static final String ansiRed = "\u001B[31m";
    
    public static final String ansiBBlack = "\u001b[30;1m";

    public static void main(String[] args){


        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n\n");
        System.out.println(ansiRed + "\t\t:::::::::  :::            :::     ::::    ::: :::    ::: :::::::::      :::     ::::    ::: :::    ::: " );
        System.out.println("\t\t:+:    :+: :+:          :+: :+:   :+:+:   :+: :+:   :+:  :+:    :+:   :+: :+:   :+:+:   :+: :+:   :+:  ");
        System.out.println("\t\t+:+    +:+ +:+         +:+   +:+  :+:+:+  +:+ +:+  +:+   +:+    +:+  +:+   +:+  :+:+:+  +:+ +:+  +:+   ");
        System.out.println(ansiBBlack + "\t\t+#++:++#+  +#+        +#++:++#++: +#+ +:+ +#+ +#++:++    +#++:++#+  +#++:++#++: +#+ +:+ +#+ +#++:++    ");
        System.out.println("\t\t+#+    +#+ +#+        +#+     +#+ +#+  +#+#+# +#+  +#+   +#+    +#+ +#+     +#+ +#+  +#+#+# +#+  +#+   ");
        System.out.println("\t\t#+#    #+# #+#        #+#     #+# #+#   #+#+# #+#   #+#  #+#    #+# #+#     #+# #+#   #+#+# #+#   #+#  ");
        System.out.println("\t\t#########  ########## ###     ### ###    #### ###    ### #########  ###     ### ###    #### ###    ### \n\n" + ansiReset);
        System.out.println("\t\t\t\t\tWelcome to BlankBank, a simple banking system\n\n");

        
        Bank bBank = new Bank("BlankBank");
    
        boolean test = true;
        Methods.startUp(bBank, test);

    }


}
