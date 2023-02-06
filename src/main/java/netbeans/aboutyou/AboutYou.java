package netbeans.aboutyou;

/**
 *
 * @author halfrikan
 */
public class AboutYou {

    public static void main(String[] args) {
        int age = 19;
        boolean registered = true;
        
        //see if the person can vote
        if (age >= 18 && registered == true) {
            System.out.println("You can vote!");
        }
        
        //see if they are not allowed to vote
        if (age <= 18 || registered != true) {
            System.out.println("you can't vote yet...");
        }
        /* there is more than one conditional statement
        the code is a bit redundant but it works for showing how 
        conditional-and and conditional-or statements work. 
        in the first statement we are checking whether the person can vote. To
        vote, they must Both be 18 or older AND registered to vote. if these 
        conditions are both met the statement evaluates as true. In the 
        second statement, we check if either they are under age or not registered
        If ONE of those conditions are met, then the statement evaluates as true
        */
    }
}
