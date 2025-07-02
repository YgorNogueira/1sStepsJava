

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Welcome to screenmatch");
        System.out.println("Movie: Top Gun");
        boolean includedOnFee = true;
        double movieScoreOnTomatoes = 8.1;
        int year = 2022;

        double mediumScore = (9.8 + 6.3 + 8.0)/3;

        System.out.println(mediumScore);

        String sinopse;

        sinopse = """
                Adventure movie with 80's male stallion
                Top Gun
                Release Year:
                """ + year;

        System.out.println(sinopse);

    }
}