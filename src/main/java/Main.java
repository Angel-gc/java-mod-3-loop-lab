public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear;
        String sentence = " years have passed";


        // while (currentYear < targetYear) {
        //     //System.out.println((currentYear - startingYear) + " year(s) have passed");
        //     // conditional logic based on the current year
        //     if((currentYear - startingYear) == 1){
        //         System.out.println((currentYear - startingYear) +  " year has passed");
        //     }
        //     else if ((currentYear - startingYear) > 1){
        //         System.out.println((currentYear - startingYear) + sentence);
        //     }
        //     currentYear++;
        // }

        for (int i = 0; currentYear < targetYear; i++){
            if((currentYear - startingYear) == 1){
                System.out.println((currentYear - startingYear) +  " year has passed");
            }
            else if ((currentYear - startingYear) > 1){
                System.out.println((currentYear - startingYear) + sentence);
            }
            currentYear += 1;
        }
    }
}
