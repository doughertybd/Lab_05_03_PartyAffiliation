public class Main {
    public static void main(String[] args) {
        String partyChoice = "";
        String party = "D - democrat R - republican I - independent";
        partyChoice = "";
        if(partyChoice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(partyChoice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant!");
        }
        else if(partyChoice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Human!");
        }
        else{
            System.out.println("You get another affiliation.");
        }
    }
}